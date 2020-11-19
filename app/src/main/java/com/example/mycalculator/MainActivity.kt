package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var calculator: Calculator
    private lateinit var textView: TextView
    private var processString: String = ""
    private lateinit var formatterString: Formatter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.processView)
        formatterString = Formatter()
        calculator = Calculator()
    }


    fun onNumberClick(view: View) {
        when (view.id) {
            R.id.num1Btn -> {
                textView.append(ONE_NUMBER)
                (formatterString.format( 1))}
            R.id.num2Btn -> {
                textView.append(TWO_NUMBER)
                (formatterString.format( 2))}
            R.id.num3Btn -> {
                textView.append(THREE_NUMBER)
                (formatterString.format( 3))}
            R.id.num4Btn -> {
                textView.append(FOUR_NUMBER)
                (formatterString.format( 4))}
            R.id.num5Btn -> {
                textView.append(FIVE_NUMBER)
                (formatterString.format( 5))}
            R.id.num6Btn -> {
                textView.append(SIX_NUMBER)
                (formatterString.format( 6))}
            R.id.num7Btn -> {
                textView.append(SEVEN_NUMBER)
                (formatterString.format( 7))}
            R.id.num8Btn -> {
                textView.append(EIGHT_NUMBER)
                (formatterString.format( 8))}
            R.id.num9Btn -> {
                textView.append(NINE_NUMBER)
                (formatterString.format( 9))}
            R.id.num0Btn -> {
                textView.append(ZERO_NUMBER)
                (formatterString.format( 0))}
        }
    }

    fun onSignClick(view: View) {
        val tempOperand: Double = formatterString.getOutput().toDouble()
        Log.d("temp operand = ", tempOperand.toString())
        when (view.id) {
            R.id.difBtn -> {
                (calculator.setOperand1(tempOperand))
                calculator.setSign(SIGN_DIF)
                textView.append(SIGN_DIF.toString())
                resetProcessString()
                formatterString.resetBuilder()
            }
            R.id.divBtn -> {
                calculator.setOperand1(tempOperand)
                (calculator.setSign(SING_DIV))
                textView.append(SING_DIV.toString())
                resetProcessString()
                formatterString.resetBuilder()
            }
            R.id.sumBtn -> {
                calculator.setOperand1(tempOperand)
                (calculator.setSign(SIGN_SUM))
                textView.append(SIGN_SUM.toString())
                resetProcessString()
                formatterString.resetBuilder()
            }
            R.id.multipleBtn -> {
                calculator.setOperand1(tempOperand)
                (calculator.setSign(SIGN_MULTIPLE))
                textView.append(SIGN_MULTIPLE.toString())
                resetProcessString()
                formatterString.resetBuilder()
            }
            R.id.resultBtn -> {
                calculator.setOperand2(tempOperand)
                textView.append(SIGN_EQUALITY.toString() + calculator.process().toString())
                formatterString.resetBuilder()
            }
            R.id.clearBtn -> {
                resetProcessString()
                textView.text = processString
                formatterString = Formatter()
                calculator = Calculator()
            }
        }
    }

    private fun resetProcessString() {
        processString = ""
    }

    companion object {
        private const val SIGN_SUM: Char = '+'
        private const val SIGN_DIF: Char = '-'
        private const val SING_DIV: Char = '/'
        private const val SIGN_MULTIPLE: Char = '*'
        private const val SIGN_EQUALITY: Char = '='
        private const val ONE_NUMBER : String = "1"
        private const val TWO_NUMBER : String = "2"
        private const val THREE_NUMBER : String = "3"
        private const val FOUR_NUMBER : String = "4"
        private const val FIVE_NUMBER : String = "5"
        private const val SIX_NUMBER : String = "6"
        private const val SEVEN_NUMBER : String = "7"
        private const val EIGHT_NUMBER : String = "8"
        private const val NINE_NUMBER : String = "9"
        private const val ZERO_NUMBER : String = "0"
    }
}