package com.example.mycalculator

import android.util.Log
import com.example.mycalculator.Calculator.Signs.*

class Calculator {

    private var sign: Signs = SUM
    private var operand1: Double = 0.0
    private var operand2: Double = 0.0
    private var result: Double = 0.0

    fun setOperand1(value: Double = 0.0) {
        this.operand1 = value
        Log.d("op1 = ", this.operand1.toString())

    }
    fun setOperand2(value: Double = 0.0) {
        this.operand2 = value
        Log.d("op2 = ", this.operand2.toString())
    }
    fun setSign(sign: Char) {
        if (sign == '+')
            this.sign = SUM
        if (sign == '-')
            this.sign = DIF
        if (sign == '/')
            this.sign = DIV
        if (sign == '*')
            this.sign = MULTIPLE
    }

    fun process(): Double {
        when (this.sign) {
            SUM -> (this.sum())
            DIV -> (this.div())
            DIF -> (this.dif())
            MULTIPLE -> (this.multi())
        }
        Log.d("Result = ", this.result.toString())
        return this.result
    }

    private fun multi() {
        this.result = operand1 * operand2
    }

    private fun div() {
        this.result = operand1 / operand2
    }

    private fun sum() {
        this.result = operand1 + operand2
    }

    private fun dif() {
        this.result = operand1 - operand2
    }

    enum class Signs {
        SUM,
        DIV,
        DIF,
        MULTIPLE,
    }

}