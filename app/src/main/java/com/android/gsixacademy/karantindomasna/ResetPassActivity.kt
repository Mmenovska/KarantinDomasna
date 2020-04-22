package com.android.gsixacademy.karantindomasna

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_reset_pass.*

class ResetPassActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pass)


        button_send_new_pass.setOnClickListener {
            if (edit_text_email.text.isNotEmpty()){
            Toast.makeText(applicationContext,"New password succesfully sent to your e-mail", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(applicationContext,"Please enter correct e-mail address", Toast.LENGTH_LONG ).show()
            }
        }

        text_view_go_back.setOnClickListener {
            var intent = Intent (applicationContext, SignInActivity :: class.java)
            startActivity(intent)
        }
    }
}