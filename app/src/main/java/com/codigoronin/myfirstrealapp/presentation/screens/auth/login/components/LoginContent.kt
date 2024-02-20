package com.codigoronin.myfirstrealapp.presentation.screens.auth.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.codigoronin.myfirstrealapp.presentation.components.DefaultTextField
import com.codigoronin.myfirstrealapp.R
import com.codigoronin.myfirstrealapp.presentation.components.DefaultButton
import com.codigoronin.myfirstrealapp.presentation.screens.auth.login.LoginViewModel
import com.codigoronin.myfirstrealapp.presentation.theme.PrimaryColor

@Composable
fun LoginContent( viewModel: LoginViewModel = hiltViewModel()) {

    Box(
        modifier = Modifier
            .fillMaxSize(),
        Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                modifier = Modifier.size(280.dp),
                contentDescription = "Logo"
            )
            DefaultTextField(
                modifier = Modifier.padding(top = 4.dp),
                value = viewModel.state.email,
                onValueChange = { viewModel.onEmailInput(it)},
                label = "Correo electronico",
                icon = Icons.Default.Email,
                keyboardType = KeyboardType.Email,
                errorMsg = viewModel.emailErrMsg,
                validateField = { viewModel.validateEmail()
                    viewModel.enabledLoginButton()}
            )
            Spacer(modifier = Modifier.size(4.dp))
            DefaultTextField(
                modifier = Modifier.padding(top = 0.dp),
                value =viewModel.state.password,
                onValueChange = {viewModel.onPasswordInput(it)},
                label = "Contraseña",
                icon = Icons.Default.Lock,
                hideText = true,
                errorMsg = viewModel.passwordErrMsg,
                validateField = {
                    viewModel.validatePassword()
                    viewModel.enabledLoginButton()
                }
            )
            Text(
                text = "¿Olvidaste tu contraseña?",
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 64.dp)
                    .clickable {  },
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                    color = PrimaryColor
                )

            )
            Spacer(modifier = Modifier.size(16.dp))
            DefaultButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 56.dp),
                text = "INICIAR SESIÓN",
                onClick = { viewModel.login() },
                enabled = viewModel.isEnabledLoginButton
            )
            Spacer(modifier = Modifier.size(32.dp))
            LoginDivider()
            Spacer(modifier = Modifier.size(32.dp))
             LoginSocial(text= "Iniciar sesión con Facebook", image = painterResource(R.drawable.facebook), onClic = {})
             Spacer(modifier = Modifier.size(16.dp))
             LoginSocial("Iniciar sesión con Google", painterResource(R.drawable.google)) {}
        }
    }
}
