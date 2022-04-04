package com.example.challange4v02

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity



class MakeChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("hasil debug","ini make chice")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gunting =  findViewById<ImageView>(R.id.player_gunting)
        gunting.setOnClickListener{
            sendMessageGunting()
        }

        val batu = findViewById<ImageView>(R.id.player_batu)
        batu.setOnClickListener{
            sendMessageBatu()
        }

        val kertas = findViewById<ImageView>(R.id.player_kertas)
        kertas.setOnClickListener{
            sendMessageKertas()
        }
}


    fun sendMessageGunting (){
        Log.d("hasil debug","ini hasulnya")
        val playerGunting = findViewById<ImageView>(R.id.player_gunting)
        val message = "player_gunting"
        val intent = Intent (this, DisplayMassageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)


        }
        startActivity(intent)
    }

    fun sendMessageBatu (){
        val playerBatu = findViewById<ImageView>(R.id.player_batu)
        val message = "player_batu"
        val intent = Intent (this, DisplayMassageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun sendMessageKertas (){
        val playerKertas = findViewById<ImageView>(R.id.player_kertas)
        val message = "player_kertas"
        val intent = Intent (this, DisplayMassageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}