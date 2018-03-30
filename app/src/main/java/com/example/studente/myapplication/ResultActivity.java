package com.example.studente.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.studente.Calculator.R;

import bsh.Interpreter;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Interpreter interpreter = new Interpreter();
        TextView tv=findViewById(R.id.textView2);
        try {
            interpreter.eval("result = " + getIntent().getStringExtra(getString(R.string.expr)));
            tv.setText(interpreter.get("result").toString());
        }
        catch(Exception e){
            tv.setText("0");
        }
    }
}
