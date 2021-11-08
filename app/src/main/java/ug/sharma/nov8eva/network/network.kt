package ug.sharma.nov8eva.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import ug.sharma.nov8eva.api.ApiClient

object network {

    private const val base="https://newsapi.org/"

    fun getDataByNetwork():ApiClient{
        val builder=Retrofit.Builder()
            .baseUrl(base)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()


        return builder.create(ApiClient::class.java)

    }
}