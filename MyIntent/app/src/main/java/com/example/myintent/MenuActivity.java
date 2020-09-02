package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();   //빈 intent 객체 만들기
                intent.putExtra("name", "태희");  //intent에 부가데이터 담기
                setResult(RESULT_OK, intent);

                //기존 창을 닫고 또 닫고 (intent는 덮어 씌움) mainAc..로
                finish();
            }
        });
    }
}