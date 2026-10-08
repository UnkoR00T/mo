package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t1 extends b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f31257b = Logger.getLogger(t1.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f31258c = i5.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    v1 f31259a;

    private static class a extends t1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f31260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f31261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f31262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f31263g;

        a(byte[] bArr, int i15, int i16) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i16) | i16) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i16)));
            }
            this.f31260d = bArr;
            this.f31261e = 0;
            this.f31263g = 0;
            this.f31262f = i16;
        }

        private final void F0(byte[] bArr, int i15, int i16) throws b {
            try {
                System.arraycopy(bArr, i15, this.f31260d, this.f31263g, i16);
                this.f31263g += i16;
            } catch (IndexOutOfBoundsException e15) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31263g), Integer.valueOf(this.f31262f), Integer.valueOf(i16)), e15);
            }
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void O(int i15) throws b {
            if (!t1.f31258c || w0.b() || b() < 5) {
                while ((i15 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f31260d;
                        int i16 = this.f31263g;
                        this.f31263g = i16 + 1;
                        bArr[i16] = (byte) ((i15 & CertificateBody.profileType) | 128);
                        i15 >>>= 7;
                    } catch (IndexOutOfBoundsException e15) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31263g), Integer.valueOf(this.f31262f), 1), e15);
                    }
                }
                byte[] bArr2 = this.f31260d;
                int i17 = this.f31263g;
                this.f31263g = i17 + 1;
                bArr2[i17] = (byte) i15;
                return;
            }
            if ((i15 & (-128)) == 0) {
                byte[] bArr3 = this.f31260d;
                int i18 = this.f31263g;
                this.f31263g = i18 + 1;
                i5.l(bArr3, i18, (byte) i15);
                return;
            }
            byte[] bArr4 = this.f31260d;
            int i19 = this.f31263g;
            this.f31263g = i19 + 1;
            i5.l(bArr4, i19, (byte) (i15 | 128));
            int i25 = i15 >>> 7;
            if ((i25 & (-128)) == 0) {
                byte[] bArr5 = this.f31260d;
                int i26 = this.f31263g;
                this.f31263g = i26 + 1;
                i5.l(bArr5, i26, (byte) i25);
                return;
            }
            byte[] bArr6 = this.f31260d;
            int i27 = this.f31263g;
            this.f31263g = i27 + 1;
            i5.l(bArr6, i27, (byte) (i25 | 128));
            int i28 = i15 >>> 14;
            if ((i28 & (-128)) == 0) {
                byte[] bArr7 = this.f31260d;
                int i29 = this.f31263g;
                this.f31263g = i29 + 1;
                i5.l(bArr7, i29, (byte) i28);
                return;
            }
            byte[] bArr8 = this.f31260d;
            int i35 = this.f31263g;
            this.f31263g = i35 + 1;
            i5.l(bArr8, i35, (byte) (i28 | 128));
            int i36 = i15 >>> 21;
            if ((i36 & (-128)) == 0) {
                byte[] bArr9 = this.f31260d;
                int i37 = this.f31263g;
                this.f31263g = i37 + 1;
                i5.l(bArr9, i37, (byte) i36);
                return;
            }
            byte[] bArr10 = this.f31260d;
            int i38 = this.f31263g;
            this.f31263g = i38 + 1;
            i5.l(bArr10, i38, (byte) (i36 | 128));
            byte[] bArr11 = this.f31260d;
            int i39 = this.f31263g;
            this.f31263g = i39 + 1;
            i5.l(bArr11, i39, (byte) (i15 >>> 28));
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void P(int i15, int i16) {
            m(i15, 0);
            j(i16);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void R(int i15, e1 e1Var) {
            m(1, 3);
            X(2, i15);
            o(3, e1Var);
            m(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void X(int i15, int i16) {
            m(i15, 0);
            O(i16);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void Y(int i15, long j15) {
            m(i15, 1);
            Z(j15);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void Z(long j15) throws b {
            try {
                byte[] bArr = this.f31260d;
                int i15 = this.f31263g;
                int i16 = i15 + 1;
                this.f31263g = i16;
                bArr[i15] = (byte) j15;
                int i17 = i15 + 2;
                this.f31263g = i17;
                bArr[i16] = (byte) (j15 >> 8);
                int i18 = i15 + 3;
                this.f31263g = i18;
                bArr[i17] = (byte) (j15 >> 16);
                int i19 = i15 + 4;
                this.f31263g = i19;
                bArr[i18] = (byte) (j15 >> 24);
                int i25 = i15 + 5;
                this.f31263g = i25;
                bArr[i19] = (byte) (j15 >> 32);
                int i26 = i15 + 6;
                this.f31263g = i26;
                bArr[i25] = (byte) (j15 >> 40);
                int i27 = i15 + 7;
                this.f31263g = i27;
                bArr[i26] = (byte) (j15 >> 48);
                this.f31263g = i15 + 8;
                bArr[i27] = (byte) (j15 >> 56);
            } catch (IndexOutOfBoundsException e15) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31263g), Integer.valueOf(this.f31262f), 1), e15);
            }
        }

        @Override // com.google.android.gms.internal.vision.b1
        public final void a(byte[] bArr, int i15, int i16) throws b {
            F0(bArr, i15, i16);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final int b() {
            return this.f31262f - this.f31263g;
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void e0(int i15) throws b {
            try {
                byte[] bArr = this.f31260d;
                int i16 = this.f31263g;
                int i17 = i16 + 1;
                this.f31263g = i17;
                bArr[i16] = (byte) i15;
                int i18 = i16 + 2;
                this.f31263g = i18;
                bArr[i17] = (byte) (i15 >> 8);
                int i19 = i16 + 3;
                this.f31263g = i19;
                bArr[i18] = (byte) (i15 >> 16);
                this.f31263g = i16 + 4;
                bArr[i19] = (byte) (i15 >>> 24);
            } catch (IndexOutOfBoundsException e15) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31263g), Integer.valueOf(this.f31262f), 1), e15);
            }
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void g(byte b15) throws b {
            try {
                byte[] bArr = this.f31260d;
                int i15 = this.f31263g;
                this.f31263g = i15 + 1;
                bArr[i15] = b15;
            } catch (IndexOutOfBoundsException e15) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31263g), Integer.valueOf(this.f31262f), 1), e15);
            }
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void j(int i15) {
            if (i15 >= 0) {
                O(i15);
            } else {
                t(i15);
            }
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void j0(int i15, int i16) {
            m(i15, 5);
            e0(i16);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void m(int i15, int i16) {
            O((i15 << 3) | i16);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void n(int i15, long j15) {
            m(i15, 0);
            t(j15);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void o(int i15, e1 e1Var) {
            m(i15, 2);
            u(e1Var);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void p(int i15, u3 u3Var) {
            m(1, 3);
            X(2, i15);
            m(3, 2);
            v(u3Var);
            m(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.t1
        final void q(int i15, u3 u3Var, l4 l4Var) {
            m(i15, 2);
            u0 u0Var = (u0) u3Var;
            int iL = u0Var.l();
            if (iL == -1) {
                iL = l4Var.c(u0Var);
                u0Var.j(iL);
            }
            O(iL);
            l4Var.d(u3Var, this.f31259a);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void r(int i15, String str) {
            m(i15, 2);
            w(str);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void s(int i15, boolean z15) {
            m(i15, 0);
            g(z15 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void t(long j15) throws b {
            if (t1.f31258c && b() >= 10) {
                while ((j15 & (-128)) != 0) {
                    byte[] bArr = this.f31260d;
                    int i15 = this.f31263g;
                    this.f31263g = i15 + 1;
                    i5.l(bArr, i15, (byte) ((((int) j15) & CertificateBody.profileType) | 128));
                    j15 >>>= 7;
                }
                byte[] bArr2 = this.f31260d;
                int i16 = this.f31263g;
                this.f31263g = i16 + 1;
                i5.l(bArr2, i16, (byte) j15);
                return;
            }
            while ((j15 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f31260d;
                    int i17 = this.f31263g;
                    this.f31263g = i17 + 1;
                    bArr3[i17] = (byte) ((((int) j15) & CertificateBody.profileType) | 128);
                    j15 >>>= 7;
                } catch (IndexOutOfBoundsException e15) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31263g), Integer.valueOf(this.f31262f), 1), e15);
                }
            }
            byte[] bArr4 = this.f31260d;
            int i18 = this.f31263g;
            this.f31263g = i18 + 1;
            bArr4[i18] = (byte) j15;
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void u(e1 e1Var) {
            O(e1Var.f());
            e1Var.o(this);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void v(u3 u3Var) {
            O(u3Var.q());
            u3Var.g(this);
        }

        @Override // com.google.android.gms.internal.vision.t1
        public final void w(String str) throws b {
            int i15 = this.f31263g;
            try {
                int iO0 = t1.o0(str.length() * 3);
                int iO1 = t1.o0(str.length());
                if (iO1 != iO0) {
                    O(l5.d(str));
                    this.f31263g = l5.e(str, this.f31260d, this.f31263g, b());
                    return;
                }
                int i16 = i15 + iO1;
                this.f31263g = i16;
                int iE = l5.e(str, this.f31260d, i16, b());
                this.f31263g = i15;
                O((iE - i15) - iO1);
                this.f31263g = iE;
            } catch (o5 e15) {
                this.f31263g = i15;
                x(str, e15);
            } catch (IndexOutOfBoundsException e16) {
                throw new b(e16);
            }
        }
    }

    public static class b extends IOException {
        b(Throwable th4) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th4);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        b(String str, Throwable th4) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th4);
        }
    }

    private t1() {
    }

    public static int A(float f15) {
        return 4;
    }

    public static int A0(int i15, int i16) {
        return o0(i15 << 3) + 4;
    }

    public static int B(int i15, double d15) {
        return o0(i15 << 3) + 8;
    }

    public static int B0(int i15) {
        return k0(i15);
    }

    public static int C(int i15, float f15) {
        return o0(i15 << 3) + 4;
    }

    public static int C0(int i15, int i16) {
        return o0(i15 << 3) + k0(i16);
    }

    public static int D(int i15, d3 d3Var) {
        return (o0(8) << 1) + p0(2, i15) + c(3, d3Var);
    }

    @Deprecated
    public static int D0(int i15) {
        return o0(i15);
    }

    public static int E(int i15, u3 u3Var) {
        return (o0(8) << 1) + p0(2, i15) + o0(24) + J(u3Var);
    }

    private static int E0(int i15) {
        return (i15 >> 31) ^ (i15 << 1);
    }

    static int F(int i15, u3 u3Var, l4 l4Var) {
        return o0(i15 << 3) + e(u3Var, l4Var);
    }

    public static int G(int i15, String str) {
        return o0(i15 << 3) + K(str);
    }

    public static int H(int i15, boolean z15) {
        return o0(i15 << 3) + 1;
    }

    public static int I(e1 e1Var) {
        int iF = e1Var.f();
        return o0(iF) + iF;
    }

    public static int J(u3 u3Var) {
        int iQ = u3Var.q();
        return o0(iQ) + iQ;
    }

    public static int K(String str) {
        int length;
        try {
            length = l5.d(str);
        } catch (o5 unused) {
            length = str.getBytes(p2.f31222a).length;
        }
        return o0(length) + length;
    }

    public static int L(boolean z15) {
        return 1;
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        return o0(length) + length;
    }

    public static int T(int i15, e1 e1Var) {
        int iO0 = o0(i15 << 3);
        int iF = e1Var.f();
        return iO0 + o0(iF) + iF;
    }

    @Deprecated
    static int U(int i15, u3 u3Var, l4 l4Var) {
        int iO0 = o0(i15 << 3) << 1;
        u0 u0Var = (u0) u3Var;
        int iL = u0Var.l();
        if (iL == -1) {
            iL = l4Var.c(u0Var);
            u0Var.j(iL);
        }
        return iO0 + iL;
    }

    @Deprecated
    public static int V(u3 u3Var) {
        return u3Var.q();
    }

    public static int b0(int i15, long j15) {
        return o0(i15 << 3) + i0(j15);
    }

    public static int c(int i15, d3 d3Var) {
        int iO0 = o0(i15 << 3);
        int iB = d3Var.b();
        return iO0 + o0(iB) + iB;
    }

    public static int c0(int i15, e1 e1Var) {
        return (o0(8) << 1) + p0(2, i15) + T(3, e1Var);
    }

    public static int d(d3 d3Var) {
        int iB = d3Var.b();
        return o0(iB) + iB;
    }

    public static int d0(long j15) {
        return i0(j15);
    }

    static int e(u3 u3Var, l4 l4Var) {
        u0 u0Var = (u0) u3Var;
        int iL = u0Var.l();
        if (iL == -1) {
            iL = l4Var.c(u0Var);
            u0Var.j(iL);
        }
        return o0(iL) + iL;
    }

    public static t1 f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int g0(int i15) {
        return o0(i15 << 3);
    }

    public static int h0(int i15, long j15) {
        return o0(i15 << 3) + i0(j15);
    }

    public static int i0(long j15) {
        int i15;
        if (((-128) & j15) == 0) {
            return 1;
        }
        if (j15 < 0) {
            return 10;
        }
        if (((-34359738368L) & j15) != 0) {
            j15 >>>= 28;
            i15 = 6;
        } else {
            i15 = 2;
        }
        if (((-2097152) & j15) != 0) {
            i15 += 2;
            j15 >>>= 14;
        }
        return (j15 & (-16384)) != 0 ? i15 + 1 : i15;
    }

    public static int k0(int i15) {
        if (i15 >= 0) {
            return o0(i15);
        }
        return 10;
    }

    public static int l0(int i15, int i16) {
        return o0(i15 << 3) + k0(i16);
    }

    public static int m0(int i15, long j15) {
        return o0(i15 << 3) + i0(y0(j15));
    }

    public static int n0(long j15) {
        return i0(y0(j15));
    }

    public static int o0(int i15) {
        if ((i15 & (-128)) == 0) {
            return 1;
        }
        if ((i15 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i15) == 0) {
            return 3;
        }
        return (i15 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int p0(int i15, int i16) {
        return o0(i15 << 3) + o0(i16);
    }

    public static int q0(int i15, long j15) {
        return o0(i15 << 3) + 8;
    }

    public static int r0(long j15) {
        return 8;
    }

    public static int s0(int i15) {
        return o0(E0(i15));
    }

    public static int t0(int i15, int i16) {
        return o0(i15 << 3) + o0(E0(i16));
    }

    public static int u0(int i15, long j15) {
        return o0(i15 << 3) + 8;
    }

    public static int v0(long j15) {
        return 8;
    }

    public static int w0(int i15) {
        return 4;
    }

    public static int x0(int i15, int i16) {
        return o0(i15 << 3) + 4;
    }

    private static long y0(long j15) {
        return (j15 >> 63) ^ (j15 << 1);
    }

    public static int z(double d15) {
        return 8;
    }

    public static int z0(int i15) {
        return 4;
    }

    public final void N() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void O(int i15);

    public abstract void P(int i15, int i16);

    public final void Q(int i15, long j15) {
        n(i15, y0(j15));
    }

    public abstract void R(int i15, e1 e1Var);

    public final void S(long j15) {
        t(y0(j15));
    }

    public final void W(int i15) {
        O(E0(i15));
    }

    public abstract void X(int i15, int i16);

    public abstract void Y(int i15, long j15);

    public abstract void Z(long j15);

    public abstract int b();

    public abstract void e0(int i15);

    public final void f0(int i15, int i16) {
        X(i15, E0(i16));
    }

    public abstract void g(byte b15);

    public final void h(double d15) {
        Z(Double.doubleToRawLongBits(d15));
    }

    public final void i(float f15) {
        e0(Float.floatToRawIntBits(f15));
    }

    public abstract void j(int i15);

    public abstract void j0(int i15, int i16);

    public final void k(int i15, double d15) {
        Y(i15, Double.doubleToRawLongBits(d15));
    }

    public final void l(int i15, float f15) {
        j0(i15, Float.floatToRawIntBits(f15));
    }

    public abstract void m(int i15, int i16);

    public abstract void n(int i15, long j15);

    public abstract void o(int i15, e1 e1Var);

    public abstract void p(int i15, u3 u3Var);

    abstract void q(int i15, u3 u3Var, l4 l4Var);

    public abstract void r(int i15, String str);

    public abstract void s(int i15, boolean z15);

    public abstract void t(long j15);

    public abstract void u(e1 e1Var);

    public abstract void v(u3 u3Var);

    public abstract void w(String str);

    final void x(String str, o5 o5Var) throws b {
        f31257b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) o5Var);
        byte[] bytes = str.getBytes(p2.f31222a);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (b e15) {
            throw e15;
        } catch (IndexOutOfBoundsException e16) {
            throw new b(e16);
        }
    }

    public final void y(boolean z15) {
        g(z15 ? (byte) 1 : (byte) 0);
    }
}
