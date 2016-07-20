package com.example.sunrin.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
private ListView listview;
private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomAdapter();

        listview = (ListView) findViewById(R.id.listview);

        listview.setAdapter(adapter);

        adapter.add("페르소나");
        adapter.add("파이널판타지");
        adapter.add("콜오브듀티");
        adapter.add("배틀필드1");
    }
}
