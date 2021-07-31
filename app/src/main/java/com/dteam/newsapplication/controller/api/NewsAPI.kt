package com.dteam.newsapplication.controller.api

import com.dteam.newsapplication.data.NewsResponse
import com.dteam.newsapplication.data.StaticData.Companion.KEY_NEWS_API
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/everything")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = KEY_NEWS_API
    ): Response<NewsResponse>

    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = KEY_NEWS_API
    ): Response<NewsResponse>
}