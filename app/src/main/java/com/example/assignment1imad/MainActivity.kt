package com.example.assignment1imad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //VARIABLE DECLARATION

        val textAgeInput = findViewById<EditText>(R.id.edtAgeInput)
        val generateButton = findViewById<Button>(R.id.btnGenerate)
        val clearButton = findViewById<Button>(R.id.btnClear)
        val textOutput = findViewById<TextView>(R.id.textOutput)

        // GENERATE BUTTON
        // THE BUTTON THAT GENERATES THE INFORMATION WITH THE INPUT AND RECIPROCATES IT INTO THE OUTPUT


        generateButton?.setOnClickListener {

            //VARIABLE DECLARATION

            var strPerson: String = ""
            var strHistoryAge: String = ""
            var intAge: Int


        }
    }
}




