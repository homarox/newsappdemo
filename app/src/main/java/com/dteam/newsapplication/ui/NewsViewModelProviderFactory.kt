package com.dteam.newsapplication.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dteam.newsapplication.data.db.NewsRepositories

class NewsViewModelProviderFactory(
    val app: Application,
    val newsRepository: NewsRepositories
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewViewModel(app, newsRepository) as T
    }
}