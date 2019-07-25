package com.learningkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.kotlin_seekbar.*

class KotlinSeekBar :AppCompatActivity(),SeekBar.OnSeekBarChangeListener {

    private var progressView: TextView?=null
    private var seekbarStatusView: TextView?=null
    private var seekbarView:SeekBar?=null

    var MIN =10
    var MAX =160
    var STEP =5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_seekbar)

        progressView = this.progress
        seekbarStatusView = this.seekbarStatus
        seekbarView = this.seekbar
        seekbarView!!.max =(MAX-MIN)/STEP
        seekbarView!!.setOnSeekBarChangeListener(this)
    }
    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        val progress_custom = MIN+(progress*STEP)
        progressView!!.text = progress_custom.toString()
        seekbarStatusView!!.text = "Tracking Touch"
    }
    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        seekbarStatusView!!.text = "Start Tracking Touch"
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        seekbarStatusView!!.text = "Stop Tracking Touch"
    }



}