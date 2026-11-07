package com.example.regalo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.regalo.ui.theme.RegaloTheme


class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            RegaloTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFFD6E8F5)
                ) { innerPadding ->

                    Mensaje(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Mensaje(name: String, modifier: Modifier = Modifier) {

    val contexto = LocalContext.current
    val menu = Intent(contexto, MainActivity::class.java)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFD6E8F5))
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Un mensaje para el amor de mi vida",
            fontSize = 25.sp,
            lineHeight = 32.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
        )

        Text(
            text = "No soy mucho de hacer regalos elaborados por que soy un desastre, pero imagine que para una vez que tengo en mis manos la oportunidad de decirte unas palabras en forma de algo mejor que simplemente un mensaje o una frase era lo minimo que podria hacer por los esfuerzos que sueles hacer por mi incluso si no tienes por que mucha veces...",
            fontSize = 16.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Justify,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )

        Text(
            text = "Queria decirte lo mucho que has significado en mi vida, lo importante que has sido para mi y lo agradecido que estoy de poder decir que te tengo a mi lado. Irune, desde que te conoci he mejorado, he logrado seguir siendo mejor persona, he incluso si aun tengo tantisimos defectos me alivia saber que tu amas aun asi, que aun siendo asi no estoy solo por que estas en mi vida, y por eso te digo, gracias.",
            fontSize = 16.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Justify,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp)
        )

        Button(
            onClick = {
                contexto.startActivity(menu)
            },
            modifier = Modifier
                .fillMaxWidth(0.65f)
                .heightIn(min = 56.dp)
        ) {
            Text(
                text = "Volver",
                fontSize = 18.sp
            )
        }
    }
}
