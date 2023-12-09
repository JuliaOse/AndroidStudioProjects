package com.example.revision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private EditText textInput;
    private Button button;
    private TextView myTextView;

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView);
        textInput = findViewById(R.id.textInput);
        button = findViewById(R.id.button);
        myTextView = findViewById(R.id.myTextView);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

    }

    private void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void updateText(View v){
        textView1.setText(textInput.getText());
        myTextView.setText("Haha! You didn't think I'd let you change MY textView , did you?");
        textInput.setText("");
    }
}