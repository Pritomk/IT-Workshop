package com.example.ques4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox pizza = findViewById(R.id.pizzaCB);
        CheckBox momo = findViewById(R.id.momoCB);
        CheckBox tacos = findViewById(R.id.tacosCB);
        CheckBox pepsi = findViewById(R.id.pepsiCB);
        Button btn = findViewById(R.id.btn);
        TextView result = findViewById(R.id.resultText);

        btn.setOnClickListener(view -> {
            StringBuilder text = new StringBuilder();

            text.append("Total food is ");
            if (pizza.isChecked())
                text.append("\n Pizza ");

            if (momo.isChecked())
                text.append("\n Momo ");

            if (tacos.isChecked())
                text.append("\n Tacos ");

            if (pepsi.isChecked())
                text.append("\n Pepsi ");

            result.setText(text.toString());
        });
    }
}