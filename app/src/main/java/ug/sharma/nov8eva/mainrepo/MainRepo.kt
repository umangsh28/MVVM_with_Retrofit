package ug.sharma.nov8eva.mainrepo

import io.reactivex.rxjava3.core.Observable
import ug.sharma.nov8eva.model.ResponseDTO
import ug.sharma.nov8eva.network.network

class MainRepo {



    fun getDataByRepo():Observable<ResponseDTO>{
        return network.getDataByNetwork().getDataByApi()
    }
}