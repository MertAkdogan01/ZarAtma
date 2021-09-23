package com.mertakdogan.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var rollButton : Button
    lateinit var textSayi : TextView
    lateinit var imageSerdar : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        rollButton = findViewById(R.id.roll_button)
        textSayi = findViewById(R.id.textView)
        imageSerdar = findViewById(R.id.imageSerdar)



        rollButton.setOnClickListener {
            rollDice()

        }


    }

    private fun rollDice() {

        val randomInt = Random.nextInt(1,7)
        val drawbleResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawbleResource2 = when(randomInt){
            1 -> R.drawable.empty_dice
            2 -> R.drawable.empty_dice
            3 -> R.drawable.empty_dice
            4 -> R.drawable.empty_dice
            5 -> R.drawable.empty_dice
            else -> R.drawable.serdar
        }



        imageSerdar.setImageResource(drawbleResource2)

        diceImage.setImageResource(drawbleResource)

        textSayi.text = randomInt.toString()





    }


}