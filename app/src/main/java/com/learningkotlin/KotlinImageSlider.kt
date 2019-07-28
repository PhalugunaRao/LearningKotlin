package com.learningkotlin

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class KotlinImageSlider:AppCompatActivity() {
    internal lateinit var viewpager : ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_image_slider)
        viewpager = findViewById(R.id.viewpager)as ViewPager

        val adapter =ViewPagerAdapter(this)
        viewpager.adapter = adapter
    }
}