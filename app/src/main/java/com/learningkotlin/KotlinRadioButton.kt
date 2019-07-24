package com.learningkotlin

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup

class KotlinRadioButton:AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_radiobutton)

        val ll_main = findViewById<LinearLayout>(R.id.ll_main_layout)

        val options = arrayOf("Option 1","Option 2","Option 3")

        val rg=RadioGroup(this)
        rg.orientation=RadioGroup.VERTICAL
        for(i in options.indices){
            val rb = RadioButton(this)
            rb.text = options[i]
            rb.id = View.generateViewId()
            rg.addView(rb)
        }
        ll_main.addView(rg)
    }
}