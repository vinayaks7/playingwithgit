package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text=intent.getStringExtra("value")
//        print("fafafasf"+text.toString())
        Log.i("this", "onCreate: text $text")
//        Toast.makeText(this,"fafasfa",Toast.LENGTH_SHORT)
//        val textView: TextView = findViewById(R.id.textView) as TextView
//        val s=textView.toString();
//        val str: String = textView.text.toString()
    }
}