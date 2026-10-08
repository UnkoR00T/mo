package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class p1 extends m1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final byte[] f31221e;

    p1(byte[] bArr) {
        bArr.getClass();
        this.f31221e = bArr;
    }

    @Override // com.google.android.gms.internal.vision.m1
    final boolean B(e1 e1Var, int i15, int i16) {
        if (i16 > e1Var.f()) {
            int iF = f();
            StringBuilder sb5 = new StringBuilder(40);
            sb5.append("Length too large: ");
            sb5.append(i16);
            sb5.append(iF);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (i16 > e1Var.f()) {
            int iF2 = e1Var.f();
            StringBuilder sb6 = new StringBuilder(59);
            sb6.append("Ran off end of other: 0, ");
            sb6.append(i16);
            sb6.append(", ");
            sb6.append(iF2);
            throw new IllegalArgumentException(sb6.toString());
        }
        if (!(e1Var instanceof p1)) {
            return e1Var.i(0, i16).equals(i(0, i16));
        }
        p1 p1Var = (p1) e1Var;
        byte[] bArr = this.f31221e;
        byte[] bArr2 = p1Var.f31221e;
        int iC = C() + i16;
        int iC2 = C();
        int iC3 = p1Var.C();
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    protected int C() {
        return 0;
    }

    @Override // com.google.android.gms.internal.vision.e1
    public final boolean a() {
        int iC = C();
        return l5.g(this.f31221e, iC, f() + iC);
    }

    @Override // com.google.android.gms.internal.vision.e1
    public byte e(int i15) {
        return this.f31221e[i15];
    }

    @Override // com.google.android.gms.internal.vision.e1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1) || f() != ((e1) obj).f()) {
            return false;
        }
        if (f() == 0) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return obj.equals(this);
        }
        p1 p1Var = (p1) obj;
        int iA = A();
        int iA2 = p1Var.A();
        if (iA == 0 || iA2 == 0 || iA == iA2) {
            return B(p1Var, 0, f());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.e1
    public int f() {
        return this.f31221e.length;
    }

    @Override // com.google.android.gms.internal.vision.e1
    protected final int h(int i15, int i16, int i17) {
        return p2.a(i15, this.f31221e, C(), i17);
    }

    @Override // com.google.android.gms.internal.vision.e1
    public final e1 i(int i15, int i16) {
        int iU = e1.u(0, i16, f());
        return iU == 0 ? e1.f30998b : new h1(this.f31221e, C(), iU);
    }

    @Override // com.google.android.gms.internal.vision.e1
    protected final String n(Charset charset) {
        return new String(this.f31221e, C(), f(), charset);
    }

    @Override // com.google.android.gms.internal.vision.e1
    final void o(b1 b1Var) {
        b1Var.a(this.f31221e, C(), f());
    }

    @Override // com.google.android.gms.internal.vision.e1
    byte s(int i15) {
        return this.f31221e[i15];
    }
}
