package com.android.gsixacademy.karantindomasna

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user_list.*


var userList = arrayListOf<String>( )

class UserListActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)



        var arrayAdapter = ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, userList)
        list_view_result.adapter = arrayAdapter

        button_add.setOnClickListener {
            var name = edit_text_ime.text.toString()
            var state = edit_text_drzava.text.toString()
            var city = edit_text_grad.text.toString()
            if (edit_text_ime.text.isNotEmpty() && edit_text_drzava.text.isNotEmpty() && edit_text_grad.text.isNotEmpty() ){
                userList.add ("Јас сум $name од $city , $state")

                var arrayAdapter =
                    ArrayAdapter <String> (this, android.R.layout.simple_list_item_1, userList)
                list_view_result.adapter = arrayAdapter
                edit_text_ime.setText("")
                edit_text_grad.setText("")
                edit_text_drzava.setText("")

            }else {
                Toast.makeText(applicationContext, "Invalid input", Toast.LENGTH_SHORT).show()
            }
        }




    }
}