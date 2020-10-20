package edu.temple.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.res.Resources;
import android.graphics.Color;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


    public  class CanvasFragment extends Fragment {

        View w;
        TextView textView;
        public CanvasFragment() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            w =  inflater.inflate(R.layout.fragment_b, container, false);
            textView = w.findViewById(R.id.colorName);
            Resources res = getResources();
            final String[] colors_ = res.getStringArray(R.array.all_colors);

            // w.setBackgroundColor(Color.BLUE);
            return w;
        }
        public void changeColor(int posotion){
            if (posotion ==0) {
                w.setBackgroundColor(Color.RED);
                textView.setText(R.string.color_red);

                // Toast.makeText(getActivity(),"Text is "+ view.get,Toast.LENGTH_LONG).show();
            } else if (posotion ==1) {
                w.setBackgroundColor(Color.BLUE);
                textView.setText(R.string.color_blue);
            } else if (posotion ==2) {
                w.setBackgroundColor(Color.GREEN);
                textView.setText(R.string.color_green);

            } else if (posotion ==3) {
                w.setBackgroundColor(Color.MAGENTA);
                textView.setText(R.string.color_pink);

            }else if (posotion ==4) {
                w.setBackgroundColor(Color.GRAY);
                textView.setText(R.string.color_gray);
            } else if (posotion ==5){
                w.setBackgroundColor(Color.WHITE);
                textView.setText(R.string.color_white);

            }else if (posotion ==6){
                w.setBackgroundColor(Color.YELLOW);
                textView.setText(R.string.color_yellow);

            }else if (posotion ==7){
                w.setBackgroundColor(Color.CYAN);
                textView.setText(R.string.color_cyan);

            } else if (posotion ==8){
                w.setBackgroundColor(Color.MAGENTA);
                textView.setText(R.string.color_purple);
            }
        }
    }
