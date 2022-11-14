package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var result:TextView
    lateinit var delete:TextView
    lateinit var numberOne:TextView
    lateinit var numberTwo:TextView
    lateinit var numberThree:TextView
    lateinit var numberFour:TextView
    lateinit var numberFive:TextView
    lateinit var numberSix:TextView
    lateinit var numberSeven:TextView
    lateinit var numberEight:TextView
    lateinit var numberNine:TextView
    lateinit var numberZero:TextView
    lateinit var plus:TextView
    lateinit var minus:TextView
    lateinit var division:TextView
    lateinit var multiply:TextView
    lateinit var moduls:TextView
    lateinit var equal:TextView
    lateinit var expession:TextView
    lateinit var decimal:TextView
    var exp:String = ""

    var num1:Double = 0.0
    var num2:Double = 0.0
    var add:Boolean = false
    var sub:Boolean = false
    var div:Boolean = false
    var mul:Boolean = false
    var mod:Boolean = false
    var none:Boolean = true
    var dec= false




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result = findViewById(R.id.result)
        delete = findViewById(R.id.delete)
        numberOne = findViewById(R.id.numberOne)
        numberTwo = findViewById(R.id.numberTwo)
        numberThree = findViewById(R.id.numberThree)
        numberFour = findViewById(R.id.numberFour)
        numberFive= findViewById(R.id.numberFive)
        numberSix = findViewById(R.id.numberSix)
        numberSeven = findViewById(R.id.numberSeven)
        numberEight = findViewById(R.id.numberEight)
        numberNine = findViewById(R.id.numberNine)
        numberZero = findViewById(R.id.numberZero)
        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)
        division = findViewById(R.id.division)
        multiply = findViewById(R.id.multiplication)
        moduls = findViewById(R.id.mod)
        equal = findViewById(R.id.equal)
        expession = findViewById(R.id.expression)
        decimal = findViewById(R.id.decimal)

    }

    fun onClick(view: View) {


        when(view.id){

            R.id.allclear -> {
                result.text = "0"
                none = true
                dec = false
                expession.text = ""
                num1 = 0.0
                num2 = 0.0
            }
            R.id.delete -> {
                result.text = result.text.substring(0, result.text.length - 1)
                if (result.length() == 0)   {
                    result.text = "0"
                    none = true
                }

            }
            R.id.numberZero -> result.append("0")
            R.id.numberOne -> {
                if (none)   {
                    result.text = "1"
                    none = false
                }
                else      result.append("1")
            }
            R.id.numberTwo ->{
                if (none)   {
                    result.text = "2"
                    none = false
                }
                else      result.append("2")
            }
            R.id.numberThree -> {
                if (none)   {
                    result.text = "3"
                    none = false
                }
                else      result.append("3")
            }
            R.id.numberFour -> {
                if (none)   {
                    result.text = "4"
                    none = false
                }
                else      result.append("4")
            }
            R.id.numberFive -> {
                if (none)   {
                    result.text = "5"
                    none = false
                }
                else      result.append("5")
            }
            R.id.numberSix -> {
                if (none)   {
                    result.text = "6"
                    none = false
                }
                else      result.append("6")
            }
            R.id.numberSeven -> {
                if (none)   {
                    result.text = "7"
                    none = false
                }
                else      result.append("7")
            }
            R.id.numberEight -> {
                if (none)   {
                    result.text = "8"
                    none = false
                }
                else      result.append("8")
            }
            R.id.numberNine -> {
                if (none)   {
                    result.text = "9"
                    none = false
                }
                else      result.append("9")
            }

            R.id.decimal ->{
                if (none)   result.text = "0"
                else{
                    if (!dec){
                        result.append(".")
                        dec = true
                    }
                }
            }

            R.id.plus -> {
                if(!result.text.isEmpty()) {
                    exp = result.text.toString() + " + "
                    expression.text = exp
                    num1 = result.text.toString().toDouble()
                    result.text = "0"
                    none = true
                    add = true
                    dec = false

                }
            }

            R.id.minus -> {
                if(!result.text.isEmpty()) {
                    exp = result.text.toString() + " - "
                    expression.text = exp
                    num1 = result.text.toString().toDouble()
                    result.text = "0"
                    sub = true
                    none = true
                    dec = false
                }
            }

            R.id.division -> {
                if(!result.text.isEmpty()) {
                    exp = result.text.toString() + " / "
                    expression.text = exp
                    num1 = result.text.toString().toDouble()
                    result.text = "0"
                    div = true
                    dec = false
                    none = true
                }
            }

            R.id.multiplication -> {
                if(!result.text.isEmpty()) {
                    exp = result.text.toString() + " X "
                    expression.text = exp
                    num1 = result.text.toString().toDouble()
                    result.text = "0"
                    mul = true
                    none = true
                    dec = false
                }
            }
            R.id.mod -> {
                if(!result.text.isEmpty()) {
                    exp = result.text.toString() + " % "
                    expression.text = exp
                    num1 = result.text.toString().toDouble()
                    result.text = "0"
                    mod = true
                    none = true
                    dec = false
                }
            }
            R.id.equal -> {
                if(!none){
                    exp += result.text.toString() + " = "
                    expession.text = exp
                    num2 = result.text.toString().toDouble()

                    if (add){
                        result.text = (num1 + num2).toString()
                        add = false
                    }
                    else if (sub){
                        result.text = (num1 - num2).toString()
                        sub = false
                    }
                    else if (mul){
                        result.text = (num1 * num2).toString()
                        mul = false
                    }
                    else if (div){
                            result.text = String.format("%.3f", num1 / num2)
                            div = false
                    }
                    else if (mod){
                        result.text = (num1 % num2).toString()
                        mod = false
                    }
                }
            }
        }
    }

}

