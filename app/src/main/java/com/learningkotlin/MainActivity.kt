package com.learningkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var nextView:TextView?=null
    private var googleButton:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextView=this.next_tv
        googleButton=this.google_button
        nextView!!.setOnClickListener {
            val intent =Intent(this,KotlinButton::class.java)
            startActivity(intent)
        }

        googleButton!!.setOnClickListener{
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.google.com/")
            startActivity(openURL)
        }


    }
}


