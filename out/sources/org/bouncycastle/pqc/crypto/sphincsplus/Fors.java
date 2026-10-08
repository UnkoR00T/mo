package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class Fors {
    SPHINCSPlusEngine engine;

    public Fors(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
    }

    static int[] message_to_idxs(byte[] bArr, int i15, int i16) {
        int[] iArr = new int[i15];
        int i17 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            iArr[i18] = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                iArr[i18] = iArr[i18] ^ (((bArr[i17 >> 3] >> (i17 & 7)) & 1) << i19);
                i17++;
            }
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i15 = 2;
        byte[][] bArr3 = new byte[2][];
        SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
        int i16 = sPHINCSPlusEngine.K;
        byte[][] bArr4 = new byte[i16][];
        int i17 = sPHINCSPlusEngine.T;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, i16, sPHINCSPlusEngine.A);
        int i18 = 0;
        while (i18 < this.engine.K) {
            int i19 = iArrMessage_to_idxs[i18];
            byte[] sk4 = sig_forsArr[i18].getSK();
            adrs.setTreeHeight(0);
            int i25 = (i18 * i17) + i19;
            adrs.setTreeIndex(i25);
            bArr3[0] = this.engine.F(bArr2, adrs, sk4);
            byte[][] authPath = sig_forsArr[i18].getAuthPath();
            adrs.setTreeIndex(i25);
            int i26 = 0;
            while (i26 < this.engine.A) {
                int i27 = i26 + 1;
                adrs.setTreeHeight(i27);
                if ((i19 / (1 << i26)) % i15 == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i15);
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i26]);
                } else {
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i26], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i26 = i27;
                i15 = i15;
            }
            bArr4[i18] = bArr3[0];
            i18++;
            i15 = i15;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setTypeAndClear(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine = fors.engine;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, sPHINCSPlusEngine.K, sPHINCSPlusEngine.A);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sPHINCSPlusEngine2.K];
        int i15 = sPHINCSPlusEngine2.T;
        int i16 = 0;
        while (i16 < fors.engine.K) {
            int i17 = iArrMessage_to_idxs[i16];
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i18 = i16 * i15;
            adrs2.setTreeIndex(i18 + i17);
            byte[] bArr4 = bArr2;
            byte[] bArr5 = bArr3;
            byte[] bArrPRF = fors.engine.PRF(bArr5, bArr4, adrs2);
            adrs2.changeType(3);
            byte[][] bArr6 = new byte[fors.engine.A][];
            int i19 = 0;
            while (i19 < fors.engine.A) {
                int i25 = 1 << i19;
                bArr6[i19] = fors.treehash(bArr4, (((i17 / i25) ^ 1) * i25) + i18, i19, bArr5, adrs2);
                i19++;
                fors = this;
                bArr4 = bArr2;
                bArr5 = bArr3;
            }
            sig_forsArr[i16] = new SIG_FORS(bArrPRF, bArr6);
            i16++;
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
