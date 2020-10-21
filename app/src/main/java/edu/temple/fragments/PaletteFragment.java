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

public class PaletteFragment extends Fragment {
  Button button;
  GridView gv;
  View v;
  //public palettefragListener parentAct;
     String[] colors_;
    private static final String COLOR_GRID = "colorGrid";
  ButtonClickInterface buttonClickInterface;
    public PaletteFragment() {
        // Required empty public constructor
    }
    public interface ButtonClickInterface{
        void OnInputPallette(int num);
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
    public static PaletteFragment newInstance(String [] colors){
        PaletteFragment paletteFragment = new PaletteFragment();
        Bundle args = new Bundle();
        args.putStringArray(COLOR_GRID,colors);
        paletteFragment.setArguments(args);
        return paletteFragment;
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
         String[] colors_ = res.getStringArray(R.array.all_colors);
        final BaseAdapter adapter = new CustomAdapter(getActivity(), colors_);
       gv.setAdapter(adapter);
       gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String p = parent.getItemAtPosition(position).toString();

               buttonClickInterface.OnInputPallette(position);
               // layout.setBackgroundColor();


           }
       });


        return v;
    }


}