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

class Municipality_IlocosNorte : AppCompatActivity() {

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
            "Adams",
            "Bacarra",
            "Badoc",
            "Bangui",
            "Banna",
            "Burgos",
            "Carasi",
            "Currimao",
            "Dingras",
            "Dumalneg",
            "Marcos",
            "Nueva Era",
            "Pagudpud",
            "Paoay",
            "Pasuquin",
            "Piddig",
            "Pinili",
            "San Nicolas",
            "Sarrat",
            "Solsona",
            "Vintar"
        )
        cityAdapter = CityAdapter(cities) { city ->
            val intent = Intent(this, CityIlocosNorteDetail::class.java)
            val message = when (city) {
                "Adams"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5024\n " +
                        "BFP: 09178239370, 09859301973\n " +
                        "Rescue Team: 0967 018 2050\n "
                "Bacarra"-> "Emergency Numbers\n " +
                        "PNP: 09985985025\n " +
                        "BFP: 0917 184 1811, 0946 751 4986\n " +
                        "Rescue Team: 0929 190 1241\n "
                "Badoc"-> "Emergency Numbers\n " +
                        "PNP: 0915 448 8965\n " +
                        "BFP: 0905 414 8354\n " +
                        "Rescue Team: 0915 863 8858\n "

                "Bangui"-> "Emergency Numbers\n " +
                        "PNP: 0977 849 4560, 0998 598 5027\n " +
                        "BFP: 0917-184-3811, 0998-338-7206\n " +
                        "Rescue Team: 0927 765 2613\n "
                "Banna"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5028, 0917 726 9976\n " +
                        "BFP: 0917 184 1811, 0946 751 4986\n " +
                        "Rescue Team: 0969 290 5552\n "


                "Burgos"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5034\n " +
                        "BFP: 09171862811, 09506161968\n " +
                        "Rescue Team: 0951 722 7632\n "


                "Carasi"-> "Emergency Numbers\n " +
                        "PNP: 0998 967 2912\n " +
                        "BFP: 0965 783 2840, 0917 824 1105\n " +
                        "Rescue Team: 0917 188 8264\n "

                "Currimao"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5031, 0915 712 7302\n " +
                        "BFP: 0917 186 4811, 0917 318 1542\n " +
                        "Rescue Team: 0917 788 9881\n "


                "Dingras"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5032\n " +
                        "BFP: 0917 184 6811\n " +
                        "Rescue Team: 0945 773 7909, 0928 173 0244\n "
                "Dumalneg"-> "Emergency Numbers\n " +
                        "PNP: 0919 001 0746\n " +
                        "BFP: 0956 463 7676\n " +
                        "Rescue Team: 0966 325 5672\n "

                "Marcos"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5034\n " +
                        "BFP: 0917 184 7811\n " +
                        "Rescue Team: 0917 775 2060\n "


                "Nueva Era"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5053\n " +
                        "BFP: 0917 184 9811\n " +
                        "Rescue Team: 0949 904 5676\n "


                "Pagudpud"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5036\n " +
                        "BFP: 0917-186-3811\n " +
                        "Rescue Team: 0917 873 3209\n "


                "Paoay"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5037, 0915 280 8075\n " +
                        "BFP: 0917 185 2811\n " +
                        "Rescue Team: 0963 202 7587\n "


                "Pasuquin"-> "Emergency Numbers\n " +
                        "PNP: 0915 762 6152, 0998 598 5038\n " +
                        "BFP: 0917-185 3811, 0919-229 8777\n " +
                        "Rescue Team: 0948 515 4176\n "


                "Piddig"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5039\n " +
                        "BFP: 0919-974-8424, 0917-185-4811\n " +
                        "Rescue Team: 0961 600 9172\n "


                "Pinili"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5040\n " +
                        "BFP: 0917 185 5811\n " +
                        "Rescue Team: 0917 149 4977\n "

                "San Nicolas"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5041, 0915 224 9546\n " +
                        "BFP: 0917 185 6811\n " +
                        "Rescue Team: 0917 574 7508\n "

                "Sarrat"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5042\n " +
                        "BFP: 0917 185 7811\n " +
                        "Rescue Team: 0992 305 6067\n "


                "Solsona"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5043\n " +
                        "BFP: 0917 185 9811\n " +
                        "Rescue Team: 0998 885 0821\n "

                "Vintar"-> "Emergency Numbers\n " +
                        "PNP: 0998 598 5044\n " +
                        "BFP: 0917 186 1811\n " +
                        "Rescue Team: 0920 100 4301\n "
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

