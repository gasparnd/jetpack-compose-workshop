package com.example.jetpackcomposeworkshop

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeworkshop.ui.theme.JetpackComposeWorkshopTheme

@Composable
fun PresentationCard(modifier: Modifier = Modifier, name: String, title: String) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(modifier = modifier.size(200.dp).clip(RoundedCornerShape(16.dp)), painter = painterResource(R.drawable.foto), contentDescription = "")
        Text(text = name, modifier = modifier, style = MaterialTheme.typography.displayMedium)
        Text(text = title, modifier = modifier, style = MaterialTheme.typography.headlineMedium)
    }
}

@Preview(showBackground = true)
@Composable
private fun PresentationCardPreview() {
    JetpackComposeWorkshopTheme {
        PresentationCard(name = "Gaspar", title = "Mobile Dev")
    }
}