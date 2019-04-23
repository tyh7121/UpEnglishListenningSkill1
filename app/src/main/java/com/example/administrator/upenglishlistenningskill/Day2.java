package com.example.administrator.upenglishlistenningskill;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.IOException;

public class Day2 extends AppCompatActivity {
    VideoView videoView;
    int position = 0;
    MediaController mediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);

        videoView = findViewById(R.id.videoView2);

        if(mediaController == null){
            mediaController = new MediaController(Day2.this);

            mediaController.setAnchorView(videoView);

            videoView.setMediaController(mediaController);
        }

        final String url = "https://zingmp3.vn/bai-hat/Em-Da-Thay-Anh-Cung-Nguoi-Ay-Huong-Giang/ZWABIBOD.html";

        Uri uri = Uri.parse(url);
        videoView.setVideoURI(uri);


        videoView.requestFocus();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.seekTo(position);

                try {
                    mp.setDataSource(url);


                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(position ==0){
                    videoView.start();
                }

                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        mediaController.setAnchorView(videoView);
                    }
                });
            }
        });
    }
}
