package com.drsilaswiggin.jetpack.data.join

import androidx.room.Embedded
import androidx.room.Relation
import com.drsilaswiggin.jetpack.data.entities.GardenPlanting
import com.drsilaswiggin.jetpack.data.entities.Plant

data class PlantAndGardenPlantings(
    @Embedded
    val plant: Plant,

    @Relation(parentColumn = "id", entityColumn = "plant_id")
    val gardenPlantings: List<GardenPlanting> = emptyList()
)