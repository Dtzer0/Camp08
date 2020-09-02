package com.example.test_act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView; //멤버 변수

    //onCreate = 생성자
    //R(RESOURCE).layout(파일명).activity_main(layout이 있는 파일명)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        //.xml 파일의 컴포넌트를 자바와 연결
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("안녕 내 이름은 태희");
            }
        });


    }
}