package com.google.android.libraries.places.internal;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class fb0 extends l40 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Logger f32271o = Logger.getLogger(fb0.class.getName());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final double f32272p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f80 f32273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f32274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wa0 f32276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g50 f32277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private za0 f32278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f32279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f40 f32280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private gb0 f32281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f32283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ScheduledExecutorService f32284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private n50 f32285m = n50.a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final tg0 f32286n;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f32272p = TimeUnit.SECONDS.toNanos(1L);
    }

    fb0(f80 f80Var, Executor executor, f40 f40Var, tg0 tg0Var, ScheduledExecutorService scheduledExecutorService, wa0 wa0Var, g60 g60Var) {
        int i15 = y40.f34340c;
        this.f32273a = f80Var;
        f80Var.b();
        System.identityHashCode(this);
        int i16 = fr0.f32341a;
        if (executor == com.google.common.util.concurrent.u.a()) {
            this.f32274b = new sl0();
            this.f32275c = true;
        } else {
            this.f32274b = new wl0(executor);
            this.f32275c = false;
        }
        this.f32276d = wa0Var;
        this.f32277e = g50.a();
        this.f32279g = f80Var.a() == d80.UNARY || f80Var.a() == d80.SERVER_STREAMING;
        this.f32280h = f40Var;
        this.f32286n = tg0Var;
        this.f32284l = scheduledExecutorService;
    }

    static final /* synthetic */ void q(j40 j40Var, l90 l90Var, a80 a80Var) {
        try {
            j40Var.c(l90Var, a80Var);
        } catch (RuntimeException e15) {
            f32271o.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final j50 g() {
        j50 j50VarB = this.f32280h.b();
        if (j50VarB == null) {
            return null;
        }
        return j50VarB;
    }

    private final void s(Object obj) {
        zj.p.x(this.f32281i != null, "Not started");
        zj.p.x(!this.f32282j, "call was cancelled");
        zj.p.x(!this.f32283k, "call was half-closed");
        try {
            gb0 gb0Var = this.f32281i;
            if (gb0Var instanceof ll0) {
                ((ll0) gb0Var).e0(obj);
            } else {
                gb0Var.d(this.f32273a.e(obj));
            }
            if (this.f32279g) {
                return;
            }
            this.f32281i.I();
        } catch (Error e15) {
            this.f32281i.t(l90.f32808f.e("Client sendMessage() failed with Error"));
            throw e15;
        } catch (RuntimeException e16) {
            this.f32281i.t(l90.f32808f.d(e16).e("Failed to stream message"));
        }
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void a(j40 j40Var, a80 a80Var) {
        gb0 sg0Var;
        int i15 = fr0.f32341a;
        zj.p.x(this.f32281i == null, "Already started");
        zj.p.x(!this.f32282j, "call was cancelled");
        zj.p.r(j40Var, "observer");
        zj.p.r(a80Var, "headers");
        g50 g50Var = this.f32277e;
        f40 f40Var = this.f32280h;
        e40 e40Var = di0.f32039g;
        di0 di0Var = (di0) f40Var.i(e40Var);
        if (di0Var != null) {
            Long l15 = di0Var.f32040a;
            if (l15 != null) {
                j50 j50VarB = j50.b(l15.longValue(), TimeUnit.NANOSECONDS);
                j50 j50VarB2 = this.f32280h.b();
                if (j50VarB2 == null || j50VarB.compareTo(j50VarB2) < 0) {
                    this.f32280h = this.f32280h.a(j50VarB);
                }
            }
            Boolean bool = di0Var.f32041b;
            if (bool != null) {
                this.f32280h = bool.booleanValue() ? this.f32280h.c() : this.f32280h.d();
            }
            Integer num = di0Var.f32042c;
            if (num != null) {
                Integer numN = this.f32280h.n();
                if (numN != null) {
                    this.f32280h = this.f32280h.l(Math.min(numN.intValue(), num.intValue()));
                } else {
                    this.f32280h = this.f32280h.l(num.intValue());
                }
            }
            Integer num2 = di0Var.f32043d;
            if (num2 != null) {
                Integer numO = this.f32280h.o();
                if (numO != null) {
                    this.f32280h = this.f32280h.m(Math.min(numO.intValue(), num2.intValue()));
                } else {
                    this.f32280h = this.f32280h.m(num2.intValue());
                }
            }
        }
        w40 w40Var = v40.f34024a;
        n50 n50Var = this.f32285m;
        a80Var.d(ze0.f34500h);
        a80Var.d(ze0.f34496d);
        w70 w70Var = ze0.f34497e;
        a80Var.d(w70Var);
        byte[] bArrA = i60.a(n50Var);
        if (bArrA.length != 0) {
            a80Var.c(w70Var, bArrA);
        }
        a80Var.d(ze0.f34498f);
        a80Var.d(ze0.f34499g);
        j50 j50VarG = g();
        boolean z15 = j50VarG != null && j50VarG.equals(null);
        za0 za0Var = new za0(this, j50VarG, z15);
        this.f32278f = za0Var;
        if (j50VarG == null || za0Var.d() > 0) {
            af0 af0Var = null;
            tg0 tg0Var = this.f32286n;
            f80 f80Var = this.f32273a;
            f40 f40Var2 = this.f32280h;
            uh0 uh0Var = tg0Var.f33789b;
            if (uh0Var.Q()) {
                di0 di0Var2 = (di0) f40Var2.i(e40Var);
                ml0 ml0Var = di0Var2 == null ? null : di0Var2.f32044e;
                if (di0Var2 != null) {
                    af0Var = di0Var2.f32045f;
                }
                sg0Var = new sg0(tg0Var, f80Var, a80Var, f40Var2, ml0Var, af0Var, g50Var);
            } else {
                s40[] s40VarArrF = ze0.f(f40Var2, a80Var, 0, false, false);
                g50 g50VarB = g50Var.b();
                try {
                    sg0Var = uh0Var.u().g(f80Var, a80Var, f40Var2, s40VarArrF);
                    g50Var.c(g50VarB);
                } catch (Throwable th4) {
                    g50Var.c(g50VarB);
                    throw th4;
                }
            }
            this.f32281i = sg0Var;
        } else {
            s40[] s40VarArrF2 = ze0.f(this.f32280h, a80Var, 0, false, false);
            String str = true != z15 ? "CallOptions" : "Context";
            Long l16 = (Long) this.f32280h.i(s40.f33649a);
            double d15 = this.f32278f.d();
            double d16 = f32272p;
            this.f32281i = new ee0(l90.f32810h.e(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d15 / d16), Double.valueOf(l16 == null ? 0.0d : l16.longValue() / d16))), hb0.PROCESSED, s40VarArrF2);
        }
        if (this.f32275c) {
            this.f32281i.e();
        }
        if (this.f32280h.n() != null) {
            this.f32281i.m(this.f32280h.n().intValue());
        }
        if (this.f32280h.o() != null) {
            this.f32281i.p(this.f32280h.o().intValue());
        }
        if (j50VarG != null) {
            this.f32281i.s(j50VarG);
        }
        this.f32281i.b(w40Var);
        this.f32281i.n(this.f32285m);
        this.f32276d.a();
        this.f32281i.u(new eb0(this, j40Var));
        this.f32278f.a();
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void b(Object obj) {
        int i15 = fr0.f32341a;
        s(obj);
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void c(int i15) {
        int i16 = fr0.f32341a;
        zj.p.x(this.f32281i != null, "Not started");
        zj.p.e(true, "Number requested must be non-negative");
        this.f32281i.a(i15);
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void d() {
        int i15 = fr0.f32341a;
        zj.p.x(this.f32281i != null, "Not started");
        zj.p.x(!this.f32282j, "call was cancelled");
        zj.p.x(!this.f32283k, "call already half-closed");
        this.f32283k = true;
        this.f32281i.h();
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void e(String str, Throwable th4) {
        int i15 = fr0.f32341a;
        if (str == null && th4 == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            f32271o.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th4 = cancellationException;
        }
        if (this.f32282j) {
            return;
        }
        this.f32282j = true;
        try {
            if (this.f32281i != null) {
                l90 l90Var = l90.f32808f;
                l90 l90VarE = str != null ? l90Var.e(str) : l90Var.e("Call cancelled without message");
                if (th4 != null) {
                    l90VarE = l90VarE.d(th4);
                }
                this.f32281i.t(l90VarE);
            }
            if (this.f32278f != null) {
            }
        } finally {
            za0 za0Var = this.f32278f;
            if (za0Var != null) {
                za0Var.b();
            }
        }
    }

    final fb0 f(n50 n50Var) {
        this.f32285m = n50Var;
        return this;
    }

    final /* synthetic */ f80 i() {
        return this.f32273a;
    }

    final /* synthetic */ Executor j() {
        return this.f32274b;
    }

    final /* synthetic */ wa0 k() {
        return this.f32276d;
    }

    final /* synthetic */ g50 l() {
        return this.f32277e;
    }

    final /* synthetic */ za0 m() {
        return this.f32278f;
    }

    final /* synthetic */ f40 n() {
        return this.f32280h;
    }

    final /* synthetic */ gb0 o() {
        return this.f32281i;
    }

    final /* synthetic */ ScheduledExecutorService p() {
        return this.f32284l;
    }

    public final String toString() {
        return zj.j.c(this).d("method", this.f32273a).toString();
    }
}
