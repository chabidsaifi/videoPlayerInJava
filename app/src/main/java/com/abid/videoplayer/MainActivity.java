package com.abid.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView3);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abid));

        videoView.setMediaController(new MediaController(this));

        videoView.start();
    }
}