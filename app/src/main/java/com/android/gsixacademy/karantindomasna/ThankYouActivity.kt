package com.android.gsixacademy.karantindomasna

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_thank_you.*

class ThankYouActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thank_you)


        button_sign_in.setOnClickListener {
            var intent = Intent (applicationContext, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}