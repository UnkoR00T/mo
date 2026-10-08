package com.google.android.gms.internal.clearcut;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes3.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f29524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m0 f29525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29526c;

    private q4(ByteBuffer byteBuffer) {
        this.f29524a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int A(int i15) {
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

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i15 = 0;
        int i16 = 0;
        while (i16 < length && charSequence.charAt(i16) < 128) {
            i16++;
        }
        int i17 = length;
        while (i16 < length) {
            char cCharAt = charSequence.charAt(i16);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i16 < length2) {
                    char cCharAt2 = charSequence.charAt(i16);
                    if (cCharAt2 < 2048) {
                        i15 += (127 - cCharAt2) >>> 31;
                    } else {
                        i15 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i16) < 65536) {
                                StringBuilder sb5 = new StringBuilder(39);
                                sb5.append("Unpaired surrogate at index ");
                                sb5.append(i16);
                                throw new IllegalArgumentException(sb5.toString());
                            }
                            i16++;
                        }
                    }
                    i16++;
                }
                i17 += i15;
                break;
            }
            i17 += (127 - cCharAt) >>> 31;
            i16++;
        }
        if (i17 >= length) {
            return i17;
        }
        StringBuilder sb6 = new StringBuilder(54);
        sb6.append("UTF-8 length does not fit in int: ");
        sb6.append(((long) i17) + 4294967296L);
        throw new IllegalArgumentException(sb6.toString());
    }

    private final void e(int i15) throws r4 {
        byte b15 = (byte) i15;
        if (!this.f29524a.hasRemaining()) {
            throw new r4(this.f29524a.position(), this.f29524a.limit());
        }
        this.f29524a.put(b15);
    }

    private final void f(int i15) throws r4 {
        while ((i15 & (-128)) != 0) {
            e((i15 & CertificateBody.profileType) | 128);
            i15 >>>= 7;
        }
        e(i15);
    }

    public static int g(int i15, w4 w4Var) {
        int iY = y(i15);
        int iE = w4Var.e();
        return iY + A(iE) + iE;
    }

    public static int h(int i15, String str) {
        return y(i15) + r(str);
    }

    public static int i(int i15, byte[] bArr) {
        return y(i15) + s(bArr);
    }

    public static int m(int i15, long j15) {
        return y(i15) + x(j15);
    }

    private static void n(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i15;
        char cCharAt;
        int i16;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c15 = 57343;
        int i17 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i17 < length) {
                char cCharAt2 = charSequence.charAt(i17);
                if (cCharAt2 < 128) {
                    i16 = cCharAt2;
                    byteBuffer.put((byte) i16);
                } else if (cCharAt2 < 2048) {
                    byteBuffer.put((byte) ((cCharAt2 >>> 6) | 960));
                    i16 = (cCharAt2 & '?') | 128;
                    i16 = cCharAt2;
                    byteBuffer.put((byte) i16);
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i18 = i17 + 1;
                        if (i18 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i17 = i18;
                            } else {
                                i17 = i18;
                            }
                        }
                        StringBuilder sb5 = new StringBuilder(39);
                        sb5.append("Unpaired surrogate at index ");
                        sb5.append(i17 - 1);
                        throw new IllegalArgumentException(sb5.toString());
                    }
                    byteBuffer.put((byte) ((cCharAt2 >>> '\f') | 480));
                    byteBuffer.put((byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((cCharAt2 & '?') | 128));
                }
                i17++;
            }
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i19 = iRemaining + iArrayOffset;
            while (i17 < length2) {
                int i25 = i17 + iArrayOffset;
                if (i25 >= i19 || (cCharAt = charSequence.charAt(i17)) >= 128) {
                    break;
                }
                bArrArray[i25] = (byte) cCharAt;
                i17++;
            }
            if (i17 == length2) {
                i15 = iArrayOffset + length2;
            } else {
                i15 = iArrayOffset + i17;
                while (i17 < length2) {
                    char cCharAt4 = charSequence.charAt(i17);
                    if (cCharAt4 < 128 && i15 < i19) {
                        bArrArray[i15] = (byte) cCharAt4;
                        i15++;
                    } else if (cCharAt4 < 2048 && i15 <= i19 - 2) {
                        int i26 = i15 + 1;
                        bArrArray[i15] = (byte) ((cCharAt4 >>> 6) | 960);
                        i15 += 2;
                        bArrArray[i26] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= 55296 && c15 >= cCharAt4) || i15 > i19 - 3) {
                            if (i15 > i19 - 4) {
                                StringBuilder sb6 = new StringBuilder(37);
                                sb6.append("Failed writing ");
                                sb6.append(cCharAt4);
                                sb6.append(" at index ");
                                sb6.append(i15);
                                throw new ArrayIndexOutOfBoundsException(sb6.toString());
                            }
                            int i27 = i17 + 1;
                            if (i27 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i27);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i15] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArrArray[i15 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i28 = i15 + 3;
                                    bArrArray[i15 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i15 += 4;
                                    bArrArray[i28] = (byte) ((codePoint2 & 63) | 128);
                                    i17 = i27;
                                } else {
                                    i17 = i27;
                                }
                            }
                            StringBuilder sb7 = new StringBuilder(39);
                            sb7.append("Unpaired surrogate at index ");
                            sb7.append(i17 - 1);
                            throw new IllegalArgumentException(sb7.toString());
                        }
                        bArrArray[i15] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i29 = i15 + 2;
                        bArrArray[i15 + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i15 += 3;
                        bArrArray[i29] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i17++;
                    c15 = 57343;
                }
            }
            byteBuffer.position(i15 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e15) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e15);
            throw bufferOverflowException;
        }
    }

    public static q4 q(byte[] bArr) {
        return t(bArr, 0, bArr.length);
    }

    public static int r(String str) {
        int iA = a(str);
        return A(iA) + iA;
    }

    public static int s(byte[] bArr) {
        return A(bArr.length) + bArr.length;
    }

    public static q4 t(byte[] bArr, int i15, int i16) {
        return new q4(bArr, 0, i16);
    }

    public static long v(long j15) {
        return (j15 >> 63) ^ (j15 << 1);
    }

    public static int x(long j15) {
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

    public static int y(int i15) {
        return A(i15 << 3);
    }

    public static int z(int i15) {
        if (i15 >= 0) {
            return A(i15);
        }
        return 10;
    }

    public final void b(int i15, w4 w4Var) throws r4 {
        j(i15, 2);
        if (w4Var.f29584a < 0) {
            w4Var.e();
        }
        f(w4Var.f29584a);
        w4Var.b(this);
    }

    public final void c(int i15, String str) throws r4 {
        j(i15, 2);
        try {
            int iA = A(str.length());
            if (iA != A(str.length() * 3)) {
                f(a(str));
                n(str, this.f29524a);
                return;
            }
            int iPosition = this.f29524a.position();
            if (this.f29524a.remaining() < iA) {
                throw new r4(iPosition + iA, this.f29524a.limit());
            }
            this.f29524a.position(iPosition + iA);
            n(str, this.f29524a);
            int iPosition2 = this.f29524a.position();
            this.f29524a.position(iPosition);
            f((iPosition2 - iPosition) - iA);
            this.f29524a.position(iPosition2);
        } catch (BufferOverflowException e15) {
            r4 r4Var = new r4(this.f29524a.position(), this.f29524a.limit());
            r4Var.initCause(e15);
            throw r4Var;
        }
    }

    public final void d(int i15, byte[] bArr) throws r4 {
        j(i15, 2);
        f(bArr.length);
        int length = bArr.length;
        if (this.f29524a.remaining() < length) {
            throw new r4(this.f29524a.position(), this.f29524a.limit());
        }
        this.f29524a.put(bArr, 0, length);
    }

    public final void j(int i15, int i16) throws r4 {
        f((i15 << 3) | i16);
    }

    public final void k(int i15, boolean z15) throws r4 {
        j(25, 0);
        byte b15 = z15 ? (byte) 1 : (byte) 0;
        if (!this.f29524a.hasRemaining()) {
            throw new r4(this.f29524a.position(), this.f29524a.limit());
        }
        this.f29524a.put(b15);
    }

    public final void l(int i15, int i16) throws r4 {
        j(i15, 0);
        if (i16 >= 0) {
            f(i16);
        } else {
            w(i16);
        }
    }

    public final void o(int i15, l2 l2Var) {
        if (this.f29525b != null) {
            if (this.f29526c != this.f29524a.position()) {
                this.f29525b.c(this.f29524a.array(), this.f29526c, this.f29524a.position() - this.f29526c);
            }
            m0 m0Var = this.f29525b;
            m0Var.n(i15, l2Var);
            m0Var.b();
            this.f29526c = this.f29524a.position();
        }
        this.f29525b = m0.f(this.f29524a);
        this.f29526c = this.f29524a.position();
        m0 m0Var2 = this.f29525b;
        m0Var2.n(i15, l2Var);
        m0Var2.b();
        this.f29526c = this.f29524a.position();
    }

    public final void p() {
        if (this.f29524a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.f29524a.remaining())));
        }
    }

    public final void u(int i15, long j15) throws r4 {
        j(i15, 0);
        w(j15);
    }

    public final void w(long j15) throws r4 {
        while (((-128) & j15) != 0) {
            e((((int) j15) & CertificateBody.profileType) | 128);
            j15 >>>= 7;
        }
        e((int) j15);
    }

    private q4(byte[] bArr, int i15, int i16) {
        this(ByteBuffer.wrap(bArr, i15, i16));
    }
}
