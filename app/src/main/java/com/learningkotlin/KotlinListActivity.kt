package com.learningkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.kotlin_list.*

class KotlinListActivity:AppCompatActivity() {

    private var listviewData:ListView?=null
    var array = arrayOf("Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Perth", "Auckland", "Helsinki", "Hamburg", "Munich", "New York", "Sydney", "Paris", "Cape Town", "Barcelona", "London", "Bangkok");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_list)
        listviewData=this.list_data
        val adapter = ArrayAdapter(this,R.layout.list_row,array)
        listviewData!!.setAdapter(adapter)

        listviewData!!.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
            val itemValue=listviewData!!.getItemAtPosition(i) as String
            Toast.makeText(applicationContext,
                "Position :$i\nItem Value : $itemValue", Toast.LENGTH_LONG)
                .show()

        }

    }
}