package com.example.user.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText meditNum1;
    EditText meditNum2;
    TextView mtextviewResult;
    Button   mbtnPlus;
    Button   mbtnMinus;
    Button   mbtnMultiply;
    Button   mbtnDivided;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Simple Calculator");

        meditNum1    = (EditText)findViewById(R.id.num1);
        meditNum2    = (EditText)findViewById(R.id.num2);

        mbtnPlus     = (Button)findViewById(R.id.btnPlus);
        mbtnMinus    = (Button)findViewById(R.id.btnMinus);
        mbtnMultiply = (Button)findViewById(R.id.btnMultiply);
        mbtnDivided  = (Button)findViewById(R.id.btnDivided);

        mtextviewResult  = (TextView) findViewById(R.id.textResult);

        mbtnPlus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                String Num1 = meditNum1.getText().toString();
                String Num2 = meditNum2.getText().toString();

                Double  result = Double.parseDouble(Num1) + Double.parseDouble(Num2);

                mtextviewResult.setText("계산결과 " + result.toString());

                return false;
            }
        });

        mbtnMinus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                String Num1 = meditNum1.getText().toString();
                String Num2 = meditNum2.getText().toString();

                Double  result = Double.parseDouble(Num1) - Double.parseDouble(Num2);

                mtextviewResult.setText("계산결과 " + result.toString());

                return false;
            }
        });

        mbtnMultiply.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                String Num1 = meditNum1.getText().toString();
                String Num2 = meditNum2.getText().toString();

                Double  result = Double.parseDouble(Num1) * Double.parseDouble(Num2);

                mtextviewResult.setText("계산결과 " + result.toString());

                return false;
            }
        });

        mbtnDivided.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                String Num1 = meditNum1.getText().toString();
                String Num2 = meditNum2.getText().toString();

                //Integer result = Integer.parseInt(Num1) / Integer.parseInt(Num2);

                if(Double.parseDouble(Num2) != 0) {
                    Double result = Double.parseDouble(Num1) / Double.parseDouble(Num2);
                    mtextviewResult.setText("계산결과 " + result.toString());
                } else {
                    mtextviewResult.setText("0으로 나눌수 없습니다.");
                }

                return false;
            }
        });
    }
}
