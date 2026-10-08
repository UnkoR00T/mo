package io.sentry.android.core;

import io.sentry.b7;
import io.sentry.h4;
import io.sentry.i8;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
final class o1 implements s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f94073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f94074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimerTask f94075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.r<Timer> f94076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f94077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.c1 f94078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f94079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f94080h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.transport.p f94081j;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (o1.this.f94079g) {
                o1.this.f94078f.v();
            }
            o1.this.f94078f.s().getReplayController().stop();
            o1.this.f94078f.s().getContinuousProfiler().n(false);
        }
    }

    o1(io.sentry.c1 c1Var, long j15, boolean z15, boolean z16) {
        this(c1Var, j15, z15, z16, io.sentry.transport.n.b());
    }

    public static /* synthetic */ void a(o1 o1Var, io.sentry.a1 a1Var) {
        i8 session;
        if (o1Var.f94073a.get() != 0 || (session = a1Var.getSession()) == null || session.k() == null) {
            return;
        }
        o1Var.f94073a.set(session.k().getTime());
    }

    public static /* synthetic */ Timer c() {
        return new Timer(true);
    }

    private void f(String str) {
        if (this.f94080h) {
            io.sentry.f fVar = new io.sentry.f();
            fVar.F("navigation");
            fVar.A("state", str);
            fVar.z("app.lifecycle");
            fVar.B(b7.INFO);
            this.f94078f.c(fVar);
        }
    }

    private void g() {
        io.sentry.g1 g1VarA = this.f94077e.a();
        try {
            TimerTask timerTask = this.f94075c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f94075c = null;
            }
            if (g1VarA != null) {
                g1VarA.close();
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

    private void i() {
        io.sentry.g1 g1VarA = this.f94077e.a();
        try {
            g();
            this.f94075c = new a();
            this.f94076d.a().schedule(this.f94075c, this.f94074b);
            if (g1VarA != null) {
                g1VarA.close();
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

    private void j() {
        g();
        long jA = this.f94081j.a();
        this.f94078f.J(new h4() { // from class: io.sentry.android.core.n1
            @Override // io.sentry.h4
            public final void a(io.sentry.a1 a1Var) {
                o1.a(this.f94066a, a1Var);
            }
        });
        long j15 = this.f94073a.get();
        if (j15 == 0 || j15 + this.f94074b <= jA) {
            if (this.f94079g) {
                this.f94078f.x();
            }
            this.f94078f.s().getReplayController().start();
        }
        this.f94078f.s().getReplayController().s();
        this.f94073a.set(jA);
    }

    @Override // io.sentry.android.core.s0.a
    public void b() {
        j();
        f("foreground");
    }

    @Override // io.sentry.android.core.s0.a
    public void h() {
        this.f94073a.set(this.f94081j.a());
        this.f94078f.s().getReplayController().g();
        i();
        f("background");
    }

    o1(io.sentry.c1 c1Var, long j15, boolean z15, boolean z16, io.sentry.transport.p pVar) {
        this.f94073a = new AtomicLong(0L);
        this.f94076d = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.android.core.m1
            @Override // io.sentry.util.r.a
            public final Object a() {
                return o1.c();
            }
        });
        this.f94077e = new io.sentry.util.a();
        this.f94074b = j15;
        this.f94079g = z15;
        this.f94080h = z16;
        this.f94078f = c1Var;
        this.f94081j = pVar;
    }
}
