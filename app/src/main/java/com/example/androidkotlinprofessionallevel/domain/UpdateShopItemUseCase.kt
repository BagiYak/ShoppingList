package com.example.androidkotlinprofessionallevel.domain

class UpdateShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun updateShopItemUseCase(shopItem: ShopItem) {
        return shopListRepository.updateShopItem(shopItem)
    }
}