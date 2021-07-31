package com.dteam.newsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.dteam.newsapplication.data.db.ArticleDataBase
import com.dteam.newsapplication.data.db.NewsRepositories
import com.dteam.newsapplication.ui.NewViewModel
import com.dteam.newsapplication.ui.NewsViewModelProviderFactory
import com.dteam.newsapplication.ui.mainnews.MainInfoFragment
import com.dteam.newsapplication.ui.mainnews.MainNewsFragment
import com.dteam.newsapplication.ui.mainnews.MainVideoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: NewViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsRepository = NewsRepositories(ArticleDataBase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(application, newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewViewModel::class.java)

        val narController = findNavController(R.id.fragmentContainerView)
        val bottomNavigationView = bt_nav_main_screen
        val appBarConfiguration = AppBarConfiguration(narController.graph)
//        val appBarConfiguration = AppBarConfiguration(setOf(R.id.mainNewsFragment,R.id.mainVideoFragment,R.id.mainInfoFragment))
        setupActionBarWithNavController(narController,appBarConfiguration)
        bottomNavigationView.setupWithNavController(narController)
//        bottomNavigationView.visibility = View.GONE
        narController.addOnDestinationChangedListener { _, destination, _ ->
            if(destination.id == R.id.mainNewsFragment || destination.id == R.id.mainVideoFragment || destination.id == R.id.mainInfoFragment) {
                bottomNavigationView.visibility = View.VISIBLE
            } else {
                bottomNavigationView.visibility = View.GONE
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragmentContainerView)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}