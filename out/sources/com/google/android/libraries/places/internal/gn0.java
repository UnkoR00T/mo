package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes4.dex */
final class gn0 implements lp0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f32400d = Logger.getLogger(ao0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fn0 f32401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lp0 f32402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eo0 f32403c = new eo0(Level.FINE, ao0.class);

    gn0(fn0 fn0Var, lp0 lp0Var) {
        this.f32401a = (fn0) zj.p.r(fn0Var, "transportExceptionHandler");
        this.f32402b = (lp0) zj.p.r(lp0Var, "frameWriter");
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void A1(boolean z15, int i15, int i16) {
        long j15 = (((long) i15) << 32) | (((long) i16) & BodyPartID.bodyIdMax);
        if (z15) {
            this.f32403c.g(2, j15);
        } else {
            this.f32403c.f(2, j15);
        }
        try {
            this.f32402b.A1(z15, i15, i16);
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void G2(int i15, long j15) {
        this.f32403c.j(2, i15, j15);
        try {
            this.f32402b.G2(i15, j15);
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void J2(xp0 xp0Var) {
        this.f32403c.d(2);
        try {
            this.f32402b.J2(xp0Var);
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void K0(xp0 xp0Var) {
        this.f32403c.e(2, xp0Var);
        try {
            this.f32402b.K0(xp0Var);
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void S(int i15, ip0 ip0Var) {
        this.f32403c.c(2, i15, ip0Var);
        try {
            this.f32402b.S(i15, ip0Var);
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void V3(boolean z15, int i15, nr0 nr0Var, int i16) {
        this.f32403c.a(2, i15, nr0Var, i16, z15);
        try {
            this.f32402b.V3(z15, i15, nr0Var, i16);
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void c() {
        try {
            this.f32402b.c();
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f32402b.close();
        } catch (IOException e15) {
            f32400d.logp(e15.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void d() {
        try {
            this.f32402b.d();
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final int i() {
        return this.f32402b.i();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void l1(boolean z15, boolean z16, int i15, int i16, List list) {
        try {
            this.f32402b.l1(false, false, i15, 0, list);
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void m2(int i15, ip0 ip0Var, byte[] bArr) {
        rr0 rr0Var = rr0.f33593d;
        this.f32403c.i(2, 0, ip0Var, qr0.b(bArr));
        try {
            lp0 lp0Var = this.f32402b;
            lp0Var.m2(0, ip0Var, bArr);
            lp0Var.d();
        } catch (IOException e15) {
            this.f32401a.h(e15);
        }
    }
}
