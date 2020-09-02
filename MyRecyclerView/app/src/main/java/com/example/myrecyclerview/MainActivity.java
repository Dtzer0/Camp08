package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        final PersonAdapter adapter = new PersonAdapter();
        adapter.addItem(new Person("태희", "010-1234-5678"));
        adapter.addItem(new Person("태규", "010-0000-0000"));
        adapter.addItem(new Person("집", "041-573-1000"));

        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnPersonItemClickListener() {
            @Override
            public void onItemClick(PersonAdapter.ViewHolder holder, View view, int position) {
                Person item = adapter.getItem(position);
                Toast.makeText(getApplicationContext(),"아이템 선택됨: "
                        +item.getName()+","
                        +item.getMobile(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}