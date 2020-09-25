package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

//baseAdapter is adapter that all other adapters inherit from
//add context and correct adapter data package to work with (com.example.coderswag.Model was used here)
class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    //    every adapter that inherits from baseAdapter needs these 4 methods (getView, getItem, getItemId, getCount)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder
//   conditional is if this is first time to see the layout, then go thru inflater process. if not, run else statement and recycle the views into the holder.
        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]
        val resourceId =
            context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    }
//  method used to retrieve info from a particular location of the listView
    override fun getItem(position: Int): Any {
        return categories[position]
    }
//  isnt used, so set to return 0. it defines a unique ID for each row.
    override fun getItemId(position: Int): Long {
        return 0
    }
// this is telling how many rows it will be displaying in the categories array
    override fun getCount(): Int {
        return categories.count()
    }
// will hold a reference to the category image and category name. this way only the displayed views are called and are active.
    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }

}


//    val context = context
//    val categories = categories
//
//    override fun getCount(): Int {
//    return categories.count()
//    }
//
//    override fun getItem(position: Int): Any {
//        return categories[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        return 0
//    }
//
//    override fun getView(position: Int, convertView: View, parent: ViewGroup?): View {
//        val categoryView: View
//        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
//        val categoryImage : ImageView = categoryView.findViewById((R.id.categoryName))
//        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)
//
//        val category = categories[position]
//
//        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
//        categoryImage.setImageResource(resourceId)
//        println(resourceId)
//        categoryName.text = category.title
//        return categoryView
//    }