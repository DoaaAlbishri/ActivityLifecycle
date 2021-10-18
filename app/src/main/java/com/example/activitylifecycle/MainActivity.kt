package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tv :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.tv)
    }
    override fun onPause() {
        super.onPause()
        val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        val currentDate = sdf.format(Date())
        Log.d("lifecycle", "onPause invoked")
        tv.text = tv.text.toString() + "\nLast seen at: $currentDate"
    }

    override fun onResume() {
        super.onResume()
        tv.text = tv.text.toString() + "\nI'm online"
    }

}