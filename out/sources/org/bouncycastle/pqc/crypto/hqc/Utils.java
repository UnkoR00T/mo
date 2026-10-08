package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class Utils {
    Utils() {
    }

    static long bitMask(long j15, long j16) {
        return (1 << ((int) (j15 % j16))) - 1;
    }

    static void copyBytes(int[] iArr, int i15, int[] iArr2, int i16, int i17) {
        System.arraycopy(iArr, i15, iArr2, i16, i17 / 2);
    }

    static void fromByte32ArrayToLongArray(long[] jArr, int[] iArr) {
        for (int i15 = 0; i15 != iArr.length; i15 += 2) {
            int i16 = i15 / 2;
            long j15 = ((long) iArr[i15]) & BodyPartID.bodyIdMax;
            jArr[i16] = j15;
            jArr[i16] = j15 | (((long) iArr[i15 + 1]) << 32);
        }
    }

    static void fromByteArrayToLongArray(long[] jArr, byte[] bArr, int i15, int i16) {
        if (i16 % 8 != 0) {
            byte[] bArr2 = new byte[((i16 + 7) / 8) * 8];
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            bArr = bArr2;
            i15 = 0;
        }
        int iMin = Math.min(jArr.length, (i16 + 7) >>> 3);
        for (int i17 = 0; i17 < iMin; i17++) {
            jArr[i17] = Pack.littleEndianToLong(bArr, i15);
            i15 += 8;
        }
    }

    static void fromLongArrayToByte32Array(int[] iArr, long[] jArr) {
        for (int i15 = 0; i15 != jArr.length; i15++) {
            int i16 = i15 * 2;
            long j15 = jArr[i15];
            iArr[i16] = (int) j15;
            iArr[i16 + 1] = (int) (j15 >> 32);
        }
    }

    static void fromLongArrayToByteArray(byte[] bArr, int i15, int i16, long[] jArr) {
        int i17 = i16 >> 3;
        int i18 = 0;
        for (int i19 = 0; i19 != i17; i19++) {
            Pack.longToLittleEndian(jArr[i19], bArr, i15);
            i15 += 8;
        }
        if ((i16 & 7) != 0) {
            while (i15 < bArr.length) {
                bArr[i15] = (byte) (jArr[i17] >>> (i18 * 8));
                i15++;
                i18++;
            }
        }
    }

    static int getByte64SizeFromBitSize(int i15) {
        return (i15 + 63) / 64;
    }

    static int getByteSizeFromBitSize(int i15) {
        return (i15 + 7) / 8;
    }

    static int toUnsigned16Bits(int i15) {
        return i15 & 65535;
    }

    static int toUnsigned8bits(int i15) {
        return i15 & GF2Field.MASK;
    }

    static void fromLongArrayToByteArray(byte[] bArr, long[] jArr) {
        int length = bArr.length / 8;
        int i15 = 0;
        for (int i16 = 0; i16 != length; i16++) {
            Pack.longToLittleEndian(jArr[i16], bArr, i16 * 8);
        }
        if (bArr.length % 8 != 0) {
            int i17 = length * 8;
            while (i17 < bArr.length) {
                bArr[i17] = (byte) (jArr[length] >>> (i15 * 8));
                i17++;
                i15++;
            }
        }
    }
}
