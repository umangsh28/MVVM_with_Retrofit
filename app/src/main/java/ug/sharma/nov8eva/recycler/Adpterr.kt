package ug.sharma.nov8eva.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ug.sharma.nov8eva.R
import ug.sharma.nov8eva.model.Article

class Adpterr(val article: List<Article>):RecyclerView.Adapter<Holderr>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int): Holderr {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_design,parent,false)
        return Holderr(view)
    }

    override fun onBindViewHolder(holder: Holderr, position: Int) {
        var article:Article=article[position]
        holder.setdata(article)
    }

    override fun getItemCount(): Int {
        return article.size
    }

}