package com.my.day3task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var number= Random.nextInt(0,1000)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton= findViewById<TextView>(R.id.clickButton)
        val typeValue=findViewById<TextInputLayout>(R.id.typeText)
        val guess=findViewById<TextView>(R.id.guessView)

        clickButton.setOnClickListener{
          val numberGuess=typeValue.editText?.text.toString().toInt()

           when{
               number>numberGuess!! ->{
                   guess.text="no :)) My Number is Bigger"
               }
               number<numberGuess!! ->{
                   guess.text="no :)) My Number is Smaller"

               }
               number==numberGuess!! ->
               {
                   guess.text="You are right!"
               }
           }

        }
    }
}