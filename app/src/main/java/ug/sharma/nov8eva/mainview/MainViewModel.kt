package ug.sharma.nov8eva.mainview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import ug.sharma.nov8eva.mainrepo.MainRepo
import ug.sharma.nov8eva.mainuimodel.MainUiModel
import ug.sharma.nov8eva.model.ResponseDTO
import java.util.*

class MainViewModel : ViewModel() {

    private val mainRepo=MainRepo()
    private val mutableLiveData=MutableLiveData<MainUiModel>()
    val liveData:LiveData<MainUiModel> =mutableLiveData


    private lateinit var disposable: Disposable



    fun CallApiByView(){
        mainRepo.getDataByRepo().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<ResponseDTO>{
                override fun onSubscribe(d: Disposable) {
                    disposable=d
                }

                override fun onNext(t: ResponseDTO) {
                    mutableLiveData.value=MainUiModel.onSucess(t)
                }

                override fun onError(e: Throwable) {

                }

                override fun onComplete() {

                }
            })

    }
}