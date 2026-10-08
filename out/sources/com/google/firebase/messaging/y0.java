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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
class y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f36619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f36620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f36621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    ExecutorService f36622d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pg.b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y0 f36623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f36624b;

        public a(y0 y0Var) {
            this.f36623a = y0Var;
        }

        public void a() {
            y0.c();
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            y0 y0Var = this.f36623a;
            if (y0Var != null) {
                Context contextB = y0Var.b();
                this.f36624b = contextB;
                contextB.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            y0 y0Var = this.f36623a;
            if (y0Var != null && y0Var.d()) {
                y0.c();
                this.f36623a.f36621c.o(this.f36623a, 0L);
                Context context2 = this.f36624b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f36623a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public y0(FirebaseMessaging firebaseMessaging, long j15) {
        this.f36621c = firebaseMessaging;
        this.f36619a = j15;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f36620b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f36621c.p();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() throws IOException {
        try {
            if (this.f36621c.m() != null) {
                return true;
            }
            c2.e("FirebaseMessaging", "Token retrieval failed: null");
            return false;
        } catch (IOException e15) {
            if (!d0.i(e15.getMessage())) {
                if (e15.getMessage() != null) {
                    throw e15;
                }
                c2.g("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            c2.g("FirebaseMessaging", "Token retrieval failed: " + e15.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            c2.g("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (u0.b().e(b())) {
            this.f36620b.acquire();
        }
        try {
            this.f36621c.B(true);
            if (!this.f36621c.A()) {
                this.f36621c.B(false);
            } else if (!u0.b().d(b()) || d()) {
                if (e()) {
                    this.f36621c.B(false);
                } else {
                    this.f36621c.F(this.f36619a);
                }
            } else {
                new a(this).a();
            }
        } catch (IOException e15) {
            c2.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e15.getMessage() + ". Won't retry the operation.");
            this.f36621c.B(false);
        } finally {
            if (u0.b().e(b())) {
                this.f36620b.release();
            }
        }
    }
}
