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
    Button   mbtnDivide;

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
        mbtnDivide  = (Button)findViewById(R.id.btnDivide);

        mtextviewResult  = (TextView) findViewById(R.id.textResult);

        mbtnPlus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Double  result = Double.parseDouble(meditNum1.toString()) + Double.parseDouble(meditNum2.toString());

                mtextviewResult.setText("계산결과 " + result.toString());

                return false;
            }
        });

        mbtnMinus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Double  result = Double.parseDouble(meditNum1.toString()) - Double.parseDouble(meditNum2.toString());

                mtextviewResult.setText("계산결과 " + result.toString());

                return false;
            }
        });

        mbtnMultiply.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Double  result = Double.parseDouble(meditNum1.toString()) * Double.parseDouble(meditNum2.toString());

                mtextviewResult.setText("계산결과 " + result.toString());

                return false;
            }
        });

        mbtnDivide.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(Double.parseDouble(meditNum2.toString()) != 0) {
                    Double result = Double.parseDouble(meditNum1.toString()) / Double.parseDouble(meditNum2.toString());
                    mtextviewResult.setText("계산결과 " + result.toString());
                } else {
                    mtextviewResult.setText("0으로 나눌수 없습니다.");
                }

                return false;
            }
        });
    }
}
