package com.codigoronin.myfirstrealapp.domain.use_cases.authentication

import com.codigoronin.myfirstrealapp.domain.repository.AuthRepository
import javax.inject.Inject

class GetCurrentUser @Inject constructor(private val authRepository: AuthRepository) {

    operator fun invoke() = authRepository.currentUser

}