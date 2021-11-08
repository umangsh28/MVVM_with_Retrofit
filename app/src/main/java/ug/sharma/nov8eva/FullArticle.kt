package ug.sharma.nov8eva

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        val full=intent.getStringExtra("full")

        Glide.with(this).load(image).into(img1)
        title1.text=title.toString()
        descr1.text=desc.toString()

        btnFullArticle.setOnClickListener {
            var intent1= Intent(Intent.ACTION_VIEW, Uri.parse(full))
            startActivity(intent1)
        }

        btnAdd.setOnClickListener {

            var intent1 = Intent(this, DataStorage::class.java)
            Toast.makeText(this,"data saved temporary",Toast.LENGTH_SHORT).show()

            intent1.putExtra("img", image)
            intent1.putExtra("title", title)
            intent1.putExtra("desc", desc)
            startActivity(intent1)
        }


    }

}