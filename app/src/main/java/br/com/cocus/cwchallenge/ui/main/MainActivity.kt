package br.com.cocus.cwchallenge.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.cocus.cwchallenge.R
import br.com.cocus.cwchallenge.presenter.MainPresenter
import br.com.cocus.cwchallenge.presenter.contract.MainContract
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    private var presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this) //Initialize MainPresenter
    }

    override fun initViews() {
        imgSearch.setOnClickListener { presenter?.onSearchClick(edtUsername.text.toString()) }
    }


}
