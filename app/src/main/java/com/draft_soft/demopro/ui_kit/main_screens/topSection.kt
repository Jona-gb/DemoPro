package com.draft_soft.demopro.ui_kit.main_screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.draft_soft.demopro.R


@Composable
@Preview(showSystemUi = true,
    showBackground = true)

fun TopSection(
    spaceBetweenCards: Dp = 5.dp,
    cardSize: Dp = 120.dp,
    imgsize: Dp = 90.dp,
   // contentColor: androidx.compose.ui.graphics.Color = colorResource(id = R.color.orangeD),
    containerColor: Painter = painterResource(id = R.color.orange0)
){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter,){
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                val Hostel = Filter()
                Hostel.filterCard(
                    cardLabel = "H",
                    filerCardSize = cardSize,
                    imageSRC = painterResource(id = R.drawable.display_icon),
                    imfilerCardSize = imgsize,
                    //primaryAppColor = contentColor
                )
                Spacer(modifier = Modifier.padding(spaceBetweenCards))
                Hostel.filterCard(
                    cardLabel = "A",
                    filerCardSize = cardSize,
                    imfilerCardSize = imgsize
                )
                Spacer(modifier = Modifier.padding(spaceBetweenCards))
                Hostel.filterCard(
                    cardLabel = "H",
                    filerCardSize = cardSize,
                    imfilerCardSize = imgsize
                )
            }
            Spacer(modifier = Modifier.padding(spaceBetweenCards))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                val chip = Chips()
                chip.Filter_chip(
                )
                Spacer(modifier = Modifier.padding(spaceBetweenCards))
                chip.Filter_chip(
                    label = "Nearest"
                )
                Spacer(modifier = Modifier.padding(spaceBetweenCards))
                chip.Filter_chip(
                    label = "Recommended"
                )
            }

        }
    }
}