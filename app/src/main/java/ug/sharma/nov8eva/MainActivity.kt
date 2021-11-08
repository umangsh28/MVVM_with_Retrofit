package ug.sharma.nov8eva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import ug.sharma.nov8eva.mainuimodel.MainUiModel
import ug.sharma.nov8eva.mainview.MainViewModel
import ug.sharma.nov8eva.model.Article
import ug.sharma.nov8eva.model.ResponseDTO
import ug.sharma.nov8eva.recycler.Adpterr
import java.util.Collections.emptyList

class MainActivity : AppCompatActivity() {


    private lateinit var mainViewModel: MainViewModel

    private var list=emptyList<Article>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.CallApiByView()

        mainViewModel.liveData.observe(this,{
            when(it){
                is MainUiModel.onSucess -> {
                    list=it.responseDTO.articles
                    setrecycler()
                }

                is MainUiModel.onError ->{
                    Log.d("umang",it.error)
                }
            }
        })

    }

    private fun setrecycler() {
        val Madapter=Adpterr(list)
        val linearLayoutManager=LinearLayoutManager(this)

        recycler.adapter=Madapter
        recycler.layoutManager=linearLayoutManager
    }
}