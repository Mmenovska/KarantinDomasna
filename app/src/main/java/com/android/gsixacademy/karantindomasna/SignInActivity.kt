package com.android.gsixacademy.karantindomasna

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        button_sign_in.setOnClickListener {
            if (edit_text_user_name.text.isEmpty()){
                Toast.makeText(applicationContext, "Incorrect Username!!!", Toast.LENGTH_LONG).show()
            }else {
                if (edit_text_password.text.isEmpty()){
                    Toast.makeText(applicationContext, "Enter your password!!!", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(applicationContext, "Welcome!!!", Toast.LENGTH_LONG).show()
                }
                var intent = Intent (applicationContext, WelcomeActivity::class.java)
                startActivity(intent)
            }
        }

        text_view_forgot_pass.setOnClickListener {
            val intent = Intent (applicationContext, ResetPassActivity::class.java)
            startActivity(intent)
        }
        text_view_sign_up.setOnClickListener {
            val intent = Intent (applicationContext, SignUpActivity::class.java)
            startActivity(intent)
        }

        text_view_sign_up.setOnClickListener {
            var intent = Intent (applicationContext, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}