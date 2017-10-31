package com.example.gaara.bookfinderandroid.UserManager

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
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

        button_Login.setOnClickListener {
            if(TextUtils.isEmpty(editText_LoginId.text)){
                Toast.makeText(applicationContext, "LoginId must not be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(editText_Password.text)){
                Toast.makeText(applicationContext, "Password msut not be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(editText_LoginId.text.toString().equals("admin", false)
                    && editText_Password!!.text.toString().equals("admin", false)){
                SessionManager(applicationContext).setLogin(true)
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(applicationContext, "Incorrect Crudential", Toast.LENGTH_LONG).show()
            }
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

        button_Register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        button_LoginGoogle.setOnClickListener {
            SessionManager(applicationContext).setLogin(true)
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }

    }
}
