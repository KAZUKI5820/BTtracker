package com.example.bttracker;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class ReminderBroadcastReceiver extends BroadcastReceiver {


    private Object ReminderBroadcastReceiver;

    public static void create(MainActivity mainActivity) {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        NotificationCompat.Builder builder = new
                NotificationCompat.Builder(context, "BT_Tracker_Channel")
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle("Notification from BT Tracker")
                .setContentText("Please log your body temperature now")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setContentIntent((PendingIntent) ReminderBroadcastReceiver);
        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(context);
        notificationManager.notify(200, builder.build());

    }

    public void addNextIntentWithParentStack(Intent resultIntent) {
    }

    public void getPendingIntent(int i, int flagUpdateCurrent) {
    }
}
