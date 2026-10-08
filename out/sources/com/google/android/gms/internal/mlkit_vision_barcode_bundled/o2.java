package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
final class o2 extends r2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f30181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30183f;

    o2(byte[] bArr, int i15, int i16) {
        super(null);
        int length = bArr.length;
        if (((length - i16) | i16) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i16)));
        }
        this.f30181d = bArr;
        this.f30183f = 0;
        this.f30182e = i16;
    }

    public final void D(byte[] bArr, int i15, int i16) {
        try {
            System.arraycopy(bArr, i15, this.f30181d, this.f30183f, i16);
            this.f30183f += i16;
        } catch (IndexOutOfBoundsException e15) {
            throw new p2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30183f), Integer.valueOf(this.f30182e), Integer.valueOf(i16)), e15);
        }
    }

    public final void E(String str) throws p2 {
        int i15 = this.f30183f;
        try {
            int iA = r2.a(str.length() * 3);
            int iA2 = r2.a(str.length());
            if (iA2 != iA) {
                w(l6.e(str));
                byte[] bArr = this.f30181d;
                int i16 = this.f30183f;
                this.f30183f = l6.d(str, bArr, i16, this.f30182e - i16);
                return;
            }
            int i17 = i15 + iA2;
            this.f30183f = i17;
            int iD = l6.d(str, this.f30181d, i17, this.f30182e - i17);
            this.f30183f = i15;
            w((iD - i15) - iA2);
            this.f30183f = iD;
        } catch (k6 e15) {
            this.f30183f = i15;
            d(str, e15);
        } catch (IndexOutOfBoundsException e16) {
            throw new p2(e16);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final int f() {
        return this.f30182e - this.f30183f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void g(byte b15) throws p2 {
        try {
            byte[] bArr = this.f30181d;
            int i15 = this.f30183f;
            this.f30183f = i15 + 1;
            bArr[i15] = b15;
        } catch (IndexOutOfBoundsException e15) {
            throw new p2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30183f), Integer.valueOf(this.f30182e), 1), e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void h(int i15, boolean z15) throws p2 {
        w(i15 << 3);
        g(z15 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void i(int i15, j2 j2Var) throws p2 {
        w((i15 << 3) | 2);
        w(j2Var.h());
        j2Var.u(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void j(int i15, int i16) throws p2 {
        w((i15 << 3) | 5);
        k(i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void k(int i15) throws p2 {
        try {
            byte[] bArr = this.f30181d;
            int i16 = this.f30183f;
            int i17 = i16 + 1;
            this.f30183f = i17;
            bArr[i16] = (byte) (i15 & GF2Field.MASK);
            int i18 = i16 + 2;
            this.f30183f = i18;
            bArr[i17] = (byte) ((i15 >> 8) & GF2Field.MASK);
            int i19 = i16 + 3;
            this.f30183f = i19;
            bArr[i18] = (byte) ((i15 >> 16) & GF2Field.MASK);
            this.f30183f = i16 + 4;
            bArr[i19] = (byte) ((i15 >> 24) & GF2Field.MASK);
        } catch (IndexOutOfBoundsException e15) {
            throw new p2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30183f), Integer.valueOf(this.f30182e), 1), e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void l(int i15, long j15) throws p2 {
        w((i15 << 3) | 1);
        m(j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void m(long j15) throws p2 {
        try {
            byte[] bArr = this.f30181d;
            int i15 = this.f30183f;
            int i16 = i15 + 1;
            this.f30183f = i16;
            bArr[i15] = (byte) (((int) j15) & GF2Field.MASK);
            int i17 = i15 + 2;
            this.f30183f = i17;
            bArr[i16] = (byte) (((int) (j15 >> 8)) & GF2Field.MASK);
            int i18 = i15 + 3;
            this.f30183f = i18;
            bArr[i17] = (byte) (((int) (j15 >> 16)) & GF2Field.MASK);
            int i19 = i15 + 4;
            this.f30183f = i19;
            bArr[i18] = (byte) (((int) (j15 >> 24)) & GF2Field.MASK);
            int i25 = i15 + 5;
            this.f30183f = i25;
            bArr[i19] = (byte) (((int) (j15 >> 32)) & GF2Field.MASK);
            int i26 = i15 + 6;
            this.f30183f = i26;
            bArr[i25] = (byte) (((int) (j15 >> 40)) & GF2Field.MASK);
            int i27 = i15 + 7;
            this.f30183f = i27;
            bArr[i26] = (byte) (((int) (j15 >> 48)) & GF2Field.MASK);
            this.f30183f = i15 + 8;
            bArr[i27] = (byte) (((int) (j15 >> 56)) & GF2Field.MASK);
        } catch (IndexOutOfBoundsException e15) {
            throw new p2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30183f), Integer.valueOf(this.f30182e), 1), e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void n(int i15, int i16) throws p2 {
        w(i15 << 3);
        o(i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void o(int i15) throws p2 {
        if (i15 >= 0) {
            w(i15);
        } else {
            y(i15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void p(byte[] bArr, int i15, int i16) {
        D(bArr, 0, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    final void q(int i15, r4 r4Var, k5 k5Var) throws p2 {
        w((i15 << 3) | 2);
        w(((t1) r4Var).d(k5Var));
        k5Var.W(r4Var, this.f30224a);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void r(int i15, r4 r4Var) throws p2 {
        w(11);
        v(2, i15);
        w(26);
        w(r4Var.u());
        r4Var.v(this);
        w(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void s(int i15, j2 j2Var) throws p2 {
        w(11);
        v(2, i15);
        i(3, j2Var);
        w(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void t(int i15, String str) throws p2 {
        w((i15 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void u(int i15, int i16) throws p2 {
        w((i15 << 3) | i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void v(int i15, int i16) throws p2 {
        w(i15 << 3);
        w(i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void w(int i15) throws p2 {
        while ((i15 & (-128)) != 0) {
            try {
                byte[] bArr = this.f30181d;
                int i16 = this.f30183f;
                this.f30183f = i16 + 1;
                bArr[i16] = (byte) ((i15 | 128) & GF2Field.MASK);
                i15 >>>= 7;
            } catch (IndexOutOfBoundsException e15) {
                throw new p2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30183f), Integer.valueOf(this.f30182e), 1), e15);
            }
        }
        byte[] bArr2 = this.f30181d;
        int i17 = this.f30183f;
        this.f30183f = i17 + 1;
        bArr2[i17] = (byte) i15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void x(int i15, long j15) throws p2 {
        w(i15 << 3);
        y(j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2
    public final void y(long j15) throws p2 {
        if (!r2.f30223c || this.f30182e - this.f30183f < 10) {
            while ((j15 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f30181d;
                    int i15 = this.f30183f;
                    this.f30183f = i15 + 1;
                    bArr[i15] = (byte) ((((int) j15) | 128) & GF2Field.MASK);
                    j15 >>>= 7;
                } catch (IndexOutOfBoundsException e15) {
                    throw new p2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30183f), Integer.valueOf(this.f30182e), 1), e15);
                }
            }
            byte[] bArr2 = this.f30181d;
            int i16 = this.f30183f;
            this.f30183f = i16 + 1;
            bArr2[i16] = (byte) j15;
            return;
        }
        while (true) {
            int i17 = (int) j15;
            if ((j15 & (-128)) == 0) {
                byte[] bArr3 = this.f30181d;
                int i18 = this.f30183f;
                this.f30183f = i18 + 1;
                f6.s(bArr3, i18, (byte) i17);
                return;
            }
            byte[] bArr4 = this.f30181d;
            int i19 = this.f30183f;
            this.f30183f = i19 + 1;
            f6.s(bArr4, i19, (byte) ((i17 | 128) & GF2Field.MASK));
            j15 >>>= 7;
        }
    }
}
