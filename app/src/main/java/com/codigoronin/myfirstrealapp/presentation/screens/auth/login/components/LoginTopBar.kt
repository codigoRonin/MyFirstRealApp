package com.codigoronin.myfirstrealapp.presentation.screens.auth.login.components

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.codigoronin.myfirstrealapp.presentation.theme.DarkPrimaryColor

@Composable
fun LoginTopBar() {
    Box(modifier = Modifier.fillMaxWidth(), Alignment.TopEnd) {
        val activity = LocalContext.current as Activity
        Icon(
            imageVector = Icons.Default.Close,
            contentDescription = "close",
            modifier = Modifier
                .clickable { activity.finish() }
                .padding(4.dp),
            tint = DarkPrimaryColor
        )
    }
}