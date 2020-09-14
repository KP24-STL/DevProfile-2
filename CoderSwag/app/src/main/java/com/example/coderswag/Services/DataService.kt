package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

//    DATA VIEWS
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslope Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$20", "hat3"),
        Product("Devslopes Hat Snapback", "#25", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslope Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$20", "hat3"),
        Product("Devslopes Hat Snapback", "#25", "hat4"),
        Product("Devslope Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$20", "hat3"),

    )

    val hoodies = listOf(
        Product("Devslopes Grey Hoodie", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32","hoodie2"),
        Product("Devslopes Grey Hooide", "$28", "hoodie3"),
        Product("Devslopes Black Hoodie", "$32", "hoodie4"),
        Product("Devslopes Hoodie Red", "$32","hoodie2"),
        Product("Devslopes Grey Hooide", "$28", "hoodie3"),
        Product("Devslopes Black Hoodie", "$32", "hoodie4"),
        Product("Devslopes Hoodie Red", "$32","hoodie2"),
        Product("Devslopes Grey Hooide", "$28", "hoodie3"),
        Product("Devslopes Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Grey", "$15", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$18", "shirt3"),
        Product("Devslopes Hustle", "$15", "shirt4"),
        Product("Kickflip Studies", "$18", "shirt5"),
        Product("Devslopes Badge Light Grey", "$15", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$18", "shirt3"),
        Product("Devslopes Hustle", "$15", "shirt4"),
        Product("Kickflip Studies", "$18", "shirt5"),
        Product("Devslopes Badge Light Grey", "$15", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$18", "shirt3"),
        Product("Devslopes Hustle", "$15", "shirt4"),
        Product("Kickflip Studies", "$18", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String?) : List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods

        }
    }
}