package com.aid.exam12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import android.content.Intent
import android.content.ComponentName







class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<AppCompatButton>(R.id.btn)

        btn.setOnClickListener {
            val intent = Intent()
            intent.component = ComponentName("com.aid.exam13", "com.aid.ContactsApp")
            startActivity(intent)
        }
    }
}