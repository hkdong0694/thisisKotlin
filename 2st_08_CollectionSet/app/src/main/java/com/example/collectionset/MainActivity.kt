package com.example.collectionset

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.collectionset.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var set = mutableSetOf<String>()
        set.add("JAN")
        set.add("FEB")
        set.add("MAR")
        set.add("JAN")  // 동일한 값은 입력되지 않음

        Log.d("Collection", "Set 전체 출력 = ${set}")

        set.remove("FEB")
        Log.d("Collection", "Set 전체 출력 = ${set}")

    }
}