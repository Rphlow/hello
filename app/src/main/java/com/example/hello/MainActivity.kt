package com.example.hello

import android.content.Intent
import android.graphics.Region
import android.os.Bundle
import android.os.Parcel
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
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
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, regionList)
        listView?.adapter = adapter
        listView?.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                startActivity(Intent(this@MainActivity, region1::class.java))
            } else {
                // Handle other positions if needed
            }
        }


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



