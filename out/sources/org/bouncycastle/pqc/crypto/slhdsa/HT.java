package org.bouncycastle.pqc.crypto.slhdsa;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class HT {
    SLHDSAEngine engine;
    final byte[] htPubKey;
    private final byte[] pkSeed;
    private final byte[] skSeed;
    WotsPlus wots;

    public HT(SLHDSAEngine sLHDSAEngine, byte[] bArr, byte[] bArr2) {
        this.skSeed = bArr;
        this.pkSeed = bArr2;
        this.engine = sLHDSAEngine;
        this.wots = new WotsPlus(sLHDSAEngine);
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(sLHDSAEngine.D - 1);
        adrs.setTreeAddress(0L);
        if (bArr != null) {
            this.htPubKey = xmss_PKgen(bArr, bArr2, adrs);
        } else {
            this.htPubKey = null;
        }
    }

    byte[] sign(byte[] bArr, long j15, int i15) {
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j15);
        HT ht4 = this;
        SIG_XMSS sig_xmssXmss_sign = ht4.xmss_sign(bArr, this.skSeed, i15, this.pkSeed, adrs);
        int i16 = ht4.engine.D;
        SIG_XMSS[] sig_xmssArr = new SIG_XMSS[i16];
        sig_xmssArr[0] = sig_xmssXmss_sign;
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j15);
        byte[] bArrXmss_pkFromSig = ht4.xmss_pkFromSig(i15, sig_xmssXmss_sign, bArr, ht4.pkSeed, adrs);
        int i17 = 1;
        while (true) {
            SLHDSAEngine sLHDSAEngine = ht4.engine;
            if (i17 >= sLHDSAEngine.D) {
                break;
            }
            int i18 = sLHDSAEngine.H_PRIME;
            int i19 = (int) (((long) ((1 << i18) - 1)) & j15);
            j15 >>>= i18;
            adrs.setLayerAddress(i17);
            adrs.setTreeAddress(j15);
            SIG_XMSS sig_xmssXmss_sign2 = ht4.xmss_sign(bArrXmss_pkFromSig, ht4.skSeed, i19, ht4.pkSeed, adrs);
            sig_xmssArr[i17] = sig_xmssXmss_sign2;
            if (i17 < ht4.engine.D - 1) {
                bArrXmss_pkFromSig = ht4.xmss_pkFromSig(i19, sig_xmssXmss_sign2, bArrXmss_pkFromSig, ht4.pkSeed, adrs);
            }
            i17++;
            ht4 = this;
        }
        byte[][] bArr2 = new byte[i16][];
        for (int i25 = 0; i25 != i16; i25++) {
            SIG_XMSS sig_xmss = sig_xmssArr[i25];
            bArr2[i25] = Arrays.concatenate(sig_xmss.sig, Arrays.concatenate(sig_xmss.auth));
        }
        return Arrays.concatenate(bArr2);
    }

    byte[] treehash(byte[] bArr, int i15, int i16, byte[] bArr2, ADRS adrs) {
        if (((i15 >>> i16) << i16) != i15) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        ADRS adrs2 = new ADRS(adrs);
        for (int i17 = 0; i17 < (1 << i16); i17++) {
            adrs2.setTypeAndClear(0);
            int i18 = i15 + i17;
            adrs2.setKeyPairAddress(i18);
            byte[] bArrPkGen = this.wots.pkGen(bArr, bArr2, adrs2);
            adrs2.setTypeAndClear(2);
            adrs2.setTreeHeight(1);
            adrs2.setTreeIndex(i18);
            int i19 = 1;
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == i19) {
                i18 = (i18 - 1) / 2;
                adrs2.setTreeIndex(i18);
                bArrPkGen = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrPkGen);
                i19++;
                adrs2.setTreeHeight(i19);
            }
            linkedList.add(0, new NodeEntry(bArrPkGen, i19));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }

    public boolean verify(byte[] bArr, SIG_XMSS[] sig_xmssArr, byte[] bArr2, long j15, int i15, byte[] bArr3) {
        ADRS adrs = new ADRS();
        SIG_XMSS sig_xmss = sig_xmssArr[0];
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j15);
        HT ht4 = this;
        byte[] bArrXmss_pkFromSig = ht4.xmss_pkFromSig(i15, sig_xmss, bArr, bArr2, adrs);
        int i16 = 1;
        while (true) {
            SLHDSAEngine sLHDSAEngine = ht4.engine;
            if (i16 >= sLHDSAEngine.D) {
                return Arrays.areEqual(bArr3, bArrXmss_pkFromSig);
            }
            int i17 = sLHDSAEngine.H_PRIME;
            int i18 = (int) (((long) ((1 << i17) - 1)) & j15);
            j15 >>>= i17;
            SIG_XMSS sig_xmss2 = sig_xmssArr[i16];
            adrs.setLayerAddress(i16);
            adrs.setTreeAddress(j15);
            bArrXmss_pkFromSig = ht4.xmss_pkFromSig(i18, sig_xmss2, bArrXmss_pkFromSig, bArr2, adrs);
            i16++;
            ht4 = this;
        }
    }

    byte[] xmss_PKgen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        return treehash(bArr, 0, this.engine.H_PRIME, bArr2, adrs);
    }

    byte[] xmss_pkFromSig(int i15, SIG_XMSS sig_xmss, byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        int i16 = 0;
        adrs2.setTypeAndClear(0);
        adrs2.setKeyPairAddress(i15);
        byte[] wOTSSig = sig_xmss.getWOTSSig();
        byte[][] xmssauth = sig_xmss.getXMSSAUTH();
        byte[] bArrPkFromSig = this.wots.pkFromSig(wOTSSig, bArr, bArr2, adrs2);
        adrs2.setTypeAndClear(2);
        adrs2.setTreeIndex(i15);
        while (i16 < this.engine.H_PRIME) {
            int i17 = i16 + 1;
            adrs2.setTreeHeight(i17);
            if (((1 << i16) & i15) == 0) {
                adrs2.setTreeIndex(adrs2.getTreeIndex() / 2);
                bArrPkFromSig = this.engine.H(bArr2, adrs2, bArrPkFromSig, xmssauth[i16]);
            } else {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrPkFromSig = this.engine.H(bArr2, adrs2, xmssauth[i16], bArrPkFromSig);
            }
            i16 = i17;
        }
        return bArrPkFromSig;
    }

    SIG_XMSS xmss_sign(byte[] bArr, byte[] bArr2, int i15, byte[] bArr3, ADRS adrs) {
        byte[][] bArr4 = new byte[this.engine.H_PRIME][];
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setTypeAndClear(2);
        adrs2.setLayerAddress(adrs.getLayerAddress());
        adrs2.setTreeAddress(adrs.getTreeAddress());
        int i16 = 0;
        while (i16 < this.engine.H_PRIME) {
            byte[] bArr5 = bArr2;
            bArr4[i16] = treehash(bArr5, ((i15 >>> i16) ^ 1) << i16, i16, bArr3, adrs2);
            i16++;
            bArr2 = bArr5;
        }
        byte[] bArr6 = bArr2;
        ADRS adrs3 = new ADRS(adrs);
        adrs3.setTypeAndClear(0);
        adrs3.setKeyPairAddress(i15);
        return new SIG_XMSS(this.wots.sign(bArr, bArr6, bArr3, adrs3), bArr4);
    }
}
