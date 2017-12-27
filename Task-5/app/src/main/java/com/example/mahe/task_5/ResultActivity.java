package com.example.mahe.task_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent switched = getIntent();
        int score = switched.getIntExtra("score",0);
        TextView t1 = (TextView)findViewById(R.id.result);
        t1.setText(Integer.toString(score)+" / 3");
    }
}
