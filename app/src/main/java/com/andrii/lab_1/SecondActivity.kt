package com.andrii.lab_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val myData = intent.getParcelableExtra<MyDataClass>("myData")
        val infoTextView = findViewById<TextView>(R.id.textView2)
        infoTextView.text = myData?.information
    }
}