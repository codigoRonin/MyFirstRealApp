package com.codigoronin.myfirstrealapp.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.codigoronin.myfirstrealapp.presentation.theme.DarkPrimaryColor
import com.codigoronin.myfirstrealapp.presentation.theme.LightPrimaryColor

@Composable
fun DefaultButton(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit,
    color: Color = DarkPrimaryColor,
    icon: ImageVector = Icons.Default.ArrowForward,
    enabled: Boolean = true
) {

    Button(
        modifier = modifier,
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            disabledContainerColor = LightPrimaryColor,
            disabledContentColor = Color.White
        ),
        enabled = enabled
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "Icon Button"
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text)
    }

}