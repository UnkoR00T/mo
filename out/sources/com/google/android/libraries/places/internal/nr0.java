package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public final class nr0 implements Cloneable, ByteChannel, pr0, or0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yr0 f33095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33096b;

    @Override // com.google.android.libraries.places.internal.pr0
    public final short A() throws EOFException {
        int iK;
        long j15 = this.f33096b;
        if (j15 < 2) {
            throw new EOFException();
        }
        yr0 yr0Var = this.f33095a;
        int i15 = yr0Var.f34428b;
        int i16 = yr0Var.f34429c;
        if (i16 - i15 < 2) {
            iK = ((k() & 255) << 8) | (k() & 255);
        } else {
            byte[] bArr = yr0Var.f34427a;
            int i17 = (bArr[i15] & 255) << 8;
            int i18 = bArr[i15 + 1] & 255;
            this.f33096b = j15 - 2;
            int i19 = i15 + 2;
            if (i19 == i16) {
                this.f33095a = yr0Var.b();
                as0.b(yr0Var);
            } else {
                yr0Var.f34428b = i19;
            }
            iK = i17 | i18;
        }
        return (short) iK;
    }

    public final nr0 C0(String str) {
        T0(str, 0, str.length());
        return this;
    }

    public final nr0 C1(byte[] bArr) {
        P1(bArr, 0, bArr.length);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final rr0 C2(long j15) throws EOFException {
        if (j15 < 0 || j15 > 2147483647L) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 11);
            sb5.append("byteCount: ");
            sb5.append(j15);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (this.f33096b < j15) {
            throw new EOFException();
        }
        if (j15 < 4096) {
            return new rr0(y3(j15));
        }
        rr0 rr0VarJ = J((int) j15);
        e1(j15);
        return rr0VarJ;
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final /* bridge */ /* synthetic */ or0 D2(int i15) {
        p(i15);
        return this;
    }

    public final yr0 H(int i15) {
        if (i15 <= 0) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        yr0 yr0Var = this.f33095a;
        if (yr0Var == null) {
            yr0 yr0VarA = as0.a();
            this.f33095a = yr0VarA;
            yr0VarA.f34433g = yr0VarA;
            yr0VarA.f34432f = yr0VarA;
            return yr0VarA;
        }
        yr0 yr0Var2 = yr0Var.f34433g;
        if (yr0Var2.f34429c + i15 <= 8192 && yr0Var2.f34431e) {
            return yr0Var2;
        }
        yr0 yr0VarA2 = as0.a();
        yr0Var2.c(yr0VarA2);
        return yr0VarA2;
    }

    public final rr0 I() {
        long j15 = this.f33096b;
        if (j15 <= 2147483647L) {
            return J((int) j15);
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 22);
        sb5.append("size > Int.MAX_VALUE: ");
        sb5.append(j15);
        throw new IllegalStateException(sb5.toString());
    }

    public final rr0 J(int i15) {
        if (i15 == 0) {
            return rr0.f33593d;
        }
        jr0.a(this.f33096b, 0L, i15);
        yr0 yr0Var = this.f33095a;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i15) {
            int i19 = yr0Var.f34429c;
            int i25 = yr0Var.f34428b;
            if (i19 == i25) {
                throw new AssertionError("s.limit == s.pos");
            }
            i17 += i19 - i25;
            i18++;
            yr0Var = yr0Var.f34432f;
        }
        byte[][] bArr = new byte[i18][];
        int[] iArr = new int[i18 + i18];
        yr0 yr0Var2 = this.f33095a;
        int i26 = 0;
        while (i16 < i15) {
            bArr[i26] = yr0Var2.f34427a;
            i16 += yr0Var2.f34429c - yr0Var2.f34428b;
            iArr[i26] = Math.min(i16, i15);
            iArr[i26 + i18] = yr0Var2.f34428b;
            yr0Var2.f34430d = true;
            i26++;
            yr0Var2 = yr0Var2.f34432f;
        }
        return new bs0(bArr, iArr);
    }

    public final long K() {
        return this.f33096b;
    }

    public final void N(long j15) {
        this.f33096b = j15;
    }

    public final nr0 O(OutputStream outputStream, long j15) throws IOException {
        jr0.a(this.f33096b, 0L, j15);
        yr0 yr0Var = this.f33095a;
        long j16 = j15;
        while (j16 > 0) {
            int iMin = (int) Math.min(j16, yr0Var.f34429c - yr0Var.f34428b);
            outputStream.write(yr0Var.f34427a, yr0Var.f34428b, iMin);
            int i15 = yr0Var.f34428b + iMin;
            yr0Var.f34428b = i15;
            long j17 = iMin;
            this.f33096b -= j17;
            j16 -= j17;
            if (i15 == yr0Var.f34429c) {
                yr0 yr0VarB = yr0Var.b();
                this.f33095a = yr0VarB;
                as0.b(yr0Var);
                yr0Var = yr0VarB;
            }
        }
        return this;
    }

    public final nr0 P1(byte[] bArr, int i15, int i16) {
        long j15 = i16;
        jr0.a(bArr.length, i15, j15);
        int i17 = i15;
        while (true) {
            int i18 = i15 + i16;
            if (i17 >= i18) {
                this.f33096b += j15;
                return this;
            }
            yr0 yr0VarH = H(1);
            int iMin = Math.min(i18 - i17, 8192 - yr0VarH.f34429c);
            int i19 = i17 + iMin;
            pq.n.i(bArr, yr0VarH.f34427a, yr0VarH.f34429c, i17, i19);
            yr0VarH.f34429c += iMin;
            i17 = i19;
        }
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final /* bridge */ /* synthetic */ or0 S3(String str) {
        C0(str);
        return this;
    }

    public final nr0 T0(String str, int i15, int i16) {
        if (i16 < 0) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 27);
            sb5.append("endIndex < beginIndex: ");
            sb5.append(i16);
            sb5.append(" < 0");
            throw new IllegalArgumentException(sb5.toString());
        }
        if (i16 > str.length()) {
            int length = str.length();
            StringBuilder sb6 = new StringBuilder(String.valueOf(i16).length() + 29 + String.valueOf(length).length());
            sb6.append("endIndex > string.length: ");
            sb6.append(i16);
            sb6.append(" > ");
            sb6.append(length);
            throw new IllegalArgumentException(sb6.toString());
        }
        int i17 = 0;
        while (i17 < i16) {
            int i18 = i17 + 1;
            char cCharAt = str.charAt(i17);
            if (cCharAt < 128) {
                yr0 yr0VarH = H(1);
                byte[] bArr = yr0VarH.f34427a;
                int i19 = yr0VarH.f34429c - i17;
                int iMin = Math.min(i16, 8192 - i19);
                bArr[i17 + i19] = (byte) cCharAt;
                i17 = i18;
                while (i17 < iMin) {
                    char cCharAt2 = str.charAt(i17);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i17 + i19] = (byte) cCharAt2;
                    i17++;
                }
                int i25 = yr0VarH.f34429c;
                int i26 = (i19 + i17) - i25;
                yr0VarH.f34429c = i25 + i26;
                this.f33096b += (long) i26;
            } else {
                if (cCharAt < 2048) {
                    yr0 yr0VarH2 = H(2);
                    byte[] bArr2 = yr0VarH2.f34427a;
                    int i27 = yr0VarH2.f34429c;
                    bArr2[i27] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i27 + 1] = (byte) ((cCharAt & '?') | 128);
                    yr0VarH2.f34429c = i27 + 2;
                    this.f33096b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    yr0 yr0VarH3 = H(3);
                    byte[] bArr3 = yr0VarH3.f34427a;
                    int i28 = yr0VarH3.f34429c;
                    bArr3[i28] = (byte) ((cCharAt >> '\f') | BERTags.FLAGS);
                    bArr3[i28 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i28 + 2] = (byte) ((cCharAt & '?') | 128);
                    yr0VarH3.f34429c = i28 + 3;
                    this.f33096b += 3;
                } else {
                    char cCharAt3 = i18 < i16 ? str.charAt(i18) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        b(63);
                    } else {
                        yr0 yr0VarH4 = H(4);
                        byte[] bArr4 = yr0VarH4.f34427a;
                        int i29 = yr0VarH4.f34429c;
                        int i35 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + PKIFailureInfo.notAuthorized;
                        bArr4[i29] = (byte) ((i35 >> 18) | 240);
                        bArr4[i29 + 1] = (byte) (((i35 >> 12) & 63) | 128);
                        bArr4[i29 + 2] = (byte) (((i35 >> 6) & 63) | 128);
                        bArr4[i29 + 3] = (byte) ((i35 & 63) | 128);
                        yr0VarH4.f34429c = i29 + 4;
                        this.f33096b += 4;
                        i17 += 2;
                    }
                }
                i17 = i18;
            }
        }
        return this;
    }

    @Override // com.google.android.libraries.places.internal.es0
    public final long V1(nr0 nr0Var, long j15) {
        if (j15 < 0) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 15);
            sb5.append("byteCount < 0: ");
            sb5.append(j15);
            throw new IllegalArgumentException(sb5.toString());
        }
        long j16 = this.f33096b;
        if (j16 == 0) {
            return -1L;
        }
        if (j15 > j16) {
            j15 = j16;
        }
        nr0Var.q1(this, j15);
        return j15;
    }

    public final byte a0(long j15) {
        jr0.a(this.f33096b, j15, 1L);
        yr0 yr0Var = this.f33095a;
        yr0Var.getClass();
        long j16 = this.f33096b;
        if (j16 - j15 < j15) {
            while (j16 > j15) {
                yr0Var = yr0Var.f34433g;
                j16 -= (long) (yr0Var.f34429c - yr0Var.f34428b);
            }
            return yr0Var.f34427a[(int) ((((long) yr0Var.f34428b) + j15) - j16)];
        }
        long j17 = 0;
        while (true) {
            int i15 = yr0Var.f34429c;
            int i16 = yr0Var.f34428b;
            long j18 = ((long) (i15 - i16)) + j17;
            if (j18 > j15) {
                return yr0Var.f34427a[(int) ((((long) i16) + j15) - j17)];
            }
            yr0Var = yr0Var.f34432f;
            j17 = j18;
        }
    }

    public final nr0 b(int i15) {
        yr0 yr0VarH = H(1);
        byte[] bArr = yr0VarH.f34427a;
        int i16 = yr0VarH.f34429c;
        yr0VarH.f34429c = i16 + 1;
        bArr[i16] = (byte) i15;
        this.f33096b++;
        return this;
    }

    public final String c0() {
        return d0(this.f33096b, fu.d.UTF_8);
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final void c2(long j15) throws EOFException {
        if (this.f33096b < j15) {
            throw new EOFException();
        }
    }

    public final /* synthetic */ Object clone() {
        nr0 nr0Var = new nr0();
        if (this.f33096b == 0) {
            return nr0Var;
        }
        yr0 yr0Var = this.f33095a;
        yr0 yr0VarA = yr0Var.a();
        nr0Var.f33095a = yr0VarA;
        yr0VarA.f34433g = yr0VarA;
        yr0VarA.f34432f = yr0VarA;
        for (yr0 yr0Var2 = yr0Var.f34432f; yr0Var2 != yr0Var; yr0Var2 = yr0Var2.f34432f) {
            yr0VarA.f34433g.c(yr0Var2.a());
        }
        nr0Var.f33096b = this.f33096b;
        return nr0Var;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.es0
    public final void close() {
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final nr0 d() {
        return this;
    }

    public final String d0(long j15, Charset charset) throws EOFException {
        if (j15 < 0 || j15 > 2147483647L) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 11);
            sb5.append("byteCount: ");
            sb5.append(j15);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (this.f33096b < j15) {
            throw new EOFException();
        }
        if (j15 == 0) {
            return "";
        }
        yr0 yr0Var = this.f33095a;
        int i15 = yr0Var.f34428b;
        int i16 = yr0Var.f34429c;
        if (((long) i15) + j15 > i16) {
            return new String(y3(j15), charset);
        }
        int i17 = (int) j15;
        String str = new String(yr0Var.f34427a, i15, i17, charset);
        int i18 = i15 + i17;
        yr0Var.f34428b = i18;
        this.f33096b -= j15;
        if (i18 == i16) {
            this.f33095a = yr0Var.b();
            as0.b(yr0Var);
        }
        return str;
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final void e1(long j15) throws EOFException {
        while (j15 > 0) {
            yr0 yr0Var = this.f33095a;
            if (yr0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j15, yr0Var.f34429c - yr0Var.f34428b);
            long j16 = iMin;
            this.f33096b -= j16;
            j15 -= j16;
            int i15 = yr0Var.f34428b + iMin;
            yr0Var.f34428b = i15;
            if (i15 == yr0Var.f34429c) {
                this.f33095a = yr0Var.b();
                as0.b(yr0Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr0)) {
            return false;
        }
        long j15 = this.f33096b;
        nr0 nr0Var = (nr0) obj;
        if (j15 != nr0Var.f33096b) {
            return false;
        }
        if (j15 == 0) {
            return true;
        }
        yr0 yr0Var = this.f33095a;
        yr0 yr0Var2 = nr0Var.f33095a;
        int i15 = yr0Var.f34428b;
        int i16 = yr0Var2.f34428b;
        long j16 = 0;
        while (j16 < this.f33096b) {
            long jMin = Math.min(yr0Var.f34429c - i15, yr0Var2.f34429c - i16);
            long j17 = 0;
            while (j17 < jMin) {
                int i17 = i15 + 1;
                int i18 = i16 + 1;
                if (yr0Var.f34427a[i15] != yr0Var2.f34427a[i16]) {
                    return false;
                }
                j17++;
                i15 = i17;
                i16 = i18;
            }
            if (i15 == yr0Var.f34429c) {
                yr0Var = yr0Var.f34432f;
                i15 = yr0Var.f34428b;
            }
            if (i16 == yr0Var2.f34429c) {
                yr0Var2 = yr0Var2.f34432f;
                i16 = yr0Var2.f34428b;
            }
            j16 += jMin;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final boolean f() {
        return this.f33096b == 0;
    }

    @Override // com.google.android.libraries.places.internal.or0, com.google.android.libraries.places.internal.cs0, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        yr0 yr0Var = this.f33095a;
        if (yr0Var == null) {
            return 0;
        }
        int i15 = 1;
        do {
            int i16 = yr0Var.f34429c;
            for (int i17 = yr0Var.f34428b; i17 < i16; i17++) {
                i15 = (i15 * 31) + yr0Var.f34427a[i17];
            }
            yr0Var = yr0Var.f34432f;
        } while (yr0Var != this.f33095a);
        return i15;
    }

    public final nr0 i1(int i15) {
        if (i15 < 128) {
            b(i15);
            return this;
        }
        if (i15 < 2048) {
            yr0 yr0VarH = H(2);
            byte[] bArr = yr0VarH.f34427a;
            int i16 = yr0VarH.f34429c;
            bArr[i16] = (byte) ((i15 >> 6) | 192);
            bArr[i16 + 1] = (byte) ((i15 & 63) | 128);
            yr0VarH.f34429c = i16 + 2;
            this.f33096b += 2;
            return this;
        }
        if (i15 >= 55296 && i15 < 57344) {
            b(63);
            return this;
        }
        if (i15 < 65536) {
            yr0 yr0VarH2 = H(3);
            byte[] bArr2 = yr0VarH2.f34427a;
            int i17 = yr0VarH2.f34429c;
            bArr2[i17] = (byte) ((i15 >> 12) | BERTags.FLAGS);
            bArr2[i17 + 1] = (byte) (((i15 >> 6) & 63) | 128);
            bArr2[i17 + 2] = (byte) ((i15 & 63) | 128);
            yr0VarH2.f34429c = i17 + 3;
            this.f33096b += 3;
            return this;
        }
        if (i15 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(String.valueOf(jr0.c(i15))));
        }
        yr0 yr0VarH3 = H(4);
        byte[] bArr3 = yr0VarH3.f34427a;
        int i18 = yr0VarH3.f34429c;
        bArr3[i18] = (byte) ((i15 >> 18) | 240);
        bArr3[i18 + 1] = (byte) (((i15 >> 12) & 63) | 128);
        bArr3[i18 + 2] = (byte) (((i15 >> 6) & 63) | 128);
        bArr3[i18 + 3] = (byte) ((i15 & 63) | 128);
        yr0VarH3.f34429c = i18 + 4;
        this.f33096b += 4;
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final /* bridge */ /* synthetic */ or0 j3(int i15) {
        b(i15);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final byte k() throws EOFException {
        long j15 = this.f33096b;
        if (j15 == 0) {
            throw new EOFException();
        }
        yr0 yr0Var = this.f33095a;
        int i15 = yr0Var.f34428b;
        int i16 = yr0Var.f34429c;
        int i17 = i15 + 1;
        byte b15 = yr0Var.f34427a[i15];
        this.f33096b = j15 - 1;
        if (i17 != i16) {
            yr0Var.f34428b = i17;
            return b15;
        }
        this.f33095a = yr0Var.b();
        as0.b(yr0Var);
        return b15;
    }

    public final nr0 m(int i15) {
        yr0 yr0VarH = H(2);
        byte[] bArr = yr0VarH.f34427a;
        int i16 = yr0VarH.f34429c;
        bArr[i16] = (byte) ((i15 >>> 8) & GF2Field.MASK);
        bArr[i16 + 1] = (byte) (i15 & GF2Field.MASK);
        yr0VarH.f34429c = i16 + 2;
        this.f33096b += 2;
        return this;
    }

    public final String n0(long j15) throws EOFException {
        yr0 yr0Var;
        long j16;
        long j17;
        long j18;
        long j19;
        long j25 = this.f33096b;
        long j26 = j25 < Long.MAX_VALUE ? j25 : Long.MAX_VALUE;
        long j27 = 0;
        if (j26 == 0 || (yr0Var = this.f33095a) == null) {
            j16 = 0;
            j19 = -1;
            j17 = -1;
        } else if (j25 < 0) {
            while (j25 > 0) {
                yr0Var = yr0Var.f34433g;
                j25 -= (long) (yr0Var.f34429c - yr0Var.f34428b);
            }
            long j28 = 0;
            while (true) {
                if (j25 < j26) {
                    byte[] bArr = yr0Var.f34427a;
                    j16 = j27;
                    j17 = -1;
                    int iMin = (int) Math.min(yr0Var.f34429c, (((long) yr0Var.f34428b) + j26) - j25);
                    int i15 = (int) ((((long) yr0Var.f34428b) + j28) - j25);
                    while (true) {
                        if (i15 >= iMin) {
                            j28 = j25 + ((long) (yr0Var.f34429c - yr0Var.f34428b));
                            yr0Var = yr0Var.f34432f;
                            j27 = j16;
                            j25 = j28;
                        } else if (bArr[i15] == 10) {
                            j18 = i15 - yr0Var.f34428b;
                            j19 = j18 + j25;
                        } else {
                            i15++;
                        }
                    }
                } else {
                    j16 = j27;
                    j17 = -1;
                    j19 = j17;
                }
            }
        } else {
            j16 = 0;
            j17 = -1;
            j25 = 0;
            while (true) {
                long j29 = ((long) (yr0Var.f34429c - yr0Var.f34428b)) + j25;
                if (j29 > 0) {
                    break;
                }
                yr0Var = yr0Var.f34432f;
                j25 = j29;
            }
            long j35 = 0;
            while (true) {
                if (j25 < j26) {
                    byte[] bArr2 = yr0Var.f34427a;
                    int iMin2 = (int) Math.min(yr0Var.f34429c, (((long) yr0Var.f34428b) + j26) - j25);
                    int i16 = (int) ((((long) yr0Var.f34428b) + j35) - j25);
                    while (true) {
                        if (i16 >= iMin2) {
                            j35 = ((long) (yr0Var.f34429c - yr0Var.f34428b)) + j25;
                            yr0Var = yr0Var.f34432f;
                            j25 = j35;
                        } else if (bArr2[i16] == 10) {
                            j18 = i16 - yr0Var.f34428b;
                            j19 = j18 + j25;
                        } else {
                            i16++;
                        }
                    }
                } else {
                    j19 = j17;
                }
            }
        }
        if (j19 != j17) {
            int i17 = is0.f32608b;
            if (j19 > j16) {
                long j36 = j19 + j17;
                if (a0(j36) == 13) {
                    String strD0 = d0(j36, fu.d.UTF_8);
                    e1(2L);
                    return strD0;
                }
            }
            String strD1 = d0(j19, fu.d.UTF_8);
            e1(1L);
            return strD1;
        }
        nr0 nr0Var = new nr0();
        long jMin = Math.min(32L, this.f33096b);
        jr0.a(this.f33096b, 0L, jMin);
        if (jMin != j16) {
            nr0Var.f33096b += jMin;
            yr0 yr0Var2 = this.f33095a;
            long j37 = j16;
            while (true) {
                long j38 = yr0Var2.f34429c - yr0Var2.f34428b;
                if (j37 < j38) {
                    break;
                }
                yr0Var2 = yr0Var2.f34432f;
                j37 -= j38;
            }
            while (jMin > j16) {
                yr0 yr0VarA = yr0Var2.a();
                int i18 = yr0VarA.f34428b + ((int) j37);
                yr0VarA.f34428b = i18;
                yr0VarA.f34429c = Math.min(i18 + ((int) jMin), yr0VarA.f34429c);
                yr0 yr0Var3 = nr0Var.f33095a;
                if (yr0Var3 == null) {
                    yr0VarA.f34433g = yr0VarA;
                    yr0VarA.f34432f = yr0VarA;
                    nr0Var.f33095a = yr0VarA;
                } else {
                    yr0Var3.f34433g.c(yr0VarA);
                }
                jMin -= (long) (yr0VarA.f34429c - yr0VarA.f34428b);
                yr0Var2 = yr0Var2.f34432f;
                j37 = j16;
            }
        }
        long jMin2 = Math.min(this.f33096b, Long.MAX_VALUE);
        String strO = nr0Var.C2(nr0Var.f33096b).o();
        StringBuilder sb5 = new StringBuilder(String.valueOf(jMin2).length() + 29 + String.valueOf(strO).length() + 1);
        sb5.append("\\n not found: limit=");
        sb5.append(jMin2);
        sb5.append(" content=");
        sb5.append(strO);
        sb5.append("…");
        throw new EOFException(sb5.toString());
    }

    public final long o() {
        long j15 = this.f33096b;
        if (j15 == 0) {
            return 0L;
        }
        yr0 yr0Var = this.f33095a.f34433g;
        int i15 = yr0Var.f34429c;
        return (i15 >= 8192 || !yr0Var.f34431e) ? j15 : j15 - ((long) (i15 - yr0Var.f34428b));
    }

    public final nr0 p(int i15) {
        yr0 yr0VarH = H(4);
        byte[] bArr = yr0VarH.f34427a;
        int i16 = yr0VarH.f34429c;
        bArr[i16] = (byte) (i15 >> 24);
        bArr[i16 + 1] = (byte) ((i15 >>> 16) & GF2Field.MASK);
        bArr[i16 + 2] = (byte) ((i15 >>> 8) & GF2Field.MASK);
        bArr[i16 + 3] = (byte) (i15 & GF2Field.MASK);
        yr0VarH.f34429c = i16 + 4;
        this.f33096b += 4;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final /* bridge */ /* synthetic */ or0 p2(byte[] bArr) {
        C1(bArr);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final int q() throws EOFException {
        long j15 = this.f33096b;
        if (j15 < 4) {
            throw new EOFException();
        }
        yr0 yr0Var = this.f33095a;
        int i15 = yr0Var.f34428b;
        int i16 = yr0Var.f34429c;
        if (i16 - i15 < 4) {
            return ((k() & 255) << 24) | ((k() & 255) << 16) | ((k() & 255) << 8) | (k() & 255);
        }
        byte[] bArr = yr0Var.f34427a;
        int i17 = (bArr[i15] & 255) << 24;
        int i18 = (bArr[i15 + 1] & 255) << 16;
        int i19 = (bArr[i15 + 2] & 255) << 8;
        int i25 = bArr[i15 + 3] & 255;
        this.f33096b = j15 - 4;
        int i26 = i17 | i18 | i19 | i25;
        int i27 = i15 + 4;
        if (i27 != i16) {
            yr0Var.f34428b = i27;
            return i26;
        }
        this.f33095a = yr0Var.b();
        as0.b(yr0Var);
        return i26;
    }

    @Override // com.google.android.libraries.places.internal.cs0
    public final void q1(nr0 nr0Var, long j15) {
        if (nr0Var == this) {
            throw new IllegalArgumentException("source == this");
        }
        jr0.a(nr0Var.f33096b, 0L, j15);
        while (j15 > 0) {
            yr0 yr0Var = nr0Var.f33095a;
            if (j15 < yr0Var.f34429c - yr0Var.f34428b) {
                yr0 yr0Var2 = this.f33095a;
                yr0 yr0Var3 = yr0Var2 != null ? yr0Var2.f34433g : null;
                int i15 = (int) j15;
                if (yr0Var3 != null && yr0Var3.f34431e) {
                    if ((((long) yr0Var3.f34429c) + j15) - ((long) (yr0Var3.f34430d ? 0 : yr0Var3.f34428b)) <= 8192) {
                        yr0Var.e(yr0Var3, i15);
                        nr0Var.f33096b -= j15;
                        this.f33096b += j15;
                        return;
                    }
                }
                nr0Var.f33095a = yr0Var.d(i15);
            }
            yr0 yr0Var4 = nr0Var.f33095a;
            int i16 = yr0Var4.f34429c - yr0Var4.f34428b;
            nr0Var.f33095a = yr0Var4.b();
            yr0 yr0Var5 = this.f33095a;
            if (yr0Var5 == null) {
                this.f33095a = yr0Var4;
                yr0Var4.f34433g = yr0Var4;
                yr0Var4.f34432f = yr0Var4;
            } else {
                yr0Var5.f34433g.c(yr0Var4);
                yr0 yr0Var6 = yr0Var4.f34433g;
                if (yr0Var6 == yr0Var4) {
                    throw new IllegalStateException("cannot compact");
                }
                if (yr0Var6.f34431e) {
                    int i17 = yr0Var4.f34429c - yr0Var4.f34428b;
                    if (i17 <= (8192 - yr0Var6.f34429c) + (yr0Var6.f34430d ? 0 : yr0Var6.f34428b)) {
                        yr0Var4.e(yr0Var6, i17);
                        yr0Var4.b();
                        as0.b(yr0Var4);
                    }
                }
            }
            long j16 = i16;
            nr0Var.f33096b -= j16;
            this.f33096b += j16;
            j15 -= j16;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        yr0 yr0Var = this.f33095a;
        if (yr0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), yr0Var.f34429c - yr0Var.f34428b);
        byteBuffer.put(yr0Var.f34427a, yr0Var.f34428b, iMin);
        int i15 = yr0Var.f34428b + iMin;
        yr0Var.f34428b = i15;
        this.f33096b -= (long) iMin;
        if (i15 == yr0Var.f34429c) {
            this.f33095a = yr0Var.b();
            as0.b(yr0Var);
        }
        return iMin;
    }

    public final int t0(byte[] bArr, int i15, int i16) {
        jr0.a(bArr.length, i15, i16);
        yr0 yr0Var = this.f33095a;
        if (yr0Var == null) {
            return -1;
        }
        int iMin = Math.min(i16, yr0Var.f34429c - yr0Var.f34428b);
        int i17 = yr0Var.f34428b;
        pq.n.i(yr0Var.f34427a, bArr, i15, i17, i17 + iMin);
        int i18 = yr0Var.f34428b + iMin;
        yr0Var.f34428b = i18;
        this.f33096b -= (long) iMin;
        if (i18 != yr0Var.f34429c) {
            return iMin;
        }
        this.f33095a = yr0Var.b();
        as0.b(yr0Var);
        return iMin;
    }

    public final String toString() {
        return I().toString();
    }

    public final nr0 u0(rr0 rr0Var) {
        rr0Var.w(this, 0, rr0Var.s());
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i15 = iRemaining;
        while (i15 > 0) {
            yr0 yr0VarH = H(1);
            int iMin = Math.min(i15, 8192 - yr0VarH.f34429c);
            byteBuffer.get(yr0VarH.f34427a, yr0VarH.f34429c, iMin);
            i15 -= iMin;
            yr0VarH.f34429c += iMin;
        }
        this.f33096b += (long) iRemaining;
        return iRemaining;
    }

    @Override // com.google.android.libraries.places.internal.or0
    public final /* bridge */ /* synthetic */ or0 x2(int i15) {
        m(i15);
        return this;
    }

    public final nr0 y(long j15) {
        if (j15 == 0) {
            b(48);
            return this;
        }
        long j16 = (j15 >>> 1) | j15;
        long j17 = j16 | (j16 >>> 2);
        long j18 = j17 | (j17 >>> 4);
        long j19 = j18 | (j18 >>> 8);
        long j25 = j19 - ((j19 >>> 1) & 6148914691236517205L);
        long j26 = ((j25 >>> 2) & 3689348814741910323L) + (j25 & 3689348814741910323L);
        long j27 = ((j26 >>> 4) + j26) & 1085102592571150095L;
        long j28 = j27 + (j27 >>> 8);
        long j29 = j28 + (j28 >>> 16);
        int i15 = (int) ((((j29 & 63) + ((j29 >>> 32) & 63)) + 3) >> 2);
        yr0 yr0VarH = H(i15);
        byte[] bArr = yr0VarH.f34427a;
        int i16 = yr0VarH.f34429c;
        int i17 = i16 + i15;
        while (true) {
            i17--;
            if (i17 < i16) {
                yr0VarH.f34429c += i15;
                this.f33096b += (long) i15;
                return this;
            }
            bArr[i17] = is0.a()[(int) (15 & j15)];
            j15 >>>= 4;
        }
    }

    @Override // com.google.android.libraries.places.internal.pr0
    public final byte[] y3(long j15) throws EOFException {
        if (j15 < 0 || j15 > 2147483647L) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 11);
            sb5.append("byteCount: ");
            sb5.append(j15);
            throw new IllegalArgumentException(sb5.toString());
        }
        if (this.f33096b < j15) {
            throw new EOFException();
        }
        int i15 = (int) j15;
        byte[] bArr = new byte[i15];
        int i16 = 0;
        while (i16 < i15) {
            int iT0 = t0(bArr, i16, i15 - i16);
            if (iT0 == -1) {
                throw new EOFException();
            }
            i16 += iT0;
        }
        return bArr;
    }
}
