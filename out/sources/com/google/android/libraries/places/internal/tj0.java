package com.google.android.libraries.places.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class tj0 extends InputStream implements t60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sj0 f33796a;

    public tj0(sj0 sj0Var) {
        this.f33796a = (sj0) zj.p.r(sj0Var, "buffer");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f33796a.f();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33796a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i15) {
        this.f33796a.zzb();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f33796a.zza();
    }

    @Override // java.io.InputStream
    public final int read() {
        sj0 sj0Var = this.f33796a;
        if (sj0Var.f() == 0) {
            return -1;
        }
        return sj0Var.i();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f33796a.a();
    }

    @Override // java.io.InputStream
    public final long skip(long j15) {
        sj0 sj0Var = this.f33796a;
        int iMin = (int) Math.min(sj0Var.f(), j15);
        sj0Var.D(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i15, int i16) {
        sj0 sj0Var = this.f33796a;
        if (sj0Var.f() == 0) {
            return -1;
        }
        int iMin = Math.min(sj0Var.f(), i16);
        sj0Var.t3(bArr, i15, iMin);
        return iMin;
    }
}
