package com.ihsan.cryptocurrency.app.presentation.coin_list

import com.ihsan.cryptocurrency.app.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
