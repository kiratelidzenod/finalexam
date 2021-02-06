package com.example.finals1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main_page.*

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)
        val travis_pic = "https://thumbor.forbes.com/thumbor/fit-in/416x416/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5ed670179e384f0007b7db8f%2F0x0.jpg%3Fbackground%3D000000%26cropX1%3D1032%26cropX2%3D3642%26cropY1%3D186%26cropY2%3D2795"
        Picasso.get().load(travis_pic).into(travis)
        val kanye_pic = "https://i.imgur.com/DIwRQyM.jpg?1"
        Picasso.get().load(kanye_pic).into(kanye)
        val kdot_pic = "https://i.imgur.com/4RTWfmg.jpg?1"
        Picasso.get().load(kdot_pic).into(kdot)
        init()
    }
    private fun init(){
        travispage.setOnClickListener(){
            goTravis()
        }
        kanyepage.setOnClickListener(){
            goKanye()
        }
        kdotpage.setOnClickListener(){
            goKdot()
        }
    }
    private fun goTravis(){
        val intent = Intent(this, TravisPage::class.java)
        startActivity(intent)
    }
    private fun goKanye(){
        val intent = Intent(this, KanyePage::class.java)
        startActivity(intent)
    }
    private fun goKdot(){
        val intent = Intent(this, KdotPage::class.java)
        startActivity(intent)
    }
}