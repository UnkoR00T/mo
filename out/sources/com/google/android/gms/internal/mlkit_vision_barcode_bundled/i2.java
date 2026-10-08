package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class i2 extends h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final byte[] f29735c;

    i2(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f29735c = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.h2
    final boolean Q(j2 j2Var, int i15, int i16) {
        if (i16 > j2Var.h()) {
            throw new IllegalArgumentException("Length too large: " + i16 + h());
        }
        int i17 = i15 + i16;
        if (i17 > j2Var.h()) {
            throw new IllegalArgumentException("Ran off end of other: " + i15 + ", " + i16 + ", " + j2Var.h());
        }
        if (!(j2Var instanceof i2)) {
            return j2Var.s(i15, i17).equals(s(0, i16));
        }
        i2 i2Var = (i2) j2Var;
        byte[] bArr = this.f29735c;
        byte[] bArr2 = i2Var.f29735c;
        int iR = R() + i16;
        int iR2 = R();
        int iR3 = i2Var.R() + i15;
        while (iR2 < iR) {
            if (bArr[iR2] != bArr2[iR3]) {
                return false;
            }
            iR2++;
            iR3++;
        }
        return true;
    }

    protected int R() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public byte e(int i15) {
        return this.f29735c[i15];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j2) || h() != ((j2) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return obj.equals(this);
        }
        i2 i2Var = (i2) obj;
        int iA = A();
        int iA2 = i2Var.A();
        if (iA == 0 || iA2 == 0 || iA == iA2) {
            return Q(i2Var, 0, h());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    byte f(int i15) {
        return this.f29735c[i15];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public int h() {
        return this.f29735c.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected void i(byte[] bArr, int i15, int i16, int i17) {
        System.arraycopy(this.f29735c, i15, bArr, i16, i17);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final int n(int i15, int i16, int i17) {
        return t3.b(i15, this.f29735c, R() + i16, i17);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final int o(int i15, int i16, int i17) {
        int iR = R() + i16;
        return l6.f(i15, this.f29735c, iR, i17 + iR);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final j2 s(int i15, int i16) {
        int iW = j2.w(i15, i16, h());
        return iW == 0 ? j2.f29738b : new e2(this.f29735c, R() + i15, iW);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final String t(Charset charset) {
        return new String(this.f29735c, R(), h(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    final void u(a2 a2Var) {
        ((o2) a2Var).D(this.f29735c, R(), h());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final boolean v() {
        int iR = R();
        return l6.g(this.f29735c, iR, h() + iR);
    }
}
