package com.example.diffutil_example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.diffutil_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),onPhoneItemClickListener{


    lateinit var binding: ActivityMainBinding
    lateinit var phoneList:ArrayList<Phones>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var recyclerView=findViewById<RecyclerView>(R.id.phoneRecycler)

        phoneList=ArrayList()
        addPhones()

        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this,1))
        recyclerView.adapter=PhoneAdapter(this)

        val adapter=recyclerView.adapter as PhoneAdapter
        adapter.submitList(phoneList)
    }

    fun addPhones(){
        phoneList.add(Phones("Apple","This is a good phone,good phone good phone good phone,good phone","Price: 50,000 ksh",R.drawable.apple))
        phoneList.add(Phones("Samsung","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.samsung))
        phoneList.add(Phones("Nokia","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.nokia))
        phoneList.add(Phones("Oppo","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.oppo))
        phoneList.add(Phones("Itel","This is a good phone,good phone,good phone,good phone,good phone","price: 50,000 ksh",R.drawable.itel))
        phoneList.add(Phones("Tecno","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.tecno))
        phoneList.add(Phones("Infinix","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.infinix))
        phoneList.add(Phones("Apple","This is a good phone,good phone good phone good phone,good phone","Price: 50,000 ksh",R.drawable.apple))
        phoneList.add(Phones("Samsung","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.samsung))
        phoneList.add(Phones("Nokia","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.nokia))
        phoneList.add(Phones("Oppo","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.oppo))
        phoneList.add(Phones("Itel","This is a good phone,good phone,good phone,good phone,good phone","price: 50,000 ksh",R.drawable.itel))
        phoneList.add(Phones("Tecno","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.tecno))
        phoneList.add(Phones("Infinix","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.infinix))
        phoneList.add(Phones("Apple","This is a good phone,good phone good phone good phone,good phone","Price: 50,000 ksh",R.drawable.apple))
        phoneList.add(Phones("Samsung","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.samsung))
        phoneList.add(Phones("Nokia","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.nokia))
        phoneList.add(Phones("Oppo","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.oppo))
        phoneList.add(Phones("Itel","This is a good phone,good phone,good phone,good phone,good phone","price: 50,000 ksh",R.drawable.itel))
        phoneList.add(Phones("Tecno","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.tecno))
        phoneList.add(Phones("Infinix","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.infinix))
        phoneList.add(Phones("Apple","This is a good phone,good phone good phone good phone,good phone","Price: 50,000 ksh",R.drawable.apple))
        phoneList.add(Phones("Samsung","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.samsung))
        phoneList.add(Phones("Nokia","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.nokia))
        phoneList.add(Phones("Oppo","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.oppo))
        phoneList.add(Phones("Itel","This is a good phone,good phone,good phone,good phone,good phone","price: 50,000 ksh",R.drawable.itel))
        phoneList.add(Phones("Tecno","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.tecno))
        phoneList.add(Phones("Infinix","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.infinix))
        phoneList.add(Phones("Apple","This is a good phone,good phone good phone good phone,good phone","Price: 50,000 ksh",R.drawable.apple))
        phoneList.add(Phones("Samsung","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.samsung))
        phoneList.add(Phones("Nokia","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.nokia))
        phoneList.add(Phones("Oppo","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.oppo))
        phoneList.add(Phones("Itel","This is a good phone,good phone,good phone,good phone,good phone","price: 50,000 ksh",R.drawable.itel))
        phoneList.add(Phones("Tecno","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.tecno))
        phoneList.add(Phones("Infinix","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.infinix))
        phoneList.add(Phones("Apple","This is a good phone,good phone good phone good phone,good phone","Price: 50,000 ksh",R.drawable.apple))
        phoneList.add(Phones("Samsung","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.samsung))
        phoneList.add(Phones("Nokia","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.nokia))
        phoneList.add(Phones("Oppo","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.oppo))
        phoneList.add(Phones("Itel","This is a good phone,good phone,good phone,good phone,good phone","price: 50,000 ksh",R.drawable.itel))
        phoneList.add(Phones("Tecno","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.tecno))
        phoneList.add(Phones("Infinix","This is a good phone,good phone,good phone,good phone,good phone","Price: 50,000 ksh",R.drawable.infinix))


    }

    override fun onItemClick(item: Phones, position: Int) {
        //Toast.makeText(this,item.name,Toast.LENGTH_SHORT).show()
        val intent=Intent(this,more_phone_details::class.java)
        intent.putExtra("Name",item.name)
        intent.putExtra("Description",item.desc)
        intent.putExtra("Price",item.price)
        intent.putExtra("Image",item.image.toString())

        startActivity(intent)
    }
}