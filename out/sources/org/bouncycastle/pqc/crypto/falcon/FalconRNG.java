package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class FalconRNG {

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    byte[] f149452bd = new byte[512];
    int ptr = 0;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    byte[] f149453sd = new byte[256];

    FalconRNG() {
    }

    private void QROUND(int i15, int i16, int i17, int i18, int[] iArr) {
        int i19 = iArr[i15] + iArr[i16];
        iArr[i15] = i19;
        int i25 = i19 ^ iArr[i18];
        iArr[i18] = i25;
        int i26 = (i25 >>> 16) | (i25 << 16);
        iArr[i18] = i26;
        int i27 = iArr[i17] + i26;
        iArr[i17] = i27;
        int i28 = iArr[i16] ^ i27;
        iArr[i16] = i28;
        int i29 = (i28 >>> 20) | (i28 << 12);
        iArr[i16] = i29;
        int i35 = iArr[i15] + i29;
        iArr[i15] = i35;
        int i36 = iArr[i18] ^ i35;
        iArr[i18] = i36;
        int i37 = (i36 >>> 24) | (i36 << 8);
        iArr[i18] = i37;
        int i38 = iArr[i17] + i37;
        iArr[i17] = i38;
        int i39 = iArr[i16] ^ i38;
        iArr[i16] = i39;
        iArr[i16] = (i39 >>> 25) | (i39 << 7);
    }

    long prng_get_u64() {
        int i15 = this.ptr;
        if (i15 >= this.f149452bd.length - 9) {
            prng_refill();
            i15 = 0;
        }
        this.ptr = i15 + 8;
        return Pack.littleEndianToLong(this.f149452bd, i15);
    }

    byte prng_get_u8() {
        byte[] bArr = this.f149452bd;
        int i15 = this.ptr;
        int i16 = i15 + 1;
        this.ptr = i16;
        byte b15 = bArr[i15];
        if (i16 == bArr.length) {
            prng_refill();
        }
        return b15;
    }

    void prng_init(SHAKEDigest sHAKEDigest) {
        sHAKEDigest.doOutput(this.f149453sd, 0, 56);
        prng_refill();
    }

    void prng_refill() {
        FalconRNG falconRNG = this;
        int[] iArr = {1634760805, 857760878, 2036477234, 1797285236};
        int[] iArr2 = new int[16];
        long jLittleEndianToLong = Pack.littleEndianToLong(falconRNG.f149453sd, 48);
        for (int i15 = 0; i15 < 8; i15++) {
            System.arraycopy(iArr, 0, iArr2, 0, 4);
            Pack.littleEndianToInt(falconRNG.f149453sd, 0, iArr2, 4, 12);
            int i16 = (int) jLittleEndianToLong;
            iArr2[14] = iArr2[14] ^ i16;
            int i17 = (int) (jLittleEndianToLong >>> 32);
            iArr2[15] = iArr2[15] ^ i17;
            int i18 = 0;
            while (i18 < 10) {
                falconRNG.QROUND(0, 4, 8, 12, iArr2);
                falconRNG = this;
                falconRNG.QROUND(1, 5, 9, 13, iArr2);
                falconRNG.QROUND(2, 6, 10, 14, iArr2);
                falconRNG.QROUND(3, 7, 11, 15, iArr2);
                falconRNG.QROUND(0, 5, 10, 15, iArr2);
                falconRNG.QROUND(1, 6, 11, 12, iArr2);
                falconRNG.QROUND(2, 7, 8, 13, iArr2);
                falconRNG.QROUND(3, 4, 9, 14, iArr2);
                i18++;
                i17 = i17;
            }
            int i19 = i17;
            for (int i25 = 0; i25 < 4; i25++) {
                iArr2[i25] = iArr2[i25] + iArr[i25];
            }
            for (int i26 = 4; i26 < 14; i26++) {
                iArr2[i26] = iArr2[i26] + Pack.littleEndianToInt(falconRNG.f149453sd, (i26 * 4) - 16);
            }
            iArr2[14] = iArr2[14] + (Pack.littleEndianToInt(falconRNG.f149453sd, 40) ^ i16);
            iArr2[15] = iArr2[15] + (Pack.littleEndianToInt(falconRNG.f149453sd, 44) ^ i19);
            jLittleEndianToLong++;
            for (int i27 = 0; i27 < 16; i27++) {
                Pack.intToLittleEndian(iArr2[i27], falconRNG.f149452bd, (i15 << 2) + (i27 << 5));
            }
        }
        Pack.longToLittleEndian(jLittleEndianToLong, falconRNG.f149453sd, 48);
        falconRNG.ptr = 0;
    }
}
