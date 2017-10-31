package com.example.gaara.bookfinderandroid

import android.app.DatePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_advance_search.*
import java.util.Calendar

class AdvanceSearch : AppCompatActivity() {

    internal var dateSetListener: DatePickerDialog.OnDateSetListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advance_search)

        setSupportActionBar(toolbar)

        var dateClicked:Int = 0
        val adapter = ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,
                arrayOf("All", "Novel", "Cookbook", "Finance", "Business", "Philantrophy",
                        "Self Help"))
        spinner_Category.adapter = adapter
        spinner_Category.setSelection(0)

        val calendar = Calendar.getInstance()
        editText_PublicationFrom.setText(
                "${calendar.get(Calendar.DAY_OF_MONTH)}/" +
                        "${calendar.get(Calendar.MONTH)}/" +
                        "${calendar.get(Calendar.YEAR)}")

        editText_PublicationTo.setText(
                "${calendar.get(Calendar.DAY_OF_MONTH)}/" +
                        "${calendar.get(Calendar.MONTH)}/" +
                        "${calendar.get(Calendar.YEAR)}")

        editText_PublicationFrom.setOnClickListener {
            dateClicked = 0
            val date = editText_PublicationFrom.getText().toString()
            val temp = date.split("/".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()

            val datePicker = DatePickerDialog(this@AdvanceSearch,
                    dateSetListener,
                    Integer.parseInt(temp[2]), Integer.parseInt(temp[1]) - 1, Integer.parseInt(temp[0]))
            datePicker.show()
        }

        editText_PublicationTo.setOnClickListener {
            dateClicked = 1
            val date = editText_PublicationTo.getText().toString()
            val temp = date.split("/".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()

            val datePicker = DatePickerDialog(this@AdvanceSearch,
                    dateSetListener,
                    Integer.parseInt(temp[2]), Integer.parseInt(temp[1]) - 1, Integer.parseInt(temp[0]))
            datePicker.show()
        }

        dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, day ->
            var month = month
            month++
            val date = day.toString() + "/" + month + "/" + year
            if(dateClicked == 0){
                editText_PublicationFrom.setText(date)
            } else {
                editText_PublicationTo.setText(date)
            }
        }

        button_Search.setOnClickListener{
            startActivity(Intent(this, AdvanceSearchResult::class.java))
        }
    }
}
