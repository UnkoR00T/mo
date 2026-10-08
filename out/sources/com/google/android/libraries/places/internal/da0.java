package com.google.android.libraries.places.internal;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public abstract class da0 extends ha0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final im0 f31990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ib0 f31992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private n50 f31993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Runnable f31995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f31996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f31997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f31998q;

    protected da0(int i15, im0 im0Var, sm0 sm0Var, f40 f40Var) {
        super(i15, im0Var, sm0Var);
        this.f31993l = n50.a();
        this.f31994m = false;
        this.f31990i = (im0) zj.p.r(im0Var, "statsTraceCtx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void C(l90 l90Var, hb0 hb0Var, a80 a80Var) {
        if (this.f31991j) {
            return;
        }
        this.f31991j = true;
        this.f31990i.e(l90Var);
        if (q() != null) {
            q().b(l90Var.j());
        }
        this.f31992k.b(l90Var, hb0Var, a80Var);
    }

    final /* synthetic */ void A(n50 n50Var) {
        zj.p.x(this.f31992k == null, "Already called start");
        this.f31993l = (n50) zj.p.r(n50Var, "decompressorRegistry");
    }

    final /* synthetic */ void B() {
        this.f31996o = true;
    }

    @Override // com.google.android.libraries.places.internal.ii0
    public void c(boolean z15) {
        zj.p.x(this.f31997p, "status should have been reported on deframer closed");
        this.f31994m = true;
        if (this.f31998q && z15) {
            z(l90.f32814l.e("Encountered end-of-stream mid-frame"), hb0.PROCESSED, true, new a80());
        }
        Runnable runnable = this.f31995n;
        if (runnable != null) {
            runnable.run();
            this.f31995n = null;
        }
    }

    @Override // com.google.android.libraries.places.internal.ha0
    protected final /* synthetic */ lm0 i() {
        return this.f31992k;
    }

    public final void u(ib0 ib0Var) {
        zj.p.x(this.f31992k == null, "Already called setListener");
        this.f31992k = (ib0) zj.p.r(ib0Var, "listener");
    }

    protected final boolean v() {
        return this.f31996o;
    }

    protected final void w(a80 a80Var) {
        zj.p.x(!this.f31997p, "Received headers on closed stream");
        this.f31990i.c(a80Var);
        String str = (String) a80Var.b(ze0.f34496d);
        if (str != null) {
            k50 k50VarC = this.f31993l.c(str);
            if (k50VarC == null) {
                f(new p90(l90.f32814l.e(String.format("Can't find decompressor for %s", str)), null));
                return;
            } else if (k50VarC != v40.f34024a) {
                n(k50VarC);
            }
        }
        this.f31992k.d(a80Var);
    }

    protected final void x(sj0 sj0Var) throws Throwable {
        zj.p.r(sj0Var, "frame");
        boolean z15 = true;
        try {
            if (this.f31997p) {
                ea0.f32175g.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                sj0Var.close();
                return;
            } else {
                try {
                    m(sj0Var);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    z15 = false;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
        if (z15) {
            sj0Var.close();
        }
        throw th;
    }

    protected final void y(a80 a80Var, l90 l90Var) {
        zj.p.r(l90Var, "status");
        zj.p.r(a80Var, "trailers");
        if (!this.f31997p) {
            this.f31990i.d(a80Var);
            z(l90Var, hb0.PROCESSED, false, a80Var);
        } else {
            int i15 = ea0.f32176h;
            ea0.f32175g.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{l90Var, a80Var});
        }
    }

    public final void z(l90 l90Var, hb0 hb0Var, boolean z15, a80 a80Var) {
        zj.p.r(l90Var, "status");
        zj.p.r(a80Var, "trailers");
        if (this.f31997p) {
            if (!z15) {
                return;
            } else {
                z15 = true;
            }
        }
        this.f31997p = true;
        this.f31998q = l90Var.j();
        p();
        if (this.f31994m) {
            this.f31995n = null;
            C(l90Var, hb0Var, a80Var);
        } else {
            this.f31995n = new ca0(this, l90Var, hb0Var, a80Var);
            l(z15);
        }
    }
}
