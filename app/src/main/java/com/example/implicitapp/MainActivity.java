package com.example.implicitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   // Button btn; dont have to do it but still works tho
    // The button is already declared and initialized inside the onCreate method using findViewById


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn =findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an implicit intent to view a web URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // Set the data for the intent to the specified URL
                intent.setData(Uri.parse("https://www.google.com/")); //uri class and parse
                // Start the activity to handle the intent                  //is used to covert to
                startActivity(intent);
            }
        });




    }
}