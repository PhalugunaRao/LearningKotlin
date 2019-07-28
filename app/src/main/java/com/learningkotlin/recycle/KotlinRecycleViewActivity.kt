package com.learningkotlin.recycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.learningkotlin.R

class KotlinRecycleViewActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_recycleview)

        val recycleView = findViewById(R.id.recyclerView) as RecyclerView
        recycleView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        val users =ArrayList<User>()

        users.add(User("Phalguna Rao","THolapi village ponduru md"))
        users.add(User("Anitha","THolapi village ponduru md"))
        users.add(User("Geethika","THolapi village ponduru md"))

        val adapter = CustomAdapter(users)
        recycleView.adapter=adapter
    }
}