package com.example.nullsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var one: One
        if( 1> 2) {
            one = One()
        }
        // one.print() -> 앱 죽음

        var nullable : String?
        nullable = null

        var norNullable: String
        // norNullable = null -> 적용 안됨

    }

    private fun nullParameter(str: String?) {
        if(str != null) {
            var leng = str.length
        }
    }

    private fun nullReturn(): String? {
        return null
    }

    private fun testSafeCall(str: String?): Int? {
        //str 이 null 이면 length 를 체크하지 않고 null 을 반환한다.
        var resultNull: Int? = str?.length
        return resultNull
    }

    private fun testElvis(str: String?): Int? {
        // length 오른쪽에 ?: 사용하면 null 일 경우 ?: 오른쪽의 값이 반환
        var resultNull: Int? = str?.length?:0
        return resultNull
    }


    class One {
        fun print() {
            Log.d("null_safety", "can you call me?")
        }
    }
}