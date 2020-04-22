package com.android.gsixacademy.karantindomasna

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_holiday.*

class HolidayActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holiday)

        button_easter.setOnClickListener {
            Toast.makeText(applicationContext, "Во 2020 година, празникот Велигден се празнува на 19ти Април", Toast.LENGTH_LONG).show()
        }

        button_bogorodica.setOnClickListener {
            Toast.makeText(applicationContext, "Празникот Богородица се празнува на 28ми Август", Toast.LENGTH_LONG).show()
        }

        button_vodici.setOnClickListener {
            Toast.makeText(applicationContext, "Празникот Водици се празнува на 19ти Јануари", Toast.LENGTH_LONG).show()
        }

        button_ilinden.setOnClickListener {
            Toast.makeText(applicationContext, "Празникот Илинден се празнува на 02ри Август", Toast.LENGTH_LONG).show()
        }

        button_kipur.setOnClickListener {
            Toast.makeText(applicationContext, "Во 2020 година, празникот Јом Кипур се празнува на 27ми Септември",Toast.LENGTH_LONG).show()
        }

        button_kurban.setOnClickListener {
            Toast.makeText(applicationContext, "Во 2020 година, празникот Курбан Бајрам се празнува на 30ти Јули", Toast.LENGTH_LONG).show()
        }

        button_new_year.setOnClickListener {
            Toast.makeText(applicationContext, "Нова Година се прославува на 31ви Декември", Toast.LENGTH_LONG).show()
        }

        button_ramazan.setOnClickListener {
            Toast.makeText(applicationContext, "Во 202 година, празникот Рамазан Бајрам се прославува на 23ти Мај", Toast.LENGTH_LONG).show()
        }

    }

}