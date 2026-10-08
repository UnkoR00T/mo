package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f36131c = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f36132d = r1.E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    l f36133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36134b;

    private static class b extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f36135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f36136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f36137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f36138h;

        b(byte[] bArr, int i15, int i16) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i17 = i15 + i16;
            if ((i15 | i16 | (bArr.length - i17)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i15), Integer.valueOf(i16)));
            }
            this.f36135e = bArr;
            this.f36136f = i15;
            this.f36138h = i15;
            this.f36137g = i17;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void A0(int i15, r0 r0Var) throws c {
            L0(1, 3);
            M0(2, i15);
            S0(3, r0Var);
            L0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void B0(int i15, h hVar) throws c {
            L0(1, 3);
            M0(2, i15);
            i0(3, hVar);
            L0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void K0(int i15, String str) throws c {
            L0(i15, 2);
            U0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void L0(int i15, int i16) throws c {
            N0(t1.c(i15, i16));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void M0(int i15, int i16) throws c {
            L0(i15, 0);
            N0(i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void N0(int i15) throws c {
            while ((i15 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f36135e;
                    int i16 = this.f36138h;
                    this.f36138h = i16 + 1;
                    bArr[i16] = (byte) ((i15 & CertificateBody.profileType) | 128);
                    i15 >>>= 7;
                } catch (IndexOutOfBoundsException e15) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36138h), Integer.valueOf(this.f36137g), 1), e15);
                }
            }
            byte[] bArr2 = this.f36135e;
            int i17 = this.f36138h;
            this.f36138h = i17 + 1;
            bArr2[i17] = (byte) i15;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void O0(int i15, long j15) throws c {
            L0(i15, 0);
            P0(j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void P0(long j15) throws c {
            if (k.f36132d && e0() >= 10) {
                while ((j15 & (-128)) != 0) {
                    byte[] bArr = this.f36135e;
                    int i15 = this.f36138h;
                    this.f36138h = i15 + 1;
                    r1.K(bArr, i15, (byte) ((((int) j15) & CertificateBody.profileType) | 128));
                    j15 >>>= 7;
                }
                byte[] bArr2 = this.f36135e;
                int i16 = this.f36138h;
                this.f36138h = i16 + 1;
                r1.K(bArr2, i16, (byte) j15);
                return;
            }
            while ((j15 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f36135e;
                    int i17 = this.f36138h;
                    this.f36138h = i17 + 1;
                    bArr3[i17] = (byte) ((((int) j15) & CertificateBody.profileType) | 128);
                    j15 >>>= 7;
                } catch (IndexOutOfBoundsException e15) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36138h), Integer.valueOf(this.f36137g), 1), e15);
                }
            }
            byte[] bArr4 = this.f36135e;
            int i18 = this.f36138h;
            this.f36138h = i18 + 1;
            bArr4[i18] = (byte) j15;
        }

        public final void Q0(byte[] bArr, int i15, int i16) throws c {
            try {
                System.arraycopy(bArr, i15, this.f36135e, this.f36138h, i16);
                this.f36138h += i16;
            } catch (IndexOutOfBoundsException e15) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36138h), Integer.valueOf(this.f36137g), Integer.valueOf(i16)), e15);
            }
        }

        public final void R0(h hVar) throws c {
            N0(hVar.size());
            hVar.T(this);
        }

        public final void S0(int i15, r0 r0Var) throws c {
            L0(i15, 2);
            T0(r0Var);
        }

        public final void T0(r0 r0Var) throws c {
            N0(r0Var.e());
            r0Var.m(this);
        }

        public final void U0(String str) throws c {
            int i15 = this.f36138h;
            try {
                int iV = k.V(str.length() * 3);
                int iV2 = k.V(str.length());
                if (iV2 != iV) {
                    N0(s1.g(str));
                    this.f36138h = s1.f(str, this.f36135e, this.f36138h, e0());
                    return;
                }
                int i16 = i15 + iV2;
                this.f36138h = i16;
                int iF = s1.f(str, this.f36135e, i16, e0());
                this.f36138h = i15;
                N0((iF - i15) - iV2);
                this.f36138h = iF;
            } catch (s1.d e15) {
                this.f36138h = i15;
                a0(str, e15);
            } catch (IndexOutOfBoundsException e16) {
                throw new c(e16);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k, com.google.crypto.tink.shaded.protobuf.g
        public final void a(byte[] bArr, int i15, int i16) throws c {
            Q0(bArr, i15, i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final int e0() {
            return this.f36137g - this.f36138h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void f0(byte b15) throws c {
            try {
                byte[] bArr = this.f36135e;
                int i15 = this.f36138h;
                this.f36138h = i15 + 1;
                bArr[i15] = b15;
            } catch (IndexOutOfBoundsException e15) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36138h), Integer.valueOf(this.f36137g), 1), e15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void g0(int i15, boolean z15) throws c {
            L0(i15, 0);
            f0(z15 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void i0(int i15, h hVar) throws c {
            L0(i15, 2);
            R0(hVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void n0(int i15, int i16) throws c {
            L0(i15, 5);
            o0(i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void o0(int i15) throws c {
            try {
                byte[] bArr = this.f36135e;
                int i16 = this.f36138h;
                int i17 = i16 + 1;
                this.f36138h = i17;
                bArr[i16] = (byte) (i15 & GF2Field.MASK);
                int i18 = i16 + 2;
                this.f36138h = i18;
                bArr[i17] = (byte) ((i15 >> 8) & GF2Field.MASK);
                int i19 = i16 + 3;
                this.f36138h = i19;
                bArr[i18] = (byte) ((i15 >> 16) & GF2Field.MASK);
                this.f36138h = i16 + 4;
                bArr[i19] = (byte) ((i15 >> 24) & GF2Field.MASK);
            } catch (IndexOutOfBoundsException e15) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36138h), Integer.valueOf(this.f36137g), 1), e15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void p0(int i15, long j15) throws c {
            L0(i15, 1);
            q0(j15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void q0(long j15) throws c {
            try {
                byte[] bArr = this.f36135e;
                int i15 = this.f36138h;
                int i16 = i15 + 1;
                this.f36138h = i16;
                bArr[i15] = (byte) (((int) j15) & GF2Field.MASK);
                int i17 = i15 + 2;
                this.f36138h = i17;
                bArr[i16] = (byte) (((int) (j15 >> 8)) & GF2Field.MASK);
                int i18 = i15 + 3;
                this.f36138h = i18;
                bArr[i17] = (byte) (((int) (j15 >> 16)) & GF2Field.MASK);
                int i19 = i15 + 4;
                this.f36138h = i19;
                bArr[i18] = (byte) (((int) (j15 >> 24)) & GF2Field.MASK);
                int i25 = i15 + 5;
                this.f36138h = i25;
                bArr[i19] = (byte) (((int) (j15 >> 32)) & GF2Field.MASK);
                int i26 = i15 + 6;
                this.f36138h = i26;
                bArr[i25] = (byte) (((int) (j15 >> 40)) & GF2Field.MASK);
                int i27 = i15 + 7;
                this.f36138h = i27;
                bArr[i26] = (byte) (((int) (j15 >> 48)) & GF2Field.MASK);
                this.f36138h = i15 + 8;
                bArr[i27] = (byte) (((int) (j15 >> 56)) & GF2Field.MASK);
            } catch (IndexOutOfBoundsException e15) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f36138h), Integer.valueOf(this.f36137g), 1), e15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void v0(int i15, int i16) throws c {
            L0(i15, 0);
            w0(i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void w0(int i15) throws c {
            if (i15 >= 0) {
                N0(i15);
            } else {
                P0(i15);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        final void z0(int i15, r0 r0Var, g1 g1Var) throws c {
            L0(i15, 2);
            N0(((com.google.crypto.tink.shaded.protobuf.a) r0Var).d(g1Var));
            g1Var.j(r0Var, this.f36133a);
        }
    }

    public static class c extends IOException {
        c(Throwable th4) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th4);
        }

        c(String str, Throwable th4) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th4);
        }
    }

    public static int A(int i15, e0 e0Var) {
        return T(i15) + B(e0Var);
    }

    public static int B(e0 e0Var) {
        return C(e0Var.b());
    }

    static int C(int i15) {
        return V(i15) + i15;
    }

    public static int D(int i15, r0 r0Var) {
        return (T(1) * 2) + U(2, i15) + E(3, r0Var);
    }

    public static int E(int i15, r0 r0Var) {
        return T(i15) + G(r0Var);
    }

    static int F(int i15, r0 r0Var, g1 g1Var) {
        return T(i15) + H(r0Var, g1Var);
    }

    public static int G(r0 r0Var) {
        return C(r0Var.e());
    }

    static int H(r0 r0Var, g1 g1Var) {
        return C(((com.google.crypto.tink.shaded.protobuf.a) r0Var).d(g1Var));
    }

    public static int I(int i15, h hVar) {
        return (T(1) * 2) + U(2, i15) + g(3, hVar);
    }

    public static int J(int i15, int i16) {
        return T(i15) + K(i16);
    }

    public static int K(int i15) {
        return 4;
    }

    public static int L(int i15, long j15) {
        return T(i15) + M(j15);
    }

    public static int M(long j15) {
        return 8;
    }

    public static int N(int i15, int i16) {
        return T(i15) + O(i16);
    }

    public static int O(int i15) {
        return V(Y(i15));
    }

    public static int P(int i15, long j15) {
        return T(i15) + Q(j15);
    }

    public static int Q(long j15) {
        return X(Z(j15));
    }

    public static int R(int i15, String str) {
        return T(i15) + S(str);
    }

    public static int S(String str) {
        int length;
        try {
            length = s1.g(str);
        } catch (s1.d unused) {
            length = str.getBytes(a0.f36000b).length;
        }
        return C(length);
    }

    public static int T(int i15) {
        return V(t1.c(i15, 0));
    }

    public static int U(int i15, int i16) {
        return T(i15) + V(i16);
    }

    public static int V(int i15) {
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

    public static int W(int i15, long j15) {
        return T(i15) + X(j15);
    }

    public static int X(long j15) {
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

    public static int Y(int i15) {
        return (i15 >> 31) ^ (i15 << 1);
    }

    public static long Z(long j15) {
        return (j15 >> 63) ^ (j15 << 1);
    }

    public static k c0(byte[] bArr) {
        return d0(bArr, 0, bArr.length);
    }

    public static int d(int i15, boolean z15) {
        return T(i15) + e(z15);
    }

    public static k d0(byte[] bArr, int i15, int i16) {
        return new b(bArr, i15, i16);
    }

    public static int e(boolean z15) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i15, h hVar) {
        return T(i15) + h(hVar);
    }

    public static int h(h hVar) {
        return C(hVar.size());
    }

    public static int i(int i15, double d15) {
        return T(i15) + j(d15);
    }

    public static int j(double d15) {
        return 8;
    }

    public static int k(int i15, int i16) {
        return T(i15) + l(i16);
    }

    public static int l(int i15) {
        return w(i15);
    }

    public static int m(int i15, int i16) {
        return T(i15) + n(i16);
    }

    public static int n(int i15) {
        return 4;
    }

    public static int o(int i15, long j15) {
        return T(i15) + p(j15);
    }

    public static int p(long j15) {
        return 8;
    }

    public static int q(int i15, float f15) {
        return T(i15) + r(f15);
    }

    public static int r(float f15) {
        return 4;
    }

    @Deprecated
    static int s(int i15, r0 r0Var, g1 g1Var) {
        return (T(i15) * 2) + u(r0Var, g1Var);
    }

    @Deprecated
    public static int t(r0 r0Var) {
        return r0Var.e();
    }

    @Deprecated
    static int u(r0 r0Var, g1 g1Var) {
        return ((com.google.crypto.tink.shaded.protobuf.a) r0Var).d(g1Var);
    }

    public static int v(int i15, int i16) {
        return T(i15) + w(i16);
    }

    public static int w(int i15) {
        if (i15 >= 0) {
            return V(i15);
        }
        return 10;
    }

    public static int x(int i15, long j15) {
        return T(i15) + y(j15);
    }

    public static int y(long j15) {
        return X(j15);
    }

    public static int z(int i15, e0 e0Var) {
        return (T(1) * 2) + U(2, i15) + A(3, e0Var);
    }

    public abstract void A0(int i15, r0 r0Var);

    public abstract void B0(int i15, h hVar);

    public final void C0(int i15, int i16) {
        n0(i15, i16);
    }

    public final void D0(int i15) {
        o0(i15);
    }

    public final void E0(int i15, long j15) {
        p0(i15, j15);
    }

    public final void F0(long j15) {
        q0(j15);
    }

    public final void G0(int i15, int i16) {
        M0(i15, Y(i16));
    }

    public final void H0(int i15) {
        N0(Y(i15));
    }

    public final void I0(int i15, long j15) {
        O0(i15, Z(j15));
    }

    public final void J0(long j15) {
        P0(Z(j15));
    }

    public abstract void K0(int i15, String str);

    public abstract void L0(int i15, int i16);

    public abstract void M0(int i15, int i16);

    public abstract void N0(int i15);

    public abstract void O0(int i15, long j15);

    public abstract void P0(long j15);

    @Override // com.google.crypto.tink.shaded.protobuf.g
    public abstract void a(byte[] bArr, int i15, int i16);

    final void a0(String str, s1.d dVar) throws c {
        f36131c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(a0.f36000b);
        try {
            N0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e15) {
            throw new c(e15);
        }
    }

    boolean b0() {
        return this.f36134b;
    }

    public final void c() {
        if (e0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int e0();

    public abstract void f0(byte b15);

    public abstract void g0(int i15, boolean z15);

    public final void h0(boolean z15) {
        f0(z15 ? (byte) 1 : (byte) 0);
    }

    public abstract void i0(int i15, h hVar);

    public final void j0(int i15, double d15) {
        p0(i15, Double.doubleToRawLongBits(d15));
    }

    public final void k0(double d15) {
        q0(Double.doubleToRawLongBits(d15));
    }

    public final void l0(int i15, int i16) {
        v0(i15, i16);
    }

    public final void m0(int i15) {
        w0(i15);
    }

    public abstract void n0(int i15, int i16);

    public abstract void o0(int i15);

    public abstract void p0(int i15, long j15);

    public abstract void q0(long j15);

    public final void r0(int i15, float f15) {
        n0(i15, Float.floatToRawIntBits(f15));
    }

    public final void s0(float f15) {
        o0(Float.floatToRawIntBits(f15));
    }

    @Deprecated
    final void t0(int i15, r0 r0Var, g1 g1Var) {
        L0(i15, 3);
        u0(r0Var, g1Var);
        L0(i15, 4);
    }

    @Deprecated
    final void u0(r0 r0Var, g1 g1Var) {
        g1Var.j(r0Var, this.f36133a);
    }

    public abstract void v0(int i15, int i16);

    public abstract void w0(int i15);

    public final void x0(int i15, long j15) {
        O0(i15, j15);
    }

    public final void y0(long j15) {
        P0(j15);
    }

    abstract void z0(int i15, r0 r0Var, g1 g1Var);

    private k() {
    }
}
