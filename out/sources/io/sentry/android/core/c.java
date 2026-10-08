package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.b7;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f93768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f93769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p1 f93770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.p f93771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f93772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f93773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.v0 f93774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f93775h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f93776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f93777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f93778l;

    public interface a {
        void a(ApplicationNotResponding applicationNotResponding);
    }

    c(long j15, boolean z15, a aVar, io.sentry.v0 v0Var, Context context) {
        this(new io.sentry.transport.p() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.p
            public final long a() {
                return SystemClock.uptimeMillis();
            }
        }, j15, 500L, z15, aVar, v0Var, new p1(), context);
    }

    public static /* synthetic */ void a(c cVar, io.sentry.transport.p pVar) {
        cVar.getClass();
        cVar.f93775h = pVar.a();
        cVar.f93776j.set(false);
    }

    private boolean c() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.f93777k.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th4) {
            this.f93774g.b(b7.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th4);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f93778l.run();
        while (!isInterrupted()) {
            this.f93770c.b(this.f93778l);
            try {
                Thread.sleep(this.f93772e);
                if (this.f93771d.a() - this.f93775h > this.f93773f) {
                    if (!this.f93768a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f93774g.c(b7.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f93776j.set(true);
                    } else if (c() && this.f93776j.compareAndSet(false, true)) {
                        this.f93769b.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f93773f + " ms.", this.f93770c.a()));
                    }
                }
            } catch (InterruptedException e15) {
                try {
                    Thread.currentThread().interrupt();
                    this.f93774g.c(b7.WARNING, "Interrupted: %s", e15.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f93774g.c(b7.WARNING, "Failed to interrupt due to SecurityException: %s", e15.getMessage());
                    return;
                }
            }
        }
    }

    c(final io.sentry.transport.p pVar, long j15, long j16, boolean z15, a aVar, io.sentry.v0 v0Var, p1 p1Var, Context context) {
        super("|ANR-WatchDog|");
        this.f93775h = 0L;
        this.f93776j = new AtomicBoolean(false);
        this.f93771d = pVar;
        this.f93773f = j15;
        this.f93772e = j16;
        this.f93768a = z15;
        this.f93769b = aVar;
        this.f93774g = v0Var;
        this.f93770c = p1Var;
        this.f93777k = context;
        this.f93778l = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                c.a(this.f93758a, pVar);
            }
        };
        if (j15 < this.f93772e * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f93772e * 2)));
        }
    }
}
