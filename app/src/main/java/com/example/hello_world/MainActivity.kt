package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butAct = findViewById<Button>(R.id.helloButton)
        butAct.setOnClickListener {
            Log.v("Hello World", "Button Clicked!")
            Toast.makeText(this, getString(R.string.toastMessage), Toast.LENGTH_SHORT).show()
        }
    }
}