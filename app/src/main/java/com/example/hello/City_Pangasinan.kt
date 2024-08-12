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

        val cities = listOf( "Alaminos", "Dagupan", "San Carlos", "Urdaneta")
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, CityIlocosNorteDetail::class.java)
            val message = when (city) {
                "Alaminos"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5094, 0998 598 5095\n" +
                        " BFP: 0919 330 4090, 0917 189 9611\n" +
                        "Rescue Team: 0947 551 1420, 0977 707 6881\n"

                "Dagupan"-> "Emergency Numbers\n " +
                        "PNP: 0916 525 6802, 0933 502 4899\n" +
                        " BFP: 0917 184 2611\n" +
                        "Rescue Team: 0968 444 9598\n"

                "San Carlos"-> "Emergency Numbers\n " +
                        "PNP: 0977 668 0796\n" +
                        " BFP: 0917 184 3611" +
                        "Rescue Team:0949 417 2265\n"

                "Urdaneta"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5134\n" +
                        " BFP: 0917 184 4611" +
                        "Rescue Team: 0917 818 5374\n"

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

