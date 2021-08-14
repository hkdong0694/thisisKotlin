package com.example.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.collection.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 1. 값으로 컬렉션 생성하기
        var mutableList = mutableListOf("MON", "THU", "WED")

        // 값을 추가한다.
        mutableList.add("THU")

        // 값을 꺼낸다
        Log.d("Collection", "mutableList 에 입력된 첫 번째 값은 ${mutableList.get(0)} 입니다.")
        Log.d("Collection", "mutableList 에 입력된 두 번째 값은 ${mutableList.get(1)} 입니다.")

        // 2. 빈 컬렉션 생성하기
        var stringList = mutableListOf<String>()
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")

        // 값 변경
        stringList.set(1, "수정된 값")
        Log.d("Collection", "stringList에 입력된 두 번째 값은 ${stringList.get(1)} 입니다.")

        // 삭제
        stringList.removeAt(1)
        Log.d("Collection", "stringList에 입력된 두 번째 값은 ${stringList.get(1)} 입니다.")

        // 개수를 출력한다.
        Log.d("Collection", "stringList에 입력된 두 번째 값은 ${stringList.size} 입니다.")

    }
}