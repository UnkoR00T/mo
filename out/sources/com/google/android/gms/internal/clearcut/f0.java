package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f29312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f29313b;

    private f0(int i15) {
        byte[] bArr = new byte[i15];
        this.f29313b = bArr;
        this.f29312a = m0.S(bArr);
    }

    public final a0 a() {
        if (this.f29312a.u() == 0) {
            return new h0(this.f29313b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final m0 b() {
        return this.f29312a;
    }

    /* synthetic */ f0(int i15, b0 b0Var) {
        this(i15);
    }
}
