package com.example.plantlist.model

import com.example.plantlist.R

object DataSource {
    val plants = listOf(
        PlantItem(
            R.string.plant_cactus,
            R.drawable.pexels_scott_webb_7159917,
            R.string.plant_cactus_desc
        ),
        PlantItem(
            R.string.plant_succulent,
            R.drawable.pexels_ylanite_koppens_796620,
            R.string.plant_succulent_desc
        )
    )
}