package ug.sharma.nov8eva.api

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import retrofit2.http.GET

interface ApiClient {

    //https://newsapi.org/v2/everything?q=tesla&from=2021-11-08&sortBy=popularity&apiKey=96680e34cd074094889957f64535496d

    @GET()
    fun getDataByApi():Observable<>
}