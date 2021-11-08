package ug.sharma.nov8eva.dataBase

import retrofit2.Call
import ug.sharma.nov8eva.model.ResponseDTO
import ug.sharma.nov8eva.network.network

class RepoDataBase {


    fun addData(): Call<ResponseDTO>{
        return  network.getDataByNetwork().getDataByBase()
    }
}