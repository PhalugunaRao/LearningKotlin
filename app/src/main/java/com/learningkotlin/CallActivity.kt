package com.learningkotlin

import android.Manifest
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.kotlinpermissions.KotlinPermissions

class CallActivity:AppCompatActivity() {
    lateinit var callView :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.call_activity)
        callView=findViewById(R.id.call_view)

        callView.setOnClickListener {
            KotlinPermissions.with(this)
                .permissions(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.CAMERA)
                .onAccepted {
                    /*val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$8140056153"))
                    startActivity(intent)*/
                }
                .onDenied {
                    println("====="+"YesssNpoppp")
                }
                .onForeverDenied {
                    println("====="+"YesssForever")
                }
                .ask()
        }
    }
}