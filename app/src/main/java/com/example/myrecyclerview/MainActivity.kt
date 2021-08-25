package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.data.Adapter
import com.example.myrecyclerview.data.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Pen", 2.50, R.drawable.ic_baseline_adb_24),
            Product("Computer", 2500.00, R.drawable.ic_baseline_accessible_forward_24),
            Product("Book", 20.00, R.drawable.ic_baseline_adb_24),
            Product("Keyboard", 200.00, R.drawable.ic_baseline_accessible_forward_24),
            Product("Pencil", 4.50, R.drawable.ic_baseline_adb_24)
        )

        val recyclerView : RecyclerView = findViewById(R.id.productRecyclerView)
        recyclerView.adapter = Adapter(productList)
        recyclerView.setHasFixedSize(true)
    }
}