package com.dteam.newsapplication.ui

import androidx.lifecycle.ViewModel
import com.dteam.newsapplication.data.db.NewsRepositories

class NewViewModel(
    val newsRepositories: NewsRepositories
) : ViewModel() {
}