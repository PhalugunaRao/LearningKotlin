package com.learningkotlin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.learningkotlin.databinds.DemoBindActivity

class KotlinSplashScreen:AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_splash_screen)

        Handler().postDelayed({
            val mainIntent = Intent(this, DemoBindActivity::class.java)
            startActivity(mainIntent)
            finish()
        },SPLASH_DISPLAY_LENGTH.toLong())

    }
}


