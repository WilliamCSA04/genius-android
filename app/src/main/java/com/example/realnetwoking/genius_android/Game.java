package com.example.realnetwoking.genius_android;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);AlertDialog alert = new AlertDialog.Builder(Game.this).create();
        alert.setTitle("Not implemented yet");
        alert.setMessage("The game activity is being developed");
        alert.show();

    }
}
