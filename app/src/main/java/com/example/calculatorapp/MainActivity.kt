package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arithmeticOperations()
    }

    fun arithmeticOperations(){
        var num1 = findViewById<EditText>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button1 = findViewById<Button>(R.id.add)
        var button2 = findViewById<Button>(R.id.subtraction)
        var button3 = findViewById<Button>(R.id.multiply)
        var button4 = findViewById<Button>(R.id.division)
        var clear = findViewById<Button>(R.id.clear)

        button1.setOnClickListener{
            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var answer = addnum1 + addnum2

            Toast.makeText(this, "$answer", Toast.LENGTH_SHORT).show()

        }

        button2.setOnClickListener{
            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var answer = addnum1 - addnum2

            Toast.makeText(this, "$answer", Toast.LENGTH_SHORT).show()

        }

        button3.setOnClickListener{
            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var answer = addnum1 * addnum2

            Toast.makeText(this, "$answer", Toast.LENGTH_SHORT).show()

        }

        button4.setOnClickListener{
            var addnum1 = num1.text.toString().toInt()
            var addnum2 = num2.text.toString().toInt()
            var answer = addnum1 / addnum2

            Toast.makeText(this, "$answer", Toast.LENGTH_SHORT).show()

        }

        clear.setOnClickListener{
            num1.setText("");
            num2.setText("");

            Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show()
        }
    }
}