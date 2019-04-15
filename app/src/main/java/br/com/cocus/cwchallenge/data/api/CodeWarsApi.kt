package br.com.cocus.cwchallenge.data.api

import br.com.cocus.cwchallenge.data.persistence.entity.dto.UserDTO
import com.google.gson.GsonBuilder
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CodeWarsApi {

    val service: CodeWarsApiDef

    init {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)

        val gson = GsonBuilder().setLenient().create()

        val retrofit = Retrofit.Builder()
                .baseUrl("https://www.codewars.com/api/v1/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(httpClient.build())
                .build()

        service = retrofit.create<CodeWarsApiDef>(CodeWarsApiDef::class.java)
    }

    fun loadUser(username : String) : Observable<UserDTO> {
        return service.getUser(username)
    }

    /*fun loadCompletedChallenges() : Observable<CompletedDTO> {
        return service.getCompletedChallenges("")
                .flatMap { completedResult -> Observable.from(completedResult.result) }
                .flatMap { completed -> Observable.just(CompletedChallengesDTO(completed.))}
    }*/

    /*fun loadAuthoredChallenges() : Observable<AuthoredDTO> {
        return service.getCompletedChallenges("")
                .flatMap { completedResult -> Observable.from(completedResult.result) }
                .flatMap { completed -> Observable.just(CompletedChallengesDTO(completed.))}
    }*/

    /*fun loadDetailedChallenge() : Observable<ChallengeDetailDTO> {
        return service.getCompletedChallenges("")
                .flatMap { completedResult -> Observable.from(completedResult.result) }
                .flatMap { completed -> Observable.just(CompletedChallengesDTO(completed.))}
    }*/
}