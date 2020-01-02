package com.example.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button enterButton;
    private EditText enterGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterButton = findViewById(R.id.enter_button);
        enterGuess = findViewById(R.id.name_text);


        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String guess = enterGuess.getText().toString().trim();

                if (!guess.isEmpty()){

                    Intent intent = new Intent(MainActivity.this, ShowGuess.class);
                    intent.putExtra("Nesar", guess);
                    intent.putExtra("James", "Bond");
                    intent.putExtra("Aaron", 25);

                    startActivity(intent); //order matters

                } else {
                    Toast.makeText(MainActivity.this, "Enter a text please", Toast.LENGTH_LONG).show();
                }
                //allows you to switch between pages


                // Alternatively: startActivity(new Intent(MainActivity.this,ShowGuess.class));

            }
        });
    }
}
