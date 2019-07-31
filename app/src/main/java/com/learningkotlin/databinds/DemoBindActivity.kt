package com.learningkotlin.databinds

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.learningkotlin.R
import com.learningkotlin.databinding.ActivityDemoTestBinding

class DemoBindActivity:AppCompatActivity() {
    lateinit var mainBinding : ActivityDemoTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_demo_test)
        var userModel = UserModel()
        userModel.uName = "Androidian"
        userModel.pwd = "123456"
        mainBinding.userModel = userModel
    }

}