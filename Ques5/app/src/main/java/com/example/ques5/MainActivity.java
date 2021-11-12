package com.example.ques5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        ListView listView = findViewById(R.id.listView);
        ArrayList<String> list = new ArrayList<>();
        list.add("Australia");
        list.add("Belgium");
        list.add("Germany");
        list.add("India");
        list.add("Italy");
        list.add("France");
        list.add("USA");
        list.add("UK");

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            textView.setText(list.get(position));
        });
    }
}