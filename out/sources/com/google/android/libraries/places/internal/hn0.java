package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class hn0 implements lp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lp0 f32503a;

    public hn0(lp0 lp0Var) {
        this.f32503a = (lp0) zj.p.r(lp0Var, "delegate");
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public void A1(boolean z15, int i15, int i16) {
        this.f32503a.A1(z15, i15, i16);
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void G2(int i15, long j15) {
        this.f32503a.G2(i15, j15);
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public void J2(xp0 xp0Var) {
        this.f32503a.J2(xp0Var);
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void K0(xp0 xp0Var) {
        this.f32503a.K0(xp0Var);
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public void S(int i15, ip0 ip0Var) {
        this.f32503a.S(i15, ip0Var);
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void V3(boolean z15, int i15, nr0 nr0Var, int i16) {
        this.f32503a.V3(z15, i15, nr0Var, i16);
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void c() {
        this.f32503a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32503a.close();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void d() {
        this.f32503a.d();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final int i() {
        return this.f32503a.i();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void l1(boolean z15, boolean z16, int i15, int i16, List list) {
        this.f32503a.l1(false, false, i15, 0, list);
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final void m2(int i15, ip0 ip0Var, byte[] bArr) {
        this.f32503a.m2(0, ip0Var, bArr);
    }
}
