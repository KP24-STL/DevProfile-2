package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
//import com.example.swoosh.Utilities.EXTRA_LEAUGE **refactored out with use of EXTRA_PLAYER
//import com.example.swoosh.Utilities.EXTRA_SKILL  **refactored out with use of EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

//        val skill = intent.getStringExtra(EXTRA_SKILL).toString()
//        val league = intent.getStringExtra(EXTRA_LEAUGE).toString()
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player?.league}  ${player?.skill} league near you..."
    }
}