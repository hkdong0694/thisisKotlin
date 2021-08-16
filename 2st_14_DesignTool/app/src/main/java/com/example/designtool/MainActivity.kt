package com.example.designtool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var child = Child()
        child.callVariables()

        var parent = Parent()


    }

    abstract class Animal {
        fun walk() {
            Log.d("abstract", "걷습니다.")
        }
        abstract fun move()
    }

    class Bird: Animal() {
        override fun move() {
            Log.d("abstract", "날아서 이동한다.")
        }
    }

    interface InterfaceKotlin {
        var variable : String
        fun get()
        fun set()
    }

    class KotlinImpl: InterfaceKotlin {
        override var variable: String = "init value"

        override fun get() {
            TODO("Not yet implemented")
        }

        override fun set() {
            TODO("Not yet implemented")
        }
    }

    open class Parent {
        private val privatVal = 1
        protected  val protectedVal = 2
        internal  val internalVal = 3
        val defaultVal = 4
    }

    class Child: Parent() {
        fun callVariables() {

        }
    }

}