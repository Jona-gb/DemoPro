package com.draft_soft.demopro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.draft_soft.demopro.ui.theme.DemoProTheme
import com.draft_soft.demopro.ui_kit.main_screens.TopSection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoProTheme {
                // A surface container using the 'background' color from the theme
/**                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }

 **/
               // Login()
                TopSection()

            }

        }
    }
}
