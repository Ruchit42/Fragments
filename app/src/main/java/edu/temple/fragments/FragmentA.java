package edu.temple.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentA extends Fragment {
  Button button;
  GridView gv;
  View v;
  ButtonClickInterface buttonClickInterface;
    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof  ButtonClickInterface){
            buttonClickInterface = (ButtonClickInterface)context;
        }else{
            throw new RuntimeException("You must implement");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v =  inflater.inflate(R.layout.fragment_a, container, false);
        //v.setBackgroundColor(Color.YELLOW);
      //  button = v.findViewById(R.id.button);
       // gv = v.findViewById(R.id.GW);
        gv = (GridView) v.findViewById(R.id.GW);
        Resources res = getResources();
        final String[] colors_ = res.getStringArray(R.array.all_colors);
        final BaseAdapter adapter = new CustomAdapter(getActivity(), colors_);
       gv.setAdapter(adapter);
       gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String p = parent.getItemAtPosition(position).toString();
               //Toast.makeText(MainActivity.this, p, Toast.LENGTH_SHORT).show();
               // view.setBackgroundColor(Color.WHITE);
               buttonClickInterface.buttonClick(position);
               // layout.setBackgroundColor();

               if (p.matches(colors_[0])) {
                   v.setBackgroundColor(Color.RED);
                  // Toast.makeText(getActivity(),"Text is "+ view.get,Toast.LENGTH_LONG).show();
               } else if (p.matches(colors_[1])) {
                   v.setBackgroundColor(Color.BLUE);
               } else if (p.matches(colors_[2])) {
                   v.setBackgroundColor(Color.GREEN);

               } else if (p.matches(colors_[3])) {
                   v.setBackgroundColor(Color.MAGENTA);

               }else if (p.matches(colors_[4])) {

                   v.setBackgroundColor(Color.GRAY);
               } else if (p.matches(colors_[5])){
                   v.setBackgroundColor(Color.WHITE);

               }else if (p.matches(colors_[6])){
                   v.setBackgroundColor(Color.YELLOW);

               }else if (p.matches(colors_[7])){
                   v.setBackgroundColor(Color.CYAN);

               } else if (p.matches(colors_[8])){
                   v.setBackgroundColor(Color.MAGENTA);
               }
           }
       });







        return v;
    }
    interface ButtonClickInterface{
        void buttonClick(int posotion);
    }

}