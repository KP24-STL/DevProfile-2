package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
//import com.example.swoosh.Utilities.EXTRA_LEAUGE
//import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""
    lateinit var player : Player //since initilizing later use lateinit

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, this.player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
//        league = intent.getStringExtra(EXTRA_LEAUGE).toString()
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

//        skill = "beginner"
        player.skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

//        skill = "baller"
        player.skill = "baller"
    }

    fun onSkillFinishClicked(view: View) = if (player.skill != "" ) {
//  fun onSkillFinishClicked(view: View) = if (onView(withId(R.id.ballerSkillBtn)).check(matches(isNotChecked()))
//    && onView(withId(R.id.beginnerSkillBtn)).check(matches(isNotChecked()))) {
        val finishActivity = Intent(this, FinishActivity::class.java)
//        finishActivity.putExtra(EXTRA_LEAUGE, league)
//        finishActivity.putExtra(EXTRA_SKILL, skill)
        finishActivity.putExtra(EXTRA_PLAYER, player)
        startActivity(finishActivity)
    } else {
        Toast.makeText(this, "Please make a selection from the choices above", Toast.LENGTH_LONG).show()
    }
}