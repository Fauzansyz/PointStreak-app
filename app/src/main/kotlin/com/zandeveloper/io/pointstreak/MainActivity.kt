package com.zandeveloper.io.pointstreak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.os.Looper
import android.widget.TextView
import android.os.Handler
import com.zandeveloper.io.pointstreak.ui.HomeFragment
import com.zandeveloper.io.pointstreak.ui.StatsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var timeText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        
        fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
    .replace(R.id.fragmentContainer, fragment)
    .commit()
        }
        
        supportFragmentManager.beginTransaction()
    .replace(R.id.fragmentContainer, HomeFragment())
    .commit()
    
    bottomNav.setOnItemSelectedListener {

    when(it.itemId){

        R.id.nav_home -> {
            loadFragment(HomeFragment())
            true
        }

        R.id.nav_stats -> {
            loadFragment(StatsFragment())
            true
        }

        R.id.nav_history -> {
        
            true
        }

        else -> false
    }
}
 }
}