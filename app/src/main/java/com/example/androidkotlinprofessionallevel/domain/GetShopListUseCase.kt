package com.example.androidkotlinprofessionallevel.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopListUseCase() : List<ShopItem> {
        return shopListRepository.getShopList()
    }
}