package com.example.gaara.bookfinderandroid

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.gaara.bookfinderandroid.UserManager.LoginActivity
import com.example.gaara.bookfinderandroid.UserManager.SessionManager
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val sessionManager = SessionManager(applicationContext)

        if(!sessionManager.isLoggedIn()){
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        button_Search.setOnClickListener{
            startActivity(Intent(this, Search::class.java))
        }

        button_Bookstore.setOnClickListener{
            startActivity(Intent(this, BookStoreList::class.java))
        }
    }
}
