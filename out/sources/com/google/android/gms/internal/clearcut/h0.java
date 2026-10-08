package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class h0 extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final byte[] f29349d;

    h0(byte[] bArr) {
        this.f29349d = bArr;
    }

    @Override // com.google.android.gms.internal.clearcut.a0
    protected final int e(int i15, int i16, int i17) {
        return h1.c(i15, this.f29349d, w(), i17);
    }

    @Override // com.google.android.gms.internal.clearcut.a0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0) || size() != ((a0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return obj.equals(this);
        }
        h0 h0Var = (h0) obj;
        int iJ = j();
        int iJ2 = h0Var.j();
        if (iJ == 0 || iJ2 == 0 || iJ == iJ2) {
            return v(h0Var, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.a0
    public final a0 f(int i15, int i16) {
        int iK = a0.k(0, i16, size());
        return iK == 0 ? a0.f29117b : new d0(this.f29349d, w(), iK);
    }

    @Override // com.google.android.gms.internal.clearcut.a0
    protected final String g(Charset charset) {
        return new String(this.f29349d, w(), size(), charset);
    }

    @Override // com.google.android.gms.internal.clearcut.a0
    final void h(z zVar) {
        zVar.a(this.f29349d, w(), size());
    }

    @Override // com.google.android.gms.internal.clearcut.a0
    public final boolean i() {
        int iW = w();
        return d4.i(this.f29349d, iW, size() + iW);
    }

    @Override // com.google.android.gms.internal.clearcut.a0
    public byte s(int i15) {
        return this.f29349d[i15];
    }

    @Override // com.google.android.gms.internal.clearcut.a0
    public int size() {
        return this.f29349d.length;
    }

    @Override // com.google.android.gms.internal.clearcut.g0
    final boolean v(a0 a0Var, int i15, int i16) {
        if (i16 > a0Var.size()) {
            int size = size();
            StringBuilder sb5 = new StringBuilder(40);
            sb5.append("Length too large: ");
            sb5.append(i16);
            sb5.append(size);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (i16 > a0Var.size()) {
            int size2 = a0Var.size();
            StringBuilder sb6 = new StringBuilder(59);
            sb6.append("Ran off end of other: 0, ");
            sb6.append(i16);
            sb6.append(", ");
            sb6.append(size2);
            throw new IllegalArgumentException(sb6.toString());
        }
        if (!(a0Var instanceof h0)) {
            return a0Var.f(0, i16).equals(f(0, i16));
        }
        h0 h0Var = (h0) a0Var;
        byte[] bArr = this.f29349d;
        byte[] bArr2 = h0Var.f29349d;
        int iW = w() + i16;
        int iW2 = w();
        int iW3 = h0Var.w();
        while (iW2 < iW) {
            if (bArr[iW2] != bArr2[iW3]) {
                return false;
            }
            iW2++;
            iW3++;
        }
        return true;
    }

    protected int w() {
        return 0;
    }
}
