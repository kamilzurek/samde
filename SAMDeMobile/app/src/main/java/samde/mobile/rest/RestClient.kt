package samde.mobile.rest

import android.content.Context
import com.mklimek.sslutilsandroid.SslUtils
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import samde.mobile.rest.server.BackendClassifierAPI
import javax.net.ssl.HttpsURLConnection

class RestClient(private val context: Context) {

    private val classifierApi: BackendClassifierAPI

    fun getApi(): BackendClassifierAPI {
        return classifierApi
    }

    init {
        val sslContext = SslUtils.getSslContextForCertificateFile(context, "ssl/samde.cer")
        val httpClient =
                OkHttpClient.Builder()
                        .sslSocketFactory(sslContext.socketFactory)
                        .hostnameVerifier { hostname, session ->
                            HttpsURLConnection.getDefaultHostnameVerifier()
                                    .verify("samde-local", session)
                        }
                        .addInterceptor(RestAuthenticationInterceptor.get()).build()
        val retrofit = Retrofit.Builder()
                .baseUrl(BackendClassifierAPI.ENDPOINT)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        classifierApi = retrofit.create(BackendClassifierAPI::class.java)
    }
}