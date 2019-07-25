package com.learningkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var nextView:TextView?=null
    private var googleButton:Button?=null
    private var dialogButton:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextView=this.next_tv
        googleButton=this.google_button
        dialogButton=this.dialog_button

        dialogButton!!.setOnClickListener {
            val snack =Snackbar.make(it,"This is a Simple Snackbar",Snackbar.LENGTH_LONG)
            snack.setAction("DISMISS", View.OnClickListener {
                System.out.println("Snack ==onclick")
            })
            snack.show()

           /* //Alert dialog
            var dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Do you want to close Application?")
                .setCancelable(false)
                .setPositiveButton("Proceed",DialogInterface.OnClickListener {
                        dialog, id ->  finish()

                })

                .setNegativeButton("Cancel",DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert =dialogBuilder.create()
            alert.setTitle("Sample Alert")
            alert.show()*/
        }
        nextView!!.setOnClickListener {
            val intent =Intent(this,KotlinButton::class.java)
            startActivity(intent)
        }

        googleButton!!.setOnClickListener{
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.google.com/")
            startActivity(openURL)
        }


    }
}


