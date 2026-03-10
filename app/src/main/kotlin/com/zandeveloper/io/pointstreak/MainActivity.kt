package com.zandeveloper.io.pointstreak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Looper
import android.widget.TextView
import android.os.Handler

class MainActivity : AppCompatActivity() {
    private lateinit var timeText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // init all layout
        
        var startTime: Long = 0
        var isRunning = false
        val handler = Handler(Looper.getMainLooper())

       val runnable = object : Runnable {
       override fun run() {
        val elapsed = System.currentTimeMillis() - startTime

        val seconds = (elapsed / 1000) % 60
        val minutes = (elapsed / (1000 * 60)) % 60
        val hours = (elapsed / (1000 * 60 * 60))

       // timerText.text = String.format("%02d:%02d:%02d", hours, minutes, seconds)

        handler.postDelayed(this, 1000)
   }
  }
 }
}