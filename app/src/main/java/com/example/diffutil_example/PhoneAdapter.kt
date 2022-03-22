package com.example.diffutil_example

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class PhoneAdapter(var clickListener: onPhoneItemClickListener)
    :ListAdapter<Phones,PhoneViewHolder>(phoneDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        lateinit var phoneViewHolder: PhoneViewHolder
        phoneViewHolder= PhoneViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false))
        return phoneViewHolder
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
//        holder.phoneName?.text=items.get(position).name
//        holder.phoneDesc?.text=items.get(position).desc
//        holder.phonePrice?.text=items.get(position).price
//        holder.phoneimage.setImageResource(items.get(position).image)

        holder.initialize(getItem(position),clickListener)

    }

}
class PhoneViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    var phoneName = itemView.findViewById<TextView>(R.id.phoneName)
    var phoneDesc = itemView.findViewById<TextView>(R.id.phoneDescription)
    var phonePrice = itemView.findViewById<TextView>(R.id.phonePrice)
    var phoneimage = itemView.findViewById<ImageView>(R.id.phoneImage)

    fun initialize(item: Phones,action:onPhoneItemClickListener){
        phoneName.text=item.name
        phoneDesc.text=item.desc
        phonePrice.text=item.price
        phoneimage.setImageResource(item.image)

        itemView.setOnClickListener{
            action.onItemClick(item,adapterPosition)
        }
    }
}
interface onPhoneItemClickListener{
    fun onItemClick(item: Phones,position: Int)
}

class phoneDiffUtil():DiffUtil.ItemCallback<Phones>(){
    override fun areItemsTheSame(oldItem: Phones, newItem: Phones): Boolean {
        return oldItem.name === newItem.name
    }

    override fun areContentsTheSame(oldItem: Phones, newItem: Phones): Boolean {
        return oldItem == newItem
    }

}