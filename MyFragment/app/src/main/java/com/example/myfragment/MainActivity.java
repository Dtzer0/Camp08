package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Fragment mainFragment;
    MenuFragment menuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = getSupportFragmentManager().findFragmentById(R.id.MainFragment);
        menuFragment = new MenuFragment();

    }

    public void onFragmentChanged(int index) {
        if (index == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.containter, menuFragment).commit();
        } else if (index == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.containter, menuFragment).commit();
        }
    }
}
