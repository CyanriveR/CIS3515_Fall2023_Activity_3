package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FontSizeAdapter(private val context: Context, private val fontSizes : Array<Int>) : BaseAdapter() {
    override fun getCount() = fontSizes.size
    override fun getItem(p0: Int) = fontSizes[p0]
    override fun getItemId(p0: Int) = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        return getDropDownView(p0,p1,p2).apply {
            (this as TextView).textSize = 22f
        }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textview : TextView
        if(convertView!=null){
            textview = convertView as TextView
        } else{
            textview = TextView(context)
            textview.setPadding(5,10,0,10)
        }
        textview.text=fontSizes[position].toString()
        textview.textSize=fontSizes[position].toFloat()

        return textview
    }
}
