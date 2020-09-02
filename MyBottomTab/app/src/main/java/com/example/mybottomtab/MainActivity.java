package com.example.mybottomtab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //아이콘(탭)이 눌렸을 때
                switch (item.getItemId()){
                    case R.id.tab1:
                        Toast.makeText(getApplicationContext(),"첫번째 탭이 눌림",Toast.LENGTH_SHORT).show(); //안내창
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment1).commit(); //fragment1 전환
                        //getSupportFragmentManager().beginTransaction().replace(R.id.container,);
                        return true;
                    case R.id.tab2:
                        Toast.makeText(getApplicationContext(),"두번째 탭이 눌림",Toast.LENGTH_SHORT).show(); //안내창
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).commit(); //fragment2 전환
                        return true;
                    case R.id.tab3:
                        Toast.makeText(getApplicationContext(),"세번째 탭이 눌림",Toast.LENGTH_SHORT).show(); //안내창
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment3).commit(); //fragment3 전환
                        return true;
                }
                return false;

            }
        });
    }
}