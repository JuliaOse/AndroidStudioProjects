package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.convert_button)
        val rawAmount = findViewById<EditText>(R.id.raw_amount)
        val convertedValue = findViewById<TextView>(R.id.display_value)

        button.setOnClickListener {
            val inputAmount = rawAmount.text.toString().toFloat()
            val convertedAmount = inputAmount * 12.26
            convertedValue.text = "¢$convertedAmount"
        }
    }
}