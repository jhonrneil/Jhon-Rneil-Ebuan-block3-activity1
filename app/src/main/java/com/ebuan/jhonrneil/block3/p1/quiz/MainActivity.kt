package com.ebuan.jhonrneil.block3.p1.quiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber: EditText = findViewById(R.id.et_first_number)
        val secondNumber: EditText = findViewById(R.id.et_second_number)
        val thirdNumber: EditText = findViewById(R.id.et_third_number)
        val fourthNumber: EditText = findViewById(R.id.et_fourth_number)
        val fifthNumber: EditText = findViewById(R.id.et_fifth_number)
        val btCompute: Button = findViewById(R.id.bt_compute)
        val txNumber: TextView = findViewById(R.id.tx_number)
        val btMinues: Button = findViewById(R.id.bt_minus)
        val btTimes: Button = findViewById(R.id.bt_times)
        val btDivide: Button = findViewById(R.id.bt_divide)

        txNumber.text = "RESULT"
        btCompute.setOnClickListener {
            txNumber.text = (firstNumber.text.toString().toInt() + secondNumber.text.toString().toInt() + thirdNumber.text.toString().toInt() + fourthNumber.text.toString().toInt() + fifthNumber.text.toString().toInt()).toString()
        }
        btMinues.setOnClickListener {
            txNumber.text = (firstNumber.text.toString().toInt() - secondNumber.text.toString().toInt() - thirdNumber.text.toString().toInt() - fourthNumber.text.toString().toInt() - fifthNumber.text.toString().toInt()).toString()
        }
        btTimes.setOnClickListener {
            txNumber.text = (firstNumber.text.toString().toInt() * secondNumber.text.toString().toInt() * thirdNumber.text.toString().toInt() * fourthNumber.text.toString().toInt() * fifthNumber.text.toString().toInt()).toString()
        }
        btDivide.setOnClickListener {
            txNumber.text = (firstNumber.text.toString().toInt() - secondNumber.text.toString().toInt() / thirdNumber.text.toString().toInt() / fourthNumber.text.toString().toInt() / fifthNumber.text.toString().toInt()).toString()
        }
    }
}