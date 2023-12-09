package com.draft_soft.demopro.ui_kit.main_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.draft_soft.demopro.R

class Filter(){
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    @Preview(showSystemUi = true, showBackground =true)
    fun filterCard(
        filerCardSize : Dp = 100.dp,
        filerCardHeight : Dp = 104.dp,
        filerCardWidth : Dp = 104.dp,
        imfilerCardSize : Dp = 75.dp,
        roundedCornerShape: Dp = 8.dp,
        insideCardPadding:Dp = 5.dp,
        imageSRC : Painter = painterResource(id = R.drawable.alt_img),
        cardLabel : String = "Logde",
        fontFamily: FontFamily = FontFamily.SansSerif ,
        background : Color = colorResource(id =R.color.black02),
        primaryAppColor : Color = colorResource(id = R.color.white01),
        textColor: Color = colorResource(id =R.color.blue00 ),

        ){
        var elevated_Card by remember{ mutableStateOf(false) }
        ElevatedCard(onClick = { elevated_Card = !elevated_Card },
            modifier = Modifier
               // .size(height =  filerCardHeight, width = filerCardWidth)
                .size(filerCardSize)
                .fillMaxSize(),
            shape = RoundedCornerShape(roundedCornerShape),
            colors = CardDefaults.cardColors(
                containerColor = background,
                contentColor = textColor
            )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    //.blur(2.dp),
            ){

                Box (
                    modifier = Modifier,
                    contentAlignment = Alignment.TopCenter
                ){
                    //Spacer(modifier = Modifier.padding(top = 100.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(
                                //horizontal = 5.dp,
                                //vertical = 5.dp
                                all = insideCardPadding
                            ),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .size(imfilerCardSize),
                               // .padding(horizontal = 9.dp, vertical = 2.dp),
                            shape = RoundedCornerShape(roundedCornerShape),



                        ) {
                            Image(painter = imageSRC,
                                contentDescription ="A display icon",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                //.clip(shape = RoundedCornerShape(roundedCornerShape))
                            )
                        }
                        Text(text = cardLabel,
                            fontFamily = fontFamily,
                            color = primaryAppColor)
                    }
                }
            }
        }
    }
}

class Chips(){
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    @Preview
    fun Filter_chip(
        label :String = "Popular"
    ){
        var chipSelection by remember { mutableStateOf(false) }
        FilterChip(selected = chipSelection,
            onClick = { chipSelection = !chipSelection },
            label = { Text(text = label)},
        )
    }
}