package com.punya.nasywash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity3::class.java)
            startActivity(Intent)
        }
    }
}