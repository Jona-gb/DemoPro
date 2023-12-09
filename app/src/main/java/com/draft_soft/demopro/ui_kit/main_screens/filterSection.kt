package com.draft_soft.demopro.ui_kit.main_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.draft_soft.demopro.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true,
    showSystemUi = true)
fun FilterSection(
    filerCardSize : Dp = 100.dp,
    spaceBetweenCards :Dp = 10.dp,
    imageWidth : Dp = 2500.dp,
    imageHeight: Dp = 75.dp,
    topPadding : Dp = 5.dp,
    imageSRC : Painter = painterResource(id = R.drawable.alt_img),

){

    var cardState by remember{ mutableStateOf(false) }

   Box (
       modifier = Modifier.fillMaxSize(),
       contentAlignment = Alignment.TopCenter,
   ){
       Row(
           modifier = Modifier.fillMaxWidth(),
           horizontalArrangement = Arrangement.Center,
           verticalAlignment = Alignment.CenterVertically
       ) {

           ElevatedCard(onClick = { cardState = !cardState },
               modifier = Modifier.size(filerCardSize)) {
               Image(painter = imageSRC,
                   contentDescription ="A display icon",
                   contentScale = ContentScale.FillBounds
                 )

           }
           Spacer(modifier = Modifier.size(spaceBetweenCards))


           ElevatedCard(onClick = { cardState = !cardState },
               modifier = Modifier.size(filerCardSize)) {
               Image(painter = imageSRC,
                   contentDescription ="A display icon",
                   contentScale = ContentScale.FillBounds

               )
           }
           Spacer(modifier = Modifier.size(spaceBetweenCards))

           ElevatedCard(onClick = { cardState = !cardState },
               modifier = Modifier.size(filerCardSize)) {
               Image(painter = imageSRC,
                   contentDescription ="A display icon",
                   contentScale = ContentScale.FillBounds

               )
               Box (
                   modifier = Modifier.fillMaxSize(),
                   contentAlignment = Alignment.BottomStart
               ){
                   Surface(
                       modifier = Modifier
                           .matchParentSize()
                           .padding(2.dp),
                       shape = RoundedCornerShape(20.dp),
                       color = Color.White,
                       contentColor = Color.White
                   ) {
                       Text(text = "hei",
                           color = Color.White,)
                   }
               }
           }
       }
   }
}
fun Search_bar(){

}