package com.example.challange4v02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

const val  EXTRA_MESSAGE="com.example.challange4v02.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)

        val startButton = findViewById<Button>(R.id.start_button)
        startButton.setOnClickListener{
            val Intent = Intent(this, MakeChoiceActivity::class.java)
            startActivity(Intent)
        }
    }
}