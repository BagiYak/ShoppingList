package com.example.androidkotlinprofessionallevel.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.androidkotlinprofessionallevel.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private var count = 0   //TODO("delete - used for test")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this) {
            Log.d("MainActivityTest: ", it.toString())
            //TODO("delete - used for test")
            if(count == 0) {
                count++
                val item = it[0]
//                viewModel.deleteShopItem(item)
                viewModel.changeEnabledState(item)
            }
        }
    }
}