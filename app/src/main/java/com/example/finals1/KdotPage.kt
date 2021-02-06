package com.example.finals1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_kdot_page.*
import kotlinx.android.synthetic.main.activity_travis_page.*

class KdotPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kdot_page)
        val sectionlink = "https://i.imgur.com/bziSdTD.jpg?1"
        Picasso.get().load(sectionlink).into(section80)
        val gkmclink = "https://i.imgur.com/wHc2mCj.jpg?1"
        Picasso.get().load(gkmclink).into(gkmc)
        val tpablink = "https://i.imgur.com/FXzCWQ1.jpg?1"
        Picasso.get().load(tpablink).into(tpab)
        val uulink = "https://i.imgur.com/9omfjLd.jpg?1"
        Picasso.get().load(uulink).into(uu)
        val damnlink = "https://i.imgur.com/qCSF6kk.jpg?1"
        Picasso.get().load(damnlink).into(damn)
        init()
    }
    private fun init(){
        section80link.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLmmFXOCBPxmLNlrWRK1KS3LeWhlrBW1Ty"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        gkmclink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PL4iddgIQErDUufHZ21sjEZ7cPSewOYNs1"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        tpablink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLZyngM228ohSVFMX5aEzkhjGdW00QQ8gs"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        uulink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLZyngM228ohTheHjIxEFQeEwpNMxp8IBD"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        damnlink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLZyngM228ohQJ3naLTqbgBaShvOncExkp"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}
