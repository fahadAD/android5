package com.fahad.applicationfahad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    LinearLayout anim;
    TextView textView;
    ImageView imageView;
    Button button1,button2,button3,button4,button5,button6;
    Animation zoom_in;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoom_in= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_in);
        anim=findViewById(R.id.anim);
       textView=findViewById(R.id.textView);
       imageView=findViewById(R.id.imageView);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);






        anim.startAnimation(zoom_in);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                textView.setText(""+count);



            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count--;
                textView.setText(""+count);



            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count=0;
                textView.setText(""+count);



            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.setVisibility(View.GONE);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              imageView.setVisibility(View.VISIBLE);



            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);



            }
        });

    }
}