package com.example.android_app_18082024

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Color.White, Color.Cyan))),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.home), contentDescription = "Home Imagen")

        Text(
            text = "Home app de accesibilidad",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "¿Qué te gustaría hacer hoy?",
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(26.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(16.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Button(
                onClick = {
                    //  Funcionalidad para reconocimiento de voz
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Hablar")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(16.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Button(
                onClick = {
                    // funcional para escritura
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Escribir")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(16.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Button(
                onClick = {
                    // Manejar logout o salir
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Cerrar sesión")
            }
        }
    }
}
