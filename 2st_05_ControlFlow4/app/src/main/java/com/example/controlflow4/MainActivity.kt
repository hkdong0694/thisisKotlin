package com.example.controlflow4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.controlflow4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var now = 10
        // 일반적인 when
        when( now ) {
            8 -> Log.d("when", "현재 시간은 8시입니다.")
            9 -> Log.d("when", "현재 시간은 9시입니다.")
            // 위의 모든 조건에 맞지 않으면 else 다음 코드가 실행 된다.
            else -> Log.d("when", "현재 시간은 9시가 아닙니다.")
        }
        // 콤마로 구분해서 사용
        when( now ) {
            8, 9 -> Log.d("when", "현재 시간은 8시 또는 9시 입니다.")
            // 위의 모든 조건에 맞지 않으면 else 다음 코드가 실행 된다.
            else -> Log.d("when", "현재 시간은 9시가 아닙니다.")
        }

        // 범위로 구분해서 사용
        var ageOfMichae = 19
        when(ageOfMichae) {
            in 10..19 -> Log.d("when", "마이클은 10대입니다.")
            !in 10..19 -> Log.d("when", "마이클은 10대가 아닙니다.")
            else -> Log.d("when", "나이를 알 수 없습니다.")
        }

        // 파라미터가 없는 when 사용하기
        var currentTime = 6

        when {
            currentTime == 5 -> {
                Log.d("when", "현재 시간은 5시입니다.")
            }
            currentTime > 5 -> {
                Log.d("when", "현재 시간은 5시가 넘었습니다.")
            }
            else -> {
                Log.d("when", "현재 시간은 5시 이전입니다.")
            }
        }

    }
}