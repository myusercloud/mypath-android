package com.harry.sokomart.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.harry.sokomart.data.ProductDatabase
import com.harry.sokomart.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductViewModel(app: Application) : AndroidViewModel(app) {

    private val productDao = ProductDatabase.getDatabase(app).productDao()

    // This LiveData is directly tied to the Room database
    val allProducts: LiveData<List<Product>> = productDao.getAllProducts()

    fun addProduct(name: String, price: Double, phone: String, imageUri: String) {
        val newProduct = Product(
            name = name,
            price = price,
            phone = phone,
            imagePath = imageUri
        )
        viewModelScope.launch(Dispatchers.IO) {
            productDao.insertProduct(newProduct)
        }
    }

    fun updateProduct(updatedProduct: Product) {
        viewModelScope.launch(Dispatchers.IO) {
            productDao.updateProduct(updatedProduct)
        }
    }

    fun deleteProduct(product: Product) {
        viewModelScope.launch(Dispatchers.IO) {
            productDao.deleteProduct(product)
        }
    }
}