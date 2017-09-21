package com.egco428.searchdialog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ir.mirrajabi.searchdialog.SimpleSearchDialogCompat
import ir.mirrajabi.searchdialog.core.BaseSearchDialogCompat
import ir.mirrajabi.searchdialog.core.SearchResultListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchBtn.setOnClickListener {
            SimpleSearchDialogCompat(this@MainActivity,"Search","What are you looking for ?",null,initData()
                    ,SearchResultListener{
                        baseSearchDialogCompat, item, position -> Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()
                        baseSearchDialogCompat.dismiss()
                    }).show()
        }
    }
    private fun initData():ArrayList<SearchModel>{
        val items = ArrayList<SearchModel>()
        items.add(SearchModel("Thailand"))
        items.add(SearchModel("United Kingdom"))
        items.add(SearchModel("United State of America"))
        items.add(SearchModel("Japan"))
        items.add(SearchModel("China"))
        items.add(SearchModel("Korea"))

        return items
    }
}
