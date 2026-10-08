package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class WotsPlus {
    private final SPHINCSPlusEngine engine;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f149612w;

    WotsPlus(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
        this.f149612w = sPHINCSPlusEngine.WOTS_W;
    }

    void base_w(byte[] bArr, int i15, int i16, int[] iArr, int i17, int i18) {
        int i19 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i19 < i18) {
            if (i25 == 0) {
                i25 += 8;
                i26 = bArr[i15];
                i15++;
            }
            i25 -= this.engine.WOTS_LOGW;
            iArr[i17] = (i26 >>> i25) & (i16 - 1);
            i19++;
            i17++;
        }
    }

    byte[] chain(byte[] bArr, int i15, int i16, byte[] bArr2, ADRS adrs) {
        if (i16 == 0) {
            return Arrays.clone(bArr);
        }
        if (i15 + i16 > this.f149612w - 1) {
            return null;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            adrs.setHashAddress(i15 + i17);
            bArr = this.engine.F(bArr2, adrs, bArr);
        }
        return bArr;
    }

    public byte[] pkFromSig(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = adrs;
        ADRS adrs3 = new ADRS(adrs2);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr2, 0, this.f149612w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i15 >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i16 += (this.f149612w - 1) - iArr[i15];
            i15++;
        }
        int i17 = sPHINCSPlusEngine.WOTS_LEN2;
        int i18 = sPHINCSPlusEngine.WOTS_LOGW;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i16 << (8 - ((i17 * i18) % 8)));
        int i19 = 4 - (((i17 * i18) + 7) / 8);
        int i25 = this.f149612w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i19, i25, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        SPHINCSPlusEngine sPHINCSPlusEngine4 = this.engine;
        byte[] bArr4 = new byte[sPHINCSPlusEngine4.N];
        byte[][] bArr5 = new byte[sPHINCSPlusEngine4.WOTS_LEN][];
        int i26 = 0;
        while (i26 < this.engine.WOTS_LEN) {
            adrs2.setChainAddress(i26);
            int i27 = this.engine.N;
            System.arraycopy(bArr, i26 * i27, bArr4, 0, i27);
            byte[] bArr6 = bArr4;
            int i28 = iArr[i26];
            bArr5[i26] = chain(bArr6, i28, (this.f149612w - 1) - i28, bArr3, adrs2);
            i26++;
            adrs2 = adrs;
            bArr4 = bArr6;
        }
        adrs3.setTypeAndClear(1);
        adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr3, adrs3, Arrays.concatenate(bArr5));
    }

    byte[] pkGen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        byte[][] bArr3 = new byte[this.engine.WOTS_LEN][];
        int i15 = 0;
        while (i15 < this.engine.WOTS_LEN) {
            ADRS adrs3 = new ADRS(adrs);
            adrs3.setTypeAndClear(5);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i15);
            adrs3.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs3);
            adrs3.setTypeAndClear(0);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i15);
            adrs3.setHashAddress(0);
            byte[] bArr4 = bArr2;
            bArr3[i15] = chain(bArrPRF, 0, this.f149612w - 1, bArr4, adrs3);
            i15++;
            bArr2 = bArr4;
        }
        adrs2.setTypeAndClear(1);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr3));
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr, 0, this.f149612w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i15 >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i16 += (this.f149612w - 1) - iArr[i15];
            i15++;
        }
        int i17 = sPHINCSPlusEngine.WOTS_LOGW;
        if (i17 % 8 != 0) {
            i16 <<= 8 - ((sPHINCSPlusEngine.WOTS_LEN2 * i17) % 8);
        }
        int i18 = ((sPHINCSPlusEngine.WOTS_LEN2 * i17) + 7) / 8;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i16);
        int i19 = 4 - i18;
        int i25 = this.f149612w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i19, i25, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        byte[][] bArr4 = new byte[this.engine.WOTS_LEN][];
        for (int i26 = 0; i26 < this.engine.WOTS_LEN; i26++) {
            adrs2.setTypeAndClear(5);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i26);
            adrs2.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr3, bArr2, adrs2);
            adrs2.setTypeAndClear(0);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i26);
            adrs2.setHashAddress(0);
            bArr4[i26] = chain(bArrPRF, 0, iArr[i26], bArr3, adrs2);
        }
        return Arrays.concatenate(bArr4);
    }
}
