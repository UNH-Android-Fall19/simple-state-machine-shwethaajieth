package com.example.sandwichstatemachine

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sandwich_name.*

class NameSandwich : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sandwich_name)

        submit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Sandwich-name", user_sandwich_name.text.toString())
            intent.putExtra("Sandwich-image", R.drawable.sandwich5)
            startActivity(intent)
        }

    }
}