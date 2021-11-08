package ug.sharma.nov8eva.listener

import ug.sharma.nov8eva.model.Article

interface NewsListener {

    fun onNews(article: Article, Position: Int)


}