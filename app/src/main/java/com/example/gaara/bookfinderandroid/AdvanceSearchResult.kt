package com.example.gaara.bookfinderandroid

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.gaara.bookfinderandroid.Fragment.BookFragment
import kotlinx.android.synthetic.main.activity_advance_search_result.*

class AdvanceSearchResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advance_search_result)
        setSupportActionBar(toolbar)

        var books = arrayOf(
                arrayOf("Intelligent Investor", "Benjamin Graham"),
                arrayOf("Rich Dad Poor Dad", "Robery Kiyosaki"),
                arrayOf("The Better Angels of Our Nature", "Steven Pinker"),
                arrayOf("The Art Of The Deal", "Donald Trump"),
                arrayOf("The Rational Optimist", "Matt Ridley"),
                arrayOf("World Order", "Henry Kissinger"))

        listView_Books.adapter = BookFragment(applicationContext, books)
        listView_Books.divider = this.getDrawable(R.drawable.transparent)

        listView_Books.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, BookInfo::class.java)
            intent.putExtra("name", books[position])
            startActivity(intent)
        }

        textView_SortBy.setOnClickListener {
            when(textView_SortBy.text.toString()){
                "Sort By: Name" -> {
                    textView_SortBy.text = "Sort By: Price"
                    books = arrayOf(
                            arrayOf("Intelligent Investor", "Benjamin Graham"),
                            arrayOf("Rich Dad Poor Dad", "Robery Kiyosaki"),
                            arrayOf("The Better Angels of Our Nature", "Steven Pinker"),
                            arrayOf("The Art Of The Deal", "Donald Trump"),
                            arrayOf("The Rational Optimist", "Matt Ridley"),
                            arrayOf("World Order", "Henry Kissinger"))

                    listView_Books.adapter = BookFragment(applicationContext, books)
                }
                "Sort By: Price" -> {
                    textView_SortBy.text = "Sort By: Author"
                    books = arrayOf(
                            arrayOf("The Better Angels of Our Nature", "Steven Pinker"),
                            arrayOf("The Art Of The Deal", "Donald Trump"),
                            arrayOf("Intelligent Investor", "Benjamin Graham"),
                            arrayOf("Rich Dad Poor Dad", "Robery Kiyosaki"),
                            arrayOf("The Rational Optimist", "Matt Ridley"),
                            arrayOf("World Order", "Henry Kissinger"))

                    listView_Books.adapter = BookFragment(applicationContext, books)
                }
                "Sort By: Author" -> {
                    textView_SortBy.text = "Sort By: Name"
                    books = arrayOf(
                            arrayOf("Rich Dad Poor Dad", "Robery Kiyosaki"),
                            arrayOf("The Rational Optimist", "Matt Ridley"),
                            arrayOf("The Better Angels of Our Nature", "Steven Pinker"),
                            arrayOf("The Art Of The Deal", "Donald Trump"),
                            arrayOf("Intelligent Investor", "Benjamin Graham"),
                            arrayOf("World Order", "Henry Kissinger"))
                    listView_Books.adapter = BookFragment(applicationContext, books)
                }
            }
        }
    }
}
