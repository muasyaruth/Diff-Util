package com.example.diffutil_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.diffutil_example.databinding.ActivityMorePhoneDetailsBinding

class more_phone_details : AppCompatActivity() {

    lateinit var binding: ActivityMorePhoneDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMorePhoneDetailsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_more_phone_details)

        val name=findViewById<TextView>(R.id.name)
        val details=findViewById<TextView>(R.id.details)
        val myimage=findViewById<ImageView>(R.id.imageView)
        val pPrice=findViewById<TextView>(R.id.pprice)

        name.text=getIntent().getStringExtra("Name")
        details.text=getIntent().getStringExtra("Description")
        pPrice.text=getIntent().getStringExtra("Price")
        myimage.setImageResource(getIntent().getStringExtra("Image")!!.toInt())

        fun backButton(activity:AppCompatActivity){
            if(activity is AppCompatActivity){
                (activity as AppCompatActivity?)?.supportActionBar?.setDisplayHomeAsUpEnabled(true)
            }
        }
    }
}