package ug.sharma.nov8eva.recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ug.sharma.nov8eva.R
import ug.sharma.nov8eva.listener.NewsListener
import ug.sharma.nov8eva.model.Article

class Holderr(var itemView: View,val clicklistener:NewsListener) : RecyclerView.ViewHolder(itemView) {


    fun setdata(article: Article,pos:Int) {

        val image = itemView.findViewById<ImageView>(R.id.img)
        val title = itemView.findViewById<TextView>(R.id.title)
        val date = itemView.findViewById<TextView>(R.id.date)
        val desc = itemView.findViewById<TextView>(R.id.descr)


        title.text=article.title
        date.text=article.publishedAt
        desc.text=article.description
        Glide.with(image).load(article.urlToImage).into(image)

        itemView.setOnClickListener {
            clicklistener.onNews(article,adapterPosition)
        }
    }
}