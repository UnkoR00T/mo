package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f29412b = Logger.getLogger(m0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f29413c = b4.x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    o0 f29414a;

    static class a extends m0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f29415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f29416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f29417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f29418g;

        a(byte[] bArr, int i15, int i16) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i17 = i15 + i16;
            if ((i15 | i16 | (bArr.length - i17)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i15), Integer.valueOf(i16)));
            }
            this.f29415d = bArr;
            this.f29416e = i15;
            this.f29418g = i15;
            this.f29417f = i17;
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void A0(int i15) throws c {
            try {
                byte[] bArr = this.f29415d;
                int i16 = this.f29418g;
                int i17 = i16 + 1;
                this.f29418g = i17;
                bArr[i16] = (byte) i15;
                int i18 = i16 + 2;
                this.f29418g = i18;
                bArr[i17] = (byte) (i15 >> 8);
                int i19 = i16 + 3;
                this.f29418g = i19;
                bArr[i18] = (byte) (i15 >> 16);
                this.f29418g = i16 + 4;
                bArr[i19] = i15 >> 24;
            } catch (IndexOutOfBoundsException e15) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29418g), Integer.valueOf(this.f29417f), 1), e15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void G(int i15, int i16) {
            y0((i15 << 3) | i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void I(int i15, a0 a0Var) {
            G(1, 3);
            b0(2, i15);
            m(3, a0Var);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void J(int i15, l2 l2Var) {
            G(1, 3);
            b0(2, i15);
            n(3, l2Var);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void K(int i15, boolean z15) {
            G(i15, 0);
            g(z15 ? (byte) 1 : (byte) 0);
        }

        public final int K0() {
            return this.f29418g - this.f29416e;
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void L(long j15) throws c {
            if (m0.f29413c && u() >= 10) {
                while ((j15 & (-128)) != 0) {
                    byte[] bArr = this.f29415d;
                    int i15 = this.f29418g;
                    this.f29418g = i15 + 1;
                    b4.k(bArr, i15, (byte) ((((int) j15) & CertificateBody.profileType) | 128));
                    j15 >>>= 7;
                }
                byte[] bArr2 = this.f29415d;
                int i16 = this.f29418g;
                this.f29418g = i16 + 1;
                b4.k(bArr2, i16, (byte) j15);
                return;
            }
            while ((j15 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f29415d;
                    int i17 = this.f29418g;
                    this.f29418g = i17 + 1;
                    bArr3[i17] = (byte) ((((int) j15) & CertificateBody.profileType) | 128);
                    j15 >>>= 7;
                } catch (IndexOutOfBoundsException e15) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29418g), Integer.valueOf(this.f29417f), 1), e15);
                }
            }
            byte[] bArr4 = this.f29415d;
            int i18 = this.f29418g;
            this.f29418g = i18 + 1;
            bArr4[i18] = (byte) j15;
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void M(l2 l2Var) {
            y0(l2Var.l());
            l2Var.i(this);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void T(int i15, int i16) {
            G(i15, 0);
            x0(i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void U(int i15, long j15) {
            G(i15, 1);
            c0(j15);
        }

        @Override // com.google.android.gms.internal.clearcut.z
        public final void a(byte[] bArr, int i15, int i16) {
            c(bArr, i15, i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public void b() {
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void b0(int i15, int i16) {
            G(i15, 0);
            y0(i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void c(byte[] bArr, int i15, int i16) throws c {
            try {
                System.arraycopy(bArr, i15, this.f29415d, this.f29418g, i16);
                this.f29418g += i16;
            } catch (IndexOutOfBoundsException e15) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29418g), Integer.valueOf(this.f29417f), Integer.valueOf(i16)), e15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void c0(long j15) throws c {
            try {
                byte[] bArr = this.f29415d;
                int i15 = this.f29418g;
                int i16 = i15 + 1;
                this.f29418g = i16;
                bArr[i15] = (byte) j15;
                int i17 = i15 + 2;
                this.f29418g = i17;
                bArr[i16] = (byte) (j15 >> 8);
                int i18 = i15 + 3;
                this.f29418g = i18;
                bArr[i17] = (byte) (j15 >> 16);
                int i19 = i15 + 4;
                this.f29418g = i19;
                bArr[i18] = (byte) (j15 >> 24);
                int i25 = i15 + 5;
                this.f29418g = i25;
                bArr[i19] = (byte) (j15 >> 32);
                int i26 = i15 + 6;
                this.f29418g = i26;
                bArr[i25] = (byte) (j15 >> 40);
                int i27 = i15 + 7;
                this.f29418g = i27;
                bArr[i26] = (byte) (j15 >> 48);
                this.f29418g = i15 + 8;
                bArr[i27] = (byte) (j15 >> 56);
            } catch (IndexOutOfBoundsException e15) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29418g), Integer.valueOf(this.f29417f), 1), e15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void g(byte b15) throws c {
            try {
                byte[] bArr = this.f29415d;
                int i15 = this.f29418g;
                this.f29418g = i15 + 1;
                bArr[i15] = b15;
            } catch (IndexOutOfBoundsException e15) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29418g), Integer.valueOf(this.f29417f), 1), e15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void i0(int i15, int i16) {
            G(i15, 5);
            A0(i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void l(int i15, long j15) {
            G(i15, 0);
            L(j15);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void m(int i15, a0 a0Var) {
            G(i15, 2);
            q(a0Var);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void m0(String str) throws c {
            int iB;
            int i15 = this.f29418g;
            try {
                int iD0 = m0.D0(str.length() * 3);
                int iD1 = m0.D0(str.length());
                if (iD1 == iD0) {
                    int i16 = i15 + iD1;
                    this.f29418g = i16;
                    iB = d4.b(str, this.f29415d, i16, u());
                    this.f29418g = i15;
                    y0((iB - i15) - iD1);
                } else {
                    y0(d4.a(str));
                    iB = d4.b(str, this.f29415d, this.f29418g, u());
                }
                this.f29418g = iB;
            } catch (g4 e15) {
                this.f29418g = i15;
                s(str, e15);
            } catch (IndexOutOfBoundsException e16) {
                throw new c(e16);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void n(int i15, l2 l2Var) {
            G(i15, 2);
            M(l2Var);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        final void o(int i15, l2 l2Var, c3 c3Var) {
            G(i15, 2);
            q qVar = (q) l2Var;
            int iD = qVar.d();
            if (iD == -1) {
                iD = c3Var.h(qVar);
                qVar.a(iD);
            }
            y0(iD);
            c3Var.e(l2Var, this.f29414a);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void p(int i15, String str) {
            G(i15, 2);
            m0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void q(a0 a0Var) {
            y0(a0Var.size());
            a0Var.h(this);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        final void r(l2 l2Var, c3 c3Var) {
            q qVar = (q) l2Var;
            int iD = qVar.d();
            if (iD == -1) {
                iD = c3Var.h(qVar);
                qVar.a(iD);
            }
            y0(iD);
            c3Var.e(l2Var, this.f29414a);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final int u() {
            return this.f29417f - this.f29418g;
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void x0(int i15) {
            if (i15 >= 0) {
                y0(i15);
            } else {
                L(i15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void y0(int i15) throws c {
            if (m0.f29413c && u() >= 10) {
                while ((i15 & (-128)) != 0) {
                    byte[] bArr = this.f29415d;
                    int i16 = this.f29418g;
                    this.f29418g = i16 + 1;
                    b4.k(bArr, i16, (byte) ((i15 & CertificateBody.profileType) | 128));
                    i15 >>>= 7;
                }
                byte[] bArr2 = this.f29415d;
                int i17 = this.f29418g;
                this.f29418g = i17 + 1;
                b4.k(bArr2, i17, (byte) i15);
                return;
            }
            while ((i15 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f29415d;
                    int i18 = this.f29418g;
                    this.f29418g = i18 + 1;
                    bArr3[i18] = (byte) ((i15 & CertificateBody.profileType) | 128);
                    i15 >>>= 7;
                } catch (IndexOutOfBoundsException e15) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29418g), Integer.valueOf(this.f29417f), 1), e15);
                }
            }
            byte[] bArr4 = this.f29415d;
            int i19 = this.f29418g;
            this.f29418g = i19 + 1;
            bArr4[i19] = (byte) i15;
        }
    }

    static final class b extends a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ByteBuffer f29419h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29420i;

        b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f29419h = byteBuffer;
            this.f29420i = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.m0.a, com.google.android.gms.internal.clearcut.m0
        public final void b() {
            this.f29419h.position(this.f29420i + K0());
        }
    }

    public static class c extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        c(String str) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        c(String str, Throwable th4) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th4);
        }

        c(Throwable th4) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th4);
        }
    }

    static final class d extends m0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ByteBuffer f29421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ByteBuffer f29422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f29423f;

        d(ByteBuffer byteBuffer) {
            super();
            this.f29421d = byteBuffer;
            this.f29422e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f29423f = byteBuffer.position();
        }

        private final void K0(String str) throws c {
            try {
                d4.c(str, this.f29422e);
            } catch (IndexOutOfBoundsException e15) {
                throw new c(e15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void A0(int i15) throws c {
            try {
                this.f29422e.putInt(i15);
            } catch (BufferOverflowException e15) {
                throw new c(e15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void G(int i15, int i16) {
            y0((i15 << 3) | i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void I(int i15, a0 a0Var) {
            G(1, 3);
            b0(2, i15);
            m(3, a0Var);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void J(int i15, l2 l2Var) {
            G(1, 3);
            b0(2, i15);
            n(3, l2Var);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void K(int i15, boolean z15) {
            G(i15, 0);
            g(z15 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void L(long j15) throws c {
            while (((-128) & j15) != 0) {
                try {
                    this.f29422e.put((byte) ((((int) j15) & CertificateBody.profileType) | 128));
                    j15 >>>= 7;
                } catch (BufferOverflowException e15) {
                    throw new c(e15);
                }
            }
            this.f29422e.put((byte) j15);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void M(l2 l2Var) {
            y0(l2Var.l());
            l2Var.i(this);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void T(int i15, int i16) {
            G(i15, 0);
            x0(i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void U(int i15, long j15) {
            G(i15, 1);
            c0(j15);
        }

        @Override // com.google.android.gms.internal.clearcut.z
        public final void a(byte[] bArr, int i15, int i16) {
            c(bArr, i15, i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void b() {
            this.f29421d.position(this.f29422e.position());
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void b0(int i15, int i16) {
            G(i15, 0);
            y0(i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void c(byte[] bArr, int i15, int i16) throws c {
            try {
                this.f29422e.put(bArr, i15, i16);
            } catch (IndexOutOfBoundsException e15) {
                throw new c(e15);
            } catch (BufferOverflowException e16) {
                throw new c(e16);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void c0(long j15) throws c {
            try {
                this.f29422e.putLong(j15);
            } catch (BufferOverflowException e15) {
                throw new c(e15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void g(byte b15) throws c {
            try {
                this.f29422e.put(b15);
            } catch (BufferOverflowException e15) {
                throw new c(e15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void i0(int i15, int i16) {
            G(i15, 5);
            A0(i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void l(int i15, long j15) {
            G(i15, 0);
            L(j15);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void m(int i15, a0 a0Var) {
            G(i15, 2);
            q(a0Var);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void m0(String str) throws c {
            int iPosition = this.f29422e.position();
            try {
                int iD0 = m0.D0(str.length() * 3);
                int iD1 = m0.D0(str.length());
                if (iD1 != iD0) {
                    y0(d4.a(str));
                    K0(str);
                    return;
                }
                int iPosition2 = this.f29422e.position() + iD1;
                this.f29422e.position(iPosition2);
                K0(str);
                int iPosition3 = this.f29422e.position();
                this.f29422e.position(iPosition);
                y0(iPosition3 - iPosition2);
                this.f29422e.position(iPosition3);
            } catch (g4 e15) {
                this.f29422e.position(iPosition);
                s(str, e15);
            } catch (IllegalArgumentException e16) {
                throw new c(e16);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void n(int i15, l2 l2Var) {
            G(i15, 2);
            M(l2Var);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        final void o(int i15, l2 l2Var, c3 c3Var) {
            G(i15, 2);
            r(l2Var, c3Var);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void p(int i15, String str) {
            G(i15, 2);
            m0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void q(a0 a0Var) {
            y0(a0Var.size());
            a0Var.h(this);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        final void r(l2 l2Var, c3 c3Var) {
            q qVar = (q) l2Var;
            int iD = qVar.d();
            if (iD == -1) {
                iD = c3Var.h(qVar);
                qVar.a(iD);
            }
            y0(iD);
            c3Var.e(l2Var, this.f29414a);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final int u() {
            return this.f29422e.remaining();
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void x0(int i15) {
            if (i15 >= 0) {
                y0(i15);
            } else {
                L(i15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void y0(int i15) throws c {
            while ((i15 & (-128)) != 0) {
                try {
                    this.f29422e.put((byte) ((i15 & CertificateBody.profileType) | 128));
                    i15 >>>= 7;
                } catch (BufferOverflowException e15) {
                    throw new c(e15);
                }
            }
            this.f29422e.put((byte) i15);
        }
    }

    static final class e extends m0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ByteBuffer f29424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ByteBuffer f29425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f29426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f29427g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f29428h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f29429i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f29430j;

        e(ByteBuffer byteBuffer) {
            super();
            this.f29424d = byteBuffer;
            this.f29425e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jO = b4.o(byteBuffer);
            this.f29426f = jO;
            long jPosition = ((long) byteBuffer.position()) + jO;
            this.f29427g = jPosition;
            long jLimit = jO + ((long) byteBuffer.limit());
            this.f29428h = jLimit;
            this.f29429i = jLimit - 10;
            this.f29430j = jPosition;
        }

        private final void K0(long j15) {
            this.f29425e.position((int) (j15 - this.f29426f));
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void A0(int i15) {
            this.f29425e.putInt((int) (this.f29430j - this.f29426f), i15);
            this.f29430j += 4;
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void G(int i15, int i16) {
            y0((i15 << 3) | i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void I(int i15, a0 a0Var) {
            G(1, 3);
            b0(2, i15);
            m(3, a0Var);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void J(int i15, l2 l2Var) {
            G(1, 3);
            b0(2, i15);
            n(3, l2Var);
            G(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void K(int i15, boolean z15) {
            G(i15, 0);
            g(z15 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void L(long j15) throws c {
            if (this.f29430j <= this.f29429i) {
                while ((j15 & (-128)) != 0) {
                    long j16 = this.f29430j;
                    this.f29430j = j16 + 1;
                    b4.c(j16, (byte) ((((int) j15) & CertificateBody.profileType) | 128));
                    j15 >>>= 7;
                }
                long j17 = this.f29430j;
                this.f29430j = 1 + j17;
                b4.c(j17, (byte) j15);
                return;
            }
            while (true) {
                long j18 = this.f29430j;
                if (j18 >= this.f29428h) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f29430j), Long.valueOf(this.f29428h), 1));
                }
                if ((j15 & (-128)) == 0) {
                    this.f29430j = 1 + j18;
                    b4.c(j18, (byte) j15);
                    return;
                } else {
                    this.f29430j = j18 + 1;
                    b4.c(j18, (byte) ((((int) j15) & CertificateBody.profileType) | 128));
                    j15 >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void M(l2 l2Var) {
            y0(l2Var.l());
            l2Var.i(this);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void T(int i15, int i16) {
            G(i15, 0);
            x0(i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void U(int i15, long j15) {
            G(i15, 1);
            c0(j15);
        }

        @Override // com.google.android.gms.internal.clearcut.z
        public final void a(byte[] bArr, int i15, int i16) {
            c(bArr, i15, i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void b() {
            this.f29424d.position((int) (this.f29430j - this.f29426f));
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void b0(int i15, int i16) {
            G(i15, 0);
            y0(i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void c(byte[] bArr, int i15, int i16) throws c {
            if (bArr != null && i15 >= 0 && i16 >= 0 && bArr.length - i16 >= i15) {
                long j15 = i16;
                long j16 = this.f29428h - j15;
                long j17 = this.f29430j;
                if (j16 >= j17) {
                    b4.l(bArr, i15, j17, j15);
                    this.f29430j += j15;
                    return;
                }
            }
            if (bArr != null) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f29430j), Long.valueOf(this.f29428h), Integer.valueOf(i16)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void c0(long j15) {
            this.f29425e.putLong((int) (this.f29430j - this.f29426f), j15);
            this.f29430j += 8;
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void g(byte b15) throws c {
            long j15 = this.f29430j;
            if (j15 >= this.f29428h) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f29430j), Long.valueOf(this.f29428h), 1));
            }
            this.f29430j = 1 + j15;
            b4.c(j15, b15);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void i0(int i15, int i16) {
            G(i15, 5);
            A0(i16);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void l(int i15, long j15) {
            G(i15, 0);
            L(j15);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void m(int i15, a0 a0Var) {
            G(i15, 2);
            q(a0Var);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void m0(String str) throws c {
            long j15 = this.f29430j;
            try {
                int iD0 = m0.D0(str.length() * 3);
                int iD1 = m0.D0(str.length());
                if (iD1 != iD0) {
                    int iA = d4.a(str);
                    y0(iA);
                    K0(this.f29430j);
                    d4.c(str, this.f29425e);
                    this.f29430j += (long) iA;
                    return;
                }
                int i15 = ((int) (this.f29430j - this.f29426f)) + iD1;
                this.f29425e.position(i15);
                d4.c(str, this.f29425e);
                int iPosition = this.f29425e.position() - i15;
                y0(iPosition);
                this.f29430j += (long) iPosition;
            } catch (g4 e15) {
                this.f29430j = j15;
                K0(j15);
                s(str, e15);
            } catch (IllegalArgumentException e16) {
                throw new c(e16);
            } catch (IndexOutOfBoundsException e17) {
                throw new c(e17);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void n(int i15, l2 l2Var) {
            G(i15, 2);
            M(l2Var);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        final void o(int i15, l2 l2Var, c3 c3Var) {
            G(i15, 2);
            r(l2Var, c3Var);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void p(int i15, String str) {
            G(i15, 2);
            m0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void q(a0 a0Var) {
            y0(a0Var.size());
            a0Var.h(this);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        final void r(l2 l2Var, c3 c3Var) {
            q qVar = (q) l2Var;
            int iD = qVar.d();
            if (iD == -1) {
                iD = c3Var.h(qVar);
                qVar.a(iD);
            }
            y0(iD);
            c3Var.e(l2Var, this.f29414a);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final int u() {
            return (int) (this.f29428h - this.f29430j);
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void x0(int i15) {
            if (i15 >= 0) {
                y0(i15);
            } else {
                L(i15);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.m0
        public final void y0(int i15) throws c {
            long j15;
            if (this.f29430j <= this.f29429i) {
                while (true) {
                    int i16 = i15 & (-128);
                    j15 = this.f29430j;
                    if (i16 == 0) {
                        break;
                    }
                    this.f29430j = j15 + 1;
                    b4.c(j15, (byte) ((i15 & CertificateBody.profileType) | 128));
                    i15 >>>= 7;
                }
            } else {
                while (true) {
                    j15 = this.f29430j;
                    if (j15 >= this.f29428h) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f29430j), Long.valueOf(this.f29428h), 1));
                    }
                    if ((i15 & (-128)) != 0) {
                        this.f29430j = j15 + 1;
                        b4.c(j15, (byte) ((i15 & CertificateBody.profileType) | 128));
                        i15 >>>= 7;
                    }
                }
            }
            this.f29430j = 1 + j15;
            b4.c(j15, (byte) i15);
        }
    }

    private m0() {
    }

    public static int A(int i15, s1 s1Var) {
        return (B0(1) << 1) + n0(2, i15) + d(3, s1Var);
    }

    static int B(int i15, l2 l2Var, c3 c3Var) {
        return B0(i15) + E(l2Var, c3Var);
    }

    public static int B0(int i15) {
        return D0(i15 << 3);
    }

    public static int C(int i15, String str) {
        return B0(i15) + q0(str);
    }

    public static int C0(int i15) {
        if (i15 >= 0) {
            return D0(i15);
        }
        return 10;
    }

    public static int D(a0 a0Var) {
        int size = a0Var.size();
        return D0(size) + size;
    }

    public static int D0(int i15) {
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

    static int E(l2 l2Var, c3 c3Var) {
        q qVar = (q) l2Var;
        int iD = qVar.d();
        if (iD == -1) {
            iD = c3Var.h(qVar);
            qVar.a(iD);
        }
        return D0(iD) + iD;
    }

    public static int E0(int i15) {
        return D0(I0(i15));
    }

    public static int F(boolean z15) {
        return 1;
    }

    public static int F0(int i15) {
        return 4;
    }

    public static int G0(int i15) {
        return 4;
    }

    public static int H0(int i15) {
        return C0(i15);
    }

    private static int I0(int i15) {
        return (i15 >> 31) ^ (i15 << 1);
    }

    @Deprecated
    public static int J0(int i15) {
        return D0(i15);
    }

    public static int N(int i15, a0 a0Var) {
        int iB0 = B0(i15);
        int size = a0Var.size();
        return iB0 + D0(size) + size;
    }

    public static int O(int i15, l2 l2Var) {
        return B0(i15) + R(l2Var);
    }

    @Deprecated
    static int P(int i15, l2 l2Var, c3 c3Var) {
        int iB0 = B0(i15) << 1;
        q qVar = (q) l2Var;
        int iD = qVar.d();
        if (iD == -1) {
            iD = c3Var.h(qVar);
            qVar.a(iD);
        }
        return iB0 + iD;
    }

    public static int Q(int i15, boolean z15) {
        return B0(i15) + 1;
    }

    public static int R(l2 l2Var) {
        int iL = l2Var.l();
        return D0(iL) + iL;
    }

    public static m0 S(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int W(int i15, long j15) {
        return B0(i15) + h0(j15);
    }

    public static int X(int i15, a0 a0Var) {
        return (B0(1) << 1) + n0(2, i15) + N(3, a0Var);
    }

    public static int Y(int i15, l2 l2Var) {
        return (B0(1) << 1) + n0(2, i15) + O(3, l2Var);
    }

    @Deprecated
    public static int Z(l2 l2Var) {
        return l2Var.l();
    }

    public static int a0(byte[] bArr) {
        int length = bArr.length;
        return D0(length) + length;
    }

    public static int d(int i15, s1 s1Var) {
        int iB0 = B0(i15);
        int iA = s1Var.a();
        return iB0 + D0(iA) + iA;
    }

    public static int d0(int i15, long j15) {
        return B0(i15) + h0(j15);
    }

    public static int e(s1 s1Var) {
        int iA = s1Var.a();
        return D0(iA) + iA;
    }

    public static int e0(long j15) {
        return h0(j15);
    }

    public static m0 f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return b4.y() ? new e(byteBuffer) : new d(byteBuffer);
    }

    public static int g0(int i15, long j15) {
        return B0(i15) + h0(u0(j15));
    }

    public static int h0(long j15) {
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

    public static int j0(int i15, int i16) {
        return B0(i15) + C0(i16);
    }

    public static int k0(int i15, long j15) {
        return B0(i15) + 8;
    }

    public static int l0(long j15) {
        return h0(u0(j15));
    }

    public static int n0(int i15, int i16) {
        return B0(i15) + D0(i16);
    }

    public static int o0(int i15, long j15) {
        return B0(i15) + 8;
    }

    public static int p0(long j15) {
        return 8;
    }

    public static int q0(String str) {
        int length;
        try {
            length = d4.a(str);
        } catch (g4 unused) {
            length = str.getBytes(h1.f29350a).length;
        }
        return D0(length) + length;
    }

    public static int r0(int i15, int i16) {
        return B0(i15) + D0(I0(i16));
    }

    public static int s0(long j15) {
        return 8;
    }

    public static int t0(int i15, int i16) {
        return B0(i15) + 4;
    }

    private static long u0(long j15) {
        return (j15 >> 63) ^ (j15 << 1);
    }

    public static int v0(int i15, int i16) {
        return B0(i15) + 4;
    }

    public static int w(double d15) {
        return 8;
    }

    public static int w0(int i15, int i16) {
        return B0(i15) + C0(i16);
    }

    public static int x(float f15) {
        return 4;
    }

    public static int y(int i15, double d15) {
        return B0(i15) + 8;
    }

    public static int z(int i15, float f15) {
        return B0(i15) + 4;
    }

    public abstract void A0(int i15);

    public abstract void G(int i15, int i16);

    public final void H(int i15, long j15) {
        l(i15, u0(j15));
    }

    public abstract void I(int i15, a0 a0Var);

    public abstract void J(int i15, l2 l2Var);

    public abstract void K(int i15, boolean z15);

    public abstract void L(long j15);

    public abstract void M(l2 l2Var);

    public abstract void T(int i15, int i16);

    public abstract void U(int i15, long j15);

    public final void V(long j15) {
        L(u0(j15));
    }

    public abstract void b();

    public abstract void b0(int i15, int i16);

    public abstract void c(byte[] bArr, int i15, int i16);

    public abstract void c0(long j15);

    public final void f0(int i15, int i16) {
        b0(i15, I0(i16));
    }

    public abstract void g(byte b15);

    public final void h(double d15) {
        c0(Double.doubleToRawLongBits(d15));
    }

    public final void i(float f15) {
        A0(Float.floatToRawIntBits(f15));
    }

    public abstract void i0(int i15, int i16);

    public final void j(int i15, double d15) {
        U(i15, Double.doubleToRawLongBits(d15));
    }

    public final void k(int i15, float f15) {
        i0(i15, Float.floatToRawIntBits(f15));
    }

    public abstract void l(int i15, long j15);

    public abstract void m(int i15, a0 a0Var);

    public abstract void m0(String str);

    public abstract void n(int i15, l2 l2Var);

    abstract void o(int i15, l2 l2Var, c3 c3Var);

    public abstract void p(int i15, String str);

    public abstract void q(a0 a0Var);

    abstract void r(l2 l2Var, c3 c3Var);

    final void s(String str, g4 g4Var) throws c {
        f29412b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) g4Var);
        byte[] bytes = str.getBytes(h1.f29350a);
        try {
            y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e15) {
            throw e15;
        } catch (IndexOutOfBoundsException e16) {
            throw new c(e16);
        }
    }

    public final void t(boolean z15) {
        g(z15 ? (byte) 1 : (byte) 0);
    }

    public abstract int u();

    public abstract void x0(int i15);

    public abstract void y0(int i15);

    public final void z0(int i15) {
        y0(I0(i15));
    }
}
