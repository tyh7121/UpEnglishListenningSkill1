package com.example.administrator.upenglishlistenningskill;

import android.media.MediaPlayer;

import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.net.URL;

import static com.example.administrator.upenglishlistenningskill.R.raw.wildlife;

public class Day1 extends AppCompatActivity {

    private VideoView videoView;
    private int position = 0;
    private MediaController mediaController;
    //MediaPlayer mediaPlayer;
    String url = "https://zingmp3.vn/bai-hat/Em-Da-Thay-Anh-Cung-Nguoi-Ay-Huong-Giang/ZWABIBOD.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);

        videoView = findViewById(R.id.videoView);
        //mediaPlayer = MediaPlayer.create(this,R.raw.wildlife);
        //mediaPlayer.start();



        if(mediaController == null){

            mediaController = new MediaController(Day1.this);

            videoView.setMediaController(mediaController);

            mediaController.setAnchorView(videoView);


        }

        try {
            // ID của file video.
            //int id = this.getRawResIdByName("wildlife");
            //videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + id));
            Uri uri  = Uri.parse(url);
            videoView.setVideoURI(uri);

        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoView.requestFocus();
        videoView.setOnPreparedListener(new OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.seekTo(position);
                if (position == 0) {

                    videoView.start();
                }

                mp.setOnVideoSizeChangedListener(new OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        mediaController.setAnchorView(videoView);

                    }
                });
            }
        });
//        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                videoView.seekTo(position);
//                if (position == 0) {
//
//                    videoView.start();
//                }
//
//                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
//                    @Override
//                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
//                        mediaController.setAnchorView(videoView);
//
//                    }
//                });
//            }
//        });


    }
    // Tìm ID ứng với tên của file nguồn (Trong thư mục raw).
//    public int getRawResIdByName(String resName) {
//        String pkgName = this.getPackageName();
//
//        // Trả về 0 nếu không tìm thấy.
//        int resID = this.getResources().getIdentifier(resName, "raw", pkgName);
//        Log.i("AndroidVideoView", "Res Name: " + resName + "==> Res ID = " + resID);
//        return resID;
//    }



    // Khi bạn xoay điện thoại, phương thức này sẽ được gọi
    // nó lưu trữ lại ví trí file video đang chơi.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        // Lưu lại vị trí file video đang chơi.
        savedInstanceState.putInt("CurrentPosition", videoView.getCurrentPosition());
        videoView.pause();
    }


    // Sau khi điện thoại xoay chiều xong. Phương thức này được gọi,
    // bạn cần tái tạo lại ví trí file nhạc đang chơi.
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Lấy lại ví trí video đã chơi.
        position = savedInstanceState.getInt("CurrentPosition");
        videoView.seekTo(position);
    }
}
