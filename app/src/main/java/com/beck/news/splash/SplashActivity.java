package com.beck.news.splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.beck.news.R;
import com.beck.news.commons.BaseActivity;
import com.beck.news.main.widget.MainActivity;

import java.util.Random;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashActivity extends BaseActivity {
    private int[] images={
            R.mipmap.timg1,R.mipmap.timg2,R.mipmap.timg3,R.mipmap.timg4,R.mipmap.timg5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Random random=new Random();
        int nub=random.nextInt(images.length);
        ImageView iv_splash= (ImageView) findViewById(R.id.iv_splash);
        iv_splash.setImageResource(images[nub]);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                go2Main();
            }
        },3000);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
    private void go2Main(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
