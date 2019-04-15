package br.com.cocus.cwchallenge.data.model

import br.com.cocus.cwchallenge.data.api.CodeWarsApi
import br.com.cocus.cwchallenge.data.persistence.entity.dto.UserDTO
import br.com.cocus.cwchallenge.presenter.contract.MainContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainRepository : MainContract.Model {

    override fun searchUsers(username: String) {
        var userDTO = UserDTO() //Debug
        val api = CodeWarsApi()
        api.loadUser(username)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ uDTO ->
                    userDTO = UserDTO(uDTO.name, uDTO.ranks)
                }, { e ->
                    e.printStackTrace()
                }, {
                    return@subscribe
                })
    }
}