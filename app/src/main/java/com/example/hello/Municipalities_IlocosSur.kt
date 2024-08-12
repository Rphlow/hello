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
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
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

        val dividerDrawable = ContextCompat.getDrawable(this, R.drawable.divider)!!
        val dividerItemDecoration = DividerItemDecoration(recyclerView.context, (recyclerView.layoutManager as LinearLayoutManager).orientation)
        dividerItemDecoration.setDrawable(dividerDrawable)
        recyclerView.addItemDecoration(dividerItemDecoration)

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
            val intent = Intent(this, CityIlocosNorteDetail::class.java)
            val message = when (city) {
                "Alilem" -> """
                    PNP: 0998 598 5082
                    BFP: 0917 186 3911, 0946 843 9385
                    Ambulance: 0935 589 8376
                """.trimIndent()
                "Banyoyo" -> """
                    PNP: 0998 598 5078, 0998 967 2958
                    BFP: 0917 183 8911
                    Ambulance: 0906 538 7390, 0917 777 9040
                """.trimIndent()
                "Bantay" -> """
                    PNP: 0917 777 270, 0998 598 5063
                    BFP: 0917 184 1911
                    Ambulance: 0917 820 4409
                """.trimIndent()
                "Burgos" -> """
                    PNP: 0915 079 3529, 0998 598 5068
                    BFP: 0966 386 0556
                    Ambulance: 0917 883 2548
                """.trimIndent()
                "Cabugao" -> """
                    PNP: +63 947-403-9113
                    BFP: 0917 184 2911
                    Ambulance: 0935 674 6728
                """.trimIndent()
                "Caoayan" -> """
                    PNP: +63 917-799-4233
                    BFP: 0917-184-3911
                    Ambulance: 0906 344 0666
                """.trimIndent()
                "Cervantes" -> """
                    PNP: +63 918-583-2592
                    BFP: 09286192872
                    Ambulance: 0939 135 2637, 0998 585 7602
                """.trimIndent()
                "Galimuyod" -> """
                    PNP: +63 917-309-7409
                    BFP: 0917-129-8234
                    Ambulance: 0905 550 6028, 0917 771 2609
                """.trimIndent()
                "Gregorio del Pilar" -> """
                    PNP: +63 917-471-2044
                    BFP: 0917-186-4911
                    Ambulance: 0905 481 9406
                """.trimIndent()
                "Lidlidda" -> """
                    PNP: +63 915-948-9147
                    BFP: 09171845911
                    Ambulance: 0917 581 0010, 0926 774 8604                 
                """.trimIndent()
                "Magsingal" -> """
                    PNP: +63 977-458-9959
                    BFP: 0917-184-6911
                    Ambulance: 0917-184-6911
                """.trimIndent()
                "Nagbukel" -> """
                    PNP: +63 917-710-2460
                    BFP: 𝟎𝟗𝟏𝟕𝟏𝟐𝟖𝟎𝟐𝟖𝟒, 𝟎𝟗𝟑𝟔𝟗𝟐𝟏𝟖𝟕𝟐𝟐
                    Ambulance: 0956 810 4812
                """.trimIndent()
                "Narvacan" -> """
                    PNP: +63 917-790-8046
                    BFP: 0917 184 7911, 0956 571 6585
                    Ambulance: 0917 553 5795
                """.trimIndent()
                "Quirino" -> """
                    PNP: +6377 732-0073 
                    BFP: 09398653162
                    Ambulance: 0909 503 2185, 0916 524 6943
                """.trimIndent()
                "Salcedo" -> """
                    PNP: +63 927-783-7644
                    BFP: 0917 186 7911
                    Ambulance: 0928 222 3442
                """.trimIndent()
                "San Emilio" -> """
                    PNP: +63 927-249-2758
                    BFP: 0977-116-1938
                    Ambulance: 0905 591 3345, 0909 217 8706
                """.trimIndent()
                "San Esteban" -> """
                    PNP: +63 977-803-1833
                    BFP: 0917 808 6101
                    Ambulance: 0915 116 5266
                """.trimIndent()
                "San Ildefonso" -> """
                    PNP: +63 917-532-2084
                    BFP: 0917-184-8911
                    Ambulance: 0936 959 6442
                """.trimIndent()
                "San Juan" -> """
                    PNP: +63 917-5783-687
                    BFP: 0917 184 9911, 0906 078 7831
                    Ambulance: 0927 482 2798
                """.trimIndent()
                "San Vicente" -> """
                    PNP: +6377 722-5896
                    BFP: 0917-185-8911
                    Ambulance: 0927 502 9168, 0917 998 3968
                """.trimIndent()
                "Santa" -> """
                    PNP: +6377 604-0189
                    BFP: 0917-185-1911
                    Ambulance: 0917 435 2213
                """.trimIndent()
                "Santa Catalina" -> """
                    PNP: +6377 722-8421
                    BFP: 0917-185-2911
                    Ambulance: 0917 838 4025, 0955 587 5757
                """.trimIndent()
                "Santa Cruz" -> """
                    PNP: +6377 674-7053
                    BFP: 0917 185 3911
                    Ambulance: 0920 906 8315, 0917 842 1530
                """.trimIndent()
                "Santa Lucia" -> """
                    PNP: +6377 674-8014
                    BFP: 0917 185 4911
                    Ambulance: 0916 259 0424, 0939 822 8510
                """.trimIndent()
                "Santa Maria" -> """
                    PNP: +6377 674-8014
                    BFP: 0917-185-5911
                    Ambulance: 0917 799 5866
                """.trimIndent()
                "Santiago" -> """
                    PNP: 0998 598 5070
                    BFP: 0967 431 9190
                    Ambulance: 0917 965 4026
                """.trimIndent()
                "Santo Domingo" -> """
                    PNP: +6377 726-4198
                    BFP: 0917-185-7911
                    Ambulance: 0916 394 7221, 0927 255 7816
                """.trimIndent()
                "Sigay" -> """
                    PNP: +63 935-616-5806
                    BFP: 09171868911
                    Ambulance: 0917 629 1760, 0927 255 7816
                """.trimIndent()
                "Sinait" -> """
                    PNP: +6377 674-0899
                    BFP: 0917-186-1911
                    Ambulance: 0916 334 4157, 0906 547 8704
                """.trimIndent()
                "Sugpon"-> """
                    PNP: +63 927-692-8627
                    BFP: 09541858999
                    Ambulance: 0995 213 8290
                """.trimIndent()
                "Suyo"->"""
                    PNP: +6377 652-1021
                    BFP: 0917 187 4911
                    Ambulance: 0919 686 7363
                """.trimIndent()
                "Tagudin"->"""
                    PNP: +6377 652-1021
                    BFP: 09171862911 09997508975
                    Ambulance: 0918 580 5003, 0999 825 2959
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

