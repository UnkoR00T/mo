package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
class c1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f36497i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f36499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f36500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f36501d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f36503f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a1 f36505h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, ArrayDeque<vh.m<Void>>> f36502e = new r0.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36504g = false;

    private c1(FirebaseMessaging firebaseMessaging, i0 i0Var, a1 a1Var, d0 d0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f36501d = firebaseMessaging;
        this.f36499b = i0Var;
        this.f36505h = a1Var;
        this.f36500c = d0Var;
        this.f36498a = context;
        this.f36503f = scheduledExecutorService;
    }

    public static /* synthetic */ c1 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, i0 i0Var, d0 d0Var) {
        return new c1(firebaseMessaging, i0Var, a1.a(context, scheduledExecutorService), d0Var, context, scheduledExecutorService);
    }

    private static <T> void b(vh.l<T> lVar) throws IOException {
        try {
            vh.o.b(lVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e15) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e15);
        } catch (ExecutionException e16) {
            Throwable cause = e16.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e16);
            }
            throw ((RuntimeException) cause);
        }
    }

    private void c(String str) throws IOException {
        b(this.f36500c.m(this.f36501d.m(), str));
    }

    private void d(String str) throws IOException {
        b(this.f36500c.n(this.f36501d.m(), str));
    }

    static vh.l<c1> e(final FirebaseMessaging firebaseMessaging, final i0 i0Var, final d0 d0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return vh.o.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.b1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c1.a(context, scheduledExecutorService, firebaseMessaging, i0Var, d0Var);
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private void i(z0 z0Var) {
        synchronized (this.f36502e) {
            try {
                String strE = z0Var.e();
                if (this.f36502e.containsKey(strE)) {
                    ArrayDeque<vh.m<Void>> arrayDeque = this.f36502e.get(strE);
                    vh.m<Void> mVarPoll = arrayDeque.poll();
                    if (mVarPoll != null) {
                        mVarPoll.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f36502e.remove(strE);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void m() {
        if (h()) {
            return;
        }
        p(0L);
    }

    boolean f() {
        return this.f36505h.b() != null;
    }

    synchronized boolean h() {
        return this.f36504g;
    }

    boolean j(z0 z0Var) throws IOException {
        try {
            String strB = z0Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    d(z0Var.c());
                    if (!g()) {
                        return true;
                    }
                    z0Var.c();
                    return true;
                }
            } else if (strB.equals(ip.a.f96137b)) {
                c(z0Var.c());
                if (!g()) {
                    return true;
                }
                z0Var.c();
                return true;
            }
            g();
            return true;
        } catch (IOException e15) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e15.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e15.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e15.getMessage())) {
                if (e15.getMessage() != null) {
                    throw e15;
                }
                c2.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            c2.e("FirebaseMessaging", "Topic operation failed: " + e15.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    void k(Runnable runnable, long j15) {
        this.f36503f.schedule(runnable, j15, TimeUnit.SECONDS);
    }

    synchronized void l(boolean z15) {
        this.f36504g = z15;
    }

    void n() {
        if (f()) {
            m();
        }
    }

    boolean o() {
        while (true) {
            synchronized (this) {
                try {
                    z0 z0VarB = this.f36505h.b();
                    if (z0VarB == null) {
                        g();
                        return true;
                    }
                    if (!j(z0VarB)) {
                        return false;
                    }
                    this.f36505h.d(z0VarB);
                    i(z0VarB);
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    void p(long j15) {
        k(new d1(this, this.f36498a, this.f36499b, Math.min(Math.max(30L, 2 * j15), f36497i)), j15);
        l(true);
    }
}
