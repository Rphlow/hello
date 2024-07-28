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
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.graphics.drawable.InsetDrawable
import androidx.core.content.ContextCompat

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

        val dividerDrawable = ContextCompat.getDrawable(this, R.drawable.divider)!!
        val dividerItemDecoration = DividerItemDecoration(recyclerView.context, (recyclerView.layoutManager as LinearLayoutManager).orientation)
        dividerItemDecoration.setDrawable(dividerDrawable)
        recyclerView.addItemDecoration(dividerItemDecoration)

        val cities = listOf("Bacoor", "Carmona", "Cavite City", "Dasmariñas", "General Trias", "Imus", "Tagaytay", "Trece Martires")
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, CityIlocosNorteDetail::class.java)
            val message = when (city) {
                "Bacoor" -> """
                    BDRRMO: (046) 417-0727
                    BFP: (046) 417-6060
                    PNP: (046) 417-6366
                """.trimIndent()
                "Carmona" -> """
                    NDRRMC EOC: (046) 413-0188, (046) 443-7094
                    BFP: (046) 430-1666
                    PNP: (046) 430-2033
                """.trimIndent()
                "Cavite City" -> """
                    CDRRMO: (046) 484-9600, (046) 852-2967
                    Mobile: 0926-970-7556, 0948-515-0632
                    BFP: (046) 431-0308
                    Mobile: 0908-950-8557, 0966-694-1416
                    PNP: (046) 431-2292
                    Mobile: 0918-462-6623
                    CITY HEALTH OFFICE: (046) 431-0752
                    RED CROSS: 431-0562, 431-5620, 484-6266
                """.trimIndent()
                "Dasmariñas" -> """
                    NDRRMC: 0917-721-8825, 0998-843-5477
                    BFP: 416-0875
                    PNP: (046) 513-1766, (046) 686-6608
                    Pagamutan ng Dasma: 481-4400, 435-0180
                    DASMA CCTV RESCUE CENTER: (046) 435-0183, (046) 481-0555
                """.trimIndent()
                "General Trias" -> """
                    CDRRMO: (0917) 596 8676, (046) 513 6986, 509-5068
                    BFP: (0917) 593 1522, (046) 513 7200/437-7625
                    PNP: (0917) 622-3320, (046) 513-8600, 437-7306
                """.trimIndent()
                "Imus" -> """
                    CDRRMO: (046) 472-2618, (046) 481-4599, 0919-069-1703, 0908-850-0046
                    BFP: (046) 970-5161, 0915-528-3256
                    PNP: (046) 471-3993, 0906-595-4801
                """.trimIndent()
                "Tagaytay" -> """
                    CDRRMO: (046)-483-0446
                    BFP: (046)-483-1193, (046)-471-3747, 0942-989-8495
                    PNP: (046)-413-1282, 0915-913-7693
                    OSPITAL NG TAGAYTAY(ONT): (046)-423-3195, (046)-483-2160
                    CITY HEALTH OFFICE (CHO): (046)-483-0604
                """.trimIndent()
                "Trece Martires" -> """
                    CDRRMO: 0977 676 3491, 0949 629 8026, 419 3858
                    BFP: (046)-483-1193, (046)-471-3747, 0942-989-8495
                    PNP: 0977 680 1240, 686 3460
                    CITY HEALTH OFFICE (CHO): 0921 451 9099, 419 2425
                """.trimIndent()
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
