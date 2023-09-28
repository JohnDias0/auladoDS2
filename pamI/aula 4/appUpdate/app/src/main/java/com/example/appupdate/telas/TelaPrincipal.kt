package com.example.appupdate.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun TelaPrincipal(nome: String){
    Column (modifier= Modifier
        .background(color= Color.Blue)
        .padding(top = Dp(50F)),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Olá, $nome")
        Text(text = "Selga Bel-vido")
    }
}