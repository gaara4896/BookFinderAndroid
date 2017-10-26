package com.example.gaara.bookfinderandroid.Fragment

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.gaara.bookfinderandroid.R
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.listview_fragment_books.view.*

/**
 * Created by gaara on 10/26/17.
 */
class BookFragment(context:Context, names:Array<Array<String>>): ArrayAdapter<Array<String>>(context, R.layout.listview_fragment_books, names){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val customView = inflater.inflate(R.layout.listview_fragment_books, parent, false)

        customView.textView_BookName.text = getItem(position)[0]
        customView.textView_Author.text = getItem(position)[1]

        return customView
    }

}