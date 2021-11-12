package com.example.ques6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    TextView textView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.text1);
        editText2 = findViewById(R.id.text2);
        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(view -> {
            int text1 = Integer.parseInt(editText1.getText().toString());
            int text2 = Integer.parseInt(editText2.getText().toString());
            textView.setText("Answer is "+text1%text2);
        });
    }
}