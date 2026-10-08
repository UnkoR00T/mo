package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.android.core.c2;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f36523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f36524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0 f36525c;

    public e(Context context, j0 j0Var, ExecutorService executorService) {
        this.f36523a = executorService;
        this.f36524b = context;
        this.f36525c = j0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f36524b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.j.b()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f36524b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(c.a aVar) {
        ((NotificationManager) this.f36524b.getSystemService("notification")).notify(aVar.f36494b, aVar.f36495c, aVar.f36493a.b());
    }

    private f0 d() {
        f0 f0VarP = f0.p(this.f36525c.p("gcm.n.image"));
        if (f0VarP != null) {
            f0VarP.u(this.f36523a);
        }
        return f0VarP;
    }

    private void e(s5.l.e eVar, f0 f0Var) {
        if (f0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) vh.o.b(f0Var.r(), 5L, TimeUnit.SECONDS);
            eVar.n(bitmap);
            eVar.v(new s5.l.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            c2.g("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            f0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e15) {
            c2.g("FirebaseMessaging", "Failed to download image: " + e15.getCause());
        } catch (TimeoutException unused2) {
            c2.g("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            f0Var.close();
        }
    }

    boolean a() {
        if (this.f36525c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        f0 f0VarD = d();
        c.a aVarE = c.e(this.f36524b, this.f36525c);
        e(aVarE.f36493a, f0VarD);
        c(aVarE);
        return true;
    }
}
