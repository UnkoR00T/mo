package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class Utils {
    Utils() {
    }

    static short bitrev(short s15, int i15) {
        short s16 = (short) (((s15 & 65280) >> 8) | ((s15 & 255) << 8));
        short s17 = (short) (((s16 & 61680) >> 4) | ((s16 & 3855) << 4));
        short s18 = (short) (((s17 & 52428) >> 2) | ((s17 & 13107) << 2));
        short s19 = (short) (((s18 & 43690) >> 1) | ((s18 & 21845) << 1));
        return (short) (i15 == 12 ? s19 >> 4 : s19 >> 3);
    }

    static int load4(byte[] bArr, int i15) {
        return Pack.littleEndianToInt(bArr, i15);
    }

    static long load8(byte[] bArr, int i15) {
        return Pack.littleEndianToLong(bArr, i15);
    }

    static short load_gf(byte[] bArr, int i15, int i16) {
        return (short) (Pack.littleEndianToShort(bArr, i15) & i16);
    }

    static void store8(byte[] bArr, int i15, long j15) {
        bArr[i15] = (byte) (j15 & 255);
        bArr[i15 + 1] = (byte) ((j15 >> 8) & 255);
        bArr[i15 + 2] = (byte) ((j15 >> 16) & 255);
        bArr[i15 + 3] = (byte) ((j15 >> 24) & 255);
        bArr[i15 + 4] = (byte) ((j15 >> 32) & 255);
        bArr[i15 + 5] = (byte) ((j15 >> 40) & 255);
        bArr[i15 + 6] = (byte) ((j15 >> 48) & 255);
        bArr[i15 + 7] = (byte) ((j15 >> 56) & 255);
    }

    static void store_gf(byte[] bArr, int i15, short s15) {
        bArr[i15] = (byte) (s15 & 255);
        bArr[i15 + 1] = (byte) (s15 >> 8);
    }
}
