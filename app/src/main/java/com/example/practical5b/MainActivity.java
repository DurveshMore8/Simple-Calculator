package com.example.practical5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText n1 = findViewById(R.id.number1);
        TextInputEditText n2 = findViewById(R.id.number2);

        Button add = findViewById(R.id.Add);
        Button subtract = findViewById(R.id.Sub);
        Button multi = findViewById(R.id.Multi);
        Button div = findViewById(R.id.Div);

        TextView answer = findViewById(R.id.answer);

        add.setOnClickListener(view -> {
            if(String.valueOf(n1.getText()).isEmpty() || String.valueOf(n2.getText()).isEmpty()) {
                message = "Incorrect Input";
                answer.setText(message);
            }
            else {
                message = "Addition is " + (Integer.parseInt(String.valueOf(n1.getText())) + Integer.parseInt(String.valueOf(n2.getText())));
                answer.setText(message);
            }
        });

        subtract.setOnClickListener(view -> {
            if(String.valueOf(n1.getText()).isEmpty() || String.valueOf(n2.getText()).isEmpty()) {
                message = "Incorrect Input";
                answer.setText(message);
            }
            else {
                message = "Subtraction is " + (Integer.parseInt(String.valueOf(n1.getText())) - Integer.parseInt(String.valueOf(n2.getText())));
                answer.setText(message);
            }
        });

        multi.setOnClickListener(view -> {
            if(String.valueOf(n1.getText()).isEmpty() || String.valueOf(n2.getText()).isEmpty()) {
                message = "Incorrect Input";
                answer.setText(message);
            }
            else {
                message = "Multiplication is " + (Integer.parseInt(String.valueOf(n1.getText())) * Integer.parseInt(String.valueOf(n2.getText())));
                answer.setText(message);
            }
        });

        div.setOnClickListener(view -> {
            if(String.valueOf(n1.getText()).isEmpty() || String.valueOf(n2.getText()).isEmpty()) {
                message = "Incorrect Input";
                answer.setText(message);
            }
            else {
                message = "Division is " + (Integer.parseInt(String.valueOf(n1.getText())) / Integer.parseInt(String.valueOf(n2.getText())));
                answer.setText(message);
            }
        });
    }
}