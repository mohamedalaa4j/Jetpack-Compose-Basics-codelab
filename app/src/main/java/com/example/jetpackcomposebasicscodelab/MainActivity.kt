package com.example.jetpackcomposebasicscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebasicscodelab.ui.theme.JetpackComposeBasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeBasicsCodelabTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp(
    names: List<String> = listOf("World", "Compose")
) {
    Column() {
        for (i in names) {
            Greeting(i)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
        ) {

            Column(modifier = Modifier.weight(1f)) {

                Text(text = "Hello")
                Text(text = "$name!")
            }

            OutlinedButton(onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.white)
                )
            ) {
                Text(text = "Show more", color = colorResource(id = R.color.purple_200))
            }
        }

    }
}

@Preview(showSystemUi = true, showBackground = true, device = Devices.NEXUS_5X)
@Composable
fun Preview() {
    MyApp()
}