package com.acyonix.samplemediaplayerapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mediaPlayer = MediaPlayer.create(this, R.raw.sample_audio);
    }

    @OnClick(R.id.start)
    public void startButtonClicked() {
        mediaPlayer.start();
    }

    @OnClick(R.id.pause)
    public void pauseButtonClicked() {
        mediaPlayer.pause();
    }

    @OnClick(R.id.stop)
    public void stopButtonClicked() {
        mediaPlayer.stop();
        try {
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
