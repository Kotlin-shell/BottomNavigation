package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val controller = findNavController(R.id.fl_wrapper)

        val appNavigationFragments = AppBarConfiguration(setOf(
            R.id.home,
            R.id.dashboard,
            R.id.list,
            R.id.storage
        ))

        setupActionBarWithNavController(controller, appNavigationFragments)
        bottomNavigation.setupWithNavController(controller)

    }


}