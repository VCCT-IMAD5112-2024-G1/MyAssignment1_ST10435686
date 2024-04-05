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

        // VARIABLE DECLARATION

        val textAgeInput = findViewById<EditText>(R.id.edtAgeInput)
        val generateButton = findViewById<Button>(R.id.btnGenerate)
        val clearButton = findViewById<Button>(R.id.btnClear)
        val textOutput = findViewById<TextView>(R.id.textOutput)

        // GENERATE BUTTON

        generateButton?.setOnClickListener {

            //VARIABLE DECLARATION

            var strPerson: String = ""
            var strHistoryAge: String = ""
            var intAge : Int

            intAge = textAgeInput.text.toString().toInt()

            // IF STATEMENT TO CHECK WHETHER THE INTEGER VALUE GIVEN IS WITHIN THE REQUIRED RANGE
            // HI

            if (intAge >= 20 && intAge <= 100) {

                //PROCESSING OF FINDING A MATCHING INTEGER

                if (intAge == 25) {
                    strPerson = "Tupac Shakur"
                    strHistoryAge = "25"
                } else if (intAge == 35) {
                    strPerson = "Wolfgang Amadeus Mozart"
                    strHistoryAge = "35"
                } else if (intAge == 42) {
                    strPerson = "Elvis Presley"
                    strHistoryAge = "42"
                } else if (intAge == 45) {
                    strPerson = "Freddy Mercury"
                    strHistoryAge = "45"
                } else if (intAge == 51) {
                    strPerson = "Napoléon Bonaparte"
                    strHistoryAge = "51"
                } else if (intAge == 56) {
                    strPerson = "Abraham Lincoln"
                    strHistoryAge = "56"
                } else if (intAge == 67) {
                    strPerson = "George Washington"
                    strHistoryAge = "67"
                } else if (intAge == 73) {
                    strPerson = "Charles Darwin"
                    strHistoryAge = "73"
                } else if (intAge == 83) {
                    strPerson = "Thomas Jefferson"
                    strHistoryAge = "83"
                } else if (intAge == 95) {
                    strPerson = "Nelson Mandela"
                    strHistoryAge = "95"
                }
                textOutput.setText(strPerson + " died at the age of " + strHistoryAge + ". This is the same age which you are currently! They are a famous historical figure.")

                if (intAge != 25 && intAge != 35 && intAge != 42 && intAge != 45 && intAge != 51 && intAge != 56 && intAge != 67 && intAge != 73 && intAge != 83 && intAge != 95) {
                    textOutput.setText("There are no famous historical figures who share the same age as you do. Please try a different age!")
                }
            } else{
                textOutput.setText("Invalid age! Please use an age between 20 and 100!") // ERROR MESSAGE OUTPUT FOR THE RANGE CHECK
            }
        }

        // CLEAR BUTTON

        clearButton?.setOnClickListener{
            textAgeInput.setText("")
            textOutput.setText("")
        }

    }

}




