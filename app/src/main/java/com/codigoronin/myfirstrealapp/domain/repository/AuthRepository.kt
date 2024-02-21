package com.codigoronin.myfirstrealapp.domain.repository

import com.codigoronin.myfirstrealapp.domain.model.FirebaseResponse
import com.google.firebase.auth.FirebaseUser

interface AuthRepository {

   val currentUser : FirebaseUser?
   suspend fun login(email:String, password :String) : FirebaseResponse<FirebaseUser>

}