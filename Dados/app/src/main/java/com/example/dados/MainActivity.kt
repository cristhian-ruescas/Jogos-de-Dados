package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jogarbt : Button = findViewById(R.id.button)
        jogarbt.setOnClickListener{
            rollDice()

        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll= dice.roll()
        val diceImage : ImageView = findViewById(R.id.imageView)
        val diceImage2 : ImageView = findViewById(R.id.imageView2)

        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            else -> diceImage.setImageResource(R.drawable.dice_6)
        }
        when (diceRoll) {
            1 -> diceImage2.setImageResource(R.drawable.um)
            2 -> diceImage2.setImageResource(R.drawable.dois)
            3 -> diceImage2.setImageResource(R.drawable.tres)
            4 -> diceImage2.setImageResource(R.drawable.quatro)
            5 -> diceImage2.setImageResource(R.drawable.cinco)
            else -> diceImage2.setImageResource(R.drawable.seis)

        }

    }
} class Dice(private val numSides : Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }