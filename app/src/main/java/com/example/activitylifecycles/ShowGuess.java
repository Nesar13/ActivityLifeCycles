package com.example.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView showGuessText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        showGuessText = findViewById(R.id.received_text);

        //Bundle is a way to map String keys, retrieving data
        Bundle getValues=getIntent().getExtras();

//        Bundle getValues=getIntent().getExtras(); //

        if (getValues != null){

            //had to use String.valueOf(int)
            showGuessText.setText(String.valueOf(getValues.getInt("Aaron"))); // using Bundle, another way of doing getIntent().getStringExtra("Nesar)"
            Log.d("Extra 1", "onCreate: "+ getValues.getString("Nesar"));
            Log.d("Extra 2", "onCreate: "+ getValues.getString("James"));

        }

//        if ((getIntent().getStringExtra("Nesar") != null)) {
//            String name = getIntent().getStringExtra("Nesar");
//
//            showGuessText.setText(name);
//
//
//        }
    }
}
