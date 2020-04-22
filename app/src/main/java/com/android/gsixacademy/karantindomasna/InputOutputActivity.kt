package com.android.gsixacademy.karantindomasna

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_input_output.*

class InputOutputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_output)


        button_add.setOnClickListener {
            if (edit_text_name.text.isEmpty()) {
                Toast.makeText(applicationContext, "Invalid input", Toast.LENGTH_SHORT).show()
            }else {
                if (edit_text_city.text.isEmpty()){
                    Toast.makeText(applicationContext, "Invalid input", Toast.LENGTH_SHORT).show()
                }else {
                    if (edit_text_state.text.isEmpty()){
                        Toast.makeText(applicationContext,"Invalid input", Toast.LENGTH_SHORT).show()
                    }else {
                        if (edit_text_birthday.text.isEmpty()){
                            Toast.makeText(applicationContext, "Invalid input", Toast.LENGTH_SHORT).show()
                        } else {
                            val name = edit_text_name.text.toString()
                            val city = edit_text_city.text.toString()
                            val state = edit_text_state.text.toString()
                            val date = edit_text_birthday.text.toString()
                            text_view_result.text = "Јас сум $name роден во $city, $state на ден $date"
                        }
                    }
                }
            }


        }
        }



}
