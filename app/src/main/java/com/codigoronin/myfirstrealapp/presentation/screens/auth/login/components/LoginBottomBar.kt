package com.codigoronin.myfirstrealapp.presentation.screens.auth.login.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codigoronin.myfirstrealapp.presentation.theme.PrimaryColor
import com.codigoronin.myfirstrealapp.presentation.theme.PrimaryTextColor

@Composable
fun LoginBottomBar() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 24.dp), horizontalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.size(24.dp))
        Text("¿No tienes cuenta?", fontSize = 12.sp, color = PrimaryTextColor)
        Text(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .clickable {

                },
            text = "REGÍSTRATE AQUÍ",
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                color = PrimaryColor
            )
        )
    }
}