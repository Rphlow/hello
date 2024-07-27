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

class Municipalities_Cavite: AppCompatActivity() {

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
            "Alfonso",
            "Amadeo",
            "General Emilio Aguinaldo",
            "General Mariano Alvarez",
            "Indang",
            "Kawit",
            "Magallanes",
            "Maragondon",
            "Mendez",
            "Naic",
            "Rosario",
            "Silang",
            "Tanza",
            "Ternate",

        )
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, CityIlocosNorteDetail::class.java)
            val message = when (city) {
                "Alfonso" -> """
                    MDRRMO: 046 443 9083
                    BFP: 0915 602 2113, 046 522 0480
                    PNP: 0906 536 6135, 0998 967 3364
                    Hospital: 0917 306 2419, 415 0190
                    
                """.trimIndent()
                "Amadeo" -> """
                    MDRRMO: 0917-504-7419
                    BFP: (046) 483-2490, 0915-601-6805
                    PNP:  (046) 483-3022, 0965-199-3111
                  
                    
                """.trimIndent()
                "General Emilio Aguinaldo" -> """
             
                    BFP: (046) 487-2697
                    PNP: 0998 967 3512, 0998 598 5616
                    
                    
                """.trimIndent()
                "General Mariano Alvarez" -> """
                    MDRRMO:(046) 443-9839
                    BFP: (046)443-9110, 09071784300
                    PNP: 0956-882-3167, 0998-446-0494
                    Municipal Health Office: 0951-669-0285, 0951-669-0286
                    
                """.trimIndent()
                "Indang" -> """
                    LDRRMO: 0915 206 6929, 0916 183 1458
                    BFP: 0915 603 4245, 415 1217
                    PNP:  0949 184 9145
                    Health Center: 415 0286, 683 9772
                    
                    
                """.trimIndent()
                "Kawit" -> """
                    MDRRMO: (046) 440 - 0722
                    BFP: (046) 484-5250
                    PNP: 0998 967 3356, 0998 598 5607
                    
                    
                """.trimIndent()
                "Magallanes" -> """
                    MDRRMO: 0930 709 7811
                    BFP: (046) 4127274, 0915 602 1644
                    PNP: 0998 967 3368, 0998 598 5618
                 
                    
                    
                """.trimIndent()
                "Maragondon" -> """
                    MDRRMO: 0906 568 0500
                    BFP: (046) 412-1911, 0936 088 2538
                    PNP: (046) 412 1161, 0998 598 5619 
                    
                    
                """.trimIndent()
                "Mendez" -> """
                    MDRRMO: (046) 443-0209, 09568820987
                    BFP: (046) 482-0712, 0919092 0206
                    PNP: (046) 443-9174, 0998 967 3370, 0998 598 5620
                    
                    
                """.trimIndent()
                "Naic" -> """
                    MDRRMO: 0918 967 9772
                    BFP: (046) 412-1481, 0956-483 0226
                    PNP: 0998 967 3371, 0998 598 5621
             
                """.trimIndent()
                "Rosario" -> """
                    MDRRMO: (046) 432 0526, 0969 011 6787, 0945 655 5002
                    BFP: (046) 438-1616, 0935 462 2522
                    PNP: 0998 967 3358,  0998 598 5609
                  
                    
                    
                """.trimIndent()
                "Silang" -> """
                    MDRRMO: (046)- 414-3776, 0935-601-6738, 0995-987-8996
                    BFP:  (046) 414-0484,  0995 961 6108
                    PNP: (046)- 414-0204, 0995-987-8996
                   
                    
                """.trimIndent()
                "Tanza" -> """
                    MDRRMO: 0977 345 5035, 0928 757 9030
                    BFP: (046) 505-6084, 0968 347 9894
                    PNP: (046) 437-6558, 0917 850 2555
                 
                    
                """.trimIndent()
                "Ternate" -> """
                    MDRRMO: 0915 799 4206
                    BFP: 0905 252 4246
                    PNP: 0998 967 3374, 0998 598 5623
                    
                    
                """.trimIndent()

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

