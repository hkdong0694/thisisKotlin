package com.example.radiobuttontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.radiobuttontest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rgMain.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId) {
                R.id.radioApple -> {
                    Log.d("Radio", "사과")
                }
                R.id.radioBanana -> {
                    Log.d("Radio", "바나나")
                }
                R.id.radioOrange -> {
                    Log.d("Radio", "오렌지")
                }
            }
        }

    }
}