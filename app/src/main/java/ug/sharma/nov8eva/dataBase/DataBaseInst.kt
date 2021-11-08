package ug.sharma.nov8eva.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase


@Database(entities = [Table::class],version = 1)
abstract class DataBaseInst {

    abstract fun getAddByBasee():TableDao

    companion object{

        private var Instance:DataBaseInst?=null

        fun getdata(context: Context):DataBaseInst{


            return if(Instance==null){
                val Builder= Room.databaseBuilder(context.applicationContext,DataBaseInst::class.java,"News")
                Instance=Builder.build()
                Instance!!
            }else{
                Instance!!
            }
        }

    }


}