package com.example.studente.Calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.studente.myapplication.ResultActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private static String expr;
    private static boolean first = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        if (first) {
            expr = "";
            first = false;
        }
        tv.setText(expr);
    }

    public void cipherPressed(View view) {
        expr += ((Button) view).getText().toString();
        tv.setText(expr);
    }

    public void operatorPressed(View view) {
        expr += ((Button) view).getText().toString();
        tv.setText(expr);
    }

    public void equalsPressed(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(getString(R.string.expr), expr);
        startActivity(intent);
    }

    public void bkspPressed(View view) {
        if(expr.length()>0) {
            expr = expr.substring(0, expr.length() - 1);
            tv.setText(expr);
        }
    }
}
