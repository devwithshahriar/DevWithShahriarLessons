package com.shahriar.devwithshahriarlessons.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun RowExample() {

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically



    ) {
        Text(text = "Apple", fontSize = 30.sp)
        Text(text = "Banana", fontSize = 30.sp)
        Text(text = "Grapes", fontSize = 30.sp)
    }



}

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "Book 01", fontSize = 30.sp)
        Text(text = "Book 02", fontSize = 30.sp)
        Text(text = "Book 03", fontSize = 30.sp)
    }
}

@Composable
fun ColumnExample2() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "Login", fontSize = 30.sp)
        OutlinedTextField(

            value = "",
            onValueChange = {},
            label = { Text(text = "Username")}

            )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Password")}
        )
        Text(
            text = "Don't have an account? Sign up"

        )

    }
}

@Composable
fun BoxExample() {

    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ){
        Text(
            text = "Note 01",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.TopEnd)
        )
        Text(
            text = "Note 02",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
        Text(
            text = "Note 03",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }

    }
