package com.example.gaara.bookfinderandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.example.gaara.bookfinderandroid.Fragment.BookStoreRecycle
import com.example.gaara.bookfinderandroid.Utils.BookStore
import kotlinx.android.synthetic.main.activity_book_store_list.*

class BookStoreList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_store_list)

        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val bookStores = arrayOf(
                BookStore("MPH Online", "Petaling Jaya", "3KM"),
                BookStore("Popular", "Petaling Jaya", "3.5KM"),
                BookStore("MPH Online", "Petaling Jaya", "3KM"),
                BookStore("Popular", "Petaling Jaya", "3.5KM"),
                BookStore("MPH Online", "Petaling Jaya", "3KM"),
                BookStore("Popular", "Petaling Jaya", "3.5KM"),
                BookStore("MPH Online", "Petaling Jaya", "3KM"),
                BookStore("Popular", "Petaling Jaya", "3.5KM"),
                BookStore("Rising Star Book", "Subang Jaya", "5KM")
        )

        recycleView_BookStore.layoutManager = LinearLayoutManager(applicationContext)

        recycleView_BookStore.adapter = BookStoreRecycle(applicationContext, bookStores){
            Log.d("Recycle", "${it.name} is working")
        }
    }
}
