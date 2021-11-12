package com.example.ques3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button displayBtn;
    TextView textView;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGrp);
        displayBtn = findViewById(R.id.displayBtn);
        textView = findViewById(R.id.textView);

//        radioGroup.setOnCheckedChangeListener((radioGroup, i) -> {
//            radioButton = findViewById(i);
//        });

        displayBtn.setOnClickListener(view ->{
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId == -1)
                Toast.makeText(MainActivity.this,"Nothing selected",Toast.LENGTH_LONG).show();
            else {
                radioButton = findViewById(selectedId);
                textView.setText(radioButton.getText());
            }
        });
    }

}