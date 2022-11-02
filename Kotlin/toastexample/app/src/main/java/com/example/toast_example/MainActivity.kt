package com.example.toast_example

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var toastButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastButton = findViewById<View>(R.id.button) as Button
        toastButton!!.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Toast now showing",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}