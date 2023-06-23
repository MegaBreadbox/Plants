package com.example.plantlist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class PlantItem(
    @StringRes val plantNameId: Int,
    @DrawableRes val plantImageId: Int,
    @StringRes val plantDesId: Int

)
