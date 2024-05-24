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

class Municipality_Pangasinan : AppCompatActivity() {

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
            "Agno",
            "Aguilar",
            "Alcala",
            "Anda",
            "Asingan",
            "Balungao",
            "Bani",
            "Basista",
            "Bautista",
            "Bayambang",
            "Binalonan",
            "Binmaley",
            "Bolinao",
            "Bugallon",
            "Burgos",
            "Calasiao",
            "Dasol",
            "Infanta",
            "Labrador",
            "Laoac",
            "Lingayen",
            "Mabini",
            "Malasiqui",
            "Manaoag",
            "Mangaldan",
            "Mangatarem",
            "Mapandan",
            "Natividad",
            "Pozorrubio",
            "Rosales",
            "San Fabian",
            "San Jacinto",
            "San Manuel",
            "San Nicolas",
            "San Quintin",
            "Santa Barbara",
            "Santa Maria",
            "Santo Tomas",
            "Sison",
            "Sual",
            "Tayug",
            "Umingan",
            "Urbiztondo",
            "Villasis"
        )
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, Detail::class.java)
            val message = when (city) {
                "Agno"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Aguilar"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Alcala"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Anda"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Asingan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Balungao"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bani"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Basista"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bautista"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bayambang"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Binalonan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Binmaley"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bolinao"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bugallon"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Burgos"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Calasiao"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Dasol"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Infanta"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Labrador"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Laoac"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Lingayen"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Mabini"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Malasiqui"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Manaoag"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Mangaldan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Mangatarem"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Mapandan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Natividad"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Pozorrubio"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Rosales"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Fabian"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Jacinto"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Manuel"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Nicolas"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Quintin"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santa Barbara"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santa Maria"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santo Tomas"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Sison"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Sual"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Tayug"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Umingan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Urbiztondo"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Villasis"-> "Emergency Numbers\n " +
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

