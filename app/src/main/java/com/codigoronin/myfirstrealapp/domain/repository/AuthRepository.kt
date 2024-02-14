package com.codigoronin.myfirstrealapp.domain.repository

import com.codigoronin.myfirstrealapp.domain.model.FirebaseResponse
import com.google.firebase.auth.FirebaseUser

interface AuthRepository {
   suspend fun login(email:String, password :String) : FirebaseResponse<FirebaseUser>
}