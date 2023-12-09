package com.draft_soft.demopro.ui_kit.main_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.draft_soft.demopro.R

class baseSection {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    @Preview(showBackground = true, showSystemUi = true)
    fun BaseCanvas(){
        var cardState by remember{ mutableStateOf(false) }
        var floatingActionState by remember{ mutableStateOf(false) }
        ElevatedCard(onClick = { cardState = !cardState},
            modifier = Modifier
                .fillMaxWidth()
                .size(height = 360.dp, width = 0.dp)
                .padding(10.dp),
            shape = RoundedCornerShape(30.dp)
        ) {
            Box (modifier = Modifier.fillMaxSize()){
                Box (modifier = Modifier.fillMaxSize()){
                    Image(painter = painterResource(id = R.drawable.ik00),
                        contentDescription ="house images",
                        contentScale = ContentScale.FillBounds)
                }
                Box (
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(height = 360.dp, width = 200.dp)
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Transparent,
                                    Color.Transparent,
                                    colorResource(id =R.color.black0),
                                ),
                                startY = 60.5f,
                            )
                        ),
                    contentAlignment = Alignment.BottomCenter,
                ){

                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                    contentAlignment = Alignment.TopEnd){
                    IconButton(
                        onClick = { floatingActionState = !floatingActionState },

                    ){
                        Icon(imageVector = Icons.Outlined.Favorite,
                            contentDescription ="like",
                            modifier = Modifier.size(80.dp),
                            )
                    }
                }
            }
        }
    }
}