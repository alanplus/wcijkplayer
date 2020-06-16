package com.alan.wcijkplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.xiao.nicevideoplayer.NiceVideoPlayer;
import com.xiao.nicevideoplayer.NiceVideoPlayerController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NiceVideoPlayer niceVideoPlayer = findViewById(R.id.nice_player);
        niceVideoPlayer.setUp("http://192.168.1.90:3000/file/陈慧琳-都是你的错.mkv", null);
        niceVideoPlayer.setController(new NiceVideoPlayerController(this) {
            @Override
            public void setTitle(String title) {

            }

            @Override
            public void setImage(int resId) {

            }

            @Override
            public ImageView imageView() {
                return null;
            }

            @Override
            public void setLenght(long length) {

            }

            @Override
            public void setLenght(String length) {

            }

            @Override
            protected void onPlayStateChanged(int playState) {

            }

            @Override
            protected void onPlayModeChanged(int playMode) {

            }

            @Override
            protected void reset() {

            }

            @Override
            protected void updateProgress() {

            }

            @Override
            protected void showChangePosition(long duration, int newPositionProgress) {

            }

            @Override
            protected void hideChangePosition() {

            }

            @Override
            protected void showChangeVolume(int newVolumeProgress) {

            }

            @Override
            protected void hideChangeVolume() {

            }

            @Override
            protected void showChangeBrightness(int newBrightnessProgress) {

            }

            @Override
            protected void hideChangeBrightness() {

            }
        });
        niceVideoPlayer.start();
    }
}
