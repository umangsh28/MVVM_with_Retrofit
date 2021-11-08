package ug.sharma.nov8eva.dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity(tableName = "News")
data class Table (@ColumnInfo(name = "title")var title:String,
                  @ColumnInfo(name = "description")var desc:String,
                  @ColumnInfo(name = "image")var image:String
)