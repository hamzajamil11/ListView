package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView=findViewById(R.id.listView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Hamza");
        arr.add("Talha");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(arrayAdapter);
    }
}