package com.example.lukieoodatahelperlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anioncode.lukieoodatahelper.LukieooFormatter.Companion.DateCustomToStringISO
import com.anioncode.lukieoodatahelper.LukieooFormatter.Companion.DateToStringISO
import com.anioncode.lukieoodatahelper.LukieooFormatter.Companion.GetCurrentDateTime
import com.anioncode.lukieoodatahelper.LukieooFormatter.Companion.StringCustomToDate
import com.anioncode.lukieoodatahelper.LukieooFormatter.Companion.StringISOToDate
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("TEST"+StringISOToDate("2019-01-07T10:49:59.229Z"))
        println("TEST2"+StringCustomToDate("2019-01-07","yyyy-MM-dd"))
        println("TEST3"+DateToStringISO(GetCurrentDateTime()))
        println("TEST3"+DateCustomToStringISO(GetCurrentDateTime(),"yyyy-MM-dd"))


    }

}
