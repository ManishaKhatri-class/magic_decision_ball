package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnAsk;
    ImageView imgBall;
    TextView textView;
     Random randomNumberGen;
     int number;
     final int[] ball_array={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,
     R.drawable.ball5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        imgBall=(ImageView)findViewById(R.id.image_eightBall);
        btnAsk=(Button)findViewById(R.id.btnAsk);
        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNumberGen=new Random();
                number=randomNumberGen.nextInt(5);
                imgBall.setImageResource(ball_array[number]);

            }
        });

    }
}
