package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class SystemEventsBreadcrumbsIntegration implements io.sentry.r1, Closeable, s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile b f93722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f93723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.c1 f93724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f93725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f93726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f93727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile IntentFilter f93728h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile HandlerThread f93729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f93730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.sentry.util.a f93731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f93732m;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f93733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Boolean f93734b;

        a(Integer num, Boolean bool) {
            this.f93733a = num;
            this.f93734b = bool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return io.sentry.util.v.a(this.f93733a, aVar.f93733a) && io.sentry.util.v.a(this.f93734b, aVar.f93734b);
        }

        public int hashCode() {
            return io.sentry.util.v.b(this.f93733a, this.f93734b);
        }
    }

    final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.sentry.c1 f93735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SentryAndroidOptions f93736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.android.core.internal.util.l f93737c = new io.sentry.android.core.internal.util.l(io.sentry.android.core.internal.util.f.b(), 60000, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char[] f93738d = new char[64];

        b(io.sentry.c1 c1Var, SentryAndroidOptions sentryAndroidOptions) {
            this.f93735a = c1Var;
            this.f93736b = sentryAndroidOptions;
        }

        private io.sentry.f a(long j15, Intent intent, String str, a aVar) {
            Bundle extras;
            io.sentry.f fVar = new io.sentry.f(j15);
            fVar.F("system");
            fVar.z("device.event");
            String strB = b(str);
            if (strB != null) {
                fVar.A("action", strB);
            }
            if (aVar != null) {
                if (aVar.f93733a != null) {
                    fVar.A("level", aVar.f93733a);
                }
                if (aVar.f93734b != null) {
                    fVar.A("charging", aVar.f93734b);
                }
            } else if (this.f93736b.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap map = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th4) {
                        this.f93736b.getLogger().a(b7.ERROR, th4, "%s key of the %s action threw an error.", str2, str);
                    }
                }
                fVar.A("extras", map);
            }
            fVar.B(b7.INFO);
            return fVar;
        }

        String b(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            int length2 = this.f93738d.length;
            for (int i15 = length - 1; i15 >= 0; i15--) {
                char cCharAt = str.charAt(i15);
                if (cCharAt == '.') {
                    char[] cArr = this.f93738d;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return io.sentry.util.d0.f(str);
                }
                length2--;
                this.f93738d[length2] = cCharAt;
            }
            return str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a aVar;
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                aVar = null;
            } else {
                if (this.f93737c.a()) {
                    return;
                }
                Float fC = g1.c(intent, this.f93736b);
                a aVar2 = new a(fC != null ? Integer.valueOf(fC.intValue()) : null, g1.t(intent, this.f93736b));
                if (aVar2.equals(SystemEventsBreadcrumbsIntegration.this.f93732m)) {
                    return;
                }
                SystemEventsBreadcrumbsIntegration.this.f93732m = aVar2;
                aVar = aVar2;
            }
            io.sentry.f fVarA = a(System.currentTimeMillis(), intent, action, aVar);
            io.sentry.j0 j0Var = new io.sentry.j0();
            j0Var.k("android:intent", intent);
            this.f93735a.q(fVarA, j0Var);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, C());
    }

    private static String[] C() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    private void E(final io.sentry.c1 c1Var, final SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f93726f && !this.f93727g && this.f93722b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.g2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.p(this.f93853a, c1Var, sentryAndroidOptions);
                    }
                });
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().c(b7.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    private void H() {
        SentryAndroidOptions sentryAndroidOptions = this.f93723c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.f2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93838a.I();
                }
            });
        } catch (RejectedExecutionException unused) {
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        io.sentry.g1 g1VarA = this.f93731l.a();
        try {
            this.f93727g = true;
            b bVar = this.f93722b;
            this.f93722b = null;
            if (g1VarA != null) {
                g1VarA.close();
            }
            if (bVar != null) {
                this.f93721a.unregisterReceiver(bVar);
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public static /* synthetic */ void p(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.c1 c1Var, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.g1 g1VarA = systemEventsBreadcrumbsIntegration.f93731l.a();
        try {
            if (!systemEventsBreadcrumbsIntegration.f93726f && !systemEventsBreadcrumbsIntegration.f93727g && systemEventsBreadcrumbsIntegration.f93722b == null) {
                systemEventsBreadcrumbsIntegration.f93722b = systemEventsBreadcrumbsIntegration.new b(c1Var, sentryAndroidOptions);
                if (systemEventsBreadcrumbsIntegration.f93728h == null) {
                    systemEventsBreadcrumbsIntegration.f93728h = new IntentFilter();
                    for (String str : systemEventsBreadcrumbsIntegration.f93725e) {
                        systemEventsBreadcrumbsIntegration.f93728h.addAction(str);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.f93729j == null) {
                    systemEventsBreadcrumbsIntegration.f93729j = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.f93729j.start();
                }
                try {
                    a1.t(systemEventsBreadcrumbsIntegration.f93721a, sentryAndroidOptions, systemEventsBreadcrumbsIntegration.f93722b, systemEventsBreadcrumbsIntegration.f93728h, new Handler(systemEventsBreadcrumbsIntegration.f93729j.getLooper()));
                    if (!systemEventsBreadcrumbsIntegration.f93730k.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().c(b7.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        io.sentry.util.p.a("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th4) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().b(b7.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th4);
                }
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th5) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    @Override // io.sentry.android.core.s0.a
    public void b() {
        if (this.f93724d == null || this.f93723c == null) {
            return;
        }
        this.f93727g = false;
        E(this.f93724d, this.f93723c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.g1 g1VarA = this.f93731l.a();
        try {
            this.f93726f = true;
            this.f93728h = null;
            if (this.f93729j != null) {
                this.f93729j.quit();
            }
            this.f93729j = null;
            if (g1VarA != null) {
                g1VarA.close();
            }
            s0.y().H(this);
            H();
            SentryAndroidOptions sentryAndroidOptions = this.f93723c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(b7.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.android.core.s0.a
    public void h() {
        H();
    }

    @Override // io.sentry.r1
    public void m(io.sentry.c1 c1Var, q7 q7Var) {
        io.sentry.util.v.c(c1Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f93723c = sentryAndroidOptions;
        this.f93724d = c1Var;
        sentryAndroidOptions.getLogger().c(b7.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f93723c.isEnableSystemEventBreadcrumbs()));
        if (this.f93723c.isEnableSystemEventBreadcrumbs()) {
            s0.y().p(this);
            if (a1.s()) {
                E(this.f93724d, this.f93723c);
            }
        }
    }

    SystemEventsBreadcrumbsIntegration(Context context, String[] strArr) {
        this.f93726f = false;
        this.f93727g = false;
        this.f93728h = null;
        this.f93729j = null;
        this.f93730k = new AtomicBoolean(false);
        this.f93731l = new io.sentry.util.a();
        this.f93721a = a1.g(context);
        this.f93725e = strArr;
    }
}
