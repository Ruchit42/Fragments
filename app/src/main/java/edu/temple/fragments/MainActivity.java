package edu.temple.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PaletteFragment.ButtonClickInterface {


    PaletteFragment fragmentA = new PaletteFragment();
    CanvasFragment fragmentB = new CanvasFragment();

    GridView gv;
    View v;
    String[] colors_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       setTitle(R.string.Main_title);
//        FragmentA fragmentA = new FragmentA();
//        FragmentB fragmentB = new FragmentB();
//        FragmentManager fm =getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.add(R.id.frameOne,fragmentA).commit();
//        //ft.add(R.id.frameTwo,fragmentB).commit();
//        FragmentManager fp =getSupportFragmentManager();
//        FragmentTransaction fg = fp.beginTransaction();
//        fg.add(R.id.frameTwo,fragmentB).commit();
        fragmentA = PaletteFragment.newInstance(colors_);
       getSupportFragmentManager().beginTransaction().add(R.id.frameOne,fragmentA)
               .add(R.id.frameTwo,fragmentB).commit();

    }
//    public void buttonClick(int posotion){
//        Toast.makeText(this,"You have clicked the button number"+ posotion,Toast.LENGTH_SHORT).show();
//        fragmentB.changeColor(posotion);
//    }
    public  void OnInputPallette(int num){
        Resources res = getResources();
        String[] colors_ = res.getStringArray(R.array.all_colors);
        TextView textView = fragmentB.getView().findViewById(R.id.colorName);
        if (num ==0) {
            fragmentB.getView().setBackgroundColor(Color.RED);
            textView.setText(R.string.color_red);

            // Toast.makeText(getActivity(),"Text is "+ view.get,Toast.LENGTH_LONG).show();
        } else if (num ==1) {
            fragmentB.getView().setBackgroundColor(Color.BLUE);
            textView.setText(R.string.color_blue);
        } else if (num ==2) {
            fragmentB.getView().setBackgroundColor(Color.GREEN);
            textView.setText(R.string.color_green);

        } else if (num ==3) {
            fragmentB.getView().setBackgroundColor(Color.MAGENTA);
            textView.setText(R.string.color_pink);

        }else if (num ==4) {
            fragmentB.getView().setBackgroundColor(Color.GRAY);
            textView.setText(R.string.color_gray);
        } else if (num ==5){
            fragmentB.getView().setBackgroundColor(Color.WHITE);
            textView.setText(R.string.color_white);

        }else if (num ==6){
            fragmentB.getView().setBackgroundColor(Color.YELLOW);
            textView.setText(R.string.color_yellow);

        }else if (num ==7){
            fragmentB.getView().setBackgroundColor(Color.CYAN);
            textView.setText(R.string.color_cyan);

        } else if (num ==8){
            fragmentB.getView().setBackgroundColor(Color.MAGENTA);
            textView.setText(R.string.color_purple);
        }
    }
}


