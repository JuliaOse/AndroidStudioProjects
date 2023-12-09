package com.example.revision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private Button button = findViewById(R.id.button1);
    private String[] suggestions = {"Apple", "Banana", "Berries", "Eclairs", "Cherry", "Grapes", "Orange", "Strawberry"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, suggestions);

        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number = Uri.parse("tel:0209215122");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

    }

}