package com.udacity.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.udacity.shoestore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        val navController = this.findNavController(R.id.myNavHostFragment)

        appBarConfiguration = AppBarConfiguration(navController.graph)

    }

    override fun onNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)

        return navController.navigateUp()
    }
}
