package com.example.testfoodapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 1500; // Splash screen duration in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView fallingImage = findViewById(R.id.fallingImage);
        // Load animation
        startFallingAnimation(fallingImage);


        // Start MainActivity after SPLASH_DURATION milliseconds
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);
    }
    private void startFallingAnimation(ImageView imageView) {
        float middleY = getResources().getDisplayMetrics().heightPixels * 0.6f; // Adjust the value (0.6f) as needed

        // Calculate the distance to move from the current position to the stopping position
        float startY = -imageView.getY(); // Start from the top

        // Create TranslateAnimation
        Animation animation = new TranslateAnimation(0, 0, startY, middleY);
        animation.setDuration(1000); // Duration in milliseconds
        animation.setFillAfter(true);
        imageView.startAnimation(animation);
    }
}