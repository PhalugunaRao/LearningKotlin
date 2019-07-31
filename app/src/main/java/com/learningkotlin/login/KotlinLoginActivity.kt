package com.learningkotlin.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.learningkotlin.R
import com.learningkotlin.utils.PreferenceHelper

class KotlinLoginActivity:AppCompatActivity() {
    internal var LoginURL = "https://demonuts.com/Demonuts/JsonTest/Tennis/simplelogin.php"
    private var etusername: EditText? = null
    private var etpassword:EditText? = null
    private var btnlogin: Button? = null
    private var tvreg: TextView? = null
    private val LoginTask = 1
    private var preferenceHelper: PreferenceHelper? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        preferenceHelper = PreferenceHelper(this)
        etusername = findViewById<View>(R.id.etusername) as EditText
        etpassword = findViewById<View>(R.id.etpassword) as EditText

        btnlogin = findViewById<View>(R.id.btn) as Button
        tvreg = findViewById<View>(R.id.tvreg) as TextView

    }
}