package com.codigoronin.myfirstrealapp.presentation.screens.auth.login.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.codigoronin.myfirstrealapp.domain.model.FirebaseResponse
import com.codigoronin.myfirstrealapp.presentation.components.DefaultProgressBar
import com.codigoronin.myfirstrealapp.presentation.screens.auth.login.LoginViewModel

@Composable
fun Login( viewModel: LoginViewModel = hiltViewModel()) {

    when (viewModel.loginResponse) {

        FirebaseResponse.Loading -> {
            DefaultProgressBar()
        }

        is FirebaseResponse.Success -> {

            Toast.makeText(
                LocalContext.current, "Usuario loguedo correctamente",
                Toast.LENGTH_LONG
            ).show()
        }

        is FirebaseResponse.Error -> {
            Toast.makeText(
                LocalContext.current, "Usuario o contraseña incorrectos",
                Toast.LENGTH_LONG
            ).show()
        }

        else -> {}
    }
}


