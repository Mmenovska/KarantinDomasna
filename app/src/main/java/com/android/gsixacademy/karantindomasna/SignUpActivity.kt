package com.android.gsixacademy.karantindomasna

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        button_sign_up.setOnClickListener {
            if (edit_text_first_name.text.isEmpty()){
                Toast.makeText(applicationContext, "Enter First Name", Toast.LENGTH_SHORT).show()
                if (edit_text_email.text.isEmpty()){
                    Toast.makeText(applicationContext, "Enter your e-mail address", Toast.LENGTH_SHORT).show()
                } else {
                    if (edit_text_login.text.isEmpty()){
                        Toast.makeText(applicationContext, "Enter your Login name", Toast.LENGTH_SHORT).show()
                    }else {
                        if (edit_text_password.text.isEmpty()){
                            Toast.makeText(applicationContext, "Incorrect password!!!", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            } else {
                var intent = Intent (applicationContext, ThankYouActivity::class.java)
                startActivity(intent)
            }
        }

        text_view_subscribe.setOnClickListener {
            Toast.makeText(applicationContext, "Thank you for subscribing to our newsletter", Toast.LENGTH_SHORT ).show()
        }

        text_view_sign_in.setOnClickListener {
            var intent = Intent (applicationContext, SignInActivity::class.java)
            startActivity(intent)
        }

    }
}