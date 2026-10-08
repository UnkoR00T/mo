package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;

/* JADX INFO: loaded from: classes4.dex */
final class uj0 extends fa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f33940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f33941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f33942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f33943d = -1;

    uj0(byte[] bArr, int i15, int i16) {
        zj.p.e(i15 >= 0, "offset must be >= 0");
        zj.p.e(i16 >= 0, "length must be >= 0");
        int i17 = i16 + i15;
        zj.p.e(i17 <= bArr.length, "offset + length exceeds array boundary");
        this.f33942c = (byte[]) zj.p.r(bArr, "bytes");
        this.f33940a = i15;
        this.f33941b = i17;
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final void D(int i15) {
        b(i15);
        this.f33940a += i15;
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final void H3(OutputStream outputStream, int i15) throws IOException {
        b(i15);
        outputStream.write(this.f33942c, this.f33940a, i15);
        this.f33940a += i15;
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final /* bridge */ /* synthetic */ sj0 W2(int i15) {
        b(i15);
        int i16 = this.f33940a;
        this.f33940a = i16 + i15;
        return new uj0(this.f33942c, i16, i15);
    }

    @Override // com.google.android.libraries.places.internal.fa0, com.google.android.libraries.places.internal.sj0
    public final void a() {
        int i15 = this.f33943d;
        if (i15 == -1) {
            throw new InvalidMarkException();
        }
        this.f33940a = i15;
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final int f() {
        return this.f33941b - this.f33940a;
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final int i() {
        b(1);
        int i15 = this.f33940a;
        this.f33940a = i15 + 1;
        return this.f33942c[i15] & 255;
    }

    @Override // com.google.android.libraries.places.internal.sj0
    public final void t3(byte[] bArr, int i15, int i16) {
        System.arraycopy(this.f33942c, this.f33940a, bArr, i15, i16);
        this.f33940a += i16;
    }

    @Override // com.google.android.libraries.places.internal.fa0, com.google.android.libraries.places.internal.sj0
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.fa0, com.google.android.libraries.places.internal.sj0
    public final void zzb() {
        this.f33943d = this.f33940a;
    }
}
