package com.sdacademy.gieysztor.michal.mp3player;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            dupstep = MediaPlayer.create(this, R.raw.bensound_dubstep)
    }
    }
}
