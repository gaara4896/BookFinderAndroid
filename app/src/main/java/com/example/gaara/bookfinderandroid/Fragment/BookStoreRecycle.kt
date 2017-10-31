package com.example.gaara.bookfinderandroid.Fragment

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gaara.bookfinderandroid.R
import com.example.gaara.bookfinderandroid.Utils.BookStore
import kotlinx.android.synthetic.main.listview_fragment_bookstores.view.*

/**
 * Created by gaara on 10/31/17.
 */
class BookStoreRecycle(val context:Context, val bookStores: Array<BookStore>, val listener:(BookStore) -> Unit): RecyclerView.Adapter<BookStoreRecycle.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookStoreRecycle.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.listview_fragment_bookstores, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: BookStoreRecycle.ViewHolder, position: Int) {
        holder.bindItems(context, bookStores[position], position, listener)
    }

    override fun getItemCount(): Int {
        return bookStores.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(context:Context, bookStore:BookStore,position:Int, listener: (BookStore) -> Unit) = with(itemView){
            itemView.textView_BookStoreName.text = bookStore.name
            itemView.textView_BookStoreAddress.text = bookStore.address
            itemView.textView_BookStoreRange.text = bookStore.range
            if(bookStore.price!= null){
                itemView.textView_BookStorePrice.text = "RM ${bookStore.price.toString()}"
            }
            when(position % 3){
                0 -> {
                    imageView_BookStore.setImageResource(resources.getIdentifier("drawable/popular1", null, context.packageName))
                }
                1 -> {
                    imageView_BookStore.setImageResource(resources.getIdentifier("drawable/popular2", null, context.packageName))
                }
                2 -> {
                    imageView_BookStore.setImageResource(resources.getIdentifier("drawable/mph", null, context.packageName))
                }
            }
        }
    }

}