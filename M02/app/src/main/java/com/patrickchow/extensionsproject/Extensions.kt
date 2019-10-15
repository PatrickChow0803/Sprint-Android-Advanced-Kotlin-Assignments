package com.patrickchow.extensionsproject

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.widget.ImageView
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

fun Context.notification(title: String = "Notification Title", message:String, notifyId: Int, channelId: String = ""){
    val notificationBuilder = NotificationCompat.Builder(this, channelId)
    notificationBuilder.setContentTitle(title)
        .setPriority(NotificationManager.IMPORTANCE_HIGH)
        .setSmallIcon(R.drawable.ic_launcher_background)
        .setColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
        .setContentText(message)
        .setDefaults(Notification.DEFAULT_ALL)

    val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
        val name = "Notifications Channel"
        val notificationChannel = NotificationChannel(channelId, name, NotificationManager.IMPORTANCE_DEFAULT)
        notificationChannel.description = "Notification channel description"
        notificationManager.createNotificationChannel(notificationChannel)
    }
    notificationManager.notify(notifyId, notificationBuilder.build())
}

fun ImageView.loadImageWithUrl(url: String){
    Glide.with(this).load(url).into(this)
}