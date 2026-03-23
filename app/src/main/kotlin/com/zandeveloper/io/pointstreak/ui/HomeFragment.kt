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
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.lifecycle.lifecycleScope

class HomeFragment : Fragment() {

    private lateinit var timerText: TextView
    private lateinit var startButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
    
    val view =  inflater.inflate(R.layout.fragment_home, container, false)
    var isRunning = false
    var pauseOffset = 0L
    var startTime = System.currentTimeMillis()

    timerText = view.findViewById(R.id.timerText)
        startButton = view.findViewById(R.id.startButton)

        startButton.setOnClickListener {
            isRunning = !isRunning
        viewLifecycleOwner.lifecycleScope.launch {
while (true) {
          if (isRunning) {
            startTime = System.currentTimeMillis() - pauseOffset

         val totalSeconds = startTime / 1000

         val hours = totalSeconds / 3600
                                                            val minutes = (totalSeconds % 3600) / 60
                                                              val seconds = totalSeconds % 60

                                                               val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
                                                                timerText.text = formattedTime 
                                                               delay(300)
                                                                  } else { 

            pauseOffset = System.currentTimeMillis() - startTime

         val totalSeconds = startTime / 1000

         val hours = totalSeconds / 3600
                                                            val minutes = (totalSeconds % 3600) / 60
                                                              val seconds = totalSeconds % 60

                                                               val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
                                                                timerText.text = formattedTime
                                                                delay(300)
            }
        }
        }
      }

        return view 
    }
}
