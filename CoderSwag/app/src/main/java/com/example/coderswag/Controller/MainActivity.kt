package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.coderswag.Adapters.CategoryAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {  //initializing an array adapter
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//this is code that transform the list view to display image and categories

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter


    }
}