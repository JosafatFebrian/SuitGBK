package com.example.challange4v02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DisplayMassageActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_massage)

        val refresh = findViewById<ImageView>(R.id.refresh)
        refresh.setOnClickListener{
            val Intent = Intent(this, MakeChoiceActivity::class.java)
            startActivity(Intent)
        }

        val userChoice = intent.getStringExtra(EXTRA_MESSAGE)
        val userImage = findViewById<ImageView>(R.id.player_choice)
        var imgResId = R.drawable.batu

        when (userChoice){
            "player_batu" -> imgResId = R.drawable.batu
            "Player_gunting" -> imgResId = R.drawable.gunting
            "player_kertas" -> imgResId = R.drawable.kertas
            else -> R.drawable.batu

        }
        userImage.setImageResource(imgResId)

        fun generatedChoice (): String {
            val list = (0..2)
            val choice = list.shuffled().take(1)[0]
            val gbk = arrayOf("com_gunting","com_batu", "com_kertas")
            return gbk.elementAtOrElse(choice) {index -> "The Value for Index $index is undefined " }
        }
        val compChoice = generatedChoice()
        val compImage = findViewById<ImageView>(R.id.com_choice)
        var imgResIdcom = R.drawable.batu

        when (compChoice){
            "com_batu" -> imgResId = R.drawable.batu
            "com_gunting" -> imgResId = R.drawable.gunting
            "com_kertas" -> imgResId = R.drawable.kertas
            else -> R.drawable.batu
        }
        compImage.setImageResource(imgResIdcom)

        var display : String
        when{
            (userChoice == "player_batu" && compChoice == "com_kertas") -> display = "kalah"
            (userChoice == "player_gunting" && compChoice == "com_batu") -> display = "kalah"
            (userChoice == "player_kertas" && compChoice == "com_gunting") -> display = "kalah"
            (userChoice == "player_batu" && compChoice == "com_batu") -> display = "seri"
            (userChoice == "player_gunting" && compChoice == "com_gunting") -> display = "seri"
            (userChoice == "player_kertas" && compChoice == "com_kertas") -> display = "seri"
        else -> display ="menang"
        }
        val ribonChose = display
        val ribonImage =findViewById<ImageView>(R.id.ribon)
        var imgRibonId = R.drawable.ribon_menang

        when (ribonChose) {
            "kalah" -> imgRibonId = R.drawable.ribon_kalah
            "seri" -> imgRibonId = R.drawable.ribon_seri
            "menang" -> imgRibonId = R.drawable.ribon_menang
            else -> R.drawable.ribon_menang
        }
        ribonImage.setImageResource(imgRibonId)

    }
}