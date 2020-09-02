package com.example.myintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //메뉴 액티비티를 띄운다.
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivityForResult(intent, 101);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //넘어온 데이터를 토스트 메세지로 띄우기
        if(requestCode == 101){
            Toast.makeText(getApplicationContext(),
                    "onActivityResult 메소드 호출. 요청 코드 :" + requestCode +
                    ", 결과 코드:" + resultCode, Toast.LENGTH_LONG).show();

        if(resultCode == RESULT_OK){
            String name = data.getExtras().getString("name");
            Toast.makeText(getApplicationContext(), "응답으로 전달된 name :" + name,
                    Toast.LENGTH_LONG).show();
        }
        }
    }
}