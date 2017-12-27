package com.example.mahe.task_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        Intent switched = getIntent();
        final int score = switched.getIntExtra("score",0);
        Button b1 = (Button)findViewById(R.id.option1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startgame = new Intent(Question3.this,ResultActivity.class);
                startgame.putExtra("score",score+1);
                startActivity(startgame);
            }
        });
        Button b2 = (Button)findViewById(R.id.option2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startgame = new Intent(Question3.this,ResultActivity.class);
                startgame.putExtra("score",score);
                startActivity(startgame);
            }
        });
        Button b3 = (Button)findViewById(R.id.option3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startgame = new Intent(Question3.this,ResultActivity.class);
                startgame.putExtra("score",score);
                startActivity(startgame);
            }
        });
        Button b4 = (Button)findViewById(R.id.option4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startgame = new Intent(Question3.this,ResultActivity.class);
                startgame.putExtra("score",score);
                startActivity(startgame);
            }
        });
        Button b5 = (Button)findViewById(R.id.finish);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startgame = new Intent(Question3.this,ResultActivity.class);
                startgame.putExtra("score",score);
                startActivity(startgame);
            }
        });
    }
}
