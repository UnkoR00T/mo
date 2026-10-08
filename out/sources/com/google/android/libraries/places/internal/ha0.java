package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ha0 implements ka0, ii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zb0 f32449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f32450b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sm0 f32451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final li0 f32452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f32456h;

    protected ha0(int i15, im0 im0Var, sm0 sm0Var) {
        this.f32451c = (sm0) zj.p.r(sm0Var, "transportTracer");
        li0 li0Var = new li0(this, v40.f34024a, i15, im0Var, sm0Var);
        this.f32452d = li0Var;
        this.f32449a = li0Var;
        this.f32456h = 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean r() {
        boolean z15;
        synchronized (this.f32450b) {
            try {
                z15 = false;
                if (this.f32454f && this.f32453e < this.f32456h && !this.f32455g) {
                    z15 = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    private final void h() {
        boolean zR;
        synchronized (this.f32450b) {
            try {
                zR = r();
                if (!zR) {
                    Logger logger = ia0.f32560a;
                    Level level = Level.FINEST;
                    if (logger.isLoggable(level)) {
                        ia0.f32560a.logp(level, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.f32454f), Integer.valueOf(this.f32453e), Integer.valueOf(this.f32456h), Boolean.valueOf(this.f32455g)});
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (zR) {
            i().c();
        }
    }

    public final void b(int i15) {
        boolean z15;
        synchronized (this.f32450b) {
            zj.p.x(this.f32454f, "onStreamAllocated was not called, but it seems the stream is active");
            int i16 = this.f32453e;
            int i17 = this.f32456h;
            int i18 = i16 - i15;
            this.f32453e = i18;
            z15 = false;
            if (i16 >= i17 && i18 < i17) {
                z15 = true;
            }
        }
        if (z15) {
            h();
        }
    }

    @Override // com.google.android.libraries.places.internal.ii0
    public final void e(km0 km0Var) {
        i().a(km0Var);
    }

    protected abstract lm0 i();

    final void j() {
        li0 li0Var = this.f32452d;
        li0Var.r(this);
        this.f32449a = li0Var;
    }

    final void k(int i15) {
        this.f32449a.b(i15);
    }

    protected final void l(boolean z15) {
        if (z15) {
            this.f32449a.close();
        } else {
            this.f32449a.d();
        }
    }

    protected final void m(sj0 sj0Var) {
        try {
            this.f32449a.h(sj0Var);
        } catch (Throwable th4) {
            f(th4);
        }
    }

    protected final void n(k50 k50Var) {
        this.f32449a.p(k50Var);
    }

    protected final void o() {
        zj.p.w(i() != null);
        synchronized (this.f32450b) {
            zj.p.x(!this.f32454f, "Already allocated");
            this.f32454f = true;
        }
        h();
    }

    protected final void p() {
        synchronized (this.f32450b) {
            this.f32455g = true;
        }
    }

    protected final sm0 q() {
        return this.f32451c;
    }

    final /* synthetic */ void s(int i15) {
        synchronized (this.f32450b) {
            this.f32453e += i15;
        }
    }

    final /* synthetic */ zb0 t() {
        return this.f32449a;
    }
}
