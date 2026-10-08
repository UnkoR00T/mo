package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import io.sentry.android.core.c2;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public class u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static u0 f36594e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36595a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f36596b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f36597c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<Intent> f36598d = new ArrayDeque();

    private u0() {
    }

    private int a(Context context, Intent intent) {
        String strF = f(context, intent);
        if (strF != null) {
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            if ((e(context) ? f1.g(context, intent) : context.startService(intent)) != null) {
                return -1;
            }
            c2.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e15) {
            c2.e("FirebaseMessaging", "Failed to start service while in background: " + e15);
            return 402;
        } catch (SecurityException e16) {
            c2.f("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e16);
            return 401;
        }
    }

    static synchronized u0 b() {
        try {
            if (f36594e == null) {
                f36594e = new u0();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f36594e;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f36595a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f36595a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f36595a = serviceInfo.name;
                    }
                    return this.f36595a;
                }
                c2.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            c2.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    Intent c() {
        return this.f36598d.poll();
    }

    boolean d(Context context) {
        if (this.f36597c == null) {
            this.f36597c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        this.f36596b.booleanValue();
        return this.f36597c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f36596b == null) {
            this.f36596b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.f36596b.booleanValue();
        return this.f36596b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        this.f36598d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
