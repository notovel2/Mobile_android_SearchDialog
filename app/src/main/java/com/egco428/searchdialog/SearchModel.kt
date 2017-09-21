package com.egco428.searchdialog

import ir.mirrajabi.searchdialog.core.Searchable

/**
 * Created by 6272user on 9/21/2017 AD.
 */
class SearchModel(private var mTitle:String):Searchable{
    override fun getTitle(): String {
        return mTitle
    }
}