package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f11997c = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f11998d = q1.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    k f11999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12000b;

    private static abstract class b extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f12001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f12002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f12003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f12004h;

        b(int i15) {
            super();
            if (i15 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i15, 20)];
            this.f12001e = bArr;
            this.f12002f = bArr.length;
        }

        final void a1(byte b15) {
            byte[] bArr = this.f12001e;
            int i15 = this.f12003g;
            this.f12003g = i15 + 1;
            bArr[i15] = b15;
            this.f12004h++;
        }

        final void b1(int i15) {
            byte[] bArr = this.f12001e;
            int i16 = this.f12003g;
            int i17 = i16 + 1;
            this.f12003g = i17;
            bArr[i16] = (byte) (i15 & GF2Field.MASK);
            int i18 = i16 + 2;
            this.f12003g = i18;
            bArr[i17] = (byte) ((i15 >> 8) & GF2Field.MASK);
            int i19 = i16 + 3;
            this.f12003g = i19;
            bArr[i18] = (byte) ((i15 >> 16) & GF2Field.MASK);
            this.f12003g = i16 + 4;
            bArr[i19] = (byte) ((i15 >> 24) & GF2Field.MASK);
            this.f12004h += 4;
        }

        final void c1(long j15) {
            byte[] bArr = this.f12001e;
            int i15 = this.f12003g;
            int i16 = i15 + 1;
            this.f12003g = i16;
            bArr[i15] = (byte) (j15 & 255);
            int i17 = i15 + 2;
            this.f12003g = i17;
            bArr[i16] = (byte) ((j15 >> 8) & 255);
            int i18 = i15 + 3;
            this.f12003g = i18;
            bArr[i17] = (byte) ((j15 >> 16) & 255);
            int i19 = i15 + 4;
            this.f12003g = i19;
            bArr[i18] = (byte) (255 & (j15 >> 24));
            int i25 = i15 + 5;
            this.f12003g = i25;
            bArr[i19] = (byte) (((int) (j15 >> 32)) & GF2Field.MASK);
            int i26 = i15 + 6;
            this.f12003g = i26;
            bArr[i25] = (byte) (((int) (j15 >> 40)) & GF2Field.MASK);
            int i27 = i15 + 7;
            this.f12003g = i27;
            bArr[i26] = (byte) (((int) (j15 >> 48)) & GF2Field.MASK);
            this.f12003g = i15 + 8;
            bArr[i27] = (byte) (((int) (j15 >> 56)) & GF2Field.MASK);
            this.f12004h += 8;
        }

        final void d1(int i15) {
            if (i15 >= 0) {
                f1(i15);
            } else {
                g1(i15);
            }
        }

        final void e1(int i15, int i16) {
            f1(s1.c(i15, i16));
        }

        final void f1(int i15) {
            if (!j.f11998d) {
                while ((i15 & (-128)) != 0) {
                    byte[] bArr = this.f12001e;
                    int i16 = this.f12003g;
                    this.f12003g = i16 + 1;
                    bArr[i16] = (byte) ((i15 | 128) & GF2Field.MASK);
                    this.f12004h++;
                    i15 >>>= 7;
                }
                byte[] bArr2 = this.f12001e;
                int i17 = this.f12003g;
                this.f12003g = i17 + 1;
                bArr2[i17] = (byte) i15;
                this.f12004h++;
                return;
            }
            long j15 = this.f12003g;
            while ((i15 & (-128)) != 0) {
                byte[] bArr3 = this.f12001e;
                int i18 = this.f12003g;
                this.f12003g = i18 + 1;
                q1.H(bArr3, i18, (byte) ((i15 | 128) & GF2Field.MASK));
                i15 >>>= 7;
            }
            byte[] bArr4 = this.f12001e;
            int i19 = this.f12003g;
            this.f12003g = i19 + 1;
            q1.H(bArr4, i19, (byte) i15);
            this.f12004h += (int) (((long) this.f12003g) - j15);
        }

        final void g1(long j15) {
            if (!j.f11998d) {
                while ((j15 & (-128)) != 0) {
                    byte[] bArr = this.f12001e;
                    int i15 = this.f12003g;
                    this.f12003g = i15 + 1;
                    bArr[i15] = (byte) ((((int) j15) | 128) & GF2Field.MASK);
                    this.f12004h++;
                    j15 >>>= 7;
                }
                byte[] bArr2 = this.f12001e;
                int i16 = this.f12003g;
                this.f12003g = i16 + 1;
                bArr2[i16] = (byte) j15;
                this.f12004h++;
                return;
            }
            long j16 = this.f12003g;
            while ((j15 & (-128)) != 0) {
                byte[] bArr3 = this.f12001e;
                int i17 = this.f12003g;
                this.f12003g = i17 + 1;
                q1.H(bArr3, i17, (byte) ((((int) j15) | 128) & GF2Field.MASK));
                j15 >>>= 7;
            }
            byte[] bArr4 = this.f12001e;
            int i18 = this.f12003g;
            this.f12003g = i18 + 1;
            q1.H(bArr4, i18, (byte) j15);
            this.f12004h += (int) (((long) this.f12003g) - j16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f12005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f12006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f12007g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f12008h;

        c(byte[] bArr, int i15, int i16) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i17 = i15 + i16;
            if ((i15 | i16 | (bArr.length - i17)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i15), Integer.valueOf(i16)));
            }
            this.f12005e = bArr;
            this.f12006f = i15;
            this.f12008h = i15;
            this.f12007g = i17;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void D0(int i15, int i16) throws d {
            V0(i15, 0);
            E0(i16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void E0(int i15) throws d {
            if (i15 >= 0) {
                X0(i15);
            } else {
                Z0(i15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        final void H0(int i15, r0 r0Var, g1 g1Var) throws d {
            V0(i15, 2);
            X0(((androidx.datastore.preferences.protobuf.a) r0Var).f(g1Var));
            g1Var.i(r0Var, this.f11999a);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void I0(r0 r0Var) throws d {
            X0(r0Var.e());
            r0Var.m(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void J0(int i15, r0 r0Var) throws d {
            V0(1, 3);
            W0(2, i15);
            b1(3, r0Var);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void K0(int i15, g gVar) throws d {
            V0(1, 3);
            W0(2, i15);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void T0(int i15, String str) throws d {
            V0(i15, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void U0(String str) throws d {
            int i15 = this.f12008h;
            try {
                int iW = j.W(str.length() * 3);
                int iW2 = j.W(str.length());
                if (iW2 != iW) {
                    X0(r1.c(str));
                    this.f12008h = r1.b(str, this.f12005e, this.f12008h, h0());
                    return;
                }
                int i16 = i15 + iW2;
                this.f12008h = i16;
                int iB = r1.b(str, this.f12005e, i16, h0());
                this.f12008h = i15;
                X0((iB - i15) - iW2);
                this.f12008h = iB;
            } catch (r1.d e15) {
                this.f12008h = i15;
                c0(str, e15);
            } catch (IndexOutOfBoundsException e16) {
                throw new d(e16);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void V0(int i15, int i16) throws d {
            X0(s1.c(i15, i16));
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void W0(int i15, int i16) throws d {
            V0(i15, 0);
            X0(i16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void X0(int i15) throws d {
            while ((i15 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f12005e;
                    int i16 = this.f12008h;
                    this.f12008h = i16 + 1;
                    bArr[i16] = (byte) ((i15 | 128) & GF2Field.MASK);
                    i15 >>>= 7;
                } catch (IndexOutOfBoundsException e15) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12008h), Integer.valueOf(this.f12007g), 1), e15);
                }
            }
            byte[] bArr2 = this.f12005e;
            int i17 = this.f12008h;
            this.f12008h = i17 + 1;
            bArr2[i17] = (byte) i15;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void Y0(int i15, long j15) throws d {
            V0(i15, 0);
            Z0(j15);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void Z0(long j15) throws d {
            if (j.f11998d && h0() >= 10) {
                while ((j15 & (-128)) != 0) {
                    byte[] bArr = this.f12005e;
                    int i15 = this.f12008h;
                    this.f12008h = i15 + 1;
                    q1.H(bArr, i15, (byte) ((((int) j15) | 128) & GF2Field.MASK));
                    j15 >>>= 7;
                }
                byte[] bArr2 = this.f12005e;
                int i16 = this.f12008h;
                this.f12008h = i16 + 1;
                q1.H(bArr2, i16, (byte) j15);
                return;
            }
            while ((j15 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f12005e;
                    int i17 = this.f12008h;
                    this.f12008h = i17 + 1;
                    bArr3[i17] = (byte) ((((int) j15) | 128) & GF2Field.MASK);
                    j15 >>>= 7;
                } catch (IndexOutOfBoundsException e15) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12008h), Integer.valueOf(this.f12007g), 1), e15);
                }
            }
            byte[] bArr4 = this.f12005e;
            int i18 = this.f12008h;
            this.f12008h = i18 + 1;
            bArr4[i18] = (byte) j15;
        }

        @Override // androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.f
        public final void a(byte[] bArr, int i15, int i16) throws d {
            a1(bArr, i15, i16);
        }

        public final void a1(byte[] bArr, int i15, int i16) throws d {
            try {
                System.arraycopy(bArr, i15, this.f12005e, this.f12008h, i16);
                this.f12008h += i16;
            } catch (IndexOutOfBoundsException e15) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12008h), Integer.valueOf(this.f12007g), Integer.valueOf(i16)), e15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void b0() {
        }

        public final void b1(int i15, r0 r0Var) throws d {
            V0(i15, 2);
            I0(r0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final int h0() {
            return this.f12007g - this.f12008h;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void i0(byte b15) throws d {
            try {
                byte[] bArr = this.f12005e;
                int i15 = this.f12008h;
                this.f12008h = i15 + 1;
                bArr[i15] = b15;
            } catch (IndexOutOfBoundsException e15) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12008h), Integer.valueOf(this.f12007g), 1), e15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void j0(int i15, boolean z15) throws d {
            V0(i15, 0);
            i0(z15 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void m0(byte[] bArr, int i15, int i16) throws d {
            X0(i16);
            a1(bArr, i15, i16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void n0(int i15, g gVar) throws d {
            V0(i15, 2);
            o0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void o0(g gVar) throws d {
            X0(gVar.size());
            gVar.L(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void t0(int i15, int i16) throws d {
            V0(i15, 5);
            u0(i16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void u0(int i15) throws d {
            try {
                byte[] bArr = this.f12005e;
                int i16 = this.f12008h;
                int i17 = i16 + 1;
                this.f12008h = i17;
                bArr[i16] = (byte) (i15 & GF2Field.MASK);
                int i18 = i16 + 2;
                this.f12008h = i18;
                bArr[i17] = (byte) ((i15 >> 8) & GF2Field.MASK);
                int i19 = i16 + 3;
                this.f12008h = i19;
                bArr[i18] = (byte) ((i15 >> 16) & GF2Field.MASK);
                this.f12008h = i16 + 4;
                bArr[i19] = (byte) ((i15 >> 24) & GF2Field.MASK);
            } catch (IndexOutOfBoundsException e15) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12008h), Integer.valueOf(this.f12007g), 1), e15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void v0(int i15, long j15) throws d {
            V0(i15, 1);
            w0(j15);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void w0(long j15) throws d {
            try {
                byte[] bArr = this.f12005e;
                int i15 = this.f12008h;
                int i16 = i15 + 1;
                this.f12008h = i16;
                bArr[i15] = (byte) (((int) j15) & GF2Field.MASK);
                int i17 = i15 + 2;
                this.f12008h = i17;
                bArr[i16] = (byte) (((int) (j15 >> 8)) & GF2Field.MASK);
                int i18 = i15 + 3;
                this.f12008h = i18;
                bArr[i17] = (byte) (((int) (j15 >> 16)) & GF2Field.MASK);
                int i19 = i15 + 4;
                this.f12008h = i19;
                bArr[i18] = (byte) (((int) (j15 >> 24)) & GF2Field.MASK);
                int i25 = i15 + 5;
                this.f12008h = i25;
                bArr[i19] = (byte) (((int) (j15 >> 32)) & GF2Field.MASK);
                int i26 = i15 + 6;
                this.f12008h = i26;
                bArr[i25] = (byte) (((int) (j15 >> 40)) & GF2Field.MASK);
                int i27 = i15 + 7;
                this.f12008h = i27;
                bArr[i26] = (byte) (((int) (j15 >> 48)) & GF2Field.MASK);
                this.f12008h = i15 + 8;
                bArr[i27] = (byte) (((int) (j15 >> 56)) & GF2Field.MASK);
            } catch (IndexOutOfBoundsException e15) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12008h), Integer.valueOf(this.f12007g), 1), e15);
            }
        }
    }

    public static class d extends IOException {
        d(Throwable th4) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th4);
        }

        d(String str, Throwable th4) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th4);
        }
    }

    private static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f12009i;

        e(OutputStream outputStream, int i15) {
            super(i15);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f12009i = outputStream;
        }

        private void h1() throws IOException {
            this.f12009i.write(this.f12001e, 0, this.f12003g);
            this.f12003g = 0;
        }

        private void i1(int i15) throws IOException {
            if (this.f12002f - this.f12003g < i15) {
                h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void D0(int i15, int i16) throws IOException {
            i1(20);
            e1(i15, 0);
            d1(i16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void E0(int i15) throws IOException {
            if (i15 >= 0) {
                X0(i15);
            } else {
                Z0(i15);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        void H0(int i15, r0 r0Var, g1 g1Var) throws IOException {
            V0(i15, 2);
            l1(r0Var, g1Var);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void I0(r0 r0Var) throws IOException {
            X0(r0Var.e());
            r0Var.m(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void J0(int i15, r0 r0Var) throws IOException {
            V0(1, 3);
            W0(2, i15);
            k1(3, r0Var);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void K0(int i15, g gVar) throws IOException {
            V0(1, 3);
            W0(2, i15);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void T0(int i15, String str) throws IOException {
            V0(i15, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void U0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iW = j.W(length);
                int i15 = iW + length;
                int i16 = this.f12002f;
                if (i15 > i16) {
                    byte[] bArr = new byte[length];
                    int iB = r1.b(str, bArr, 0, length);
                    X0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i15 > i16 - this.f12003g) {
                    h1();
                }
                int iW2 = j.W(str.length());
                int i17 = this.f12003g;
                try {
                    if (iW2 == iW) {
                        int i18 = i17 + iW2;
                        this.f12003g = i18;
                        int iB2 = r1.b(str, this.f12001e, i18, this.f12002f - i18);
                        this.f12003g = i17;
                        iC = (iB2 - i17) - iW2;
                        f1(iC);
                        this.f12003g = iB2;
                    } else {
                        iC = r1.c(str);
                        f1(iC);
                        this.f12003g = r1.b(str, this.f12001e, this.f12003g, iC);
                    }
                    this.f12004h += iC;
                } catch (r1.d e15) {
                    this.f12004h -= this.f12003g - i17;
                    this.f12003g = i17;
                    throw e15;
                } catch (ArrayIndexOutOfBoundsException e16) {
                    throw new d(e16);
                }
            } catch (r1.d e17) {
                c0(str, e17);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void V0(int i15, int i16) throws IOException {
            X0(s1.c(i15, i16));
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void W0(int i15, int i16) throws IOException {
            i1(20);
            e1(i15, 0);
            f1(i16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void X0(int i15) throws IOException {
            i1(5);
            f1(i15);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void Y0(int i15, long j15) throws IOException {
            i1(20);
            e1(i15, 0);
            g1(j15);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void Z0(long j15) throws IOException {
            i1(10);
            g1(j15);
        }

        @Override // androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.f
        public void a(byte[] bArr, int i15, int i16) throws IOException {
            j1(bArr, i15, i16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void b0() throws IOException {
            if (this.f12003g > 0) {
                h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void i0(byte b15) throws IOException {
            if (this.f12003g == this.f12002f) {
                h1();
            }
            a1(b15);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void j0(int i15, boolean z15) throws IOException {
            i1(11);
            e1(i15, 0);
            a1(z15 ? (byte) 1 : (byte) 0);
        }

        public void j1(byte[] bArr, int i15, int i16) throws IOException {
            int i17 = this.f12002f;
            int i18 = this.f12003g;
            if (i17 - i18 >= i16) {
                System.arraycopy(bArr, i15, this.f12001e, i18, i16);
                this.f12003g += i16;
                this.f12004h += i16;
                return;
            }
            int i19 = i17 - i18;
            System.arraycopy(bArr, i15, this.f12001e, i18, i19);
            int i25 = i15 + i19;
            int i26 = i16 - i19;
            this.f12003g = this.f12002f;
            this.f12004h += i19;
            h1();
            if (i26 <= this.f12002f) {
                System.arraycopy(bArr, i25, this.f12001e, 0, i26);
                this.f12003g = i26;
            } else {
                this.f12009i.write(bArr, i25, i26);
            }
            this.f12004h += i26;
        }

        public void k1(int i15, r0 r0Var) throws IOException {
            V0(i15, 2);
            I0(r0Var);
        }

        void l1(r0 r0Var, g1 g1Var) throws IOException {
            X0(((androidx.datastore.preferences.protobuf.a) r0Var).f(g1Var));
            g1Var.i(r0Var, this.f11999a);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void m0(byte[] bArr, int i15, int i16) throws IOException {
            X0(i16);
            j1(bArr, i15, i16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void n0(int i15, g gVar) throws IOException {
            V0(i15, 2);
            o0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void o0(g gVar) throws IOException {
            X0(gVar.size());
            gVar.L(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void t0(int i15, int i16) throws IOException {
            i1(14);
            e1(i15, 5);
            b1(i16);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void u0(int i15) throws IOException {
            i1(4);
            b1(i15);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void v0(int i15, long j15) throws IOException {
            i1(18);
            e1(i15, 1);
            c1(j15);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public void w0(long j15) throws IOException {
            i1(8);
            c1(j15);
        }
    }

    public static int A(int i15, d0 d0Var) {
        return U(i15) + B(d0Var);
    }

    public static int B(d0 d0Var) {
        return C(d0Var.b());
    }

    static int C(int i15) {
        return W(i15) + i15;
    }

    public static int D(int i15, r0 r0Var) {
        return (U(1) * 2) + V(2, i15) + E(3, r0Var);
    }

    public static int E(int i15, r0 r0Var) {
        return U(i15) + G(r0Var);
    }

    static int F(int i15, r0 r0Var, g1 g1Var) {
        return U(i15) + H(r0Var, g1Var);
    }

    public static int G(r0 r0Var) {
        return C(r0Var.e());
    }

    static int H(r0 r0Var, g1 g1Var) {
        return C(((androidx.datastore.preferences.protobuf.a) r0Var).f(g1Var));
    }

    static int I(int i15) {
        return i15 > 4096 ? PKIFailureInfo.certConfirmed : i15;
    }

    public static int J(int i15, g gVar) {
        return (U(1) * 2) + V(2, i15) + g(3, gVar);
    }

    public static int K(int i15, int i16) {
        return U(i15) + L(i16);
    }

    public static int L(int i15) {
        return 4;
    }

    public static int M(int i15, long j15) {
        return U(i15) + N(j15);
    }

    public static int N(long j15) {
        return 8;
    }

    public static int O(int i15, int i16) {
        return U(i15) + P(i16);
    }

    public static int P(int i15) {
        return W(Z(i15));
    }

    public static int Q(int i15, long j15) {
        return U(i15) + R(j15);
    }

    public static int R(long j15) {
        return Y(a0(j15));
    }

    public static int S(int i15, String str) {
        return U(i15) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = r1.c(str);
        } catch (r1.d unused) {
            length = str.getBytes(z.f12228b).length;
        }
        return C(length);
    }

    public static int U(int i15) {
        return W(s1.c(i15, 0));
    }

    public static int V(int i15, int i16) {
        return U(i15) + W(i16);
    }

    public static int W(int i15) {
        return (352 - (Integer.numberOfLeadingZeros(i15) * 9)) >>> 6;
    }

    public static int X(int i15, long j15) {
        return U(i15) + Y(j15);
    }

    public static int Y(long j15) {
        return (640 - (Long.numberOfLeadingZeros(j15) * 9)) >>> 6;
    }

    public static int Z(int i15) {
        return (i15 >> 31) ^ (i15 << 1);
    }

    public static long a0(long j15) {
        return (j15 >> 63) ^ (j15 << 1);
    }

    public static int d(int i15, boolean z15) {
        return U(i15) + e(z15);
    }

    public static int e(boolean z15) {
        return 1;
    }

    public static j e0(OutputStream outputStream, int i15) {
        return new e(outputStream, i15);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static j f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
    }

    public static int g(int i15, g gVar) {
        return U(i15) + h(gVar);
    }

    public static j g0(byte[] bArr, int i15, int i16) {
        return new c(bArr, i15, i16);
    }

    public static int h(g gVar) {
        return C(gVar.size());
    }

    public static int i(int i15, double d15) {
        return U(i15) + j(d15);
    }

    public static int j(double d15) {
        return 8;
    }

    public static int k(int i15, int i16) {
        return U(i15) + l(i16);
    }

    public static int l(int i15) {
        return w(i15);
    }

    public static int m(int i15, int i16) {
        return U(i15) + n(i16);
    }

    public static int n(int i15) {
        return 4;
    }

    public static int o(int i15, long j15) {
        return U(i15) + p(j15);
    }

    public static int p(long j15) {
        return 8;
    }

    public static int q(int i15, float f15) {
        return U(i15) + r(f15);
    }

    public static int r(float f15) {
        return 4;
    }

    @Deprecated
    static int s(int i15, r0 r0Var, g1 g1Var) {
        return (U(i15) * 2) + u(r0Var, g1Var);
    }

    @Deprecated
    public static int t(r0 r0Var) {
        return r0Var.e();
    }

    @Deprecated
    static int u(r0 r0Var, g1 g1Var) {
        return ((androidx.datastore.preferences.protobuf.a) r0Var).f(g1Var);
    }

    public static int v(int i15, int i16) {
        return U(i15) + w(i16);
    }

    public static int w(int i15) {
        return Y(i15);
    }

    public static int x(int i15, long j15) {
        return U(i15) + y(j15);
    }

    public static int y(long j15) {
        return Y(j15);
    }

    public static int z(int i15, d0 d0Var) {
        return (U(1) * 2) + V(2, i15) + A(3, d0Var);
    }

    @Deprecated
    final void A0(int i15, r0 r0Var, g1 g1Var) {
        V0(i15, 3);
        C0(r0Var, g1Var);
        V0(i15, 4);
    }

    @Deprecated
    public final void B0(r0 r0Var) {
        r0Var.m(this);
    }

    @Deprecated
    final void C0(r0 r0Var, g1 g1Var) {
        g1Var.i(r0Var, this.f11999a);
    }

    public abstract void D0(int i15, int i16);

    public abstract void E0(int i15);

    public final void F0(int i15, long j15) {
        Y0(i15, j15);
    }

    public final void G0(long j15) {
        Z0(j15);
    }

    abstract void H0(int i15, r0 r0Var, g1 g1Var);

    public abstract void I0(r0 r0Var);

    public abstract void J0(int i15, r0 r0Var);

    public abstract void K0(int i15, g gVar);

    public final void L0(int i15, int i16) {
        t0(i15, i16);
    }

    public final void M0(int i15) {
        u0(i15);
    }

    public final void N0(int i15, long j15) {
        v0(i15, j15);
    }

    public final void O0(long j15) {
        w0(j15);
    }

    public final void P0(int i15, int i16) {
        W0(i15, Z(i16));
    }

    public final void Q0(int i15) {
        X0(Z(i15));
    }

    public final void R0(int i15, long j15) {
        Y0(i15, a0(j15));
    }

    public final void S0(long j15) {
        Z0(a0(j15));
    }

    public abstract void T0(int i15, String str);

    public abstract void U0(String str);

    public abstract void V0(int i15, int i16);

    public abstract void W0(int i15, int i16);

    public abstract void X0(int i15);

    public abstract void Y0(int i15, long j15);

    public abstract void Z0(long j15);

    @Override // androidx.datastore.preferences.protobuf.f
    public abstract void a(byte[] bArr, int i15, int i16);

    public abstract void b0();

    public final void c() {
        if (h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c0(String str, r1.d dVar) throws d {
        f11997c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(z.f12228b);
        try {
            X0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e15) {
            throw new d(e15);
        }
    }

    boolean d0() {
        return this.f12000b;
    }

    public abstract int h0();

    public abstract void i0(byte b15);

    public abstract void j0(int i15, boolean z15);

    public final void k0(boolean z15) {
        i0(z15 ? (byte) 1 : (byte) 0);
    }

    public final void l0(byte[] bArr) {
        m0(bArr, 0, bArr.length);
    }

    abstract void m0(byte[] bArr, int i15, int i16);

    public abstract void n0(int i15, g gVar);

    public abstract void o0(g gVar);

    public final void p0(int i15, double d15) {
        v0(i15, Double.doubleToRawLongBits(d15));
    }

    public final void q0(double d15) {
        w0(Double.doubleToRawLongBits(d15));
    }

    public final void r0(int i15, int i16) {
        D0(i15, i16);
    }

    public final void s0(int i15) {
        E0(i15);
    }

    public abstract void t0(int i15, int i16);

    public abstract void u0(int i15);

    public abstract void v0(int i15, long j15);

    public abstract void w0(long j15);

    public final void x0(int i15, float f15) {
        t0(i15, Float.floatToRawIntBits(f15));
    }

    public final void y0(float f15) {
        u0(Float.floatToRawIntBits(f15));
    }

    @Deprecated
    public final void z0(int i15, r0 r0Var) {
        V0(i15, 3);
        B0(r0Var);
        V0(i15, 4);
    }

    private j() {
    }
}
