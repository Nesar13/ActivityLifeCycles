package com.example.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button enterButton;
    private EditText enterGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterButton = findViewById(R.id.enter_button);
        enterGuess= findViewById(R.id.name_text);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String guess=enterGuess.getText().toString().trim();;
                //allows you to switch between pages
                Intent intent = new Intent(MainActivity.this, ShowGuess.class);
                intent.putExtra("Nesar", "Hello there!");
                startActivity(intent); //order matters

                // Alternatively: startActivity(new Intent(MainActivity.this,ShowGuess.class));

            }
        });
    }
}
