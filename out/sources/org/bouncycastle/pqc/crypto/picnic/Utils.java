package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
class Utils {
    Utils() {
    }

    protected static int ceil_log2(int i15) {
        if (i15 == 0) {
            return 0;
        }
        return 32 - nlz(i15 - 1);
    }

    protected static byte getBit(byte[] bArr, int i15) {
        return (byte) ((bArr[i15 >>> 3] >>> ((i15 & 7) ^ 7)) & 1);
    }

    protected static int getBitFromWordArray(int[] iArr, int i15) {
        return getBit(iArr, i15);
    }

    protected static byte getCrumbAligned(byte[] bArr, int i15) {
        int i16 = bArr[i15 >>> 2] >>> (((i15 << 1) & 6) ^ 6);
        return (byte) (((i16 & 2) >> 1) | ((i16 & 1) << 1));
    }

    protected static int getTrailingBitsMask(int i15) {
        int i16 = i15 & (-8);
        int i17 = ~((-1) << i16);
        int i18 = i15 & 7;
        return i18 != 0 ? (((65280 >>> i18) & GF2Field.MASK) << i16) ^ i17 : i17;
    }

    private static int nlz(int i15) {
        int i16;
        if (i15 == 0) {
            return 32;
        }
        if ((i15 >>> 16) == 0) {
            i15 <<= 16;
            i16 = 17;
        } else {
            i16 = 1;
        }
        if ((i15 >>> 24) == 0) {
            i16 += 8;
            i15 <<= 8;
        }
        if ((i15 >>> 28) == 0) {
            i16 += 4;
            i15 <<= 4;
        }
        if ((i15 >>> 30) == 0) {
            i16 += 2;
            i15 <<= 2;
        }
        return i16 - (i15 >>> 31);
    }

    protected static int numBytes(int i15) {
        if (i15 == 0) {
            return 0;
        }
        return ((i15 - 1) / 8) + 1;
    }

    protected static int parity(byte[] bArr, int i15) {
        byte b15 = bArr[0];
        for (int i16 = 1; i16 < i15; i16++) {
            b15 = (byte) (b15 ^ bArr[i16]);
        }
        return Integers.bitCount(b15 & 255) & 1;
    }

    protected static int parity16(int i15) {
        return Integers.bitCount(i15 & 65535) & 1;
    }

    protected static int parity32(int i15) {
        return Integers.bitCount(i15) & 1;
    }

    protected static int setBit(int i15, int i16, int i17) {
        int i18 = i16 ^ 7;
        return (i15 & (~(1 << i18))) | (i17 << i18);
    }

    protected static void setBitInWordArray(int[] iArr, int i15, int i16) {
        setBit(iArr, i15, i16);
    }

    protected static void zeroTrailingBits(int[] iArr, int i15) {
        if ((i15 & 31) != 0) {
            int i16 = i15 >>> 5;
            iArr[i16] = getTrailingBitsMask(i15) & iArr[i16];
        }
    }

    protected static int getBit(int i15, int i16) {
        return (i15 >>> (i16 ^ 7)) & 1;
    }

    protected static void setBit(byte[] bArr, int i15, byte b15) {
        int i16 = i15 >>> 3;
        int i17 = (i15 & 7) ^ 7;
        bArr[i16] = (byte) ((b15 << i17) | (bArr[i16] & (~(1 << i17))));
    }

    protected static int getBit(int[] iArr, int i15) {
        return (iArr[i15 >>> 5] >>> ((i15 & 31) ^ 7)) & 1;
    }

    protected static void setBit(int[] iArr, int i15, int i16) {
        int i17 = i15 >>> 5;
        int i18 = (i15 & 31) ^ 7;
        iArr[i17] = (i16 << i18) | (iArr[i17] & (~(1 << i18)));
    }
}
