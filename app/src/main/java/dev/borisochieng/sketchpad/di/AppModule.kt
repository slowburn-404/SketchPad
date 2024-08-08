package dev.borisochieng.sketchpad.di

import dev.borisochieng.sketchpad.auth.data.AuthRepositoryImpl
import dev.borisochieng.sketchpad.auth.domain.AuthRepository
import dev.borisochieng.sketchpad.auth.presentation.viewmodels.AuthViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppModule {
    val appModule = module {
        factory<AuthRepository> { AuthRepositoryImpl() }
        viewModel { AuthViewModel() }
    }
}