package com.example.myparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        Intent intent = getIntent();


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //메뉴 액티비티를 띄운다.
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                SimpleData data = new SimpleData(100, "Hello Android");
                intent.putExtra("data", data);
                startActivityForResult(intent, 101);
            }
        });
    };
}