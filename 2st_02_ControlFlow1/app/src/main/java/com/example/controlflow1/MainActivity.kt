package com.example.controlflow1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.controlflow1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var ball = 4
        if(ball > 3) {
            Log.d("ControlFlow", "4볼")
        } else {
            Log.d("ControlFlow", "타석 대기")
        }

    }
}