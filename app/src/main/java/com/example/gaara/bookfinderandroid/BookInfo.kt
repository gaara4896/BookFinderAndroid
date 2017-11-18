package com.example.gaara.bookfinderandroid

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.example.gaara.bookfinderandroid.Fragment.BookStoreRecycle
import com.example.gaara.bookfinderandroid.Utils.BookStore
import kotlinx.android.synthetic.main.activity_book_info.*

class BookInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_info)

        setSupportActionBar(toolbar)
        toolbar.setTitleTextColor(Color.WHITE)

        toolbar.title = (intent.extras.get("name") as Array<String>)[0]

        val bookStores = arrayOf(
                BookStore("MPH Online", "Petaling Jaya", "3KM", 39.90),
                BookStore("Popular", "Petaling Jaya", "3.5KM", 40.50),
                BookStore("MPH Online", "Petaling Jaya", "3KM", 39.90),
                BookStore("Popular", "Petaling Jaya", "3.5KM", 40.50),
                BookStore("MPH Online", "Petaling Jaya", "3KM", 39.90),
                BookStore("Popular", "Petaling Jaya", "3.5KM", 40.50),
                BookStore("MPH Online", "Petaling Jaya", "3KM", 39.90),
                BookStore("Popular", "Petaling Jaya", "3.5KM", 40.50),
                BookStore("Rising Star Book", "Subang Jaya", "5KM", 41.30)
        )

        recycleView_BookStore.layoutManager = LinearLayoutManager(applicationContext)

        recycleView_BookStore.adapter = BookStoreRecycle(applicationContext, bookStores){
            Log.d("Recycle", "${it.name} is working")
        }
    }
}
