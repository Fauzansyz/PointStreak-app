package com.zandeveloper.io.pointstreak.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.widget.Button
import com.zandeveloper.io.pointstreak.R
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup

class HomeFragment : Fragment() {

    private lateinit var timerText: TextView
    private lateinit var startButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
    
    val view =  inflater.inflate(R.layout.fragment_home, container, false)
    
    timerText = view.findViewById(R.id.timerText)
        startButton = view.findViewById(R.id.startButton)

        startButton.setOnClickListener {
            timerText.text = "Coding started 🚀"
        }

        return view 
    }
}
