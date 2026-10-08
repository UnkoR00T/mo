package bt;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f21408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21409b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final OutputStream f21412e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21411d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21410c = 0;

    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private f(OutputStream outputStream, byte[] bArr) {
        this.f21412e = outputStream;
        this.f21408a = bArr;
        this.f21409b = bArr.length;
    }

    public static int A(int i15, long j15) {
        return D(i15) + B(j15);
    }

    public static int B(long j15) {
        return w(H(j15));
    }

    public static int C(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e15) {
            throw new RuntimeException("UTF-8 not supported.", e15);
        }
    }

    public static int D(int i15) {
        return v(z.c(i15, 0));
    }

    public static int E(int i15) {
        return v(i15);
    }

    public static int F(long j15) {
        return w(j15);
    }

    public static int G(int i15) {
        return (i15 >> 31) ^ (i15 << 1);
    }

    public static long H(long j15) {
        return (j15 >> 63) ^ (j15 << 1);
    }

    public static f J(OutputStream outputStream, int i15) {
        return new f(outputStream, new byte[i15]);
    }

    private void K() throws IOException {
        OutputStream outputStream = this.f21412e;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f21408a, 0, this.f21410c);
        this.f21410c = 0;
    }

    public static int a(int i15, boolean z15) {
        return D(i15) + b(z15);
    }

    public static int b(boolean z15) {
        return 1;
    }

    public static int c(byte[] bArr) {
        return v(bArr.length) + bArr.length;
    }

    public static int d(int i15, d dVar) {
        return D(i15) + e(dVar);
    }

    public static int e(d dVar) {
        return v(dVar.size()) + dVar.size();
    }

    public static int f(int i15, double d15) {
        return D(i15) + g(d15);
    }

    public static int g(double d15) {
        return 8;
    }

    public static int h(int i15, int i16) {
        return D(i15) + i(i16);
    }

    public static int i(int i15) {
        return p(i15);
    }

    public static int j(int i15) {
        return 4;
    }

    public static int k(long j15) {
        return 8;
    }

    public static int l(int i15, float f15) {
        return D(i15) + m(f15);
    }

    public static int m(float f15) {
        return 4;
    }

    public static int n(q qVar) {
        return qVar.e();
    }

    public static int o(int i15, int i16) {
        return D(i15) + p(i16);
    }

    public static int p(int i15) {
        if (i15 >= 0) {
            return v(i15);
        }
        return 10;
    }

    public static int q(long j15) {
        return w(j15);
    }

    public static int r(m mVar) {
        int iB = mVar.b();
        return v(iB) + iB;
    }

    public static int s(int i15, q qVar) {
        return D(i15) + t(qVar);
    }

    public static int t(q qVar) {
        int iE = qVar.e();
        return v(iE) + iE;
    }

    static int u(int i15) {
        return i15 > 4096 ? PKIFailureInfo.certConfirmed : i15;
    }

    public static int v(int i15) {
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

    public static int w(long j15) {
        if (((-128) & j15) == 0) {
            return 1;
        }
        if (((-16384) & j15) == 0) {
            return 2;
        }
        if (((-2097152) & j15) == 0) {
            return 3;
        }
        if (((-268435456) & j15) == 0) {
            return 4;
        }
        if (((-34359738368L) & j15) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j15) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j15) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j15) == 0) {
            return 8;
        }
        return (j15 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int x(int i15) {
        return 4;
    }

    public static int y(long j15) {
        return 8;
    }

    public static int z(int i15) {
        return v(G(i15));
    }

    public void I() throws IOException {
        if (this.f21412e != null) {
            K();
        }
    }

    public void L(int i15, boolean z15) throws IOException {
        w0(i15, 0);
        M(z15);
    }

    public void M(boolean z15) throws IOException {
        h0(z15 ? 1 : 0);
    }

    public void N(byte[] bArr) throws IOException {
        o0(bArr.length);
        k0(bArr);
    }

    public void O(int i15, d dVar) {
        w0(i15, 2);
        P(dVar);
    }

    public void P(d dVar) {
        o0(dVar.size());
        i0(dVar);
    }

    public void Q(int i15, double d15) throws IOException {
        w0(i15, 1);
        R(d15);
    }

    public void R(double d15) throws IOException {
        n0(Double.doubleToRawLongBits(d15));
    }

    public void S(int i15, int i16) throws IOException {
        w0(i15, 0);
        T(i16);
    }

    public void T(int i15) throws IOException {
        b0(i15);
    }

    public void U(int i15) {
        m0(i15);
    }

    public void V(long j15) {
        n0(j15);
    }

    public void W(int i15, float f15) throws IOException {
        w0(i15, 5);
        X(f15);
    }

    public void X(float f15) throws IOException {
        m0(Float.floatToRawIntBits(f15));
    }

    public void Y(int i15, q qVar) {
        w0(i15, 3);
        Z(qVar);
        w0(i15, 4);
    }

    public void Z(q qVar) {
        qVar.m(this);
    }

    public void a0(int i15, int i16) throws IOException {
        w0(i15, 0);
        b0(i16);
    }

    public void b0(int i15) throws IOException {
        if (i15 >= 0) {
            o0(i15);
        } else {
            p0(i15);
        }
    }

    public void c0(long j15) throws IOException {
        p0(j15);
    }

    public void d0(int i15, q qVar) {
        w0(i15, 2);
        e0(qVar);
    }

    public void e0(q qVar) {
        o0(qVar.e());
        qVar.m(this);
    }

    public void f0(int i15, q qVar) {
        w0(1, 3);
        x0(2, i15);
        d0(3, qVar);
        w0(1, 4);
    }

    public void g0(byte b15) throws IOException {
        if (this.f21410c == this.f21409b) {
            K();
        }
        byte[] bArr = this.f21408a;
        int i15 = this.f21410c;
        this.f21410c = i15 + 1;
        bArr[i15] = b15;
        this.f21411d++;
    }

    public void h0(int i15) throws IOException {
        g0((byte) i15);
    }

    public void i0(d dVar) throws IOException {
        j0(dVar, 0, dVar.size());
    }

    public void j0(d dVar, int i15, int i16) throws IOException {
        int i17 = this.f21409b;
        int i18 = this.f21410c;
        if (i17 - i18 >= i16) {
            dVar.k(this.f21408a, i15, i18, i16);
            this.f21410c += i16;
            this.f21411d += i16;
            return;
        }
        int i19 = i17 - i18;
        dVar.k(this.f21408a, i15, i18, i19);
        int i25 = i15 + i19;
        int i26 = i16 - i19;
        this.f21410c = this.f21409b;
        this.f21411d += i19;
        K();
        if (i26 <= this.f21409b) {
            dVar.k(this.f21408a, i25, 0, i26);
            this.f21410c = i26;
        } else {
            dVar.C(this.f21412e, i25, i26);
        }
        this.f21411d += i26;
    }

    public void k0(byte[] bArr) throws IOException {
        l0(bArr, 0, bArr.length);
    }

    public void l0(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = this.f21409b;
        int i18 = this.f21410c;
        if (i17 - i18 >= i16) {
            System.arraycopy(bArr, i15, this.f21408a, i18, i16);
            this.f21410c += i16;
            this.f21411d += i16;
            return;
        }
        int i19 = i17 - i18;
        System.arraycopy(bArr, i15, this.f21408a, i18, i19);
        int i25 = i15 + i19;
        int i26 = i16 - i19;
        this.f21410c = this.f21409b;
        this.f21411d += i19;
        K();
        if (i26 <= this.f21409b) {
            System.arraycopy(bArr, i25, this.f21408a, 0, i26);
            this.f21410c = i26;
        } else {
            this.f21412e.write(bArr, i25, i26);
        }
        this.f21411d += i26;
    }

    public void m0(int i15) throws IOException {
        h0(i15 & GF2Field.MASK);
        h0((i15 >> 8) & GF2Field.MASK);
        h0((i15 >> 16) & GF2Field.MASK);
        h0((i15 >> 24) & GF2Field.MASK);
    }

    public void n0(long j15) throws IOException {
        h0(((int) j15) & GF2Field.MASK);
        h0(((int) (j15 >> 8)) & GF2Field.MASK);
        h0(((int) (j15 >> 16)) & GF2Field.MASK);
        h0(((int) (j15 >> 24)) & GF2Field.MASK);
        h0(((int) (j15 >> 32)) & GF2Field.MASK);
        h0(((int) (j15 >> 40)) & GF2Field.MASK);
        h0(((int) (j15 >> 48)) & GF2Field.MASK);
        h0(((int) (j15 >> 56)) & GF2Field.MASK);
    }

    public void o0(int i15) {
        while ((i15 & (-128)) != 0) {
            h0((i15 & CertificateBody.profileType) | 128);
            i15 >>>= 7;
        }
        h0(i15);
    }

    public void p0(long j15) throws IOException {
        while (((-128) & j15) != 0) {
            h0((((int) j15) & CertificateBody.profileType) | 128);
            j15 >>>= 7;
        }
        h0((int) j15);
    }

    public void q0(int i15) throws IOException {
        m0(i15);
    }

    public void r0(long j15) throws IOException {
        n0(j15);
    }

    public void s0(int i15) {
        o0(G(i15));
    }

    public void t0(int i15, long j15) throws IOException {
        w0(i15, 0);
        u0(j15);
    }

    public void u0(long j15) throws IOException {
        p0(H(j15));
    }

    public void v0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        o0(bytes.length);
        k0(bytes);
    }

    public void w0(int i15, int i16) {
        o0(z.c(i15, i16));
    }

    public void x0(int i15, int i16) {
        w0(i15, 0);
        y0(i16);
    }

    public void y0(int i15) {
        o0(i15);
    }

    public void z0(long j15) {
        p0(j15);
    }
}
