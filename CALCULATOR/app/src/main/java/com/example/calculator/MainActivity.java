package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double firstnum;
    String operation;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn0 = findViewById(R.id.btn0);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnEquals = findViewById(R.id.btnEquals);
        Button btnClear = findViewById(R.id.btnClear);

        TextView result =findViewById(R.id.result);

        btnClear.setOnClickListener(View ->
        {
            firstnum = 0;
            result.setText("0");
        });

        ArrayList<Button> btn = new ArrayList<>();
        btn.add(btn0);
        btn.add(btn1);
        btn.add(btn2);
        btn.add(btn3);
        btn.add(btn4);
        btn.add(btn5);
        btn.add(btn6);
        btn.add(btn7);
        btn.add(btn8);
        btn.add(btn9);


        for(Button b: btn)
        {
            b.setOnClickListener(View -> {
                if (!result.getText().toString().equals("0")) {
                    result.setText(result.getText().toString() + b.getText().toString());
                } else {
                    result.setText(b.getText().toString());
                }
            });
        }

        ArrayList<Button> operator = new ArrayList<>();
        operator.add(btnPlus);
        operator.add(btnMinus);
        operator.add(btnDivide);
        operator.add(btnMultiply);

        for (Button b : operator)
        {
            b.setOnClickListener(View ->
            {
                firstnum = Double.parseDouble(result.getText().toString());
                operation = b.getText().toString();
                result.setText("0");
            });
        }


        btnEquals.setOnClickListener(View ->
        {
            double secondNum = Double.parseDouble(result.getText().toString());
            double result1;
            switch (operation)
            {
                case "/":
                    result1 = firstnum/secondNum;
                    break;
                case "x":
                    result1 = firstnum*secondNum;
                    break;
                case "+":
                    result1 = firstnum + secondNum;
                    break;
                case "-":
                    result1 = firstnum - secondNum;
                    break;
                default:
                    result1 = 0;
            }
            result.setText(String.valueOf(result1));
            firstnum = result1;

        });



    }
}