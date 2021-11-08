package ug.sharma.nov8eva.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ug.sharma.nov8eva.R
import ug.sharma.nov8eva.model.ResponseDTO

class Adpterr(val responseDTO: ResponseDTO):RecyclerView.Adapter<Holderr>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int): Holderr {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_design,parent,false)
    }

    override fun onBindViewHolder(holder: Holderr, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}