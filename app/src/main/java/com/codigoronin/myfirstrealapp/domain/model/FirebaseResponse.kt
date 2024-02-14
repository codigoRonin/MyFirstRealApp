package com.codigoronin.myfirstrealapp.domain.model

import java.lang.Exception

sealed class FirebaseResponse<out T>{
    object Loading: FirebaseResponse<Nothing>()
    data class Success <out T>(val data:T):FirebaseResponse<T>()
    data class Error <out T> (val exception: Exception?): FirebaseResponse<T>()
}
