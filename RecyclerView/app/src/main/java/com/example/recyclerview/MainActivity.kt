package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("C++", "Videos are available", R.drawable.cpp))
        arrayList.add(Model("Python", "Videos are available", R.drawable.python))
        arrayList.add(Model("Java", "Videos are available", R.drawable.java))
        arrayList.add(Model("Java Script", "Videos are available", R.drawable.js))
        arrayList.add(Model("Ruby", "Videos are available", R.drawable.ruby))
        arrayList.add(Model("HTML", "Videos are available", R.drawable.html))
        arrayList.add(Model("NodeJS", "Videos are available", R.drawable.nodejs))
        arrayList.add(Model("Networking", "Videos are available", R.drawable.nt))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = myAdapter

    }

}