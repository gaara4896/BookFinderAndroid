package com.example.gaara.bookfinderandroid.UserManager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.gaara.bookfinderandroid.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        button_Register.setOnClickListener {
            if(TextUtils.isEmpty(editText_LoginId.text)){
                Toast.makeText(applicationContext, "Login Id cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(editText_Password.text)){
                Toast.makeText(applicationContext, "Password cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(editText_ConfirmPassword.text)){
                Toast.makeText(applicationContext, "ConfirmPassword cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(editText_Email.text)){
                Toast.makeText(applicationContext, "Email cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(editText_Name.text)){
                Toast.makeText(applicationContext, "Name cannot be empty", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            button_Register.setOnClickListener {
                if(editText_Password.text.toString().equals(editText_ConfirmPassword.text.toString())){
                    Toast.makeText(applicationContext, "Register Successfully", Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    editText_ConfirmPassword.error = ("Different Password")
                }
            }
        }
    }
}
