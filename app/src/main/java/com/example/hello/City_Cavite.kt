package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class City_Cavite : AppCompatActivity() {

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

        val cities = listOf("Bacoor", "Carmona", "Cavite City", "Dasmariñas", "Genral Trias", "Imus", "Tagaytay", "Trece Martires\n")
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, CityIlocosNorteDetail::class.java)
            val message = when (city) {
                "Bacoor" -> "Emergency Numbers\n " +
                        "BDRRMO: (046) 417-0727\n " +
                        "BFP (046) 417-6060\n" +
                        "PNP: (046) 417-6366\n" +

                "Carmona" > "Emergency Numbers\n " +
                        "NDRRMC EOC:(046) 413-0188\n(046) 443-7094\n " +
                        "BFP:(046) 430-1666\n" +
                        "PNP: (046) 430 2033\n"

                "Cavite City" -> "Emergency Numbers\n " +
                        "CDRRMO: (046) 484 - 9600|(046) 852 - 2967\n" +
                        "Mobile no.: 0926 - 970 - 7556| 0948 - 515 - 0632\n " +
                        "BFP (046) 431-0308\n Mobile no.:0908 - 950 - 8557| 0966 - 694 - 1416\n" +
                        "PNP: (046) 431-2292\n" +
                        "Mobile No.: 0918-462-6623\n" +
                        "CITY HEALTH OFFICE: (046) 431 - 0752\n" +
                        "RED CROSS: 431-0562/431-5620 | 484-6266\n"

                "Dasmariñas" -> "Emergency Numbers\n " +
                        "NDRRMC:0917-721-8825\n 0998-843-5477\n " +
                        "BFP 416-08-75\n" +
                        "PNP: (046) 513-1766\n (046) 686-6608\n " +
                        "Pagamutan ng Dasma: 481-44-00 / 435-01-80 " +
                        "DASMA CCTV RESCUE CENTER: (046) 435-0183\n (046) 481-0555 \n"

                "General Trias" -> "Emergency Numbers\n " +
                        "CDRRMO: (0917) 596 8676\n (046) 513 6986\n 509-5068\n " +
                        "BFP (0917) 593 1522\n (046) 513 7200/437-7625\n" +
                        "PNP: (0917) 622-3320\n (046) 513-8600\n 437-7306\n"

                "Imus" -> "Emergency Numbers\n " +
                        "CDRRMO: (046) 472-2618\n (046) 481-4599\n 0919-069-1703\n 0908-850-0046\n " +
                        "BFP (046) 970-5161\n 0915-528-3256\n" +
                        "PNP: (046) 471-3993\n 0906-595-4801\n"

                "Tagaytay" -> "Emergency Numbers\n " +
                        "CDRRMO: (046)-483-0446\n " +
                        "BFP (046)-483-1193\n (046)-471-3747\n 0942-989-8495\n" +
                        "PNP: (046)-413-1282\n 0915-913-7693\n" +
                        "OSPITAL NG TAGAYTAY(ONT): (046)-423-3195\n (046)-483-2160\n" +
                        "CITY HEALTH OFFICE (CHO): (046)-483-0604\n "

                "Trece" -> "Emergency Numbers\n " +
                        "CDRRMO: 0977 676 3491\n 0949 629 8026\n 419 3858\n " +
                        "BFP (046)-483-1193\n (046)-471-3747\n 0942-989-8495\n" +
                        "PNP: 0977 680 1240\n  686 3460\n" +
                        "CITY HEALTH OFFICE (CHO): 0921 451 9099\n 419 2425\n "









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

