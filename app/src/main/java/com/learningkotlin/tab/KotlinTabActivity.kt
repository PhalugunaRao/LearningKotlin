package com.learningkotlin.tab

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.learningkotlin.R

class KotlinTabActivity:AppCompatActivity() {
    private var tabLayout:TabLayout?=null
    var viepager:ViewPager?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_tab_layout)

        viepager = findViewById(R.id.viewpager) as ViewPager
        setupViewPage(viepager!!)

        tabLayout = findViewById(R.id.tabs) as TabLayout
        tabLayout!!.setupWithViewPager(viepager)

        /*

        Custom Adapter with custom images


        val headerView = (getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
            .inflate(R.layout.custom_tab, null, false)

        val linearLayoutOne = headerView.findViewById(R.id.ll) as LinearLayout
        val linearLayout2 = headerView.findViewById(R.id.ll2) as LinearLayout
        val linearLayout3 = headerView.findViewById(R.id.ll3) as LinearLayout

        tabLayout!!.getTabAt(0)!!.setCustomView(linearLayoutOne)
        tabLayout!!.getTabAt(1)!!.setCustomView(linearLayout2)
        tabLayout!!.getTabAt(2)!!.setCustomView(linearLayout3)
*/



    }

    private fun setupViewPage(viewPager: ViewPager) {
        val adapter =ViewPagerTabAdapter(supportFragmentManager)
        adapter.addFragmet(OneFragment(),"ONE")
        adapter.addFragmet(TwoFragment(),"TWO")
        adapter.addFragmet(ThreeFragment(),"THREE")
        viewPager.adapter=adapter

    }
}



