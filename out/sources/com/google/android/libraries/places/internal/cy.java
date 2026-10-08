package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class cy extends dy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f31940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f31943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final OutputStream f31944h;

    cy(OutputStream outputStream, int i15) {
        super(null);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f31944h = outputStream;
        if (i15 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i15, 20)];
        this.f31940d = bArr;
        this.f31941e = bArr.length;
    }

    private final void K(int i15) throws IOException {
        if (this.f31941e - this.f31942f < i15) {
            L();
        }
    }

    private final void L() throws IOException {
        this.f31944h.write(this.f31940d, 0, this.f31942f);
        this.f31942f = 0;
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void A(long j15) throws IOException {
        K(10);
        G(j15);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void B(long j15) throws IOException {
        K(8);
        I(j15);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void C(String str) throws IOException {
        int iA;
        int length = str.length() * 3;
        int iD = dy.d(length);
        int i15 = iD + length;
        int i16 = this.f31941e;
        if (i15 > i16) {
            byte[] bArr = new byte[length];
            int iB = t10.b(str, bArr, 0, length);
            y(iB);
            J(bArr, 0, iB);
            return;
        }
        if (i15 > i16 - this.f31942f) {
            L();
        }
        int iD2 = dy.d(str.length());
        int i17 = this.f31942f;
        try {
            if (iD2 == iD) {
                int i18 = i17 + iD2;
                this.f31942f = i18;
                int iB2 = t10.b(str, this.f31940d, i18, i16 - i18);
                this.f31942f = i17;
                iA = (iB2 - i17) - iD2;
                F(iA);
                this.f31942f = iB2;
            } else {
                iA = t10.a(str);
                F(iA);
                this.f31942f = t10.b(str, this.f31940d, this.f31942f, iA);
            }
            this.f31943g += iA;
        } catch (ArrayIndexOutOfBoundsException e15) {
            throw new ay(e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void D() throws IOException {
        if (this.f31942f > 0) {
            L();
        }
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final int E() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void F(int i15) {
        if (!dy.f32107b) {
            while ((i15 & (-128)) != 0) {
                byte[] bArr = this.f31940d;
                int i16 = this.f31942f;
                this.f31942f = i16 + 1;
                bArr[i16] = (byte) (i15 | 128);
                this.f31943g++;
                i15 >>>= 7;
            }
            byte[] bArr2 = this.f31940d;
            int i17 = this.f31942f;
            this.f31942f = i17 + 1;
            bArr2[i17] = (byte) i15;
            this.f31943g++;
            return;
        }
        long j15 = this.f31942f;
        while ((i15 & (-128)) != 0) {
            byte[] bArr3 = this.f31940d;
            int i18 = this.f31942f;
            this.f31942f = i18 + 1;
            p10.s(bArr3, i18, (byte) (i15 | 128));
            i15 >>>= 7;
        }
        byte[] bArr4 = this.f31940d;
        int i19 = this.f31942f;
        this.f31942f = i19 + 1;
        p10.s(bArr4, i19, (byte) i15);
        this.f31943g += (int) (((long) this.f31942f) - j15);
    }

    final void G(long j15) {
        if (dy.f32107b) {
            long j16 = this.f31942f;
            while (true) {
                int i15 = (int) j15;
                if ((j15 & (-128)) == 0) {
                    byte[] bArr = this.f31940d;
                    int i16 = this.f31942f;
                    this.f31942f = i16 + 1;
                    p10.s(bArr, i16, (byte) i15);
                    this.f31943g += (int) (((long) this.f31942f) - j16);
                    return;
                }
                byte[] bArr2 = this.f31940d;
                int i17 = this.f31942f;
                this.f31942f = i17 + 1;
                p10.s(bArr2, i17, (byte) (i15 | 128));
                j15 >>>= 7;
            }
        } else {
            while (true) {
                int i18 = (int) j15;
                if ((j15 & (-128)) == 0) {
                    byte[] bArr3 = this.f31940d;
                    int i19 = this.f31942f;
                    this.f31942f = i19 + 1;
                    bArr3[i19] = (byte) i18;
                    this.f31943g++;
                    return;
                }
                byte[] bArr4 = this.f31940d;
                int i25 = this.f31942f;
                this.f31942f = i25 + 1;
                bArr4[i25] = (byte) (i18 | 128);
                this.f31943g++;
                j15 >>>= 7;
            }
        }
    }

    final void H(int i15) {
        int i16 = this.f31942f;
        byte[] bArr = this.f31940d;
        bArr[i16] = (byte) i15;
        bArr[i16 + 1] = (byte) (i15 >> 8);
        bArr[i16 + 2] = (byte) (i15 >> 16);
        bArr[i16 + 3] = (byte) (i15 >> 24);
        this.f31942f = i16 + 4;
        this.f31943g += 4;
    }

    final void I(long j15) {
        int i15 = this.f31942f;
        byte[] bArr = this.f31940d;
        bArr[i15] = (byte) j15;
        bArr[i15 + 1] = (byte) (j15 >> 8);
        bArr[i15 + 2] = (byte) (j15 >> 16);
        bArr[i15 + 3] = (byte) (j15 >> 24);
        bArr[i15 + 4] = (byte) (j15 >> 32);
        bArr[i15 + 5] = (byte) (j15 >> 40);
        bArr[i15 + 6] = (byte) (j15 >> 48);
        bArr[i15 + 7] = (byte) (j15 >> 56);
        this.f31942f = i15 + 8;
        this.f31943g += 8;
    }

    public final void J(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = this.f31941e;
        int i18 = this.f31942f;
        int i19 = i17 - i18;
        if (i19 >= i16) {
            System.arraycopy(bArr, i15, this.f31940d, i18, i16);
            this.f31942f += i16;
            this.f31943g += i16;
            return;
        }
        byte[] bArr2 = this.f31940d;
        System.arraycopy(bArr, i15, bArr2, i18, i19);
        int i25 = i15 + i19;
        this.f31942f = i17;
        this.f31943g += i19;
        L();
        int i26 = i16 - i19;
        if (i26 <= i17) {
            System.arraycopy(bArr, i25, bArr2, 0, i26);
            this.f31942f = i26;
        } else {
            this.f31944h.write(bArr, i25, i26);
        }
        this.f31943g += i26;
    }

    final void M(byte b15) {
        byte[] bArr = this.f31940d;
        int i15 = this.f31942f;
        bArr[i15] = b15;
        this.f31942f = i15 + 1;
        this.f31943g++;
    }

    @Override // com.google.android.libraries.places.internal.mx
    public final void a(byte[] bArr, int i15, int i16) throws IOException {
        J(bArr, i15, i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void i(int i15, int i16) throws IOException {
        y((i15 << 3) | i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void j(int i15, int i16) throws IOException {
        K(20);
        F(i15 << 3);
        if (i16 >= 0) {
            F(i16);
        } else {
            G(i16);
        }
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void k(int i15, int i16) throws IOException {
        K(20);
        F(i15 << 3);
        F(i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void l(int i15, int i16) throws IOException {
        K(14);
        F((i15 << 3) | 5);
        H(i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void m(int i15, long j15) throws IOException {
        K(20);
        F(i15 << 3);
        G(j15);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void n(int i15, long j15) throws IOException {
        K(18);
        F((i15 << 3) | 1);
        I(j15);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void o(int i15, boolean z15) throws IOException {
        K(11);
        F(i15 << 3);
        M(z15 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void p(int i15, String str) throws IOException {
        y((i15 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void q(int i15, tx txVar) throws IOException {
        y((i15 << 3) | 2);
        r(txVar);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void r(tx txVar) throws IOException {
        y(txVar.f());
        txVar.i(this);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void s(byte[] bArr, int i15, int i16) throws IOException {
        y(i16);
        J(bArr, 0, i16);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void t(int i15, g00 g00Var) throws IOException {
        y(11);
        k(2, i15);
        y(26);
        v(g00Var);
        y(12);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void u(int i15, tx txVar) throws IOException {
        y(11);
        k(2, i15);
        q(3, txVar);
        y(12);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void v(g00 g00Var) throws IOException {
        y(g00Var.j());
        g00Var.e(this);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void w(byte b15) throws IOException {
        if (this.f31942f == this.f31941e) {
            L();
        }
        M(b15);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void x(int i15) throws IOException {
        if (i15 >= 0) {
            y(i15);
        } else {
            A(i15);
        }
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void y(int i15) throws IOException {
        K(5);
        F(i15);
    }

    @Override // com.google.android.libraries.places.internal.dy
    public final void z(int i15) throws IOException {
        K(4);
        H(i15);
    }
}
