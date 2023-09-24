package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(String s, String x, String y){
        Intent intent=new Intent(this, calculatorActivity.class);
        intent.putExtra("op",s);
        intent.putExtra("a", x);
        intent.putExtra("b", y);
        startActivity(intent);
    }

    public void clickAdd(View view){
        Button operation = (Button) findViewById(R.id.add);
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(operation.getText().toString(), myTextField1.getText().toString(), myTextField2.getText().toString());
    }

    public void clickMinus(View view){
        Button operation = (Button) findViewById(R.id.minus);
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(operation.getText().toString(), myTextField1.getText().toString(), myTextField2.getText().toString());
    }

    public void clickMultiply(View view){
        Button operation = (Button) findViewById(R.id.multiply);
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(operation.getText().toString(), myTextField1.getText().toString(), myTextField2.getText().toString());
    }

    public void clickDivide(View view){
        Button operation = (Button) findViewById(R.id.divide);
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(operation.getText().toString(), myTextField1.getText().toString(), myTextField2.getText().toString());
    }

}