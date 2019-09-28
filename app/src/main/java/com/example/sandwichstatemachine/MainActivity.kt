package com.example.sandwichstatemachine

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name :String? = null
        var image : Int? = null
        val rv = findViewById<RecyclerView>(R.id.recyclerList)
        rv.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL, false)
        val swich = ArrayList<Sandwich>()

        val extras : Bundle? = intent.getExtras();
        if (extras != null) {
             name  = extras.getString("Sandwich-name")
             image = extras.getInt("Sandwich-image")
            swich.add(Sandwich(name,image))
        }

        var adapter = SandwichListAdapter(swich)
        rv.adapter = adapter

        add_fav_sandwich.setOnClickListener{
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}