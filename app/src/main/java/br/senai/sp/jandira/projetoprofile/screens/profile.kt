package br.senai.sp.jandira.projetoprofile.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.projetoprofile.R

@Composable
fun profile(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ){
        Column (){
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(275.dp)
            ){
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "",
                    tint = Color.White
                )
                Text(
                    text = stringResource(R.string.Details)
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