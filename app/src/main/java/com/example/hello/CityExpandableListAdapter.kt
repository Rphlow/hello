package com.example.hello
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import java.util.zip.Inflater

class CityExpandableListAdapter(
    var context: Context,
    var originalHeader: MutableList<String>,
    var originalChildItem: MutableList<MutableList<String>>
) : BaseExpandableListAdapter() {

    private var header: MutableList<String> = originalHeader
    private var childItem: MutableList<MutableList<String>> = originalChildItem
    var filter: Filter

    init {
        filter = Filter()
    }

    // Implement filtering functionality
    inner class Filter : android.widget.Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val filteredHeader = mutableListOf<String>()
            val filteredChildItem = mutableListOf<MutableList<String>>()

            if (constraint.isNullOrEmpty()) {
                filteredHeader.addAll(originalHeader)
                filteredChildItem.addAll(originalChildItem)
            } else {
                val filterPattern = constraint.toString().toLowerCase().trim()

                for (i in originalHeader.indices) {
                    val filteredChildren = mutableListOf<String>()
                    for (child in originalChildItem[i]) {
                        if (child.toLowerCase().contains(filterPattern)) {
                            filteredChildren.add(child)
                        }
                    }
                    if (originalHeader[i].toLowerCase().contains(filterPattern) || filteredChildren.isNotEmpty()) {
                        filteredHeader.add(originalHeader[i])
                        filteredChildItem.add(filteredChildren)
                    }
                }
            }

            val results = FilterResults()
            results.values = Pair(filteredHeader, filteredChildItem)
            return results
        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            val pair = results?.values as? Pair<MutableList<String>, MutableList<MutableList<String>>>
            pair?.let {
                header = it.first
                childItem = it.second
                notifyDataSetChanged()
            }
        }
    }


    override fun getGroupCount(): Int {
        return header.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return childItem[p0].size
    }

    override fun getGroup(p0: Int): CharSequence? {
        return header[p0]
    }

    override fun getChild(p0: Int, p1: Int): CharSequence? {
        return childItem[p0][p1]
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        p0: Int,
        p1: Boolean,
        p2: View?,
        p3: ViewGroup?,
    ): View {
        var convertView = p2

        if (convertView ==null){
            val inflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView =inflater.inflate(R.layout.list_group, null)
        }
        var Itemchild = convertView!!.findViewById<TextView>(R.id.groupHeader)
        Itemchild.text= getGroup(p0)
        return convertView
    }

    override fun getChildView(
        p0: Int,
        p1: Int,
        p2: Boolean,
        p3: View?,
        p4: ViewGroup?,
    ): View {
        var convertView = p3

        if (convertView== null) {

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.list_item, null)
        }
        val childItem = convertView!!.findViewById<TextView>(R.id.childitem)
        childItem.text = getChild(p0, p1)
        return convertView
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }

}

