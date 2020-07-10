package com.example.carolinebot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img =(ImageView) findViewById(R.id.image);
        txt = (TextView) findViewById(R.id.txtsplash);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        img.startAnimation(animation);
        txt.startAnimation(animation);

        final Intent intent = new Intent(this, MainScreen.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }

        };
        timer.start();
    }
}
