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
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.regalo.ui.theme.RegaloTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            RegaloTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFFD8B4E2)
                ) { innerPadding ->

                    MenuEntrada(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MenuEntrada(
    name: String,
    modifier: Modifier = Modifier
) {

    val contexto = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFD8B4E2))
            .padding(horizontal = 24.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Text(
            text = "Pequeña Sorpresa",
            fontSize = 32.sp,
            lineHeight = 38.sp,
            textAlign = TextAlign.Center
        )

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(28.dp)
        ) {

            Button(
                onClick = {
                    contexto.startActivity(
                        Intent(contexto, SecondActivity::class.java)
                    )
                },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .heightIn(min = 56.dp)
            ) {
                Text(
                    text = "Mensaje",
                    fontSize = 18.sp
                )
            }

            Button(
                onClick = {
                    contexto.startActivity(
                        Intent(contexto, ThirdActivity::class.java)
                    )
                },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .heightIn(min = 56.dp)
            ) {
                Text(
                    text = "Galería",
                    fontSize = 18.sp
                )
            }

            Button(
                onClick = {
                    contexto.startActivity(
                        Intent(contexto, ForthActivity::class.java)
                    )
                },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .heightIn(min = 56.dp)
            ) {
                Text(
                    text = "Recordatorio",
                    fontSize = 18.sp
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RegaloTheme {
        MenuEntrada("Android")
    }
}