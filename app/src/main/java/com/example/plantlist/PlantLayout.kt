package com.example.plantlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.plantlist.model.DataSource
import com.example.plantlist.model.PlantItem
import com.example.plantlist.ui.theme.PlantListTheme

@Composable
fun PlantCard (
    plantItem: PlantItem,
    modifier: Modifier = Modifier
){
    var isExpanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier.clickable(onClick = {
            isExpanded = !isExpanded
        }),

    ){
        Column(

        ){
            Text(
                text = stringResource(plantItem.plantNameId)
            )
            Image(
                painter = painterResource(plantItem.plantImageId),
                contentDescription = null
            )
            if(isExpanded){
                Text(
                    text = stringResource(plantItem.plantDesId)
                )
            }
        }
    }
}

@Preview
@Composable
fun PlantCardPreview(){
    PlantListTheme{
        PlantCard(DataSource.plants[0])
    }
}