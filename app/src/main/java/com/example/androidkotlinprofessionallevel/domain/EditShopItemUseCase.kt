package com.example.androidkotlinprofessionallevel.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItemUseCase(shopItem: ShopItem) {
        return shopListRepository.editShopItem(shopItem)
    }
}