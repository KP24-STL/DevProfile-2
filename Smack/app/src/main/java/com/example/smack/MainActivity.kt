package com.example.smack

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.ui.AppBarConfiguration
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity() {

//    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
//                val toolbar: Toolbar = findViewById(R.id.toolbar)


//        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, "Open drawer", "Close drawer")
//        drawer_layout.addDrawerListener(toggle)
//        toggle.syncState()

    }

    private fun ActionBarDrawerToggle(
        activity: Activity,
        drawerLayout: DrawerLayout?,
        toolbar: Toolbar?,
        s: String,
        s1: String
    ): ActionBarDrawerToggle {
        TODO("Not yet implemented")
    }


    override fun onBackPressed() {
    if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
        drawer_layout.closeDrawer(GravityCompat.START)
    } else {
        super.onBackPressed()
        }
    }

    fun loginBtnNavClicked(view: View) {  //create this click listener function for a clickable button. Use onClick name as method name.
        val loginIntent = Intent(this, Loginactivity::class.java)
        startActivity(loginIntent)
    }

    fun addChannelClicked(view: View) {

    }

    fun sendMsgBtnClicked(view: View) {

    }

}
