package ug.sharma.nov8eva.mainuimodel

import ug.sharma.nov8eva.model.ResponseDTO

sealed class MainUiModel {

    data class onSucess(var responseDTO: ResponseDTO):MainUiModel()

    data class onError(var error:String):MainUiModel()

}