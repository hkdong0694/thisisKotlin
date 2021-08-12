package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.basicsyntax.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /**
         * Log.v() -> verbose -> 상세한 로그 내용을 출력하기 위해 사용
         * Log.d() -> debug -> 개발에 필요한 내용을 출력하기 위해 사용 (개발자용)
         * Log.i() -> information -> 정보성의 일반적인 메시지를 전달하기 위해 사용
         * Log.w() -> warning -> 에러는 아니지만 경고성 메시지를 전달하기 위해 사용
         * Log.e() -> error -> 실제 에러 메시지를 출력하기 위해 사용
         */
        Log.d("BasicSynTax", "로그를 출력합니다. method = Log.d")

    }
}