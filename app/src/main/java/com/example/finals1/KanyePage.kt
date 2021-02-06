package com.example.finals1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_kanye_page.*
import kotlinx.android.synthetic.main.activity_travis_page.*

class KanyePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanye_page)
        val collegepic = "https://i.imgur.com/IWbsei3.jpg?1"
        Picasso.get().load(collegepic).into(collegedrop)
        val lateregislink = "https://i.imgur.com/Edvj6Ag.jpg?1"
        Picasso.get().load(lateregislink).into(lateregis)
        val graduationlink = "https://i.imgur.com/J51byhq.jpg?1"
        Picasso.get().load(graduationlink).into(graduation)
        val heartbreakslink = "https://i.imgur.com/pEtZkxq.jpg?1"
        Picasso.get().load(heartbreakslink).into(heartbreaks)
        val mbdtflink = "https://i.imgur.com/AxxDs08.jpg?1"
        Picasso.get().load(mbdtflink).into(mbdtf)
        val yeezuslink = "https://i.imgur.com/QfjCb0r.jpg?1"
        Picasso.get().load(yeezuslink).into(yeezus)
        val tloplink = "https://i.imgur.com/2h5CSLB.jpg?1"
        Picasso.get().load(tloplink).into(tlop)
        val yelink = "https://i.imgur.com/kiwNhiq.png?1"
        Picasso.get().load(yelink).into(ye)
        val jiklink = "https://i.imgur.com/qnPG3Vd.jpg?1"
        Picasso.get().load(jiklink).into(jik)
        init()
    }
    private fun init(){
        collegedroplink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLJNbijG2M7Oxyfz_Fi5Ef7snqXqOlCBlm"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        lateregislink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLJNbijG2M7Oz4Ynh8kEAg5SeGT1lFuiky"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        graduationlink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLJNbijG2M7OyqJ38U-ZX3vDqp_hzR1CfW"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        mbdtflink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLklvWcXoAxKiJGaLhcHFZ1OPC5eKKpYB_"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        yelink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLR5Z8-U9seCSP55F0iQWeJ28kz5-zCa3p"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        tloplink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLzOe4l-oG2trDaNQD8C-xxv4fdihmuTxq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        jiklink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PL1pL0l4LnkiQxle2vqE-UGcx_hnz_xoMq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        heartbreakslink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PL4wPS-tevF1-ar7K7E64JdT3_tGXl-c6K"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
        yeezuslink.setOnClickListener(){
            var url = "https://youtube.com/playlist?list=PLs1FU4K2xfMF_vYBple5WRG_cppeOL2g9"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}
