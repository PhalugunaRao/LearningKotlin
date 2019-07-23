package com.learningkotlin

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.text.Layout.JUSTIFICATION_MODE_INTER_WORD
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.kotlin_text_view.*

class KotlinTextview:AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_text_view)

        val tv_dyamic =TextView(this)
        tv_dyamic.textSize=20f
        tv_dyamic.text="TEXT VIEW generate programaticly"
        ll_main_layout.addView(tv_dyamic)

        //second method get reference of textview

        val tv_click_me = findViewById<TextView>(R.id.tv_click_me)
        tv_click_me.isAllCaps=false
        tv_click_me.setOnClickListener {
            Toast.makeText(this,"TEST TOAST",Toast.LENGTH_LONG).show()
        }
        tvJustified.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        //Textview click directly

        /*tv_click_me.setOnClickListener{
            Toast.makeText(this,"You clicked on TextView",Toast.LENGTH_SHORT).show()
        }*/
    }
}