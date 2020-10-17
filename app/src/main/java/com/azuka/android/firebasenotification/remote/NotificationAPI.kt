package com.azuka.android.firebasenotification.remote

import com.azuka.android.firebasenotification.other.Constant.Companion.CONTENT_TYPE
import com.azuka.android.firebasenotification.other.Constant.Companion.SERVER_KEY
import com.azuka.android.firebasenotification.data.PushNotification
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotificationAPI {

    //using caroutines to asynchronize when execute the fucntions
    @Headers("Authorization: key=$SERVER_KEY", "Content-Type:$CONTENT_TYPE")
    @POST("fcm/send")
    suspend fun postNotification(
        @Body notification: PushNotification
    ): Response<ResponseBody>
}