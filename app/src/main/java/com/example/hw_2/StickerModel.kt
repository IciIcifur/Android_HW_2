package com.example.hw_2

import androidx.annotation.DrawableRes

data class StickerModel(
    val stickerTitle: String,
    val stickerColor: StickerColor,
    @DrawableRes
    val stickerImage: Int
)