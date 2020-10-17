package com.azuka.android.firebasenotification.data

import com.azuka.android.firebasenotification.data.NotificationData

data class PushNotification(

    //all device for apps get the data
    val data: NotificationData,
    val to: String
)