package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
final class dv extends gv {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f30401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30403f;

    dv(byte[] bArr, int i15, int i16) {
        super(null);
        int length = bArr.length;
        if (((length - i16) | i16) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i16)));
        }
        this.f30401d = bArr;
        this.f30403f = 0;
        this.f30402e = i16;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void A(String str) throws ev {
        int i15 = this.f30403f;
        try {
            int iD = gv.d(str.length() * 3);
            int iD2 = gv.d(str.length());
            if (iD2 != iD) {
                D(uy.c(str));
                byte[] bArr = this.f30401d;
                int i16 = this.f30403f;
                this.f30403f = uy.b(str, bArr, i16, this.f30402e - i16);
                return;
            }
            int i17 = i15 + iD2;
            this.f30403f = i17;
            int iB = uy.b(str, this.f30401d, i17, this.f30402e - i17);
            this.f30403f = i15;
            D((iB - i15) - iD2);
            this.f30403f = iB;
        } catch (ty e15) {
            this.f30403f = i15;
            g(str, e15);
        } catch (IndexOutOfBoundsException e16) {
            throw new ev(e16);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void B(int i15, int i16) throws ev {
        D((i15 << 3) | i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void C(int i15, int i16) throws ev {
        D(i15 << 3);
        D(i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void D(int i15) throws ev {
        while ((i15 & (-128)) != 0) {
            try {
                byte[] bArr = this.f30401d;
                int i16 = this.f30403f;
                this.f30403f = i16 + 1;
                bArr[i16] = (byte) ((i15 | 128) & GF2Field.MASK);
                i15 >>>= 7;
            } catch (IndexOutOfBoundsException e15) {
                throw new ev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30403f), Integer.valueOf(this.f30402e), 1), e15);
            }
        }
        byte[] bArr2 = this.f30401d;
        int i17 = this.f30403f;
        this.f30403f = i17 + 1;
        bArr2[i17] = (byte) i15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void E(int i15, long j15) throws ev {
        D(i15 << 3);
        F(j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void F(long j15) throws ev {
        if (!gv.f30434c || this.f30402e - this.f30403f < 10) {
            while ((j15 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f30401d;
                    int i15 = this.f30403f;
                    this.f30403f = i15 + 1;
                    bArr[i15] = (byte) ((((int) j15) | 128) & GF2Field.MASK);
                    j15 >>>= 7;
                } catch (IndexOutOfBoundsException e15) {
                    throw new ev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30403f), Integer.valueOf(this.f30402e), 1), e15);
                }
            }
            byte[] bArr2 = this.f30401d;
            int i16 = this.f30403f;
            this.f30403f = i16 + 1;
            bArr2[i16] = (byte) j15;
            return;
        }
        while (true) {
            int i17 = (int) j15;
            if ((j15 & (-128)) == 0) {
                byte[] bArr3 = this.f30401d;
                int i18 = this.f30403f;
                this.f30403f = i18 + 1;
                ry.s(bArr3, i18, (byte) i17);
                return;
            }
            byte[] bArr4 = this.f30401d;
            int i19 = this.f30403f;
            this.f30403f = i19 + 1;
            ry.s(bArr4, i19, (byte) ((i17 | 128) & GF2Field.MASK));
            j15 >>>= 7;
        }
    }

    public final void H(byte[] bArr, int i15, int i16) {
        try {
            System.arraycopy(bArr, 0, this.f30401d, this.f30403f, i16);
            this.f30403f += i16;
        } catch (IndexOutOfBoundsException e15) {
            throw new ev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30403f), Integer.valueOf(this.f30402e), Integer.valueOf(i16)), e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final int i() {
        return this.f30402e - this.f30403f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void j(byte b15) throws ev {
        try {
            byte[] bArr = this.f30401d;
            int i15 = this.f30403f;
            this.f30403f = i15 + 1;
            bArr[i15] = b15;
        } catch (IndexOutOfBoundsException e15) {
            throw new ev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30403f), Integer.valueOf(this.f30402e), 1), e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void k(int i15, boolean z15) throws ev {
        D(i15 << 3);
        j(z15 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void l(byte[] bArr, int i15, int i16) throws ev {
        D(i16);
        H(bArr, 0, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void m(int i15, yu yuVar) throws ev {
        D((i15 << 3) | 2);
        n(yuVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void n(yu yuVar) throws ev {
        D(yuVar.g());
        yuVar.j(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void o(int i15, int i16) throws ev {
        D((i15 << 3) | 5);
        p(i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void p(int i15) throws ev {
        try {
            byte[] bArr = this.f30401d;
            int i16 = this.f30403f;
            int i17 = i16 + 1;
            this.f30403f = i17;
            bArr[i16] = (byte) (i15 & GF2Field.MASK);
            int i18 = i16 + 2;
            this.f30403f = i18;
            bArr[i17] = (byte) ((i15 >> 8) & GF2Field.MASK);
            int i19 = i16 + 3;
            this.f30403f = i19;
            bArr[i18] = (byte) ((i15 >> 16) & GF2Field.MASK);
            this.f30403f = i16 + 4;
            bArr[i19] = (byte) ((i15 >> 24) & GF2Field.MASK);
        } catch (IndexOutOfBoundsException e15) {
            throw new ev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30403f), Integer.valueOf(this.f30402e), 1), e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void q(int i15, long j15) throws ev {
        D((i15 << 3) | 1);
        r(j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void r(long j15) throws ev {
        try {
            byte[] bArr = this.f30401d;
            int i15 = this.f30403f;
            int i16 = i15 + 1;
            this.f30403f = i16;
            bArr[i15] = (byte) (((int) j15) & GF2Field.MASK);
            int i17 = i15 + 2;
            this.f30403f = i17;
            bArr[i16] = (byte) (((int) (j15 >> 8)) & GF2Field.MASK);
            int i18 = i15 + 3;
            this.f30403f = i18;
            bArr[i17] = (byte) (((int) (j15 >> 16)) & GF2Field.MASK);
            int i19 = i15 + 4;
            this.f30403f = i19;
            bArr[i18] = (byte) (((int) (j15 >> 24)) & GF2Field.MASK);
            int i25 = i15 + 5;
            this.f30403f = i25;
            bArr[i19] = (byte) (((int) (j15 >> 32)) & GF2Field.MASK);
            int i26 = i15 + 6;
            this.f30403f = i26;
            bArr[i25] = (byte) (((int) (j15 >> 40)) & GF2Field.MASK);
            int i27 = i15 + 7;
            this.f30403f = i27;
            bArr[i26] = (byte) (((int) (j15 >> 48)) & GF2Field.MASK);
            this.f30403f = i15 + 8;
            bArr[i27] = (byte) (((int) (j15 >> 56)) & GF2Field.MASK);
        } catch (IndexOutOfBoundsException e15) {
            throw new ev(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30403f), Integer.valueOf(this.f30402e), 1), e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void s(int i15, int i16) throws ev {
        D(i15 << 3);
        t(i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void t(int i15) throws ev {
        if (i15 >= 0) {
            D(i15);
        } else {
            F(i15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void u(byte[] bArr, int i15, int i16) {
        H(bArr, 0, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    final void v(int i15, jx jxVar, ux uxVar) throws ev {
        D((i15 << 3) | 2);
        D(((eu) jxVar).a(uxVar));
        uxVar.c(jxVar, this.f30435a);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void w(jx jxVar) throws ev {
        D(jxVar.b());
        jxVar.j(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void x(int i15, jx jxVar) throws ev {
        D(11);
        C(2, i15);
        D(26);
        w(jxVar);
        D(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void y(int i15, yu yuVar) throws ev {
        D(11);
        C(2, i15);
        m(3, yuVar);
        D(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.gv
    public final void z(int i15, String str) throws ev {
        D((i15 << 3) | 2);
        A(str);
    }
}
