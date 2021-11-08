package ug.sharma.nov8eva.dataBase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import ug.sharma.nov8eva.model.Article


@Dao
interface TableDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun add(article: Article)
}