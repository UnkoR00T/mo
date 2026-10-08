package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import io.sentry.android.core.c2;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class d1 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f36513f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Boolean f36514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f36515h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f36517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f36518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c1 f36519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f36520e;

    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d1 f36521a;

        public a(d1 d1Var) {
            this.f36521a = d1Var;
        }

        public void a() {
            d1.j();
            d1.this.f36516a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            d1 d1Var = this.f36521a;
            if (d1Var == null) {
                return;
            }
            if (d1Var.i()) {
                d1.j();
                this.f36521a.f36519d.k(this.f36521a, 0L);
                context.unregisterReceiver(this);
                this.f36521a = null;
            }
        }
    }

    d1(c1 c1Var, Context context, i0 i0Var, long j15) {
        this.f36519d = c1Var;
        this.f36516a = context;
        this.f36520e = j15;
        this.f36517b = i0Var;
        this.f36518c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f36513f) {
            try {
                Boolean bool = f36515h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f36515h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z15 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z15 && Log.isLoggable("FirebaseMessaging", 3)) {
            e(str);
        }
        return z15;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f36513f) {
            try {
                Boolean bool = f36514g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f36514g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f36516a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th4) {
            throw th4;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f36516a)) {
            this.f36518c.acquire(d.f36506a);
        }
        try {
            try {
                try {
                    this.f36519d.l(true);
                    if (!this.f36517b.g()) {
                        this.f36519d.l(false);
                        if (h(this.f36516a)) {
                            try {
                                this.f36518c.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (f(this.f36516a) && !i()) {
                        new a(this).a();
                        if (h(this.f36516a)) {
                            try {
                                this.f36518c.release();
                                return;
                            } catch (RuntimeException unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    if (this.f36519d.o()) {
                        this.f36519d.l(false);
                    } else {
                        this.f36519d.p(this.f36520e);
                    }
                    if (h(this.f36516a)) {
                        this.f36518c.release();
                    }
                } catch (Throwable th4) {
                    if (h(this.f36516a)) {
                        try {
                            this.f36518c.release();
                        } catch (RuntimeException unused3) {
                        }
                    }
                    throw th4;
                }
            } catch (IOException e15) {
                c2.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e15.getMessage());
                this.f36519d.l(false);
                if (h(this.f36516a)) {
                    this.f36518c.release();
                }
            }
        } catch (RuntimeException unused4) {
        }
    }
}
