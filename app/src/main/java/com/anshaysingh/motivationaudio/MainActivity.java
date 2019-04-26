package com.anshaysingh.motivationaudio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.goals );
    }

    public void onClick(View view) {
        if(mp.isPlaying())
            mp.pause();
        int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);
        int resId = getResources().getIdentifier(ourId, "raw", "com.anshaysingh.motivationaudio");
        mp = MediaPlayer.create(this, resId);

        mp.start();
    //    Log.i("ButtonID", Integer.toString(view.getId()));

    }

}
