package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import io.sentry.android.core.c2;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class m0 {
    public static /* synthetic */ void a(Context context, boolean z15, vh.m mVar) {
        try {
            if (!b(context)) {
                c2.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            o0.e(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z15) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            mVar.e(null);
        }
    }

    private static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    static void c(Context context) {
        if (o0.c(context)) {
            return;
        }
        e(new ma.b(), context, f(context));
    }

    static boolean d(Context context) {
        if (!com.google.android.gms.common.util.j.f()) {
            return false;
        }
        if (b(context)) {
            return "com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate());
        }
        c2.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
        return false;
    }

    @TargetApi(29)
    static vh.l<Void> e(Executor executor, final Context context, final boolean z15) {
        if (!com.google.android.gms.common.util.j.f()) {
            return vh.o.f(null);
        }
        final vh.m mVar = new vh.m();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.l0
            @Override // java.lang.Runnable
            public final void run() {
                m0.a(context, z15, mVar);
            }
        });
        return mVar.a();
    }

    private static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
