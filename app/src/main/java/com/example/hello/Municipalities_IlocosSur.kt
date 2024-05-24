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

class Municipalities_IlocosSur : AppCompatActivity() {

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
            "Alilem",
            "Banayoyo",
            "Bantay",
            "Burgos",
            "Cabugao",
            "Caoayan",
            "Cervantes",
            "Galimuyod",
            "Gregorio del Pilar",
            "Lidlidda",
            "Magsingal",
            "Nagbukel",
            "Narvacan",
            "Quirino",
            "Salcedo",
            "San Emilio",
            "San Esteban",
            "San Ildefonso",
            "San Juan",
            "San Vicente",
            "Santa",
            "Santa Catalina",
            "Santa Cruz",
            "Santa Lucia",
            "Santa Maria",
            "Santiago",
            "Santo Domingo",
            "Sigay",
            "Sinait",
            "Sugpon",
            "Suyo",
            "Tagudin"
        )
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, Detail::class.java)
            val message = when (city) {
                "Alilem"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Banayoyo"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Bantay"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Burgos"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Cabugao"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Caoayan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Cervantes"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Galimuyod"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Gregorio del Pilar"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Lidlidda"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Magsingal"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Nagbukel"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Narvacan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Quirino"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Salcedo"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Emilio"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Esteban"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Ildefonso"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Juan"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "San Vicente"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santa"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santa Catalina"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santa Cruz"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santa Lucia"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santa Maria"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santiago"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Santo Domingo"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Sigay"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Sinait"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Sugpon"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Suyo"-> "Emergency Numbers\n " +
                        "Telephone Number:\n 9-234-13\n 4-215-32\n " +
                        "Mobile Number:\n 098765412 ( Smart )\n 097612567 ( Globe )\n" +
                        "Police Number: 112\n" +
                        " NDRRMC: 231"
                "Tagudin"-> "Emergency Numbers\n " +
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

