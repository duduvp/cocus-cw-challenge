package br.com.cocus.cwchallenge.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.cocus.cwchallenge.R
import br.com.cocus.cwchallenge.presenter.contract.MainContract

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
