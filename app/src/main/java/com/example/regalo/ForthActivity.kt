package com.example.regalo

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.regalo.ui.theme.RegaloTheme

class ForthActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            RegaloTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFFF8D7E8)
                ) { innerPadding ->
                    MensajeFinal(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MensajeFinal(modifier: Modifier = Modifier) {
    val contexto = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF8D7E8))
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Pequeño extra",
            fontSize = 25.sp,
            lineHeight = 32.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
        )

        Text(
            text = "Perdona si la app es algo cutre, apenas empiezo a pillarle el truco a esto de Android y lo primero que se me a ocurrido es hacer una app y comerme la cabeza en como hacer que funcione... Espero que te guste mucho",
            fontSize = 16.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Justify,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
        )

        Text(
            text = " Te amo muchisimo, y espero poder seguir haciendolo mucho más tiempo Irune, por que eres el mundo para mi incluso si soy terrible en demostrartelo aveces, por eso quiero decirte mil veces que te amo, te quiero y adoro. ",
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
                (contexto as? Activity)?.finish()
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
