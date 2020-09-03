package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
//import com.example.swoosh.Utilities.EXTRA_LEAUGE **refactor/replaced with EXTRA_PLAYER
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player ("", "")
//    var selectedLeague = ""

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, this.player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"
//      selectedLeague = "mens"
    }

    fun onWomensClicked (view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"
//      selectedLeague = "womens"

    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "co-ed"
//      selectedLeague = "co-ed"

    }

    fun leagueNextClicked(view: View) = if (player.league != "") {  // selectedLeague != ""
        val skillActivity = Intent(this, SkillActivity::class.java)
        skillActivity.putExtra(EXTRA_PLAYER, player)      //EXTRA_LEAGUE, selectedLeague
        startActivity(skillActivity)
    } else {
        Toast.makeText(this, "Please make a selection from the choices above", Toast.LENGTH_SHORT).show()
    }
}