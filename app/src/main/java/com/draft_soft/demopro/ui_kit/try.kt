package com.draft_soft.demopro.ui_kit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import com.draft_soft.demopro.R

data class Tabitem(
    val title: String
)

@Composable
fun Tab(
    background : Color = colorResource(id = R.color.black0),
    primaryAppColor : Color = colorResource(id = R.color.orange),
    fontface : FontFamily = FontFamily.Monospace,
    textColor: Color = colorResource(id = R.color.blue00 )
){
    var tabitems = listOf(
        Tabitem(
            title = "Login"
        ),
        Tabitem(
            title = "Signup"
        )
    )
    var tabState by remember{ mutableIntStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TabRow(selectedTabIndex = tabState,
            containerColor = background,
            contentColor = primaryAppColor,
        ) {


            tabitems.forEachIndexed { index, tabitem ->
                Tab(selected = index == tabState,
                    onClick = {
                        tabState = index
                    },
                    text ={
                        Text(text = tabitem.title)
                    }
                    )

            }
        }
    }
}