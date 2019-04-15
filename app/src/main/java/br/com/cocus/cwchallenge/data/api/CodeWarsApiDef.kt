package br.com.cocus.cwchallenge.data.api

import br.com.cocus.cwchallenge.data.persistence.entity.dto.ChallengeDetailDTO
import br.com.cocus.cwchallenge.data.persistence.entity.dto.AuthoredDTO
import br.com.cocus.cwchallenge.data.persistence.entity.dto.CompletedDTO
import br.com.cocus.cwchallenge.data.persistence.entity.dto.UserDTO
import io.reactivex.Observable

import retrofit2.http.GET
import retrofit2.http.Path

interface CodeWarsApiDef {
    @GET("users/{username}")
    fun getUser(@Path("username") username : String) : Observable<UserDTO>

    @GET("users/{user}/code-challenges/completed?page=0")
    fun getCompletedChallenges(@Path("user") user : String) : Observable<CompletedDTO>

    @GET("users/{user}/code-challenges/authored")
    fun getAuthoredChallenges(@Path("user") user : String) : Observable<AuthoredDTO>

    @GET("code-challenges/{id}")
    fun getChallengeDetail(@Path("id") id : String) : Observable<ChallengeDetailDTO>
}