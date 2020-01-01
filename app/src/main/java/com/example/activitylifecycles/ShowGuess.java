package com.example.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView showGuessText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        showGuessText = findViewById(R.id.received_text);

        if ((getIntent().getStringExtra("Nesar") != null)) {
            String name = getIntent().getStringExtra("Nesar");

            showGuessText.setText(name);


        }
    }
}
