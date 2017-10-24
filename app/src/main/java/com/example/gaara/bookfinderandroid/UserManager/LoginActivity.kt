package com.example.gaara.bookfinderandroid.UserManager

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.example.gaara.bookfinderandroid.MainActivity
import com.example.gaara.bookfinderandroid.R
import com.twitter.sdk.android.core.DefaultLogger
import com.twitter.sdk.android.core.Twitter
import com.twitter.sdk.android.core.TwitterAuthConfig
import com.twitter.sdk.android.core.TwitterConfig
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val config = TwitterConfig.Builder(this)
                .logger(DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(TwitterAuthConfig("KEY", "SECRET"))
                .debug(true)
                .build();
        Twitter.initialize(config);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

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

        button_LoginTwitter.setOnClickListener {
            SessionManager(applicationContext).setLogin(true)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}
