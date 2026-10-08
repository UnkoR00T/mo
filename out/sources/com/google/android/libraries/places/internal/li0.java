package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class li0 implements Closeable, zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ii0 f32833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final im0 f32835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sm0 f32836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k50 f32837e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private tb0 f32840h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f32842k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32845n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f32848r = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32838f = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private tb0 f32841j = new tb0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f32843l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32844m = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f32846p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f32847q = false;

    public li0(ii0 ii0Var, k50 k50Var, int i15, im0 im0Var, sm0 sm0Var) {
        this.f32833a = (ii0) zj.p.r(ii0Var, "sink");
        this.f32837e = (k50) zj.p.r(k50Var, "decompressor");
        this.f32834b = i15;
        this.f32835c = (im0) zj.p.r(im0Var, "statsTraceCtx");
        this.f32836d = (sm0) zj.p.r(sm0Var, "transportTracer");
    }

    private final void C() {
        int i15;
        InputStream tj0Var;
        if (this.f32843l) {
            return;
        }
        this.f32843l = true;
        loop0: while (this.f32842k > 0) {
            try {
                try {
                    if (this.f32840h == null) {
                        this.f32840h = new tb0();
                    }
                    i15 = 0;
                    while (true) {
                        try {
                            int iF = this.f32838f - this.f32840h.f();
                            if (iF > 0) {
                                if (this.f32841j.f() == 0) {
                                    if (i15 <= 0) {
                                        break loop0;
                                    }
                                    this.f32833a.a(i15);
                                    if (this.f32848r != 2) {
                                        break loop0;
                                    }
                                    this.f32835c.m(i15);
                                    this.f32845n += i15;
                                    break loop0;
                                }
                                int iMin = Math.min(iF, this.f32841j.f());
                                i15 += iMin;
                                this.f32840h.h(this.f32841j.W2(iMin));
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (i15 > 0) {
                                this.f32833a.a(i15);
                                if (this.f32848r == 2) {
                                    this.f32835c.m(i15);
                                    this.f32845n += i15;
                                }
                            }
                            throw th;
                        }
                    }
                    if (i15 > 0) {
                        this.f32833a.a(i15);
                        if (this.f32848r == 2) {
                            this.f32835c.m(i15);
                            this.f32845n += i15;
                        }
                    }
                    int i16 = this.f32848r;
                    int i17 = i16 - 1;
                    if (i16 == 0) {
                        throw null;
                    }
                    if (i17 == 0) {
                        int i18 = this.f32840h.i();
                        if ((i18 & 254) != 0) {
                            throw new p90(l90.f32814l.e("gRPC frame header malformed: reserved bits not zero"), null);
                        }
                        this.f32839g = 1 == (i18 & 1);
                        tb0 tb0Var = this.f32840h;
                        tb0Var.b(4);
                        int i19 = tb0Var.i() | (tb0Var.i() << 24) | (tb0Var.i() << 16) | (tb0Var.i() << 8);
                        this.f32838f = i19;
                        if (i19 < 0 || i19 > this.f32834b) {
                            throw new p90(l90.f32812j.e(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f32834b), Integer.valueOf(this.f32838f))), null);
                        }
                        int i25 = this.f32844m + 1;
                        this.f32844m = i25;
                        this.f32835c.g(i25);
                        this.f32836d.d();
                        this.f32848r = 2;
                    } else {
                        if (i17 != 1) {
                            String str = i16 != 1 ? "BODY" : "HEADER";
                            StringBuilder sb5 = new StringBuilder(str.length() + 15);
                            sb5.append("Invalid state: ");
                            sb5.append(str);
                            throw new AssertionError(sb5.toString());
                        }
                        im0 im0Var = this.f32835c;
                        int i26 = this.f32844m;
                        long j15 = this.f32845n;
                        im0Var.i(i26, j15, true != this.f32839g ? j15 : -1L);
                        this.f32845n = 0;
                        if (this.f32839g) {
                            k50 k50Var = this.f32837e;
                            if (k50Var == v40.f34024a) {
                                throw new p90(l90.f32814l.e("Can't decode compressed gRPC message as compression not configured"), null);
                            }
                            try {
                                tb0 tb0Var2 = this.f32840h;
                                int i27 = vj0.f34068b;
                                tj0Var = new ki0(k50Var.b(new tj0(tb0Var2)), this.f32834b, im0Var);
                            } catch (IOException e15) {
                                throw new RuntimeException(e15);
                            }
                        } else {
                            im0Var.l(this.f32840h.f());
                            tb0 tb0Var3 = this.f32840h;
                            int i28 = vj0.f34068b;
                            tj0Var = new tj0(tb0Var3);
                        }
                        this.f32840h = null;
                        this.f32833a.e(new ji0(tj0Var, null));
                        this.f32848r = 1;
                        this.f32838f = 5;
                        this.f32842k--;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    i15 = 0;
                }
            } catch (Throwable th6) {
                this.f32843l = false;
                throw th6;
            }
        }
        if (this.f32846p && y()) {
            close();
        }
        this.f32843l = false;
    }

    private final boolean y() {
        return this.f32841j.f() == 0;
    }

    @Override // com.google.android.libraries.places.internal.zb0
    public final void b(int i15) {
        this.f32834b = i15;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zb0
    public final void close() {
        if (u()) {
            return;
        }
        tb0 tb0Var = this.f32840h;
        boolean z15 = false;
        if (tb0Var != null && tb0Var.f() > 0) {
            z15 = true;
        }
        try {
            tb0 tb0Var2 = this.f32841j;
            if (tb0Var2 != null) {
                tb0Var2.close();
            }
            tb0 tb0Var3 = this.f32840h;
            if (tb0Var3 != null) {
                tb0Var3.close();
            }
            this.f32841j = null;
            this.f32840h = null;
            this.f32833a.c(z15);
        } catch (Throwable th4) {
            this.f32841j = null;
            this.f32840h = null;
            throw th4;
        }
    }

    @Override // com.google.android.libraries.places.internal.zb0
    public final void d() {
        if (u()) {
            return;
        }
        if (y()) {
            close();
        } else {
            this.f32846p = true;
        }
    }

    @Override // com.google.android.libraries.places.internal.zb0
    public final void h(sj0 sj0Var) throws Throwable {
        zj.p.r(sj0Var, "data");
        boolean z15 = true;
        try {
            if (u() || this.f32846p) {
                sj0Var.close();
                return;
            }
            this.f32841j.h(sj0Var);
            try {
                C();
                return;
            } catch (Throwable th4) {
                th = th4;
                z15 = false;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        if (z15) {
            sj0Var.close();
        }
        throw th;
    }

    @Override // com.google.android.libraries.places.internal.zb0
    public final void m(int i15) {
        zj.p.e(true, "numMessages must be > 0");
        if (u()) {
            return;
        }
        this.f32842k += (long) i15;
        C();
    }

    @Override // com.google.android.libraries.places.internal.zb0
    public final void p(k50 k50Var) {
        zj.p.x(true, "Already set full stream decompressor");
        this.f32837e = (k50) zj.p.r(k50Var, "Can't pass an empty decompressor");
    }

    final void r(ii0 ii0Var) {
        this.f32833a = ii0Var;
    }

    public final boolean u() {
        return this.f32841j == null;
    }
}
