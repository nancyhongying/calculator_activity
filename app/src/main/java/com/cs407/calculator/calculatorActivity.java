package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculatorActivity extends AppCompatActivity {

    private String x;
    private String y;

    TextView textView;

    double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        textView =(TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        x = intent.getStringExtra("a");
        y = intent.getStringExtra("b");
        boolean isNumbers = x.matches("^\\d+$");
        boolean isNumbers2 = y.matches("^\\d+$");
        String operation = intent.getStringExtra("op");
        System.out.println(y);
        System.out.println(operation);
        if (operation.equals("/") && y.equals("0")){
            System.out.println("here");
            textView.setText("Divide by Zero Error");
        }
        else if (isNumbers2 && isNumbers){
            res = performOperation(operation);
            System.out.println(res);
            System.out.println(x);
            System.out.println(y);
            textView.setText(String.valueOf(res));
        }else{
            textView.setText("Invalid Input");
        }

    }

    private double performOperation(String operation) {
        double num1 = Double.parseDouble(x);
        double num2 = Double.parseDouble(y);
        double result = 0;

        if (operation.equals("+")) {
            return num1 + num2;
        } else if (operation.equals("-")) {
            return num1 - num2;
        } else if (operation.equals("*")) {
            return num1 * num2;
        } else {
            return num1 / num2;
        }

    }
}
