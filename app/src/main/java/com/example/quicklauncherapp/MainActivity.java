package com.example.quicklauncherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_secondActivity = findViewById(R.id.b_secondActivity);

        // Launching an activity within our own app
        b_secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("Something Bro!", "Hello World! You are in the Second Activity.");
                startActivity(startIntent);

                /*
                 putExtra(): Passes data as a key:value pair.
                 startActivity(): Used to launch another activity.
                */

            }
        });

        // Launching an activity outside our app
        Button b_google = findViewById(R.id.b_google);
        b_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String google = "https://www.google.com";
                Uri web_address = Uri.parse(google);

                Intent browser_Intent = new Intent(Intent.ACTION_VIEW, web_address);
                startActivity(browser_Intent);

                /*
                 OR
                 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                 startActivity(browserIntent);
                */

            }
        });


    }
}