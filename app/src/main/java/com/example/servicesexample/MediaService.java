package com.example.servicesexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MediaService extends Service {
    MediaPlayer ambientMediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        ambientMediaPlayer=MediaPlayer.create(this, R.raw.papa);
        ambientMediaPlayer.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        ambientMediaPlayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        ambientMediaPlayer.stop();
    }
}
