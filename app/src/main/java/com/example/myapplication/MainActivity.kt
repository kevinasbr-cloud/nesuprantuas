package com.example.myapplication // Keep your original package name line here!

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            textView.text = "Button Clicked!"
        }
    }
}