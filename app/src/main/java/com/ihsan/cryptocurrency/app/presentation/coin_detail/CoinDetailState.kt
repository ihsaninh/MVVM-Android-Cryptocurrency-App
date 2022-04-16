package com.ihsan.cryptocurrency.app.presentation.coin_detail

import com.ihsan.cryptocurrency.app.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
