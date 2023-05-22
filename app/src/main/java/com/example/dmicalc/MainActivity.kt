package com.example.dmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var display_results: TextView
    lateinit var txt_1: EditText
    lateinit var txt_2:EditText
    lateinit var btn_1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //join the two
        display_results = findViewById(R.id.txt_display)
        txt_1 = findViewById(R.id.weight_display)
        txt_2 = findViewById(R.id.height_display)
        btn_1 = findViewById(R.id.btn_1)

        btn_1.setOnClickListener {
            var num1 = txt_1.text.toString().trim()
            var num2 = txt_2.text.toString().trim()

            //validation
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(this, "cannot submit an empty form", Toast.LENGTH_SHORT).show()
            }else{

                //convert to double
                var first_num = num1.toDouble()
                var second_num = num2.toDouble()

                //result in double format
                var result = first_num/ (second_num * second_num)

                //convert back to string
                var finalresult = result.toString()

                display_results.setText("Your BMI is"+ finalresult)

                Toast.makeText(this,finalresult, Toast.LENGTH_SHORT).show()


            }




        }

    }
}