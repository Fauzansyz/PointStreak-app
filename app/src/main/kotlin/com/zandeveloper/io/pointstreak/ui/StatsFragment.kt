package com.zandeveloper.io.pointstreak.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.widget.TextView
import com.zandeveloper.io.pointstreak.R
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup

class StatsFragment : Fragment() {

    private lateinit var totalTime: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
    
    val view = inflater.inflate(R.layout.fragment_stats, container, false)

        totalTime = view.findViewById(R.id.totalTime)

            totalTime.text = "0h"
            
            return view
     }
   }