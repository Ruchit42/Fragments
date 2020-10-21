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
        private static final String ARG_PARAM1 = "param1";
        private static final String ARG_PARAM2 = "param2";
        private String mParam1;
        private String mParam2;
        public CanvasFragment() {
            // Required empty public constructor
        }

        public static CanvasFragment newInstance(String param1, String param2){
            CanvasFragment canvasFragment = new CanvasFragment();
            Bundle args = new Bundle();
            args.putString((ARG_PARAM1),param1);
            args.putString((ARG_PARAM2),param2);
            canvasFragment.setArguments(args);
            return canvasFragment;
        }
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (getArguments() != null) {
                mParam1 = getArguments().getString(ARG_PARAM1);
                mParam2 = getArguments().getString(ARG_PARAM2);
            }
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
           return inflater.inflate(R.layout.fragment_b, container, false);
           // textView = w.findViewById(R.id.colorName);
            //Resources res = getResources();
           // final String[] colors_ = res.getStringArray(R.array.all_colors);

            // w.setBackgroundColor(Color.BLUE);
           // return w;
        }

    }
