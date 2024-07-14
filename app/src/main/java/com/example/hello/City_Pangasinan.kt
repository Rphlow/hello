package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.telecom.Call.Details
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class City_Pangasinan : AppCompatActivity() {

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

        val cities = listOf(
            "Alaminos",
            "Dagupan",
            "San Carlos",
            "Urdaneta"
        )
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, CityIlocosNorteDetail::class.java)
            val message = when (city) {
                "Alaminos"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Dagupan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Carlos"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Urdaneta"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                else -> "Default message"
            }
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

