package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import io.sentry.android.core.c2;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
class k1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f36563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f36564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<a> f36565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h1 f36566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36567f;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f36568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vh.m<Void> f36569b = new vh.m<>();

        a(Intent intent) {
            this.f36568a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            c2.g("FirebaseMessaging", "Service took too long to process intent: " + aVar.f36568a.getAction() + " finishing.");
            aVar.d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.i1
                @Override // java.lang.Runnable
                public final void run() {
                    k1.a.b(this.f36555a);
                }
            }, 20L, TimeUnit.SECONDS);
            e().b(scheduledExecutorService, new vh.f() { // from class: com.google.firebase.messaging.j1
                @Override // vh.f
                public final void a(vh.l lVar) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f36569b.e(null);
        }

        vh.l<Void> e() {
            return this.f36569b.a();
        }
    }

    k1(Context context, String str) {
        this(context, str, a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new pg.b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f36565d.isEmpty()) {
            this.f36565d.poll().d();
        }
    }

    private synchronized void c() {
        while (!this.f36565d.isEmpty()) {
            try {
                h1 h1Var = this.f36566e;
                if (h1Var == null || !h1Var.isBinderAlive()) {
                    e();
                    return;
                } else {
                    this.f36566e.b(this.f36565d.poll());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void e() {
        if (this.f36567f) {
            return;
        }
        this.f36567f = true;
        try {
            if (og.a.b().a(this.f36562a, this.f36563b, this, 65)) {
                return;
            } else {
                c2.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e15) {
            c2.f("FirebaseMessaging", "Exception while binding the service", e15);
        }
        this.f36567f = false;
        b();
    }

    synchronized vh.l<Void> d(Intent intent) {
        a aVar;
        aVar = new a(intent);
        aVar.c(this.f36564c);
        this.f36565d.add(aVar);
        c();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f36567f = false;
            if (iBinder instanceof h1) {
                this.f36566e = (h1) iBinder;
                c();
                return;
            }
            c2.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        c();
    }

    k1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f36565d = new ArrayDeque();
        this.f36567f = false;
        Context applicationContext = context.getApplicationContext();
        this.f36562a = applicationContext;
        this.f36563b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f36564c = scheduledExecutorService;
    }
}
