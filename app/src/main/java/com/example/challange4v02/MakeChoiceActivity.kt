package com.example.challange4v02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity



class MakeChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
}
    fun sendMessageGunting (view: View){
        val playerGunting = findViewById<ImageView>(R.id.player_gunting)
        val message = playerGunting.id.toString()
        val intent = Intent (this, DisplayMassageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun sendMessageBatu (view: View){
        val playerBatu = findViewById<ImageView>(R.id.player_batu)
        val message = playerBatu.id.toString()
        val intent = Intent (this, DisplayMassageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun sendMessageKertas (view: View){
        val playerKertas = findViewById<ImageView>(R.id.player_kertas)
        val message = playerKertas.id.toString()
        val intent = Intent (this, DisplayMassageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}