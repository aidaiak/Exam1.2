package com.aid.exam12

import android.content.ActivityNotFoundException
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import android.content.Intent
import android.content.ComponentName
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<AppCompatButton>(R.id.btn)

        btn.setOnClickListener {
            try {
                val intent = Intent("ContactsApp")
                startActivity(intent)
            }
            catch (exception: ActivityNotFoundException) {
                Toast.makeText(this, "There is no app",Toast.LENGTH_SHORT).show()
            }
        }
    }
}

