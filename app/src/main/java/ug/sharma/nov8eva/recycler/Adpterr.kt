package ug.sharma.nov8eva.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ug.sharma.nov8eva.R
import ug.sharma.nov8eva.model.Article
import ug.sharma.nov8eva.model.ResponseDTO

class Adpterr(val responseDTO: ResponseDTO):RecyclerView.Adapter<Holderr>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int): Holderr {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_design,parent,false)
        return Holderr(view)
    }

    override fun onBindViewHolder(holder: Holderr, position: Int) {
        var article:Article=responseDTO.articles[position]
        holder.setdata(article)
    }

    override fun getItemCount(): Int {
        return responseDTO.totalResults
    }

}