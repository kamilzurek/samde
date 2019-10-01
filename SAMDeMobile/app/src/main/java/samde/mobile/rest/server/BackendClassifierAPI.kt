package samde.mobile.rest.server

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import samde.mobile.model.ClassificationResponse

interface BackendClassifierAPI {

    companion object {
        const val ENDPOINT = "http://192.168.56.1:8080"
//        const val ENDPOINT = "https://192.168.56.1:8443"
    }

    @POST("/classify")
    @FormUrlEncoded
    fun classify(@Field("content") content: String): Call<ClassificationResponse>

}