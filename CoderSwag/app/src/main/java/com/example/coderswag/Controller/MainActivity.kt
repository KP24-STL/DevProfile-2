package com.example.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Selection
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapters.CategoryAdapter
import com.example.coderswag.Adapters.CategoryRecyclerAdapter
import com.example.coderswag.Adapters.ProductsAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit is used as a default adapter (ArrayAdapter<Category> )
    lateinit var adapter : CategoryRecyclerAdapter

//    initializing an array adapter. onCreate is used to make the adapter. takes data from object dataService formats it into ListViews (LayoutManager)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//this is code that transform the list view to display image and categories

        adapter = CategoryRecyclerAdapter(this, DataService.categories) {category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
//    this tells the list view who to listen to. categoryListView is the id set in the activity_main XML file
        categoryListView.adapter = adapter

//   last step for recycler view is code to create layout manager. calls for the.
//    choose linearlayout and initialized. set the manager. setHasFixed is to opttimize the view
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}