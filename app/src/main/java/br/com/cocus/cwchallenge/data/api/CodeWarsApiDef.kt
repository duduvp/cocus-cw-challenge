package br.com.cocus.cwchallenge.data.api

import br.com.cocus.cwchallenge.data.local.entity.UserResult
import io.reactivex.Observable
import retrofit2.http.GET

interface CodeWarsApiDef {
    @GET("users/{username}")
    fun getUsers() : Observable<UserResult>

    @GET("users/{user}/code-challenges/completed?page=0")
    fun getCompletedChallenges() : Observable<UserResult>

    @GET("users/{user}/code-challenges/authored")
    fun getAuthoredChallenges() : Observable<UserResult>

    @GET("code-challenges/{:id}")
    fun getChallengeDetail() : Observable<UserResult>
}