package com.example.androidkotlinprofessionallevel.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int) : ShopItem

    fun updateShopItem(shopItem: ShopItem)

    fun getShopList() : List<ShopItem>
}