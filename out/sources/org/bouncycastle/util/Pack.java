package org.bouncycastle.util;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Pack {
    public static int bigEndianToInt(byte[] bArr, int i15) {
        return (bArr[i15 + 3] & 255) | (bArr[i15] << 24) | ((bArr[i15 + 1] & 255) << 16) | ((bArr[i15 + 2] & 255) << 8);
    }

    public static long bigEndianToLong(byte[] bArr, int i15) {
        int iBigEndianToInt = bigEndianToInt(bArr, i15);
        int iBigEndianToInt2 = bigEndianToInt(bArr, i15 + 4);
        return (((long) iBigEndianToInt2) & BodyPartID.bodyIdMax) | ((((long) iBigEndianToInt) & BodyPartID.bodyIdMax) << 32);
    }

    public static short bigEndianToShort(byte[] bArr, int i15) {
        return (short) ((bArr[i15 + 1] & 255) | ((bArr[i15] & 255) << 8));
    }

    public static void intToBigEndian(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) (i15 >>> 24);
        bArr[i16 + 1] = (byte) (i15 >>> 16);
        bArr[i16 + 2] = (byte) (i15 >>> 8);
        bArr[i16 + 3] = (byte) i15;
    }

    public static void intToLittleEndian(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) i15;
        bArr[i16 + 1] = (byte) (i15 >>> 8);
        bArr[i16 + 2] = (byte) (i15 >>> 16);
        bArr[i16 + 3] = (byte) (i15 >>> 24);
    }

    public static int littleEndianToInt(byte[] bArr, int i15) {
        return (bArr[i15 + 3] << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    public static int littleEndianToInt_High(byte[] bArr, int i15, int i16) {
        return littleEndianToInt_Low(bArr, i15, i16) << ((4 - i16) << 3);
    }

    public static int littleEndianToInt_Low(byte[] bArr, int i15, int i16) {
        int i17 = bArr[i15] & 255;
        int i18 = 0;
        for (int i19 = 1; i19 < i16; i19++) {
            i18 += 8;
            i17 |= (bArr[i15 + i19] & 255) << i18;
        }
        return i17;
    }

    public static long littleEndianToLong(byte[] bArr, int i15) {
        return ((((long) littleEndianToInt(bArr, i15 + 4)) & BodyPartID.bodyIdMax) << 32) | (((long) littleEndianToInt(bArr, i15)) & BodyPartID.bodyIdMax);
    }

    public static long littleEndianToLong_High(byte[] bArr, int i15, int i16) {
        return littleEndianToLong_Low(bArr, i15, i16) << ((8 - i16) << 3);
    }

    public static long littleEndianToLong_Low(byte[] bArr, int i15, int i16) {
        long j15 = bArr[i15] & 255;
        for (int i17 = 1; i17 < i16; i17++) {
            j15 = (j15 << 8) | ((long) (bArr[i15 + i17] & 255));
        }
        return j15;
    }

    public static short littleEndianToShort(byte[] bArr, int i15) {
        return (short) (((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255));
    }

    public static void longToBigEndian(long j15, byte[] bArr, int i15) {
        intToBigEndian((int) (j15 >>> 32), bArr, i15);
        intToBigEndian((int) (j15 & BodyPartID.bodyIdMax), bArr, i15 + 4);
    }

    public static void longToLittleEndian(long j15, byte[] bArr, int i15) {
        intToLittleEndian((int) (BodyPartID.bodyIdMax & j15), bArr, i15);
        intToLittleEndian((int) (j15 >>> 32), bArr, i15 + 4);
    }

    public static void longToLittleEndian_High(long j15, byte[] bArr, int i15, int i16) {
        int i17 = 56;
        bArr[i15] = (byte) (j15 >>> 56);
        for (int i18 = 1; i18 < i16; i18++) {
            i17 -= 8;
            bArr[i15 + i18] = (byte) (j15 >>> i17);
        }
    }

    public static void shortToBigEndian(short s15, byte[] bArr, int i15) {
        bArr[i15] = (byte) (s15 >>> 8);
        bArr[i15 + 1] = (byte) s15;
    }

    public static void shortToLittleEndian(short s15, byte[] bArr, int i15) {
        bArr[i15] = (byte) s15;
        bArr[i15 + 1] = (byte) (s15 >>> 8);
    }

    public static void bigEndianToInt(byte[] bArr, int i15, int[] iArr) {
        for (int i16 = 0; i16 < iArr.length; i16++) {
            iArr[i16] = bigEndianToInt(bArr, i15);
            i15 += 4;
        }
    }

    public static long bigEndianToLong(byte[] bArr, int i15, int i16) {
        long j15 = 0;
        for (int i17 = 0; i17 < i16; i17++) {
            j15 |= (((long) bArr[i17 + i15]) & 255) << ((7 - i17) << 3);
        }
        return j15;
    }

    public static void intToBigEndian(int[] iArr, int i15, int i16, byte[] bArr, int i17) {
        for (int i18 = 0; i18 < i16; i18++) {
            intToBigEndian(iArr[i15 + i18], bArr, i17);
            i17 += 4;
        }
    }

    public static void intToLittleEndian(int[] iArr, int i15, int i16, byte[] bArr, int i17) {
        for (int i18 = 0; i18 < i16; i18++) {
            intToLittleEndian(iArr[i15 + i18], bArr, i17);
            i17 += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i15, int[] iArr) {
        for (int i16 = 0; i16 < iArr.length; i16++) {
            iArr[i16] = littleEndianToInt(bArr, i15);
            i15 += 4;
        }
    }

    public static long littleEndianToLong(byte[] bArr, int i15, int i16) {
        long j15 = 0;
        for (int i17 = 0; i17 < i16; i17++) {
            j15 |= (((long) bArr[i15 + i17]) & 255) << (i17 << 3);
        }
        return j15;
    }

    public static void littleEndianToShort(byte[] bArr, int i15, short[] sArr, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            sArr[i16 + i18] = littleEndianToShort(bArr, i15);
            i15 += 2;
        }
    }

    @Deprecated
    public static void longToBigEndian(long j15, byte[] bArr, int i15, int i16) {
        for (int i17 = i16 - 1; i17 >= 0; i17--) {
            bArr[i17 + i15] = (byte) (255 & j15);
            j15 >>>= 8;
        }
    }

    public static void longToLittleEndian(long j15, byte[] bArr, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            bArr[i15 + i17] = (byte) (j15 >>> (i17 << 3));
        }
    }

    public static byte[] shortToBigEndian(short s15) {
        byte[] bArr = new byte[2];
        shortToBigEndian(s15, bArr, 0);
        return bArr;
    }

    public static void shortToLittleEndian(short[] sArr, int i15, int i16, byte[] bArr, int i17) {
        for (int i18 = 0; i18 < i16; i18++) {
            shortToLittleEndian(sArr[i15 + i18], bArr, i17);
            i17 += 2;
        }
    }

    public static void bigEndianToInt(byte[] bArr, int i15, int[] iArr, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            iArr[i16 + i18] = bigEndianToInt(bArr, i15);
            i15 += 4;
        }
    }

    public static void bigEndianToLong(byte[] bArr, int i15, long[] jArr) {
        for (int i16 = 0; i16 < jArr.length; i16++) {
            jArr[i16] = bigEndianToLong(bArr, i15);
            i15 += 8;
        }
    }

    public static void intToBigEndian(int[] iArr, byte[] bArr, int i15) {
        for (int i16 : iArr) {
            intToBigEndian(i16, bArr, i15);
            i15 += 4;
        }
    }

    public static void intToLittleEndian(int[] iArr, byte[] bArr, int i15) {
        for (int i16 : iArr) {
            intToLittleEndian(i16, bArr, i15);
            i15 += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i15, int[] iArr, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            iArr[i16 + i18] = littleEndianToInt(bArr, i15);
            i15 += 4;
        }
    }

    public static void littleEndianToLong(byte[] bArr, int i15, long[] jArr) {
        for (int i16 = 0; i16 < jArr.length; i16++) {
            jArr[i16] = littleEndianToLong(bArr, i15);
            i15 += 8;
        }
    }

    public static void longToBigEndian(long[] jArr, int i15, int i16, byte[] bArr, int i17) {
        for (int i18 = 0; i18 < i16; i18++) {
            longToBigEndian(jArr[i15 + i18], bArr, i17);
            i17 += 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, int i15, int i16, byte[] bArr, int i17) {
        for (int i18 = 0; i18 < i16; i18++) {
            longToLittleEndian(jArr[i15 + i18], bArr, i17);
            i17 += 8;
        }
    }

    public static byte[] shortToLittleEndian(short s15) {
        byte[] bArr = new byte[2];
        shortToLittleEndian(s15, bArr, 0);
        return bArr;
    }

    public static void bigEndianToLong(byte[] bArr, int i15, long[] jArr, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            jArr[i16 + i18] = bigEndianToLong(bArr, i15);
            i15 += 8;
        }
    }

    public static byte[] intToBigEndian(int i15) {
        byte[] bArr = new byte[4];
        intToBigEndian(i15, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int i15) {
        byte[] bArr = new byte[4];
        intToLittleEndian(i15, bArr, 0);
        return bArr;
    }

    public static int[] littleEndianToInt(byte[] bArr, int i15, int i16) {
        int[] iArr = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            iArr[i17] = littleEndianToInt(bArr, i15);
            i15 += 4;
        }
        return iArr;
    }

    public static void littleEndianToLong(byte[] bArr, int i15, long[] jArr, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            jArr[i16 + i18] = littleEndianToLong(bArr, i15);
            i15 += 8;
        }
    }

    public static void longToBigEndian(long[] jArr, byte[] bArr, int i15) {
        for (long j15 : jArr) {
            longToBigEndian(j15, bArr, i15);
            i15 += 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, byte[] bArr, int i15) {
        for (long j15 : jArr) {
            longToLittleEndian(j15, bArr, i15);
            i15 += 8;
        }
    }

    public static byte[] intToBigEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToLittleEndian(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] longToBigEndian(long j15) {
        byte[] bArr = new byte[8];
        longToBigEndian(j15, bArr, 0);
        return bArr;
    }

    public static byte[] longToLittleEndian(long j15) {
        byte[] bArr = new byte[8];
        longToLittleEndian(j15, bArr, 0);
        return bArr;
    }

    public static byte[] longToBigEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToBigEndian(jArr, bArr, 0);
        return bArr;
    }

    public static byte[] longToLittleEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToLittleEndian(jArr, bArr, 0);
        return bArr;
    }
}
