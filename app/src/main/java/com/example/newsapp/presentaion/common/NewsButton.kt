package com.example.newsapp.presentaion.common

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newsapp.presentaion.onboarding.components.OnBoardingPage
import com.example.newsapp.presentaion.onboarding.pages
import com.example.newsapp.ui.theme.NewsAppTheme

@Composable
fun NewsButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick, colors = ButtonDefaults.buttonColors(
            contentColor = MaterialTheme.colorScheme.primary,
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(size = 6.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
        )
    }

}

@Composable
fun NewsTextButton(
    text: String,
    onClick: () -> Unit
) {
    TextButton(
        onClick = onClick

    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
            color = Color.White
        )
    }
}
