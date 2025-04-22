package com.harry.sokomart.viewmodel

import android.app.Application
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.harry.sokomart.data.ProductDatabase
import com.harry.sokomart.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream

class ProductViewModel(app: Application) : AndroidViewModel(app) {

    private val context = app.applicationContext
    private val productDao = ProductDatabase.getDatabase(app).productDao()

    val allProducts: LiveData<List<Product>> = productDao.getAllProducts()

    fun addProduct(name: String, price: Double, phone: String, imageUri: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val savedImagePath = saveImageToInternalStorage(Uri.parse(imageUri))
            val newProduct = Product(
                name = name,
                price = price,
                phone = phone,
                imagePath = savedImagePath // use saved image path
            )
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
            // Delete image from storage
            deleteImageFromInternalStorage(product.imagePath)
            productDao.deleteProduct(product)
        }
    }

    // Save image permanently to internal storage
    private fun saveImageToInternalStorage(uri: Uri): String {
        val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
        val fileName = "IMG_${System.currentTimeMillis()}.jpg"
        val file = File(context.filesDir, fileName)

        inputStream?.use { input ->
            FileOutputStream(file).use { output ->
                input.copyTo(output)
            }
        }

        return file.absolutePath
    }

    private fun deleteImageFromInternalStorage(path: String) {
        try {
            val file = File(path)
            if (file.exists()) {
                file.delete()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}