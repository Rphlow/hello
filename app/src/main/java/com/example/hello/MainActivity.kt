package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.hello.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity {
    private lateinit var arrayAdapter: ArrayAdapter<String>
    lateinit var binding : ActivityMainBinding




    var regionList = arrayOf(
        "Region 1 (Ilocos Region)",
        "Region 2 (Cagayan Valley)",
        "Region 3 (Central Luzon)",
        "Region 4A (CALABARZON)",
        "Region 4B (MIMAROPA)",
        "Region 5 (Bicol Region)",
        "Cordilera Administrative Region (CAR)",
        "National Capital Region (NCR)"
    )


    var listView: ListView? = null

    constructor()
    protected constructor(parcel: Parcel?)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Regions in Luzon"

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, regionList)
        binding.listView?.adapter = adapter
        binding.listView?.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                startActivity(Intent(this@MainActivity, region1::class.java))
            } else if (position == 1) {
                startActivity(Intent(this@MainActivity, region2::class.java))
            } else if (position == 2) {
                startActivity(Intent(this@MainActivity, region3::class.java))
            } else if (position == 3) {
                startActivity(Intent(this@MainActivity, region4A::class.java))
            } else if (position == 4) {
                startActivity(Intent(this@MainActivity, region4B::class.java))
            } else if (position == 5) {
                startActivity(Intent(this@MainActivity, region5::class.java))
            }  else if (position == 6) {
                startActivity(Intent(this@MainActivity, CAR::class.java))
            } else if (position == 7) {
                startActivity(Intent(this@MainActivity, NCR::class.java))
            } else {
                // Handle other positions if needed

            }

            val user = arrayOf(
                "Region 1 ( Ilocos Region )",
                "Region 2 ( Cagayan Valley )",
                "Region 3 ( Central Luzon )",
                "Region 4A ( CALABARZON )",
                "Region 4B ( MIMAROPA )",
                "Region 5 ( Bicol Region )",
                "Cordilera Administrative Region ( CAR )",
                "National Capital Region ( NCR )"
            )

            val userAdapter : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,
                user
            )
            binding.listView?.adapter = userAdapter
            binding.SearchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    binding.SearchView!!.clearFocus()
                    if (user.contains(query)){
                        userAdapter.filter.filter(query)
                    }
                    return false
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    userAdapter.filter.filter(newText)
                    return false
                }

            })
        }

    }
}