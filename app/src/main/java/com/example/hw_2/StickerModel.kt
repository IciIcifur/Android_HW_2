package com.example.hw_2

import androidx.annotation.DrawableRes

data class StickerModel(
    val stickerTitle: String,
    @DrawableRes
    val stickerImage: Int
)