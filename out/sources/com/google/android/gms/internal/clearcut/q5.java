package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes3.dex */
public final class q5 {
    private static int a(byte[] bArr, int i15) {
        return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    private static long b(long j15, long j16, long j17) {
        long j18 = (j15 ^ j16) * j17;
        long j19 = ((j18 ^ (j18 >>> 47)) ^ j16) * j17;
        return (j19 ^ (j19 >>> 47)) * j17;
    }

    public static long c(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb5 = new StringBuilder(67);
            sb5.append("Out of bound index with offput: 0 and length: ");
            sb5.append(length);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        char c15 = '/';
        char c16 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j15 = ((long) (length << 1)) - 7286425919675154353L;
                long jE = e(bArr2, 0) * (-5435081209227447693L);
                long jE2 = e(bArr2, 8);
                long jE3 = e(bArr2, length - 8) * j15;
                return b(Long.rotateRight(jE + jE2, 43) + Long.rotateRight(jE3, 30) + (e(bArr2, length - 16) * (-7286425919675154353L)), jE + Long.rotateRight(jE2 - 7286425919675154353L, 18) + jE3, j15);
            }
            if (length >= 8) {
                long j16 = ((long) (length << 1)) - 7286425919675154353L;
                long jE4 = e(bArr2, 0) - 7286425919675154353L;
                long jE5 = e(bArr2, length - 8);
                return b((Long.rotateRight(jE5, 37) * j16) + jE4, (Long.rotateRight(jE4, 25) + jE5) * j16, j16);
            }
            if (length >= 4) {
                return b(((long) length) + ((((long) a(bArr2, 0)) & BodyPartID.bodyIdMax) << 3), ((long) a(bArr2, length - 4)) & BodyPartID.bodyIdMax, ((long) (length << 1)) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            long j17 = (((long) (length + ((bArr2[length - 1] & 255) << 2))) * (-4348849565147123417L)) ^ (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * (-7286425919675154353L));
            return (j17 ^ (j17 >>> 47)) * (-7286425919675154353L);
        }
        char c17 = '@';
        if (length <= 64) {
            long j18 = ((long) (length << 1)) - 7286425919675154353L;
            long jE6 = e(bArr2, 0) * (-7286425919675154353L);
            long jE7 = e(bArr2, 8);
            long jE8 = e(bArr2, length - 8) * j18;
            long jRotateRight = Long.rotateRight(jE6 + jE7, 43) + Long.rotateRight(jE8, 30) + (e(bArr2, length - 16) * (-7286425919675154353L));
            long jB = b(jRotateRight, Long.rotateRight(jE7 - 7286425919675154353L, 18) + jE6 + jE8, j18);
            long jE9 = e(bArr2, 16) * j18;
            long jE10 = e(bArr2, 24);
            long jE11 = (jRotateRight + e(bArr2, length - 32)) * j18;
            return b(Long.rotateRight(jE9 + jE10, 43) + Long.rotateRight(jE11, 30) + ((jB + e(bArr2, length - 24)) * j18), jE9 + Long.rotateRight(jE10 + jE6, 18) + jE11, j18);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jE12 = e(bArr2, 0) + 95310865018149119L;
        int i15 = length - 1;
        int i16 = (i15 / 64) << 6;
        int i17 = i15 & 63;
        int i18 = i16 + i17;
        int i19 = i18 - 63;
        long j19 = 2480279821605975764L;
        long j25 = 1390051526045402406L;
        int i25 = i17;
        int i26 = 0;
        while (true) {
            char c18 = c16;
            long jRotateRight2 = Long.rotateRight(jE12 + j19 + jArr[c16] + e(bArr2, i26 + 8), 37) * (-5435081209227447693L);
            long jRotateRight3 = Long.rotateRight(j19 + jArr[1] + e(bArr2, i26 + 48), 42) * (-5435081209227447693L);
            long j26 = jRotateRight2 ^ jArr2[1];
            char c19 = c17;
            long jE13 = jRotateRight3 + jArr[c18] + e(bArr2, i26 + 40);
            long jRotateRight4 = Long.rotateRight(j25 + jArr2[c18], 33) * (-5435081209227447693L);
            char c25 = c15;
            int i27 = i25;
            d(bArr2, i26, jArr[1] * (-5435081209227447693L), j26 + jArr2[c18], jArr);
            int i28 = i26;
            long[] jArr3 = jArr;
            d(bArr2, i28 + 32, jRotateRight4 + jArr2[1], jE13 + e(bArr2, i28 + 16), jArr2);
            i26 = i28 + 64;
            if (i26 == i16) {
                long j27 = ((j26 & 255) << 1) - 5435081209227447693L;
                long j28 = jArr2[c18] + ((long) i27);
                jArr2[c18] = j28;
                long j29 = jArr3[c18] + j28;
                jArr3[c18] = j29;
                jArr2[c18] = jArr2[c18] + j29;
                long jRotateRight5 = Long.rotateRight(jRotateRight4 + jE13 + jArr3[c18] + e(bArr2, i18 - 55), 37) * j27;
                long jRotateRight6 = Long.rotateRight(jE13 + jArr3[1] + e(bArr2, i18 - 15), 42) * j27;
                long j35 = jRotateRight5 ^ (jArr2[1] * 9);
                long jE14 = jRotateRight6 + (jArr3[c18] * 9) + e(bArr2, i18 - 23);
                long jRotateRight7 = Long.rotateRight(j26 + jArr2[c18], 33) * j27;
                d(bArr2, i19, jArr3[1] * j27, jArr2[c18] + j35, jArr3);
                d(bArr2, i18 - 31, jArr2[1] + jRotateRight7, e(bArr2, i18 - 47) + jE14, jArr2);
                return b(b(jArr3[c18], jArr2[c18], j27) + (((jE14 >>> c25) ^ jE14) * (-4348849565147123417L)) + j35, b(jArr3[1], jArr2[1], j27) + jRotateRight7, j27);
            }
            bArr2 = bArr;
            jE12 = jRotateRight4;
            jArr = jArr3;
            c16 = c18;
            j25 = j26;
            c17 = c19;
            j19 = jE13;
            i25 = i27;
            c15 = c25;
        }
    }

    private static void d(byte[] bArr, int i15, long j15, long j16, long[] jArr) {
        long jE = e(bArr, i15);
        long jE2 = e(bArr, i15 + 8);
        long jE3 = e(bArr, i15 + 16);
        long jE4 = e(bArr, i15 + 24);
        long j17 = j15 + jE;
        long j18 = jE2 + j17 + jE3;
        long jRotateRight = Long.rotateRight(j16 + j17 + jE4, 21) + Long.rotateRight(j18, 44);
        jArr[0] = j18 + jE4;
        jArr[1] = jRotateRight + j17;
    }

    private static long e(byte[] bArr, int i15) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i15, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }
}
