package com.dteam.newsapplication.data

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)