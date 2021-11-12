package com.example.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nameET,rollET,sectionET,collegeNameET,streamET;
    private Button submitBtn;
    private TextView textView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        nameET = findViewById(R.id.nameET);
        rollET = findViewById(R.id.rollET);
        sectionET = findViewById(R.id.sectionET);
        collegeNameET = findViewById(R.id.collegeNameET);
        streamET = findViewById(R.id.streamET);
        submitBtn = findViewById(R.id.submitBtn);
        textView = findViewById(R.id.textView);
        
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameET.getText().toString();
                String roll = rollET.getText().toString();
                String section = sectionET.getText().toString();
                String collegeName = collegeNameET.getText().toString();
                String stream = streamET.getText().toString();

                String text = "Name - "+name+"\n"+"Roll - "+roll+"\n"+"Section - "+section
                        +"\n"+"College Name - "+collegeName+"\n"+"Stream - "+stream;
                textView.setText(text);
            }
        });
        
    }
}