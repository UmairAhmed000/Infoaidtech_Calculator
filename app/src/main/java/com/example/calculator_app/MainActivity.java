package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button equal;
    private Button clear;
    private Button add;
    private Button sub;
    private Button div;
    private Button mul;
    private TextView input;
    private TextView result;
    private final char ADD='+';
    private final char SUB='-';
    private final char MUL='*';
    private final char DIV='/';
    private final char EQU=0;
    private double val1 = Double.NaN;
    private double val2 = Double.NaN;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "0");

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "9");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADD;
                result.setText(String.valueOf(val1) + "+");
                input.setText(null);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUB;
                result.setText(String.valueOf(val1) + "-");
                input.setText(null);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    compute();
                    ACTION = DIV;
                    result.setText(String.valueOf(val1) + "/");
                    input.setText(null);
                }

        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MUL;
                result.setText(String.valueOf(val1) + "*");
                input.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    compute();
                    ACTION = EQU;
                        result.setText(String.valueOf(val1));
                        input.setText(null);
                    }


        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
        }
    private void setupView(){
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        zero = (Button) findViewById(R.id.button0);
        add = (Button) findViewById(R.id.buttonadd);
        sub = (Button) findViewById(R.id.buttonsub);
        mul = (Button) findViewById(R.id.buttonmul);
        div = (Button) findViewById(R.id.buttondiv);
        input = (TextView) findViewById(R.id.input);
        result = (TextView) findViewById(R.id.result);
        equal = (Button) findViewById(R.id.buttonequal);
        clear = (Button) findViewById(R.id.buttonclear);
    }
    private void reset(){
        val1 = Double.NaN;
        val2 = Double.NaN;
        input.setText("");
        result.setText("");
    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(input.getText().toString());

            switch (ACTION)
            {
                case ADD:
                    val1 = val1 + val2;
                    break;
                case SUB:
                    val1 = val1 - val2;
                    break;
                case MUL:
                    val1 = val1 * val2;
                    break;
                case DIV:
                    if (val2!=0.0) {

                        val1 = val1 / val2;
                    }
                    else {
                        Toast.makeText(this, "Mathematical Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case EQU:
                    break;


            }

        }
        else {
            val1 = Double.parseDouble(input.getText().toString());
        }
    }
}