package com.example.challange4v02

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Log.DEBUG
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.BuildConfig.DEBUG
import com.example.challange4v02.BuildConfig.DEBUG

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