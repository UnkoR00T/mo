package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class bs0 extends rr0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient byte[][] f31821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int[] f31822f;

    public bs0(byte[][] bArr, int[] iArr) {
        super(rr0.f33593d.b());
        this.f31821e = bArr;
        this.f31822f = iArr;
    }

    private final rr0 G() {
        return new rr0(t());
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final boolean A(int i15, byte[] bArr, int i16, int i17) {
        int i18;
        if (i15 < 0 || i15 > s() - i17 || i16 < 0 || i16 > bArr.length - i17) {
            return false;
        }
        int i19 = i17 + i15;
        int iA = ks0.a(this, i15);
        while (i15 < i19) {
            if (iA == 0) {
                iA = 0;
                i18 = 0;
            } else {
                i18 = this.f31822f[iA - 1];
            }
            int[] iArr = this.f31822f;
            int i25 = iArr[iA] - i18;
            byte[][] bArr2 = this.f31821e;
            int i26 = iArr[bArr2.length + iA];
            int iMin = Math.min(i19, i25 + i18) - i15;
            if (!jr0.b(bArr2[iA], i26 + (i15 - i18), bArr, i16, iMin)) {
                return false;
            }
            i16 += iMin;
            i15 += iMin;
            iA++;
        }
        return true;
    }

    public final byte[][] D() {
        return this.f31821e;
    }

    public final int[] F() {
        return this.f31822f;
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rr0) {
            rr0 rr0Var = (rr0) obj;
            return rr0Var.s() == s() && y(0, rr0Var, 0, s());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final int hashCode() {
        int iE = e();
        if (iE != 0) {
            return iE;
        }
        byte[][] bArr = this.f31821e;
        int length = bArr.length;
        int i15 = 0;
        int i16 = 1;
        int i17 = 0;
        while (i15 < length) {
            int[] iArr = this.f31822f;
            int i18 = iArr[length + i15];
            int i19 = iArr[i15];
            byte[] bArr2 = bArr[i15];
            int i25 = (i19 - i17) + i18;
            while (i18 < i25) {
                i16 = (i16 * 31) + bArr2[i18];
                i18++;
            }
            i15++;
            i17 = i19;
        }
        g(i16);
        return i16;
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final String o() {
        return G().o();
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final rr0 p() {
        return G().p();
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final byte r(int i15) {
        byte[][] bArr = this.f31821e;
        int length = bArr.length;
        int[] iArr = this.f31822f;
        jr0.a(iArr[length - 1], i15, 1L);
        int iA = ks0.a(this, i15);
        return bArr[iA][(i15 - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[length + iA]];
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final int s() {
        return this.f31822f[this.f31821e.length - 1];
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final byte[] t() {
        byte[] bArr = new byte[s()];
        byte[][] bArr2 = this.f31821e;
        int length = bArr2.length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            int[] iArr = this.f31822f;
            int i18 = iArr[length + i15];
            int i19 = iArr[i15];
            int i25 = i19 - i16;
            pq.n.i(bArr2[i15], bArr, i17, i18, i18 + i25);
            i17 += i25;
            i15++;
            i16 = i19;
        }
        return bArr;
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final String toString() {
        return G().toString();
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final byte[] v() {
        return t();
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final void w(nr0 nr0Var, int i15, int i16) {
        int i17;
        int iA = ks0.a(this, 0);
        int i18 = 0;
        while (i18 < i16) {
            if (iA == 0) {
                iA = 0;
                i17 = 0;
            } else {
                i17 = this.f31822f[iA - 1];
            }
            int[] iArr = this.f31822f;
            int i19 = iArr[iA] - i17;
            byte[][] bArr = this.f31821e;
            int i25 = iArr[bArr.length + iA];
            int iMin = Math.min(i16, i19 + i17) - i18;
            int i26 = i25 + (i18 - i17);
            yr0 yr0Var = new yr0(bArr[iA], i26, i26 + iMin, true, false);
            yr0 yr0Var2 = nr0Var.f33095a;
            if (yr0Var2 == null) {
                yr0Var.f34433g = yr0Var;
                yr0Var.f34432f = yr0Var;
                nr0Var.f33095a = yr0Var;
            } else {
                yr0Var2.f34433g.c(yr0Var);
            }
            i18 += iMin;
            iA++;
        }
        nr0Var.N(nr0Var.K() + ((long) i16));
    }

    @Override // com.google.android.libraries.places.internal.rr0
    public final boolean y(int i15, rr0 rr0Var, int i16, int i17) {
        int i18;
        if (s() - i17 < 0) {
            return false;
        }
        int iA = ks0.a(this, 0);
        int i19 = 0;
        int i25 = 0;
        while (i19 < i17) {
            if (iA == 0) {
                iA = 0;
                i18 = 0;
            } else {
                i18 = this.f31822f[iA - 1];
            }
            int[] iArr = this.f31822f;
            int i26 = iArr[iA] - i18;
            byte[][] bArr = this.f31821e;
            int i27 = iArr[bArr.length + iA];
            int iMin = Math.min(i17, i26 + i18) - i19;
            if (!rr0Var.A(i25, bArr[iA], i27 + (i19 - i18), iMin)) {
                return false;
            }
            i25 += iMin;
            i19 += iMin;
            iA++;
        }
        return true;
    }
}
