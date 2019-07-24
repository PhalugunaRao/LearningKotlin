package com.learningkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.kotlin_button.*

class KotlinButton:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_button)
        var button_bg :Int=1


        val ll_main_layout=findViewById<LinearLayout>(R.id.ll_main_layout)
        val button_dynamic=Button(this)
        button_dynamic.layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        button_dynamic.text="Dynamic Button"
        ll_main_layout.addView(button_dynamic)

        button_click_me.setOnClickListener {
            if(button_bg==2){
                button_click_me.setBackgroundResource(R.drawable.btn_center_gradient);
                button_bg=1
            } else if(button_bg==1){
                button_click_me.setBackgroundResource(R.drawable.btn_oval_gradient);
                button_bg=2;
            }
        }
    }
}