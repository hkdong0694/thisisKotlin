package com.example.controlflow3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.controlflow3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var eraOfRyu = 2.32
        var eraOfDegrom = 2.43

        val era = if(eraOfRyu < eraOfDegrom) {
            Log.d("MLB_Result", "2019 류현진이 디그롬을 이겼습니다.")
            eraOfRyu
        } else {
            Log.d("ML_Result", "2019 디그롬이 류현진을 이겼습니다.")
            eraOfDegrom
        }

        // 문자열 템플릿 -> ${코드 블록} 으러ㅗ 수식 입력 가능
        Log.d("ML_Result", "2019 MLB 에서 가장 높은 ERA는 $era 입니다.")

    }
}