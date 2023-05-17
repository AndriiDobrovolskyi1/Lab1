package com.andrii.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val myData = MyDataClass("A cat is a small domesticated carnivorous mammal that is often kept as a pet.\n" +
                    "Cats are known for their agility, grace, and independent nature.\n" +
                    "They have a compact body, sharp retractable claws, and a well-developed sense of balance.\n" +
                    "Cats are known for their ability to hunt and catch prey, but they are also valued for their companionship\n" +
                    "and ability to form close bonds with humans.\n")
            intent.putExtra("myData", myData)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val myData = MyDataClass("A dog is a domesticated mammal often kept as a pet.\n" +
                    "Dogs are known for their loyalty, playfulness, and sociable nature.\n" +
                    "They have a medium-sized body, non-retractable claws, and a keen sense of smell.\n" +
                    "Dogs are valued for their ability to be trained, provide protection, and offer companionship.\n" +
                    "They form strong bonds with humans and are known for their devotion and affection.")
            intent.putExtra("myData", myData)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val myData = MyDataClass("A hamster is a small domesticated rodent commonly kept as a pet.\n" +
                    "Hamsters are known for their cute appearance, small size, and playful nature.\n" +
                    "They have a compact body, short legs, and sharp front teeth for gnawing.\n" +
                    "Hamsters are primarily kept for companionship and entertainment.\n" +
                    "They are nocturnal animals and enjoy exploring their habitat through tunnels and wheels.\n" +
                    "Hamsters are relatively low-maintenance pets and can form bonds with their owners.")
            intent.putExtra("myData", myData)
            startActivity(intent)
        }
    }
}
