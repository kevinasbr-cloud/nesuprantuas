package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<ConstraintLayout>(R.id.mainLayout)
        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)
        val buttonColor = findViewById<Button>(R.id.buttonColor)
        val buttonBgColor = findViewById<Button>(R.id.buttonBgColor)

        // Step 4: Change text
        button1.setOnClickListener {
            textView.text = "Button Clicked!"
        }

        // Step 7: Change text color
        buttonColor.setOnClickListener {
            textView.setTextColor(Color.RED)
        }

        // Step 10: Change background color
        buttonBgColor.setOnClickListener {
            mainLayout.setBackgroundColor(Color.LTGRAY)
        }
    }
}