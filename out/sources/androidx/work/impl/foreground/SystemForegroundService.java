package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.p016lifecycle.w;

/* JADX INFO: loaded from: classes3.dex */
public class SystemForegroundService extends w implements androidx.work.impl.foreground.a.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f13851e = ub.w.i("SystemFgService");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SystemForegroundService f13852f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    androidx.work.impl.foreground.a f13854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    NotificationManager f13855d;

    static class a {
        static void a(Service service, int i15, Notification notification, int i16) {
            service.startForeground(i15, notification, i16);
        }
    }

    static class b {
        static void a(Service service, int i15, Notification notification, int i16) {
            try {
                service.startForeground(i15, notification, i16);
            } catch (ForegroundServiceStartNotAllowedException e15) {
                ub.w.e().l(SystemForegroundService.f13851e, "Unable to start foreground service", e15);
            } catch (SecurityException e16) {
                ub.w.e().l(SystemForegroundService.f13851e, "Unable to start foreground service", e16);
            }
        }
    }

    private void g() {
        this.f13855d = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f13854c = aVar;
        aVar.o(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i15, Notification notification) {
        this.f13855d.notify(i15, notification);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i15) {
        this.f13853b = true;
        ub.w.e().a(f13851e, "Shutting down.");
        stopForeground(true);
        f13852f = null;
        stopSelf(i15);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i15, int i16, Notification notification) {
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 31) {
            b.a(this, i15, notification, i16);
        } else if (i17 >= 29) {
            a.a(this, i15, notification, i16);
        } else {
            startForeground(i15, notification);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i15) {
        this.f13855d.cancel(i15);
    }

    @Override // androidx.p016lifecycle.w, android.app.Service
    public void onCreate() {
        super.onCreate();
        f13852f = this;
        g();
    }

    @Override // androidx.p016lifecycle.w, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f13854c.l();
    }

    @Override // androidx.p016lifecycle.w, android.app.Service
    public int onStartCommand(Intent intent, int i15, int i16) {
        super.onStartCommand(intent, i15, i16);
        if (this.f13853b) {
            ub.w.e().f(f13851e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f13854c.l();
            g();
            this.f13853b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f13854c.m(intent, i16);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i15) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f13854c.n(i15, 2048);
    }

    public void onTimeout(int i15, int i16) {
        this.f13854c.n(i15, i16);
    }
}
