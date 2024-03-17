package com.example.testfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.support.common.FileUtil;
import org.tensorflow.lite.support.label.LabelUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class CameraActivity extends AppCompatActivity {
    ImageView imageView;

    //    Interpreter interpreter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        imageView = findViewById(R.id.otherImageView);

        // Retrieve the image bitmap from the intent extras
        Bitmap imageBitmap = getIntent().getParcelableExtra("imageBitmap");
        // Display the image bitmap in the ImageView
        imageView.setImageBitmap(imageBitmap);

    }

}