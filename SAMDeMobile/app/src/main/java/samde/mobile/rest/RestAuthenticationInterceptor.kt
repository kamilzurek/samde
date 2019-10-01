package samde.mobile.rest

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Response

class RestAuthenticationInterceptor : Interceptor {

    private val credentials = Credentials.basic("user", "password123")

    companion object {
        fun get(): RestAuthenticationInterceptor {
            return RestAuthenticationInterceptor()
        }
    }

    private constructor()

    override fun intercept(chain: Interceptor.Chain?): Response {
        val request = chain!!.request()
        val builder = request!!.newBuilder().header("Authorization", credentials)
        val newRequest = builder.build()
        return chain.proceed(newRequest)
    }

}