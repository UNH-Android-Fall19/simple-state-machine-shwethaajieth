package com.example.sandwichstatemachine

import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.predefined_sandwich_list.*
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log
import java.util.*
import java.util.Base64.Encoder


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.predefined_sandwich_list)

        imageView1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Sandwich-name", "Veg sandwich")
            intent.putExtra("Sandwich-image", R.drawable.sandwich1)
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Sandwich-name", "Chicken sandwich")
            intent.putExtra("Sandwich-image", R.drawable.sandwich2)
            startActivity(intent)
        }

        imageView3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Sandwich-name", "Gaucamole Toast sandwich")
            intent.putExtra("Sandwich-image", R.drawable.sandwich3)
            startActivity(intent)
        }

        imageView4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Sandwich-name", "Bacon Breakfast sandwich")
            intent.putExtra("Sandwich-image", R.drawable.sandwich4)
            startActivity(intent)
        }

        wrap.setOnClickListener{
            val nameIntent = Intent(this, NameSandwich::class.java)
            startActivity(nameIntent)
        }

        grinder.setOnClickListener{
            val nameIntent = Intent(this, NameSandwich::class.java)
            startActivity(nameIntent)
        }
    }
}