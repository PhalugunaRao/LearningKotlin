package com.learningkotlin.recycle

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.learningkotlin.R

class CustomAdapter(val users: ArrayList<User>) :RecyclerView.Adapter<CustomAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycle_row,parent,false)
        return ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, pos: Int) {
        holder.bindItems(users[pos])

    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: User){
            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress  = itemView.findViewById(R.id.textViewAddress) as TextView
            textViewName.text = user.name
            textViewAddress.text = user.address
        }

    }


}


