package edu.temple.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentA.ButtonClickInterface {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentA fragmentA = new FragmentA();
        FragmentB fragmentB = new FragmentB();

        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frameOne,fragmentA).commit();
        //ft.add(R.id.frameTwo,fragmentB).commit();
        FragmentManager fp =getSupportFragmentManager();
        FragmentTransaction fg = fp.beginTransaction();
        fg.add(R.id.frameTwo,fragmentB).commit();
    }
    public void buttonClick(int posotion){
        Toast.makeText(this,"You have clicked the button number"+ posotion,Toast.LENGTH_SHORT).show();
    }

}