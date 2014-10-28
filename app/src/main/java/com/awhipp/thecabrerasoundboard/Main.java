package com.awhipp.thecabrerasoundboard;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class Main extends Activity {

    MediaPlayer georgeMasonMp;
    MediaPlayer jorgeMasonMp;
    MediaPlayer happyBirthdayMp;
    MediaPlayer felizCumpleMp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button georgeMason = (Button) findViewById(R.id.george_button);
        Button jorgeMason = (Button) findViewById(R.id.jorge_button);
        Button happyBirthday = (Button) findViewById(R.id.birthday_button);
        Button felizCumple = (Button) findViewById(R.id.feliz_button);

        try {
            georgeMasonMp = MediaPlayer.create(this, R.raw.georgemason);
            georgeMasonMp.setAudioStreamType(AudioManager.STREAM_MUSIC);

            jorgeMasonMp = MediaPlayer.create(this, R.raw.jorgemason);
            jorgeMasonMp.setAudioStreamType(AudioManager.STREAM_MUSIC);

            happyBirthdayMp = MediaPlayer.create(this, R.raw.happybirthday);
            happyBirthdayMp.setAudioStreamType(AudioManager.STREAM_MUSIC);

            felizCumpleMp = MediaPlayer.create(this, R.raw.felizcumpleanos);
            felizCumpleMp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        }catch(Exception e){
            e.printStackTrace();
        }

        georgeMason.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                georgeMasonMp.start();
            }
        });

        jorgeMason.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                jorgeMasonMp.start();
            }
        });

        happyBirthday.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                happyBirthdayMp.start();
            }
        });

        felizCumple.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                felizCumpleMp.start();
            }
        });

    }

    protected void onDestroy(){
        super.onDestroy();
        georgeMasonMp.pause();
        georgeMasonMp.release();

        jorgeMasonMp.pause();
        jorgeMasonMp.release();

        happyBirthdayMp.pause();
        happyBirthdayMp.release();

        felizCumpleMp.pause();
        felizCumpleMp.release();

    }

    protected void onPause(){
        super.onPause();
    }

    protected void onResume(){
        super.onResume();
    }

}
