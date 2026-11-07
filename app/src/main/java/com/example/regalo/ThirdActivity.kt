package com.example.regalo

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.regalo.ui.theme.RegaloTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items


class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            RegaloTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFFB7D7B0)
                ) { innerPadding ->
                    Galeria(
                        modifier = Modifier.padding(innerPadding),

                    )
                }
            }
        }
    }
}

@Composable
fun Galeria(modifier: Modifier = Modifier) {
    val contexto = LocalContext.current

    val imagenes = listOf(
        painterResource(R.drawable.img_0376),
        painterResource(R.drawable.img_0163),
        painterResource(R.drawable.eeba4eff_d128_40ca_b091_d4025aefb8b8),
        painterResource(R.drawable.rn_image_picker_lib_temp_bf174cac_298c_4bc7_9e53_7101a9dcfccc),
        painterResource(R.drawable.botella),
        painterResource(R.drawable.pelirroja),
        painterResource(R.drawable.autista),
        painterResource(R.drawable.furcia),
        painterResource(R.drawable.ojos),
        painterResource(R.drawable.epic),
        painterResource(R.drawable.odiseo),
        painterResource(R.drawable.poseidon),
        painterResource(R.drawable.ojos2),
        painterResource(R.drawable.file),
        painterResource(R.drawable.parejita),
        painterResource(R.drawable.parejita2),
        painterResource(R.drawable.ala),
        painterResource(R.drawable.nose),
        painterResource(R.drawable._657),
        painterResource(R.drawable.hermes)
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFB7D7B0))
            .padding(horizontal = 16.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Los increibles dibujos de mi amada",
            fontSize = 25.sp,
            lineHeight = 32.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentPadding = PaddingValues(4.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            items(items = imagenes) { imagen ->
                Image(
                    painter = imagen,
                    contentDescription = "Dibujo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                )
            }
        }

        Button(
            onClick = {
                (contexto as? Activity)?.finish()
            },
            modifier = Modifier
                .fillMaxWidth(0.65f)
                .heightIn(min = 56.dp)
                .padding(top = 8.dp)
        ) {
            Text(
                text = "Volver",
                fontSize = 18.sp
            )
        }
    }
}
