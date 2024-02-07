package com.codigoronin.myfirstrealapp.presentation.screens.auth.login

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor (): ViewModel(){

    //STATES
    var state by mutableStateOf(LoginState())
        private set

    //VALIDATIONS
    var isEmailValid by mutableStateOf(false)
    var emailErrMsg by mutableStateOf("")
    var isPasswordValid by mutableStateOf(false)
    var passwordErrMsg by mutableStateOf("")

    var isEnabledLoginButton = false

    fun validateEmail(){
        if(Patterns.EMAIL_ADDRESS.matcher(state.email).matches()){
            isEmailValid=true
            emailErrMsg = ""
        }else{
            isEmailValid =false
            emailErrMsg = "El email no tiene el formato válido"
        }
    }

    fun validatePassword(){
        if(state.password.length >=6){
            isPasswordValid=true
            passwordErrMsg = ""
        }else{
            isPasswordValid =false
            passwordErrMsg = "La contraseña debe tener al menos 6 caracteres"
        }
    }

    fun enabledLoginButton(){
        isEnabledLoginButton= isEmailValid && isPasswordValid
    }

    //INPUTS
    fun onEmailInput(email:String){
        state = state.copy(email = email)
    }

    fun onPasswordInput(password:String){
        state = state.copy(password = password)
    }
}