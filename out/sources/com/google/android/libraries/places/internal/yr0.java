package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class yr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f34427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yr0 f34432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yr0 f34433g;

    public yr0() {
        this.f34427a = new byte[PKIFailureInfo.certRevoked];
        this.f34431e = true;
        this.f34430d = false;
    }

    public final yr0 a() {
        this.f34430d = true;
        return new yr0(this.f34427a, this.f34428b, this.f34429c, true, false);
    }

    public final yr0 b() {
        yr0 yr0Var = this.f34432f;
        yr0 yr0Var2 = yr0Var == this ? null : yr0Var;
        yr0 yr0Var3 = this.f34433g;
        yr0Var3.f34432f = yr0Var;
        this.f34432f.f34433g = yr0Var3;
        this.f34432f = null;
        this.f34433g = null;
        return yr0Var2;
    }

    public final yr0 c(yr0 yr0Var) {
        yr0Var.f34433g = this;
        yr0Var.f34432f = this.f34432f;
        this.f34432f.f34433g = yr0Var;
        this.f34432f = yr0Var;
        return yr0Var;
    }

    public final yr0 d(int i15) {
        yr0 yr0VarA;
        if (i15 > this.f34429c - this.f34428b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i15 >= 1024) {
            yr0VarA = a();
        } else {
            byte[] bArr = this.f34427a;
            yr0VarA = as0.a();
            byte[] bArr2 = yr0VarA.f34427a;
            int i16 = this.f34428b;
            pq.n.o(bArr, bArr2, 0, i16, i16 + i15, 2, null);
        }
        yr0VarA.f34429c = yr0VarA.f34428b + i15;
        this.f34428b += i15;
        this.f34433g.c(yr0VarA);
        return yr0VarA;
    }

    public final void e(yr0 yr0Var, int i15) {
        if (!yr0Var.f34431e) {
            throw new IllegalStateException("only owner can write");
        }
        int i16 = yr0Var.f34429c;
        int i17 = i16 + i15;
        if (i17 > 8192) {
            if (yr0Var.f34430d) {
                throw new IllegalArgumentException();
            }
            int i18 = yr0Var.f34428b;
            if (i17 - i18 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = yr0Var.f34427a;
            pq.n.o(bArr, bArr, 0, i18, i16, 2, null);
            i16 = yr0Var.f34429c - yr0Var.f34428b;
            yr0Var.f34429c = i16;
            yr0Var.f34428b = 0;
        }
        byte[] bArr2 = this.f34427a;
        byte[] bArr3 = yr0Var.f34427a;
        int i19 = this.f34428b;
        pq.n.i(bArr2, bArr3, i16, i19, i19 + i15);
        yr0Var.f34429c += i15;
        this.f34428b += i15;
    }

    public yr0(byte[] bArr, int i15, int i16, boolean z15, boolean z16) {
        this.f34427a = bArr;
        this.f34428b = i15;
        this.f34429c = i16;
        this.f34430d = z15;
        this.f34431e = false;
    }
}
