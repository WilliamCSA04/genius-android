package com.example.realnetwoking.genius_android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;

public class Main extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        addListenerOnButton();

    }

    public void addListenerOnButton() {

        Button button = (Button) findViewById(R.id.startButton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                AlertDialog alert = new AlertDialog.Builder(Main.this).create();
                alert.setTitle("Not implemented yet");
                alert.setMessage("The game activity is being developed");
                alert.show();
            }

        });

    }
}
