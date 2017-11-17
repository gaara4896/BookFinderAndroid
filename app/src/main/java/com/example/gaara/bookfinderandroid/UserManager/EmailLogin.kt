package com.example.gaara.bookfinderandroid.UserManager

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.gaara.bookfinderandroid.MainActivity
import com.example.gaara.bookfinderandroid.R
import kotlinx.android.synthetic.main.activity_email_login.*

class EmailLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_login)
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

        button_Register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
