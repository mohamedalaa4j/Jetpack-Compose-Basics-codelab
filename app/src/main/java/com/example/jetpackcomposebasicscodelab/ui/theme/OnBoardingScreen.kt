package com.example.jetpackcomposebasicscodelab.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OnBoardingScreen(onContinueClicked: () -> Unit) {
    Surface {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Welcome to the basics code lap")
            Button(onClick = {onContinueClicked()}
            , Modifier.padding(24.dp)) {
                Text(text = "Continue")
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true, device = Devices.NEXUS_5X)
@Composable
fun Preview() {
    OnBoardingScreen {}
}