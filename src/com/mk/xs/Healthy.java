package com.mk.xs;

import android.app.Service;
import android.content.Intent;
import android.content.Context;
import android.os.IBinder;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

public class Healthy extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("attention", "service started");
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}
