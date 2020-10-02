package com.example.smack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Loginactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)
    }

    fun loginLoginBtnClicked(view: View) {

    }

    fun loginCreateUserBtnClicked(view: View) {
        val createuserIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(createuserIntent)


    }
}