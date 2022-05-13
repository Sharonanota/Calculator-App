package com.example.calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityCalculate: AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var tvResult: TextView
    lateinit var subtractBtn: Button
    lateinit var modulusBtn: Button
    lateinit var addBtn: Button
    lateinit var multiplyBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        subtractBtn = findViewById(R.id.subractBtn)
        multiplyBtn = findViewById(R.id.multiplyBtn)
        addBtn = findViewById(R.id.addBtn)
        modulusBtn = findViewById(R.id.modulusBtn)
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvResult = findViewById(R.id.tvResult)


        addBtn.setOnClickListener {
            var num = etNum1.text.toString().toInt()
            var num1 = etNum2.text.toString().toInt()
            calculateAddition(num, num1)

        }
        multiplyBtn.setOnClickListener {
            var num = etNum1.text.toString().toInt()
            var num1 = etNum2.text.toString().toInt()
            calculatemultiplicatiom(num, num1)

        }
        modulusBtn.setOnClickListener {
            var num = etNum1.text.toString().toInt()
            var num1 = etNum2.text.toString().toInt()
            calculatemodulus(num, num1)
        }
        subtractBtn.setOnClickListener {
            var num = etNum1.text.toString().toInt()
            var num1 = etNum2.text.toString().toInt()
            calculatesubtraction(num, num1)

        }
    }

     fun calculatesubtraction(num: Int, num1: Int) {
         var subtract=num-num1
         tvResult.text=subtract.toString()
    }

    fun calculatemodulus(num: Int, num1: Int) {
        var modulus=num%num1
        tvResult.text=modulus.toString()
    }

    fun calculatemultiplicatiom(num: Int, num1: Int) {
      var multiplication=num*num1
        tvResult.text=multiplication.toString()
    }

    fun calculateAddition(num: Int, num1: Int) {
    var addition=num+num1
        tvResult.text=addition.toString()
    }

}


