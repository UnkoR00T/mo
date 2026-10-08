package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1 f31196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f31197b;

    private n1(int i15) {
        byte[] bArr = new byte[i15];
        this.f31197b = bArr;
        this.f31196a = t1.f(bArr);
    }

    public final e1 a() {
        this.f31196a.N();
        return new p1(this.f31197b);
    }

    public final t1 b() {
        return this.f31196a;
    }

    /* synthetic */ n1(int i15, d1 d1Var) {
        this(i15);
    }
}
