package com.example.ques2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText dividend,divisor;
    TextView textView;
    Button calculateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dividend = findViewById(R.id.dividendET);
        divisor = findViewById(R.id.divisorET);
        textView = findViewById(R.id.textView);
        calculateBtn = findViewById(R.id.calculateBtn);

        calculateBtn.setOnClickListener(view -> {
            calculateFunc();
        });
    }

    private void calculateFunc() {
        double dividendDouble = 0,divisorDouble = 0;
        String dividendStr = dividend.getText().toString();
        String divisorStr = divisor.getText().toString();

        try {
            dividendDouble = Double.parseDouble(dividendStr);
            divisorDouble = Double.parseDouble(divisorStr);
        } catch (Exception e) {
            dividend.setError("Numbers only");
            divisor.setError("Numbers only");
            return;
        }

        if (divisorDouble == 0) {
            divisor.setError("\"0\" not permit");
            return;
        }
        double answer = dividendDouble/divisorDouble;
        textView.setText(String.valueOf(answer));
    }
}