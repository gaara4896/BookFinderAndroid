package com.example.gaara.bookfinderandroid.UserManager

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.example.gaara.bookfinderandroid.MainActivity
import com.example.gaara.bookfinderandroid.R
import com.twitter.sdk.android.core.*
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private val TWITTER_KEY = "A8MSq8r8QXI8SrtFsiHeOIAnx"
    private val TWITTER_SECRET = "T8mwnsDfDW68YKCEsueWhHgHz6bVrPhS7MZOrvjOtTqWe12Yjk"

    override fun onCreate(savedInstanceState: Bundle?) {
        val config = TwitterConfig.Builder(this)
                .logger(DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET))
                .debug(true)
                .build();
        Twitter.initialize(config);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbar)

        button_LoginEmail.setOnClickListener {
            startActivity(Intent(this, EmailLogin::class.java))
        }

        button_LoginTwitter.callback = (object : Callback<TwitterSession>() {
            override fun success(result: Result<TwitterSession>) {
                SessionManager(applicationContext).setLogin(true)
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            }

            override fun failure(exception: TwitterException) {
                Toast.makeText(applicationContext, "Fail Twitter Login", Toast.LENGTH_LONG).show()
            }
        })

        button_LoginGoogle.setOnClickListener {
            SessionManager(applicationContext).setLogin(true)
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }

    }
}
