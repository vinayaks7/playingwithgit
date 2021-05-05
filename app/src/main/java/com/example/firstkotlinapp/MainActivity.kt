package com.example.firstkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doSomething(view: View) {

        var editTextHello = findViewById(R.id.inputname) as EditText
        val value:String=editTextHello.toString()
        Log.i("letslo", "doSomething: mksgmfs")
        val intent=Intent(this,MainActivity2::class.java)
        intent.putExtra("editTextHello","editTextHello")
        startActivity(intent)
    }
}


