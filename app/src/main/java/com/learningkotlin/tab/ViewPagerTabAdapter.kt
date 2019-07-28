package com.learningkotlin.tab

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerTabAdapter(manager: FragmentManager):FragmentPagerAdapter(manager) {
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()
    override fun getItem(p0: Int): Fragment {
        return mFragmentList[p0]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragmet(fragmet:Fragment,title:String){
        mFragmentList.add(fragmet)
        mFragmentTitleList.add(title)

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }

}