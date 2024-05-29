package co.si.main.zing.splash.networking

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Copyright © 2021 Hell Corporation. All rights reserved.
 *
 * @author Mr. Lucifer
 * @since September 06, 2021
 */
@Module
@InstallIn(SingletonComponent::class)
object SplashDI {

    @Provides
    @Singleton
    fun provideService(retrofit: Retrofit): SplashApi {
        return retrofit.create(SplashApi::class.java)
    }

    @Provides
    @Singleton
    fun provideLoginRepository(splashService: SplashApi): SplashRepository =
        SplashRepository(splashService)
}