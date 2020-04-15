package com.anioncode.lukieoodatahelper

import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

open class LukieooFormatter {

    companion object {

        //Parse  String to ISO Date Format
        //example dateString = "2019-01-07T10:49:59.229Z"

        fun StringISOToDate(dateString: String?): Date? {
            val tz = TimeZone.getTimeZone("UTC")
            val df: DateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
            df.setTimeZone(tz)
            try {
                return df.parse(dateString)
            } catch (e: ParseException) {
                e.printStackTrace()
            }
            return null
        }

        //Parse String to date with Custom format
        //example dateString = "2019-01-07" ,format="yyyy-MM-dd"

        fun StringCustomToDate(dateString: String?, format: String?): Date? {
            val tz = TimeZone.getTimeZone("UTC")
            val df: DateFormat = SimpleDateFormat(format)
            df.setTimeZone(tz)
            try {
                return df.parse(dateString)
            } catch (e: ParseException) {
                e.printStackTrace()
            }
            return null
        }

        //Parse Date to String ISO Format
        fun DateToStringISO(date: Date?): String? {
            val tz = TimeZone.getTimeZone("UTC")
            val df: DateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
            df.timeZone = tz
            return df.format(date)
        }

        //Parse Date to Custom String Format
        fun DateCustomToStringISO(date: Date?, format: String?): String? {
            val tz = TimeZone.getTimeZone("UTC")
            val df: DateFormat = SimpleDateFormat(format)
            df.timeZone = tz
            return df.format(date)
        }

        //currentDate
        fun GetCurrentDateTime(): Date {
            return Calendar.getInstance().time
        }
    }

}