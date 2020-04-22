package com.android.gsixacademy.karantindomasna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view_sign_in.setOnClickListener {
            var intent = Intent (applicationContext, SignInActivity ::class.java)
            startActivity(intent)
        }
        text_view_sign_up.setOnClickListener {
            var intent = Intent (applicationContext, SignUpActivity ::class.java)
            startActivity(intent)
        }
        text_view_input.setOnClickListener {
            var intent = Intent (applicationContext, InputOutputActivity::class.java)
            startActivity(intent)
        }
        text_view_user_list.setOnClickListener {
            var intent = Intent (applicationContext, UserListActivity::class.java)
            startActivity(intent)
        }
        text_view_holiday.setOnClickListener {
            var intent = Intent (applicationContext, HolidayActivity::class.java)
            startActivity(intent)
        }
    }
}
