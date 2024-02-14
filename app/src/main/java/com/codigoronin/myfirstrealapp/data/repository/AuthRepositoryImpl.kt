package com.codigoronin.myfirstrealapp.data.repository

import com.codigoronin.myfirstrealapp.domain.model.FirebaseResponse
import com.codigoronin.myfirstrealapp.domain.repository.AuthRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val firebaseAuth: FirebaseAuth): AuthRepository{
    override suspend fun login(email: String, password: String): FirebaseResponse<FirebaseUser> {
        return try {
            val result = firebaseAuth.signInWithEmailAndPassword(email, password).await()
            FirebaseResponse.Success(result.user!!)
        } catch (e:Exception){
            FirebaseResponse.Error(e)
        }
    }
}