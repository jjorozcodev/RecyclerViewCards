package com.soyjj.example.recyclerviewcards

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv:RecyclerView = findViewById(R.id.rvLista)
        rv.layoutManager=LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val vengadores = ArrayList<Avengers>()

        vengadores.add(Avengers("Tony Stark", "ironman", R.drawable.ic_launcher_foreground))
        vengadores.add(Avengers("Steve Rogers", "capitan america", R.drawable.ic_launcher_background))
        vengadores.add(Avengers("Nick Fury", "El Tuerto", R.drawable.ic_launcher_foreground))
        vengadores.add(Avengers("Thor", "Thor", R.drawable.ic_launcher_background))

        val adapter = AvengersAdapter(vengadores)

        rv.adapter = adapter
    }
}
