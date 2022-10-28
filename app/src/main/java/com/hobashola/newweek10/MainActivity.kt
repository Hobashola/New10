package com.hobashola.newweek10

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import com.hobashola.newweek10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfCodes = listOf<Int>(+234, +966)
        binding.code.adapter = ArrayAdapter<Int> (
            this,
            android.R.layout.simple_spinner_dropdown_item,
            listOfCodes
        )

        binding.button.setOnClickListener {
            Toast.makeText(this, "Profile updated", Toast.LENGTH_LONG).show()


        }

    }


}