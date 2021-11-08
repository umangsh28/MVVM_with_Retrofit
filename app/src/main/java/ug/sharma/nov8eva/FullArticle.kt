package ug.sharma.nov8eva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_full_article.*

class FullArticle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_article)

        datafromFirst()


    }

    private fun datafromFirst() {
        val image=intent.getStringExtra("img")
        val title=intent.getStringExtra("title")
        val desc=intent.getStringExtra("desc")

        Glide.with(this).load(image).into(img1)
        title1.text=title.toString()
        descr1.text=desc.toString()

    }
}