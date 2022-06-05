package com.example.androidkotlinprofessionallevel.presentation

import androidx.lifecycle.ViewModel
import com.example.androidkotlinprofessionallevel.data.ShopListRepositoryImpl
import com.example.androidkotlinprofessionallevel.domain.DeleteShopItemUseCase
import com.example.androidkotlinprofessionallevel.domain.EditShopItemUseCase
import com.example.androidkotlinprofessionallevel.domain.GetShopListUseCase
import com.example.androidkotlinprofessionallevel.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }

}