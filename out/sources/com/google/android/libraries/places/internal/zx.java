package com.google.android.libraries.places.internal;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class zx extends dy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f34570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f34571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34572f;

    zx(byte[] bArr, int i15, int i16) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i17 = i15 + i16;
        int length = bArr.length;
        if ((i15 | i16 | (length - i17)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i15), Integer.valueOf(i16)));
        }
        this.f34570d = bArr;
        this.f34572f = i15;
        this.f34571e = i17;
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void A(long j15) throws ay {
        int i15;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z15 = dy.f32107b;
        int i16 = this.f34572f;
        if (!z15 || this.f34571e - i16 < 10) {
            while ((j15 & (-128)) != 0) {
                try {
                    int i17 = i16 + 1;
                    try {
                        this.f34570d[i16] = (byte) (((int) j15) | 128);
                        j15 >>>= 7;
                        i16 = i17;
                    } catch (IndexOutOfBoundsException e15) {
                        indexOutOfBoundsException = e15;
                        i16 = i17;
                        throw new ay(i16, this.f34571e, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e16) {
                    indexOutOfBoundsException = e16;
                }
            }
            i15 = i16 + 1;
            try {
                this.f34570d[i16] = (byte) j15;
            } catch (IndexOutOfBoundsException e17) {
                indexOutOfBoundsException = e17;
                i16 = i15;
                throw new ay(i16, this.f34571e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j15 & (-128)) != 0) {
                p10.s(this.f34570d, i16, (byte) (((int) j15) | 128));
                j15 >>>= 7;
                i16++;
            }
            i15 = i16 + 1;
            p10.s(this.f34570d, i16, (byte) j15);
        }
        this.f34572f = i15;
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void B(long j15) throws ay {
        int i15 = this.f34572f;
        try {
            byte[] bArr = this.f34570d;
            bArr[i15] = (byte) j15;
            bArr[i15 + 1] = (byte) (j15 >> 8);
            bArr[i15 + 2] = (byte) (j15 >> 16);
            bArr[i15 + 3] = (byte) (j15 >> 24);
            bArr[i15 + 4] = (byte) (j15 >> 32);
            bArr[i15 + 5] = (byte) (j15 >> 40);
            bArr[i15 + 6] = (byte) (j15 >> 48);
            bArr[i15 + 7] = (byte) (j15 >> 56);
            this.f34572f = i15 + 8;
        } catch (IndexOutOfBoundsException e15) {
            throw new ay(i15, this.f34571e, 8, e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void C(String str) throws ay {
        int i15 = this.f34572f;
        try {
            int iD = dy.d(str.length() * 3);
            int iD2 = dy.d(str.length());
            if (iD2 != iD) {
                y(t10.a(str));
                byte[] bArr = this.f34570d;
                int i16 = this.f34572f;
                this.f34572f = t10.b(str, bArr, i16, bArr.length - i16);
                return;
            }
            int i17 = i15 + iD2;
            this.f34572f = i17;
            byte[] bArr2 = this.f34570d;
            int iB = t10.b(str, bArr2, i17, bArr2.length - i17);
            this.f34572f = i15;
            y((iB - i15) - iD2);
            this.f34572f = iB;
        } catch (IndexOutOfBoundsException e15) {
            throw new ay(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void D() {
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final int E() {
        return this.f34571e - this.f34572f;
    }

    public final void F(byte[] bArr, int i15, int i16) throws ay {
        try {
            System.arraycopy(bArr, i15, this.f34570d, this.f34572f, i16);
            this.f34572f += i16;
        } catch (IndexOutOfBoundsException e15) {
            throw new ay(this.f34572f, this.f34571e, i16, e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.mx
    public final void a(byte[] bArr, int i15, int i16) throws ay {
        F(bArr, i15, i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void i(int i15, int i16) throws ay {
        y((i15 << 3) | i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void j(int i15, int i16) throws ay {
        y(i15 << 3);
        x(i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void k(int i15, int i16) throws ay {
        y(i15 << 3);
        y(i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void l(int i15, int i16) throws ay {
        y((i15 << 3) | 5);
        z(i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void m(int i15, long j15) throws ay {
        y(i15 << 3);
        A(j15);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void n(int i15, long j15) throws ay {
        y((i15 << 3) | 1);
        B(j15);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void o(int i15, boolean z15) throws ay {
        y(i15 << 3);
        w(z15 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void p(int i15, String str) throws ay {
        y((i15 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void q(int i15, tx txVar) throws ay {
        y((i15 << 3) | 2);
        r(txVar);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void r(tx txVar) throws ay {
        y(txVar.f());
        txVar.i(this);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void s(byte[] bArr, int i15, int i16) throws ay {
        y(i16);
        F(bArr, 0, i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void t(int i15, g00 g00Var) throws ay {
        y(11);
        k(2, i15);
        y(26);
        v(g00Var);
        y(12);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void u(int i15, tx txVar) throws ay {
        y(11);
        k(2, i15);
        q(3, txVar);
        y(12);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void v(g00 g00Var) throws ay {
        y(g00Var.j());
        g00Var.e(this);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void w(byte b15) throws ay {
        int i15 = this.f34572f;
        try {
            int i16 = i15 + 1;
            try {
                this.f34570d[i15] = b15;
                this.f34572f = i16;
            } catch (IndexOutOfBoundsException e15) {
                e = e15;
                i15 = i16;
                throw new ay(i15, this.f34571e, 1, e);
            }
        } catch (IndexOutOfBoundsException e16) {
            e = e16;
        }
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void x(int i15) throws ay {
        if (i15 >= 0) {
            y(i15);
        } else {
            A(i15);
        }
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void y(int i15) throws ay {
        int i16;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i17 = this.f34572f;
        while ((i15 & (-128)) != 0) {
            try {
                i16 = i17 + 1;
                try {
                    this.f34570d[i17] = (byte) (i15 | 128);
                    i15 >>>= 7;
                    i17 = i16;
                } catch (IndexOutOfBoundsException e15) {
                    indexOutOfBoundsException = e15;
                    i17 = i16;
                    throw new ay(i17, this.f34571e, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e16) {
                indexOutOfBoundsException = e16;
                throw new ay(i17, this.f34571e, 1, indexOutOfBoundsException);
            }
        }
        i16 = i17 + 1;
        this.f34570d[i17] = (byte) i15;
        this.f34572f = i16;
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void z(int i15) throws ay {
        int i16 = this.f34572f;
        try {
            byte[] bArr = this.f34570d;
            bArr[i16] = (byte) i15;
            bArr[i16 + 1] = (byte) (i15 >> 8);
            bArr[i16 + 2] = (byte) (i15 >> 16);
            bArr[i16 + 3] = (byte) (i15 >> 24);
            this.f34572f = i16 + 4;
        } catch (IndexOutOfBoundsException e15) {
            throw new ay(i16, this.f34571e, 4, e15);
        }
    }
}
