package com.example.gaara.bookfinderandroid.Fragment

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gaara.bookfinderandroid.R
import com.example.gaara.bookfinderandroid.Utils.BookStore
import kotlinx.android.synthetic.main.listview_fragment_bookstores.view.*

/**
 * Created by gaara on 10/31/17.
 */
class BookStoreRecycle(val bookStores: Array<BookStore>, val listener:(BookStore) -> Unit): RecyclerView.Adapter<BookStoreRecycle.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookStoreRecycle.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.listview_fragment_bookstores, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: BookStoreRecycle.ViewHolder, position: Int) {
        holder.bindItems(bookStores[position], listener)
    }

    override fun getItemCount(): Int {
        return bookStores.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(bookStore:BookStore, listener: (BookStore) -> Unit) = with(itemView){
            itemView.textView_BookStoreName.text = bookStore.name
            itemView.textView_BookStoreAddress.text = bookStore.address
            itemView.textView_BookStoreRange.text = bookStore.range
            itemView.textView_BookStorePrice.text = "RM ${bookStore.price.toString()}"
            Log.d("Recycle", "Success Binding")
        }
    }

}