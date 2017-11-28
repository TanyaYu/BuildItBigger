package com.example.androidjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE_STRING = "extra.joke";

    //todo butter knife
    private TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        jokeTextView = findViewById(R.id.tv_joke);

        if(getIntent().hasExtra(EXTRA_JOKE_STRING)) {
            jokeTextView.setText(getIntent().getStringExtra(EXTRA_JOKE_STRING));
        }
    }
}
