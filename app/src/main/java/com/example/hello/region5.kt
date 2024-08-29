package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ExpandableListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.hello.CityExpandableListAdapter
import com.example.hello.R
import com.example.hello.databinding.ActivityRegion1Binding

class region5 : AppCompatActivity() {
    private lateinit var binding: ActivityRegion1Binding
    private lateinit var expandableListView: ExpandableListView
    private lateinit var expandableListAdapter: CityExpandableListAdapter
    private val header: MutableList<String> = ArrayList()
    private val childitem: MutableList<MutableList<String>> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegion1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Provinces"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        expandableListView = binding.expandablelistView

        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home_icon -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                R.id.tips_icon -> {
                    startActivity(Intent(this, Tips::class.java))
                    true
                }
                R.id.map_icon -> {
                    startActivity(Intent(this, MapsActivity::class.java))
                    true
                }
                else -> false
            }
        }

        val header1: MutableList<String> = ArrayList()
        header1.add("Cities")
        header1.add("Municipalities")


        val header2: MutableList<String> = ArrayList()
        header2.add("Cities")
        header2.add("Municipalities")

        val header3: MutableList<String> = ArrayList()
        header3.add("Cities")
        header3.add("Municipalities")

        val header4: MutableList<String> = ArrayList()
        header4.add("Cities")
        header4.add("Municipalities")

        val header5: MutableList<String> = ArrayList()
        header5.add("Cities")
        header5.add("Municipalities")

        val header6: MutableList<String> = ArrayList()
        header6.add("Cities")
        header6.add("Municipalities")


        header.add("Albay")
        header.add("Camarines Sur")
        header.add("Camarines Norte")
        header.add("Sorsogon")
        header.add("Catanduanes")
        header.add("Masbate")


        childitem.add(header1)
        childitem.add(header2)
        childitem.add(header3)
        childitem.add(header4)
        childitem.add(header5)
        childitem.add(header6)


        expandableListAdapter = CityExpandableListAdapter(this@region5, header, childitem)
        expandableListView.setAdapter(expandableListAdapter)

        expandableListView.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
            val childName = childitem[groupPosition][childPosition]
            val intent = if ((groupPosition == 0) && (childPosition == 0)) {
                startActivity(Intent(this@region5, City_Batanes::class.java))
            } else if ((groupPosition == 0) && (childPosition == 1)) {
                startActivity(Intent(this@region5, Municipalities_Batanes::class.java))
            } else if ((groupPosition == 1) && (childPosition == 0)) {
                startActivity(Intent(this@region5, City_Cagayan::class.java))
            } else if ((groupPosition == 1) && (childPosition == 1)) {
                startActivity(Intent(this@region5, Municipalities_Cagayan::class.java))
            } else if ((groupPosition == 2) && (childPosition == 0)) {
                startActivity(Intent(this@region5, City_NuevaVizcaya::class.java))
            } else if ((groupPosition == 2) && (childPosition == 1)) {
                startActivity(Intent(this@region5, Municipalities_NuevaVizcaya::class.java))
            } else if ((groupPosition == 3) && (childPosition == 0)) {
                startActivity(Intent(this@region5, City_Quirino::class.java))
            } else if ((groupPosition == 3) && (childPosition == 1)) {
                startActivity(Intent(this@region5, Municipalities_Quirino::class.java))
            } else {


            }
            true
        }


        val searchView: SearchView = findViewById(R.id.SearchView)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                expandableListAdapter.filter.filter(newText)
                return false
            }

        })
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
