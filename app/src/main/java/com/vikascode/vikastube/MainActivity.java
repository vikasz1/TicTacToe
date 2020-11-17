package com.vikascode.vikastube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView pexels = findViewById(R.id.pexels);
        pexels.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cow);
        MediaController mediaController = new MediaController(this);
        pexels.setMediaController(mediaController);
        mediaController.setAnchorView(pexels);
        pexels.start();
    }
}
