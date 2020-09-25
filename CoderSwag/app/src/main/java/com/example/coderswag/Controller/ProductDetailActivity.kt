package com.example.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapters.ProductsAdapter
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import com.example.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_products.*

class ProductDetailActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product =  intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        val selectedProductImage = findViewById<ImageView>(R.id.selectedProductImage)
        val selectedProductName = findViewById<TextView>(R.id.selectedProductName)
        val selectedProductPrice = findViewById<TextView>(R.id.selectedProductPrice)

        product?.let {
            val resourceId =
                this.resources.getIdentifier(product.image, "drawable", this.packageName)
            selectedProductImage?.setImageResource(resourceId)
            selectedProductName?.text = product.title
            selectedProductPrice?.text = product.price
        }
    }
}