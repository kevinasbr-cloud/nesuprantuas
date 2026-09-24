package com.example.myapplication // Keep your actual package name here

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)
        val buttonColor = findViewById<Button>(R.id.buttonColor)

        // Step 4: Button 1 click handler -> Change text content
        button1.setOnClickListener {
            textView.text = "Button Clicked!"
        }

        // Step 7: Button 2 click handler -> Change text color
        buttonColor.setOnClickListener {
            textView.setTextColor(Color.RED)
        }
    }
}