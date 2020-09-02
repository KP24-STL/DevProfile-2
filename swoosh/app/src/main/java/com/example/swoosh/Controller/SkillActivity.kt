package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_LEAUGE
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAUGE).toString()
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

        skill = "baller"
    }

    fun onSkillFinishClicked(view: View) = if (skill != "" ) {
//  fun onSkillFinishClicked(view: View) = if (onView(withId(R.id.ballerSkillBtn)).check(matches(isNotChecked()))
//    && onView(withId(R.id.beginnerSkillBtn)).check(matches(isNotChecked()))) {
        val finishActivity = Intent(this, FinishActivity::class.java)
        finishActivity.putExtra(EXTRA_LEAUGE, league)
        finishActivity.putExtra(EXTRA_SKILL, skill)
        startActivity(finishActivity)
    } else {
        Toast.makeText(this, "Please make a selection from the choices above", Toast.LENGTH_LONG).show()
    }
}