package com.example.checkboxtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.example.checkboxtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    val listener by lazy { CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
        if(isChecked) {
            when(buttonView.id) {
                R.id.checkApple -> Log.d("CheckBox", "사과 선택")
                R.id.checkBanana -> Log.d("CheckBox", "바나나 선택")
                R.id.checkOrange -> Log.d("CheckBox", "오렌지 선택")
            }
        } else {
            when(buttonView.id) {
                R.id.checkApple -> Log.d("CheckBox", "사과 선택 X")
                R.id.checkBanana -> Log.d("CheckBox", "바나나 선택 X")
                R.id.checkOrange -> Log.d("CheckBox", "오렌지 선택 X")
            }
        }

    } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.checkApple.setOnCheckedChangeListener(listener)
        binding.checkBanana.setOnCheckedChangeListener(listener)
        binding.checkOrange.setOnCheckedChangeListener(listener)
    }
}