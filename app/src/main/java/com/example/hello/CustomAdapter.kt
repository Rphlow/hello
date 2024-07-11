// CustomAdapter.kt
package com.example.hello

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(
    private val context: MainActivity,
    private val regionList: Array<String>,
    private val imageList: Array<Int>
) : BaseAdapter() {

    override fun getCount(): Int {
        return regionList.size
    }

    override fun getItem(position: Int): Any {
        return regionList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = (convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.activity_list_view, parent, false))

        val regionText = view.findViewById<TextView>(R.id.textView)
        val regionImage = view.findViewById<ImageView>(R.id.imageView)

        regionText.text = regionList[position]
        regionImage.setImageResource(imageList[position])

        return view
    }
}