package com.example.gaara.bookfinderandroid.UserManager

import android.content.Context

/**
 * Created by gaara on 10/24/17.
 */

class SessionManager(val context:Context){

    val PREF_NAME = "BookFinderApp"
    val IS_LOGGED_IN_KEY = "isLoggedIn"
    val pref = context.getSharedPreferences(PREF_NAME, 0)
    val editor = pref.edit()

    /**
     * function setLogin set the session is logged in
     * @param isLoggedin:Boolean status if session is logged in
     */
    fun setLogin(isLoggedin:Boolean){
        editor.putBoolean(IS_LOGGED_IN_KEY, isLoggedin)
        editor.commit()
    }

    /**
     * function isLoggedIn return if the session is logged in
     * @return Boolean if logged in
     */
    fun isLoggedIn():Boolean {
        return pref.getBoolean(IS_LOGGED_IN_KEY, false)
    }
}