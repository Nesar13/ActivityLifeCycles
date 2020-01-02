package com.example.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView showGuessText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        showGuessText = findViewById(R.id.received_text);

        //Bundle is a way to map String keys, retrieving data
        Bundle getValues = getIntent().getExtras();

//        Bundle getValues=getIntent().getExtras(); //

        if (getValues != null) {

            //had to use String.valueOf(int)
            showGuessText.setText(String.valueOf(getValues.getInt("Aaron"))); // using Bundle, another way of doing getIntent().getStringExtra("Nesar)"
            Log.d("Extra 1", "onCreate: " + getValues.getString("Nesar"));
            Log.d("Extra 2", "onCreate: " + getValues.getString("James"));

        }

        showGuessText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();

                intent.putExtra("message_back", "From Second Activity");
                setResult(RESULT_OK, intent); // setResult method, pass the result code

                finish(); //pop outs of stack



            }
        });

//        if ((getIntent().getStringExtra("Nesar") != null)) {
//            String name = getIntent().getStringExtra("Nesar");
//
//            showGuessText.setText(name);
//
//
//        }
    }
}
