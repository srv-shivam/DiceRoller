package com.example.diceroller

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var iv_dice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_rollDice: Button = findViewById(R.id.btn_rollDice)
        iv_dice = findViewById(R.id.iv_dice)

        btn_rollDice.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        val random = (1..6).random()
        Log.i("RANDOM_VALUE", random.toString())

        val drawableImageResource = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        iv_dice.setImageResource(drawableImageResource)

    }
}