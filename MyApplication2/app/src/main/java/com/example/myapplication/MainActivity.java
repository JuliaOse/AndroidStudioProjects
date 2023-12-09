package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*

    public void handleText(View v){
        v.setEnabled(false);
        Toast.makeText(this, t.getText().toString(), Toast.LENGTH_SHORT).show();
    }
*/
    public void launchSettings(View v){
        Intent in = new Intent(this, settingsActivity.class);
        startActivity(in);
    }
}