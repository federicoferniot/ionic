package io.ionic.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withHeaderText("Ferniot Federico")
                .withFooterText("4º B")
                .withLogo(R.drawable.splash)
                .withBackgroundColor(Color.WHITE);

        config.getHeaderTextView().setTextColor(Color.BLACK);
        config.getFooterTextView().setTextColor(Color.BLACK);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}