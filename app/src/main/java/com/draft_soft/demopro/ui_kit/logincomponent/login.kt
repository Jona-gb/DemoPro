package com.draft_soft.demopro.ui_kit.logincomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.draft_soft.demopro.R
import com.draft_soft.demopro.ui_kit.Tab

@Composable
@Preview(showBackground = false)
fun Login(
    background : Color = colorResource(id =R.color.black0),
    primaryAppColor : Color = colorResource(id = R.color.orange),
    fontface : FontFamily = FontFamily.Monospace,
    textColor: Color = colorResource(id =R.color.orange),
    passIcon : Painter = painterResource(id = R.drawable.roundeye),
    numIcon : ImageVector = Icons.Rounded.Call,
    connerradius : Dp = 55.dp,
    horizontalPadding :Dp = 55.dp,
    buttonTextPadding :Dp = 4.dp,
    textInTextfieldColor: Color = Color.White,
    focusColor: Color = colorResource(id = R.color.orange0)
){


    var numTextState by remember { mutableStateOf(value = "")}
    var passTextState by remember { mutableStateOf(value = "") }

    var passState by remember {mutableStateOf(value = false) }
    var check_state by remember{ mutableStateOf(false) }

    var But_state by remember { mutableStateOf(false) }
    var Google_But_state by remember { mutableStateOf(false) }
    var Facebook_But_state by remember { mutableStateOf(false) }
    var signUp_but by remember{ mutableStateOf(false) }



    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(color = background)
        ){



        Box(modifier = Modifier
            .matchParentSize()

        ){
            Tab(
                primaryAppColor = primaryAppColor,

            )

            Box(modifier = Modifier.fillMaxSize() ){
                Column(
                    modifier = Modifier.matchParentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,

                ) {

                    TextField(value =numTextState, onValueChange = {reflect -> numTextState = reflect},
                        placeholder = {
                            Text(text = "+233 XXX XXX XXX")
                        },
                        trailingIcon = {
                            Icon(imageVector = numIcon, contentDescription = "call")

                        },
                        label = {
                            Text(text = "Number")
                        },
                        shape = RoundedCornerShape(connerradius),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp),
                        singleLine = true,

                        textStyle = TextStyle(fontFamily = fontface),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = focusColor,
                            focusedLabelColor = Color.White,
                            focusedTextColor = textInTextfieldColor,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),

                    )




                    Spacer(modifier = Modifier.size(20.dp))




                    TextField(value =passTextState , onValueChange = {reflect -> passTextState = reflect},
                        placeholder = {
                            Text(text = "Password")
                        },


                        trailingIcon = {
                                       IconButton(onClick = { passState = !passState}) {
                                           Icon(
                                               painter =passIcon ,
                                               contentDescription ="Visible"
                                           )
                                       }

                        },


                        label = {
                            Text(text = "Password")
                        },


                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp),
                        singleLine = true,

                        textStyle = TextStyle(fontFamily = fontface),

                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = focusColor,
                            focusedLabelColor = Color.White,
                            focusedTextColor = textInTextfieldColor,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        shape = RoundedCornerShape(connerradius),

                        visualTransformation = if (passState)
                            VisualTransformation.None
                        else
                            PasswordVisualTransformation()
                    )



                    Spacer(modifier = Modifier.size(5.dp))



                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){


                        Checkbox(checked =check_state ,
                            onCheckedChange ={reflect -> check_state =reflect},
                            colors = CheckboxDefaults.colors(
                                checkedColor = colorResource(id = R.color.black03),
                                checkmarkColor = colorResource(id = R.color.black0),
                                uncheckedColor = colorResource(id = R.color.black03)
                            ))


                        Text(text = "Remember me",
                            color = colorResource(id = R.color.black04))
                        Spacer(modifier = Modifier.size(45.dp))
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "Forget password?",
                                color = primaryAppColor)
                        }

                    }



                    Spacer(modifier = Modifier.size(45.dp))



                    Button(onClick = {But_state =!But_state},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = primaryAppColor
                        )

                    ) {
                        Box(
                        ) {
                            Text(text = "Login",
                                modifier = Modifier.padding(buttonTextPadding))
                        }
                        
                    }


                    Spacer(modifier = Modifier.size(15.dp))



                    Text(text = "or connect using",
                        color = colorResource(id = R.color.black03))
                    Spacer(modifier = Modifier.size(20.dp))




                    OutlinedButton(onClick = {Google_But_state =!Google_But_state},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),

                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color.White,
                            containerColor = Color.Transparent,

                            )

                    ) {
                        Box(
                        ) {
                            Text(text = "Google",
                                modifier = Modifier.padding(buttonTextPadding))
                        }

                    }



                    Spacer(modifier = Modifier.size(20.dp))



                    OutlinedButton(onClick = {Facebook_But_state =!Facebook_But_state},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color.White,
                            containerColor = Color.Transparent,

                        )
                        ) {
                        Box(
                        ) {
                            Text(text = "Facebook",
                                modifier = Modifier.padding(buttonTextPadding))
                        }

                    }
                }
            }

        }




        Box(
            modifier = Modifier.matchParentSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Don't have an account?",
                    color = colorResource(id = R.color.black04))

                TextButton(onClick = { signUp_but = ! signUp_but},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = primaryAppColor,
                        containerColor = Color.Transparent,

                        )) {
                    Text(text = "Signup")
                }
            }
        }

    }
}