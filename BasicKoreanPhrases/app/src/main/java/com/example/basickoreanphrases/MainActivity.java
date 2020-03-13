package com.example.basickoreanphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){
        //retrieving the value of the specific button clicked
        int id = view.getId();
        String myId = "";
        myId = view.getResources().getResourceEntryName(id);
        //
        int resourceId = getResources().getIdentifier(myId, "raw", getPackageName());
        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();
        Log.i("Button tapped", Integer.toString(view.getId()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
