package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class City_LaUnion : AppCompatActivity() {

    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var recyclerView: RecyclerView
    private lateinit var cityAdapter: CityAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_ilocos_norte)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Cities"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val cities = listOf("San Fernando")
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, CityIlocosNorteDetail::class.java)
            val message = when (city) {
                "San Fernando" -> "Emergency Numbers\n " +
                        "PNP: 0915 558 8888, 0939 812 6888\n" +
                        " BFP: 0917 183 8711" +
                        "Rescue Team: 0928 522 0622, 0928 193 7818\n"

                else -> "No Information Available"
            }
            intent.putExtra("CITY_NAME", city)
            intent.putExtra("MESSAGE", message)
            startActivity(intent)
        }
        recyclerView.adapter = cityAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        val searchItem: MenuItem = menu.findItem(R.id.action_search)
        val searchView: SearchView = searchItem.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return true
            }
        })
        return true

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

