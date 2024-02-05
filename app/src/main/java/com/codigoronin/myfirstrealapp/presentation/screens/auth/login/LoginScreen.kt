package com.codigoronin.myfirstrealapp.presentation.screens.auth.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.codigoronin.myfirstrealapp.presentation.screens.auth.login.components.LoginBottomBar
import com.codigoronin.myfirstrealapp.presentation.screens.auth.login.components.LoginContent
import com.codigoronin.myfirstrealapp.presentation.screens.auth.login.components.LoginTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){
   Scaffold (
       topBar = { LoginTopBar() },
       bottomBar = { LoginBottomBar() }
   ){
           contentPadding ->
       // Screen content
       Box(modifier = Modifier.padding(contentPadding)) { LoginContent() }
   }
}