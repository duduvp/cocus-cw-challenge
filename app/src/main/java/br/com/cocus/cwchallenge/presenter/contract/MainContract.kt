package br.com.cocus.cwchallenge.presenter.contract

interface MainContract {
    interface View {
        fun initViews()
    }

    interface Presenter {
        fun onSearchClick(username: String?)
    }

    interface Model {
        fun searchUsers(username: String?)
    }
}