package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class recyclerView(val UserInput: ArrayList<String>):RecyclerView.Adapter<recyclerView.ItemHolder>() {
    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

         val userinput=UserInput[position]
          holder.itemView.apply {
           tvUserInput.text =userinput }
}

    override fun getItemCount()= UserInput.count()
//fun bind(userInput:String){
   //  itemView.tvUserInput
//}
}