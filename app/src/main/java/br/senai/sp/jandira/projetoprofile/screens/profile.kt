package br.senai.sp.jandira.projetoprofile.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.projetoprofile.R

@Composable
fun profile(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .height(300.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(355.dp),
                colors = CardDefaults.cardColors
                    (containerColor = Color(color = 0xFFF3F2F2)),
                shape = RoundedCornerShape(0.dp,0.dp,20.dp,20.dp),
            ) {
                Box(

                ){
                    Image(
                        painterResource(id = R.drawable.fundo),
                        contentDescription = stringResource(
                            R.string.logo_description
                        ),
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = stringResource(R.string.Details),
                            fontSize = 15.sp,
                            color = Color(color = 0xFFF4F4F5),
                            modifier = Modifier
                                .padding(35.dp)
                        )
                        Card (
                            modifier = Modifier
                                .size(100.dp),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors
                                (containerColor = Color(color = 0xFFB596F1)),
                            elevation = CardDefaults
                                .cardElevation(2.dp)
                        ){
                            Image(
                                painter = painterResource(R.drawable.avatar),
                                contentDescription = ""
                            )
                        }
                        Text(
                            text = stringResource(R.string.nome),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(color = 0xFFF4F4F5),
                            modifier = Modifier
                                .padding(20.dp)
                        )
                        Text(
                            text = stringResource(R.string.ux_designer),
                            fontSize = 10.sp,
                            color = Color(color = 0xFFF4F4F5),
                            modifier = Modifier
                                .padding(5.dp)
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 15.dp, vertical = 8.dp),
                            horizontalArrangement = Arrangement.SpaceAround
                        ){
                            Card (
                                modifier = Modifier
                                    .size(80.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0x00F4F4F5)
                                ),
                                shape = RoundedCornerShape(10.dp),
                                border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                            ){
                                Column (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        imageVector = Icons.Default.Email,
                                        contentDescription = "",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(22.dp)
                                    )
                                    Text(
                                        text = stringResource(R.string.email),
                                        fontSize = 10.sp,
                                        color = Color(0xFFEAEBF1),
                                        modifier = Modifier
                                            .padding(4.dp)
                                    )
                                }
                            }
                            Card (
                                modifier = Modifier
                                    .size(80.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0x00F4F4F5)
                                ),
                                shape = RoundedCornerShape(10.dp),
                                border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                            ){
                                Column (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        imageVector = Icons.Default.Call,
                                        contentDescription = "",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(22.dp)
                                    )
                                    Text(
                                        text = stringResource(R.string.call),
                                        fontSize = 10.sp,
                                        color = Color(0xFFEAEBF1),
                                        modifier = Modifier
                                            .padding(4.dp)
                                    )
                                }
                            }
                            Card (
                                modifier = Modifier
                                    .size(80.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0x00F4F4F5)
                                ),
                                shape = RoundedCornerShape(10.dp),
                                border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                            ){
                                Column (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        imageVector = Icons.Default.MailOutline,
                                        contentDescription = "",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(22.dp)
                                    )
                                    Text(
                                        text = stringResource(R.string.whatssap),
                                        fontSize = 10.sp,
                                        color = Color(0xFFEAEBF1),
                                        modifier = Modifier
                                            .padding(4.dp)
                                    )
                                }
                            }
                            Card (
                                modifier = Modifier
                                    .size(80.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0x00F4F4F5)
                                ),
                                shape = RoundedCornerShape(10.dp),
                                border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                            ){
                                Column (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ){
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(22.dp)
                                    )
                                    Text(
                                        text = stringResource(R.string.favorite),
                                        fontSize = 10.sp,
                                        color = Color(0xFFEAEBF1),
                                        modifier = Modifier
                                            .padding(4.dp)
                                    )
                                }
                            }

                        }
                    }

                }
            }
            Row (
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(15.dp)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.Absolute.Left
            ){
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "",
                    tint = Color.Blue,
                    modifier = Modifier
                        .size(22.dp)
                )
                Text(
                    text = stringResource(R.string.email),
                    fontSize = 15.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(4.dp)
                )
            }


        }
    }
}



@Preview(showSystemUi =  true)
@Composable
private fun profilePreview(){
    profile()
}