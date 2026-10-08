package org.bouncycastle.pqc.crypto.slhdsa;

import java.math.BigInteger;
import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class Fors {
    SLHDSAEngine engine;

    public Fors(SLHDSAEngine sLHDSAEngine) {
        this.engine = sLHDSAEngine;
    }

    static int[] base2B(byte[] bArr, int i15, int i16) {
        int[] iArr = new int[i16];
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            while (i18 < i15) {
                bigIntegerAdd = bigIntegerAdd.shiftLeft(8).add(BigInteger.valueOf(bArr[i17] & 255));
                i17++;
                i18 += 8;
            }
            i18 -= i15;
            iArr[i19] = bigIntegerAdd.shiftRight(i18).mod(BigInteger.valueOf(2L).pow(i15)).intValue();
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        byte[][] bArr3 = new byte[2][];
        SLHDSAEngine sLHDSAEngine = this.engine;
        int i15 = sLHDSAEngine.K;
        byte[][] bArr4 = new byte[i15][];
        int[] iArrBase2B = base2B(bArr, sLHDSAEngine.A, i15);
        for (int i16 = 0; i16 < this.engine.K; i16++) {
            int i17 = iArrBase2B[i16];
            byte[] sk4 = sig_forsArr[i16].getSK();
            adrs.setTreeHeight(0);
            adrs.setTreeIndex((i16 << this.engine.A) + i17);
            bArr3[0] = this.engine.F(bArr2, adrs, sk4);
            byte[][] authPath = sig_forsArr[i16].getAuthPath();
            adrs.setTreeIndex((i16 << this.engine.A) + i17);
            int i18 = 0;
            while (i18 < this.engine.A) {
                int i19 = i18 + 1;
                adrs.setTreeHeight(i19);
                if (((1 << i18) & i17) == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i18]);
                } else {
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i18], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i18 = i19;
            }
            bArr4[i16] = bArr3[0];
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setTypeAndClear(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SLHDSAEngine sLHDSAEngine = fors.engine;
        int[] iArrBase2B = base2B(bArr, sLHDSAEngine.A, sLHDSAEngine.K);
        SIG_FORS[] sig_forsArr = new SIG_FORS[fors.engine.K];
        int i15 = 0;
        while (i15 < fors.engine.K) {
            int i16 = iArrBase2B[i15];
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            adrs2.setTreeIndex((i15 << fors.engine.A) + i16);
            byte[] bArr4 = bArr2;
            byte[] bArr5 = bArr3;
            byte[] bArrPRF = fors.engine.PRF(bArr5, bArr4, adrs2);
            adrs2.changeType(3);
            byte[][] bArr6 = new byte[fors.engine.A][];
            int i17 = 0;
            while (true) {
                int i18 = fors.engine.A;
                if (i17 < i18) {
                    bArr6[i17] = fors.treehash(bArr4, (i15 << i18) + (((i16 >>> i17) ^ 1) << i17), i17, bArr5, adrs2);
                    i17++;
                    fors = this;
                    bArr4 = bArr2;
                    bArr5 = bArr3;
                }
            }
            sig_forsArr[i15] = new SIG_FORS(bArrPRF, bArr6);
            i15++;
            fors = this;
        }
        return sig_forsArr;
    }

    byte[] treehash(byte[] bArr, int i15, int i16, byte[] bArr2, ADRS adrs) {
        if (((i15 >>> i16) << i16) != i15) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        ADRS adrs2 = new ADRS(adrs);
        for (int i17 = 0; i17 < (1 << i16); i17++) {
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i18 = i15 + i17;
            adrs2.setTreeIndex(i18);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs2);
            adrs2.changeType(3);
            byte[] bArrF = this.engine.F(bArr2, adrs2, bArrPRF);
            adrs2.setTreeHeight(1);
            int i19 = 1;
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == i19) {
                i18 = (i18 - 1) / 2;
                adrs2.setTreeIndex(i18);
                bArrF = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrF);
                i19++;
                adrs2.setTreeHeight(i19);
            }
            linkedList.add(0, new NodeEntry(bArrF, i19));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}
