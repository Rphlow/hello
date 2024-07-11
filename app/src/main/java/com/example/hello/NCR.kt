package com.example.hello

import android.R
import android.content.Intent
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

class NCR : AppCompatActivity() {
    private lateinit var arrayAdapter: ArrayAdapter<String>
    lateinit var binding: ActivityMainBinding

    var provinceList = arrayOf(
        "Cities",
        "Municipalities"
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

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, provinceList)
        binding.listView?.adapter = adapter
        binding.listView?.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                startActivity(Intent(this@NCR, CitiesNCR::class.java))
            } else if (position == 1) {
                startActivity(Intent(this@NCR, MunicipalityNCR::class.java))
            } else {
                // Handle other positions if needed

            }


            val user = arrayOf(
                "Cities",
                "Municipalities"
            )
            val userAdapter: ArrayAdapter<String> = ArrayAdapter(
                this, R.layout.simple_list_item_1,
                user
            )
            binding.listView?.adapter = userAdapter
            binding.SearchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    binding.SearchView!!.clearFocus()
                    if (user.contains(query)) {
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