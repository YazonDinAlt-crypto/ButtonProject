package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputText: EditText
    private lateinit var convertButton: Button
    private lateinit var resultText: TextView
    private lateinit var charCountText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.inputText)
        convertButton = findViewById(R.id.convertButton)
        resultText = findViewById(R.id.resultText)
        charCountText = findViewById(R.id.charCountText)

        convertButton.setOnClickListener {
            val text = inputText.text.toString()
            val reversedText = text.reversed()
            val charCount = text.replace(" ", "").length

            resultText.text = reversedText
            charCountText.text = "Количество символов: $charCount"
        }
    }
}