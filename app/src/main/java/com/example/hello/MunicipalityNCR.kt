package com.example.hello

import android.R
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding

class MunicipalityNCR : AppCompatActivity() {
    private lateinit var arrayAdapter: ArrayAdapter<String>
    lateinit var binding : ActivityMainBinding

    var provinceList = arrayOf(
        "Caloocan",
        "Las Piñas",
        "Makati",
        "Malabon",
        "Mandaluyong",
        "Manila",
        "Marikina",
        "Muntinlupa",
        "Navotas",
        "Parañaque",
        "Pasay",
        "Pasig",
        "Quezon City",
        "San Juan",
        "Taguig",
        "Valenzuela"
    )


    var listView: ListView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar: Toolbar = findViewById(com.example.hello.R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "NCR"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val user = arrayOf(
            "Pateros"
        )
        val userAdapter : ArrayAdapter<String> = ArrayAdapter(this, R.layout.simple_list_item_1,
            user
        )
        binding.listView?.adapter = userAdapter
        binding.SearchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.SearchView!!.clearFocus()
                if (user.contains(query)){
                    userAdapter.filter.filter(query)
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                userAdapter.filter.filter(newText)
                return false
            }

        })
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed() // Navigate back when the up button is clicked
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}