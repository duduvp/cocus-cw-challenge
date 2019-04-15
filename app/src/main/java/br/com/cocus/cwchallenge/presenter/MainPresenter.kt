package br.com.cocus.cwchallenge.presenter

import br.com.cocus.cwchallenge.data.model.MainRepository
import br.com.cocus.cwchallenge.presenter.contract.MainContract
import br.com.cocus.cwchallenge.ui.main.MainActivity

class MainPresenter(mainView: MainActivity) : MainContract.Presenter {

    private var view: MainActivity = mainView
    private var model: MainRepository = MainRepository()

    init {
        view.initViews()
    }

    override fun onSearchClick(username: String?) {
        model.searchUsers(username)
    }


}