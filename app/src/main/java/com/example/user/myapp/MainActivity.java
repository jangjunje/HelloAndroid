package com.example.user.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button mbtnOk;
    EditText metName;
    TextView mtvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안녕하세요");

        mbtnOk  = (Button)findViewById(R.id.btnOk);
        metName = (EditText)findViewById(R.id.etName);
        mtvName = (TextView)findViewById(R.id.tvName);

        mbtnOk.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mtvName.setText("안녕하세요 : " + metName.getText().toString());
                return false;
            }
        });
    }
}
