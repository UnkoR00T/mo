package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class GF2Field {
    public static final int MASK = 255;
    static final byte[][] gfMulTable = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 256);
    static final byte[] gfInvTable = new byte[256];

    static {
        long j15;
        int i15 = 1;
        long j16 = 72340172838076673L;
        while (true) {
            j15 = 506097522914230528L;
            if (i15 > 255) {
                break;
            }
            for (int i16 = 0; i16 < 256; i16 += 8) {
                Pack.longToLittleEndian(gf256Mul_64(j16, j15), gfMulTable[i15], i16);
                j15 += 578721382704613384L;
            }
            j16 += 72340172838076673L;
            i15++;
        }
        for (int i17 = 0; i17 < 256; i17 += 8) {
            Pack.longToLittleEndian(gf256Inv_64(j15), gfInvTable, i17);
            j15 += 578721382704613384L;
        }
    }

    GF2Field() {
    }

    public static short addElem(short s15, short s16) {
        return (short) (s15 ^ s16);
    }

    public static long addElem_64(long j15, long j16) {
        return j15 ^ j16;
    }

    private static short gf16Mul(short s15, short s16) {
        short s17 = (short) (s15 & 3);
        short s18 = (short) ((s15 >>> 2) & MASK);
        short s19 = (short) (s16 & 3);
        short s25 = (short) ((s16 >>> 2) & MASK);
        short sGf4Mul = gf4Mul(s17, s19);
        short sGf4Mul2 = gf4Mul(s18, s25);
        return (short) ((((((short) (gf4Mul((short) (s18 ^ s17), (short) (s25 ^ s19)) ^ sGf4Mul)) << 2) ^ sGf4Mul) ^ gf4Mul2(sGf4Mul2)) & MASK);
    }

    private static short gf16Mul8(short s15) {
        short s16 = (short) (s15 & 3);
        short s17 = (short) ((s15 >>> 2) & MASK);
        return (short) ((gf4Mul3(s17) | (gf4Mul2((short) (s16 ^ s17)) << 2)) & MASK);
    }

    private static long gf16Mul8_64(long j15) {
        long j16 = 3689348814741910323L & j15;
        long j17 = j15 & (-3689348814741910324L);
        long j18 = (j16 << 2) ^ j17;
        long j19 = j17 >>> 2;
        return j19 ^ gf4Mul2_64(j18 ^ j19);
    }

    private static long gf16Mul_64(long j15, long j16) {
        long jGf4Mul_64 = gf4Mul_64(j15, j16);
        long j17 = 3689348814741910323L & jGf4Mul_64;
        return (gf4Mul_64(((j15 ^ (j15 << 2)) & (-3689348814741910324L)) ^ ((jGf4Mul_64 & (-3689348814741910324L)) >>> 2), ((j16 ^ (j16 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L) ^ (j17 << 2)) ^ j17;
    }

    private static short gf16Squ(short s15) {
        short s16 = (short) (s15 & 3);
        short sGf4Squ = gf4Squ((short) ((s15 >>> 2) & MASK));
        return (short) ((((sGf4Squ << 2) ^ gf4Mul2(sGf4Squ)) ^ gf4Squ(s16)) & MASK);
    }

    private static long gf16Squ_64(long j15) {
        long jGf4Squ_64 = gf4Squ_64(j15);
        return jGf4Squ_64 ^ (gf4Mul2_64((-3689348814741910324L) & jGf4Squ_64) >>> 2);
    }

    private static short gf256Inv(short s15) {
        short sGf256Squ = gf256Squ(s15);
        short sGf256Squ2 = gf256Squ(sGf256Squ);
        short sGf256Mul = gf256Mul(gf256Mul(sGf256Squ2, sGf256Squ), gf256Squ(sGf256Squ2));
        return gf256Mul(sGf256Squ, gf256Squ(gf256Mul(gf256Squ(gf256Squ(gf256Squ(sGf256Mul))), sGf256Mul)));
    }

    private static long gf256Inv_64(long j15) {
        long jGf256Squ_64 = gf256Squ_64(j15);
        long jGf256Squ_65 = gf256Squ_64(jGf256Squ_64);
        long jGf256Mul_64 = gf256Mul_64(gf256Mul_64(jGf256Squ_65, jGf256Squ_64), gf256Squ_64(jGf256Squ_65));
        return gf256Mul_64(jGf256Squ_64, gf256Squ_64(gf256Mul_64(gf256Squ_64(gf256Squ_64(gf256Squ_64(jGf256Mul_64))), jGf256Mul_64)));
    }

    private static short gf256Mul(short s15, short s16) {
        short s17 = (short) (s15 & 15);
        short s18 = (short) ((s15 >>> 4) & MASK);
        short s19 = (short) (s16 & 15);
        short s25 = (short) ((s16 >>> 4) & MASK);
        short sGf16Mul = gf16Mul(s17, s19);
        short sGf16Mul2 = gf16Mul(s18, s25);
        return (short) ((((((short) (gf16Mul((short) (s18 ^ s17), (short) (s25 ^ s19)) ^ sGf16Mul)) << 4) ^ sGf16Mul) ^ gf16Mul8(sGf16Mul2)) & MASK);
    }

    private static long gf256Mul_64(long j15, long j16) {
        long jGf16Mul_64 = gf16Mul_64(j15, j16);
        long j17 = 1085102592571150095L & jGf16Mul_64;
        return (gf16Mul_64(((j15 ^ (j15 << 4)) & (-1085102592571150096L)) ^ ((jGf16Mul_64 & (-1085102592571150096L)) >>> 4), ((j16 ^ (j16 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j17 << 4)) ^ j17;
    }

    private static short gf256Squ(short s15) {
        short s16 = (short) (s15 & 15);
        short sGf16Squ = gf16Squ((short) ((s15 >>> 4) & MASK));
        return (short) ((((sGf16Squ << 4) ^ gf16Mul8(sGf16Squ)) ^ gf16Squ(s16)) & MASK);
    }

    private static long gf256Squ_64(long j15) {
        long jGf16Squ_64 = gf16Squ_64(j15);
        return jGf16Squ_64 ^ (gf16Mul8_64((-1085102592571150096L) & jGf16Squ_64) >>> 4);
    }

    private static short gf4Mul(short s15, short s16) {
        return (short) (((gf4Mul2(s15) * (s16 >>> 1)) ^ ((s16 & 1) * s15)) & MASK);
    }

    private static short gf4Mul2(short s15) {
        return (short) ((((s15 >>> 1) * 7) ^ (s15 << 1)) & MASK);
    }

    private static long gf4Mul2_64(long j15) {
        long j16 = 6148914691236517205L & j15;
        long j17 = j15 & (-6148914691236517206L);
        return (j17 >>> 1) ^ ((j16 << 1) ^ j17);
    }

    private static short gf4Mul3(short s15) {
        int i15 = (s15 - 2) >>> 1;
        return (short) ((((s15 - 1) & (~i15)) | ((s15 * 3) & i15)) & MASK);
    }

    private static long gf4Mul_64(long j15, long j16) {
        long j17 = (((j15 << 1) & j16) ^ ((j16 << 1) & j15)) & (-6148914691236517206L);
        long j18 = j15 & j16;
        return ((j18 & (-6148914691236517206L)) >>> 1) ^ (j18 ^ j17);
    }

    private static short gf4Squ(short s15) {
        return (short) ((s15 ^ (s15 >>> 1)) & MASK);
    }

    private static long gf4Squ_64(long j15) {
        return j15 ^ (((-6148914691236517206L) & j15) >>> 1);
    }

    public static short invElem(short s15) {
        return (short) (gfInvTable[s15] & 255);
    }

    public static long invElem_64(long j15) {
        return gf256Inv_64(j15);
    }

    public static short multElem(short s15, short s16) {
        return (short) (gfMulTable[s15][s16] & 255);
    }

    public static long multElem_64(long j15, long j16) {
        return gf256Mul_64(j15, j16);
    }
}
