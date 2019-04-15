package br.com.cocus.cwchallenge.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.cocus.cwchallenge.R
import br.com.cocus.cwchallenge.presenter.contract.DetailContract

class DetailActivity : AppCompatActivity(), DetailContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}
