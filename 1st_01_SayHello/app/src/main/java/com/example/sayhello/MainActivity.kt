package com.example.sayhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayhello.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // build.gradle 에서 viewBinding 을 추가해줘야 가능
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnText.setOnClickListener {
            binding.tvTitle.text = "Hello Kotlin!!"
        }
    }
}