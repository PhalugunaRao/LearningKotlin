package com.learningkotlin

import android.annotation.SuppressLint
import android.content.Context
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class ViewPagerAdapter(private val context: Context): PagerAdapter() {

    private var layoutInflater:LayoutInflater?=null
    val Image = arrayOf(R.drawable.benz2,R.drawable.bikess,R.drawable.vecto,R.drawable.webshots)
    override fun getCount(): Int {
        return  Image.size
           }

    override fun isViewFromObject(p0: View, p1: Any): Boolean {
       return p0===p1
    }

    @SuppressLint("ServiceCast")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.viewpager_row,null)

        val image = v.findViewById<View>(R.id.imageview) as ImageView
        image.setImageResource(Image[position])
        val vp= container as ViewPager
        vp.addView(v,0)

        return  v

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v= `object` as View
        vp.removeView(v)
    }

}