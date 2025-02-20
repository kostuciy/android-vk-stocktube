package com.kostuciy.data.network.interceptors

import com.kostuciy.data.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

private const val HEADER_NAME = "api-key"
private const val API_KEY = BuildConfig.API_KEY

@Singleton
class KeyInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request =
            chain
                .request()
                .newBuilder()
                .addHeader(HEADER_NAME, API_KEY)
                .build()

        return chain.proceed(request)
    }
}
