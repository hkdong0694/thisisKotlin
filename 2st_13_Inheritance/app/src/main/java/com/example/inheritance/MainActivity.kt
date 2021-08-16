package com.example.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 부모 클래스 직접 호출하기
        var parent = Parent()
        parent.sayHello()

        var child = Child()
        child.myHello()

        testStringExtension()
    }

    private fun testStringExtension() {
        var original = "Hello"
        var added = " Guys~"
        // plus 메서드를 사용해서 문자열을 더할 수 있다.
        Log.d("Extension", "added를 더한 값은 ${original.plus(added)} 입니다.")
    }

    // 상속 연습
    open class Parent {
        var hello : String = "안녕하세요."
        fun sayHello() {
            Log.d("Extension", "${hello}")
        }
    }

    class Child: Parent() {
        fun myHello() {
            hello = "Hello"
            sayHello()
        }
    }
    // 메서드 오버라이드 연습
    open class BaseClass {
        open fun opened() {

        }
        fun notOpend() {

        }
    }

    class ChildClass: BaseClass() {
        override fun opened() {

        }
    }

    open class BaseClass2 {
        open var opend: String = "I am"
    }

    class ChildClass2: BaseClass2() {
        override var opend: String = "You are"
   }

    fun String.plus(word: String): String {
        return this + word
    }

}