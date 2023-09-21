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
        val textview=TextView(context)

        textview.text=fontSizes[p0].toString()
        textview.textSize=fontSizes[p0].toFloat()
        textview.setPadding(5,10,0,10)

        return textview
    }
}
