package com.example.gaara.bookfinderandroid.Fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.gaara.bookfinderandroid.R
import com.example.gaara.bookfinderandroid.Utils.BookStore
import kotlinx.android.synthetic.main.listview_fragment_bookstores.view.*

/**
 * Created by gaara on 10/26/17.
 */
class BookStoreFragment(context: Context, names:Array<BookStore>): ArrayAdapter<BookStore>(context, R.layout.listview_fragment_bookstores, names){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val customView = inflater.inflate(R.layout.listview_fragment_bookstores, parent, false)

        customView.textView_BookStoreName.text = getItem(position).name
        customView.textView_BookStoreAddress.text = getItem(position).address
        customView.textView_BookStoreRange.text = getItem(position).range
        customView.textView_BookStorePrice.text = "RM " + getItem(position).price!!.toString()

        return customView
    }

}