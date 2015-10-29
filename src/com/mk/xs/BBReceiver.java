package com.mk.xs;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.os.IBinder;
import android.net.Uri;
import android.util.Log;

public class BBReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction().toString();
        if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            Log.d("BBoot", "Intent.ACTION_BOOT_COMPLETED!");
            Intent service = new Intent("android.intent.action.MAIN");
            service.setClass(context, Healthy.class);
            context.startService(service);
        } else {
            Log.d("BBoot", "Unknown action: " + action);
        }
    }
}
