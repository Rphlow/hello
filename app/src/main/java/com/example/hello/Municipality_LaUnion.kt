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

class Municipality_LaUnion : AppCompatActivity() {

    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var recyclerView: RecyclerView
    private lateinit var cityAdapter: CityAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_ilocos_norte)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Municipalities"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val cities = listOf(
            "Agoo",
            "Aringay",
            "Bacnotan",
            "Bagulin",
            "Balaoan",
            "Bangar",
            "Bauang",
            "Burgos",
            "Caba",
            "Luna",
            "Naguilian",
            "Pugo",
            "Rosario",
            "San Gabriel",
            "San Juan",
            "Santo Tomas",
            "Santol",
            "Sudipen",
            "Tubao"
        )
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, Detail::class.java)
            val message = when (city) {
                "Agoo" -> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Aringay"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bacnotan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bagulin"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Balaoan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bangar"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bauang"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Burgos"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Caba"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Luna"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Naguilian"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Pugo"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Rosario"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Gabriel"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Juan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santo Tomas"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santol"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Sudipen"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Tubao"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                else -> "No Information Available"
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

