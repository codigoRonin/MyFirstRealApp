package com.codigoronin.myfirstrealapp.di

import com.codigoronin.myfirstrealapp.data.repository.AuthRepositoryImpl
import com.codigoronin.myfirstrealapp.domain.repository.AuthRepository
import com.codigoronin.myfirstrealapp.domain.use_cases.authentication.AuthUseCases
import com.codigoronin.myfirstrealapp.domain.use_cases.authentication.Login
import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    //SERVICES
    @Provides
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    //REPOSITORIES
    @Provides
    fun provideAuthRepository(impl: AuthRepositoryImpl) : AuthRepository = impl

    //USE CASES

    @Provides
    fun provideAuthUSeCases(repository: AuthRepository) = AuthUseCases(
        login = Login(repository)
    )
}