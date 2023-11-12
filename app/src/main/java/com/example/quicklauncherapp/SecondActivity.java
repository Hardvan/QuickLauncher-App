package com.example.quicklauncherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("Something Bro!")) {

            TextView tv_secondActivity = findViewById(R.id.tv_secondActivity);
            String text = getIntent().getExtras().getString("Something Bro!");
            tv_secondActivity.setText(text);

            // getExtras().getString(): Retrieve the String that was passed to the Intent object.

        }

    }
}