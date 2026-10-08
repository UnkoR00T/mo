package com.google.android.libraries.places.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class ki0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final im0 f32741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f32744e;

    ki0(InputStream inputStream, int i15, im0 im0Var) {
        super(inputStream);
        this.f32744e = -1L;
        this.f32740a = i15;
        this.f32741b = im0Var;
    }

    private final void b() {
        long j15 = this.f32743d;
        long j16 = this.f32742c;
        if (j15 > j16) {
            this.f32741b.l(j15 - j16);
            this.f32742c = this.f32743d;
        }
    }

    private final void zzb() {
        long j15 = this.f32743d;
        int i15 = this.f32740a;
        if (j15 <= i15) {
            return;
        }
        l90 l90Var = l90.f32812j;
        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 47);
        sb5.append("Decompressed gRPC message exceeds maximum size ");
        sb5.append(i15);
        throw new p90(l90Var.e(sb5.toString()), null);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i15) {
        ((FilterInputStream) this).in.mark(i15);
        this.f32744e = this.f32743d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i15 = ((FilterInputStream) this).in.read();
        if (i15 != -1) {
            this.f32743d++;
        }
        zzb();
        b();
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f32744e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f32743d = this.f32744e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j15) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j15);
        this.f32743d += jSkip;
        zzb();
        b();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = ((FilterInputStream) this).in.read(bArr, i15, i16);
        if (i17 != -1) {
            this.f32743d += (long) i17;
        }
        zzb();
        b();
        return i17;
    }
}
