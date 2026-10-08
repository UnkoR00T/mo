package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f36534a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36535b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static uh.a f36536c;

    private static void b(Context context) {
        if (f36536c == null) {
            uh.a aVar = new uh.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f36536c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f36535b) {
            try {
                if (f36536c != null && d(intent)) {
                    f(intent, false);
                    f36536c.c();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    @SuppressLint({"TaskMainThread"})
    static void e(Context context, k1 k1Var, final Intent intent) {
        synchronized (f36535b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                if (!zD) {
                    f36536c.a(f36534a);
                }
                k1Var.d(intent).c(new vh.f() { // from class: com.google.firebase.messaging.e1
                    @Override // vh.f
                    public final void a(vh.l lVar) {
                        f1.c(intent);
                    }
                });
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static void f(Intent intent, boolean z15) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z15);
    }

    static ComponentName g(Context context, Intent intent) {
        synchronized (f36535b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f36536c.a(f36534a);
                }
                return componentNameStartService;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
