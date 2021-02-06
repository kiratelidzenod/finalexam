package com.example.finals1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_travis_page.*

class TravisPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travis_page)
        val owlpharaohpic = "https://i.imgur.com/YrbP6RL.jpg?1"
        Picasso.get().load(owlpharaohpic).into(owlpharaoh)
        val beforerodeopic = "https://i.imgur.com/X5LXxNH.jpg?1"
        Picasso.get().load(beforerodeopic).into(beforerodeo)
        val rodeopic = "https://i.imgur.com/QnbrVlR.jpg?1"
        Picasso.get().load(rodeopic).into(rodeo)
        val bittsmpic = "https://i.imgur.com/dqEwUr8.jpg?1"
        Picasso.get().load(bittsmpic).into(bittsm)
        val hjjhpic = "https://i.imgur.com/yDcVsx2.jpg?1"
        Picasso.get().load(hjjhpic).into(hjjh)
        val astropic = "https://i.imgur.com/W5FRI5w.jpg?1"
        Picasso.get().load(astropic).into(astro)
        val jackboyspic = "https://i.imgur.com/GONi3Ji.jpg?1"
        Picasso.get().load(jackboyspic).into(jackboys)
        init()
    }
    private fun init(){
        jackboyslink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLATQ8iWXs4Gwb9zZkZnzEo7pEoTJH7By_"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        owllink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLsReBoZpZEChRw_aZb2e2_pV6DzFZliK-"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        beforerodeolink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLN2gEUOWu_KkGbYWZgr1qBQky4929YSGO"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        rodeolink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLtRMTc48iZNzUAtprYtBZ5vPBsEl_hZGq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        bittsmlink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLFykhhx3RzemznNXdef8h2BMqgwpP7NHU"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        hjjhlink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLrhnXQODw-Id57PoN4HqZawQh8eZyc7b5"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        astrolink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PL9tY0BWXOZFvdeHbEJr7Wiztcue35IStT"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}