package ug.sharma.nov8eva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_data_storage.*
import kotlinx.android.synthetic.main.activity_full_article.*

import ug.sharma.nov8eva.model.Article

class DataStorage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_storage)
        add()
    }



     fun add() {
        val image=intent.getStringExtra("img")
        val title=intent.getStringExtra("title")

        Glide.with(this).load(image).into(imggg)
        Title.text=title.toString()

    }

}