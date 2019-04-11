package br.com.cocus.cwchallenge.ui.challenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.cocus.cwchallenge.R
import br.com.cocus.cwchallenge.presenter.contract.ChallengeContract
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_challenge.*

class ChallengeActivity : AppCompatActivity(), ChallengeContract.View {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_completed_challenges -> {
                //TODO LIST OF COMPLETED CHALLENGES
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_authored_challenges -> {
                //TODO LIST OF AUTHORED CHALLENGES
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
