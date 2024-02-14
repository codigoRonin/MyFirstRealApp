package com.codigoronin.myfirstrealapp.domain.use_cases.authentication

import com.codigoronin.myfirstrealapp.domain.repository.AuthRepository
import javax.inject.Inject

class Login @Inject constructor(private val repository: AuthRepository){

    suspend operator fun invoke (email:String, password:String) = repository.login(email, password)
}