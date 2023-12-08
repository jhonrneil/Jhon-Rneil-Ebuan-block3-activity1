package com.ebuan.jhonrneil.block3.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
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
    }
}