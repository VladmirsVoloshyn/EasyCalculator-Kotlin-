package com.example.mycalculator

import android.util.Log
import java.lang.StringBuilder

class Formatter {

    private var string: String = "0.0"
    private var stringBuilder = StringBuilder()

    private fun setInput(setIt: String) {
        stringBuilder.append(setIt)
        Log.d("Builder = ", stringBuilder.toString())
        this.string = stringBuilder.toString()
    }

    fun resetBuilder() {
        this.stringBuilder = StringBuilder()
    }

    fun format(value: Int): String {
        when (value) {
            1 -> (setInput("1"))
            2 -> (setInput("2"))
            3 -> (setInput("3"))
            4 -> (setInput("4"))
            5 -> (setInput("5"))
            6 -> (setInput("6"))
            7 -> (setInput("7"))
            8 -> (setInput("8"))
            9 -> (setInput("9"))
            0 -> (setInput("0"))
        }
        return this.string
    }

    fun getOutput(): String {
        return this.string
    }

}