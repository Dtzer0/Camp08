package com.example.sample_event;

import androidx.appcompat.app.AppCompatActivity;

import android.gesture.GestureOverlayView;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //인플레이션
    TextView textView;
    GestureDetector detector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        View view = findViewById(R.id.view);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                float curX = motionEvent.getX();
                float curY = motionEvent.getY();

                //getApplicationContext() or this 사용
                if(action == MotionEvent.ACTION_DOWN){
                    //Toast.makeText(getApplicationContext(), "손가락 눌림:", Toast.LENGTH_SHORT).show();
                    println("Down: "+curX+","+curY);
                }else if(action == MotionEvent.ACTION_MOVE){
                    //Toast.makeText(getApplicationContext(), "손가락 움직임: ", Toast.LENGTH_SHORT).show();
                    println("Move: "+curX+","+curY);
                }else if(action == MotionEvent.ACTION_UP){
                    //Toast.makeText(getApplicationContext(), "손가락 뗌: ", Toast.LENGTH_SHORT).show();
                    println("Up: "+curX+","+curY);
            }
                return true;
            }
        });

       detector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
           @Override
           public boolean onDown(MotionEvent e) {
               println("onDown Call");
               return true;
           }

           @Override
           public void onShowPress(MotionEvent e) {

           }

           @Override
           public boolean onSingleTapUp(MotionEvent e) {
               return false;
           }

           @Override
           public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
               return false;
           }

           @Override
           public void onLongPress(MotionEvent e) {

           }

           @Override
           public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
               return false;
           }
       });

        View view2 = findViewById(R.id.view2);
        view2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                return false;
            }
        });
    }

    //뒤로가기 버튼을 눌렀을 때,,
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Toast.makeText(this, "시스템 [BACK] 버튼이 눌림",
                    Toast.LENGTH_LONG).show();

            return true;
        }
        return false;
    }

    public void println(String data){
        textView.append(data+"\n");
    }

}