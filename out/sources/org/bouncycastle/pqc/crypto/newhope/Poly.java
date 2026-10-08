package org.bouncycastle.pqc.crypto.newhope;

import android.R;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class Poly {
    Poly() {
    }

    static void add(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i15 = 0; i15 < 1024; i15++) {
            sArr3[i15] = Reduce.barrett((short) (sArr[i15] + sArr2[i15]));
        }
    }

    static void fromBytes(short[] sArr, byte[] bArr) {
        for (int i15 = 0; i15 < 256; i15++) {
            int i16 = i15 * 7;
            int i17 = bArr[i16] & 255;
            byte b15 = bArr[i16 + 1];
            int i18 = bArr[i16 + 2] & 255;
            byte b16 = bArr[i16 + 3];
            int i19 = bArr[i16 + 4] & 255;
            byte b17 = bArr[i16 + 5];
            int i25 = bArr[i16 + 6] & 255;
            int i26 = i15 * 4;
            sArr[i26] = (short) (i17 | ((b15 & 63) << 8));
            sArr[i26 + 1] = (short) (((b15 & 255) >>> 6) | (i18 << 2) | ((b16 & 15) << 10));
            sArr[i26 + 2] = (short) (((b16 & 255) >>> 4) | (i19 << 4) | ((b17 & 3) << 12));
            sArr[i26 + 3] = (short) ((i25 << 6) | ((b17 & 255) >>> 2));
        }
    }

    static void fromNTT(short[] sArr) {
        NTT.bitReverse(sArr);
        NTT.core(sArr, Precomp.OMEGAS_INV_MONTGOMERY);
        NTT.mulCoefficients(sArr, Precomp.PSIS_INV_MONTGOMERY);
    }

    static void getNoise(short[] sArr, byte[] bArr, byte b15) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b15;
        byte[] bArr3 = new byte[PKIFailureInfo.certConfirmed];
        ChaCha20.process(bArr, bArr2, bArr3, 0, PKIFailureInfo.certConfirmed);
        for (int i15 = 0; i15 < 1024; i15++) {
            int iBigEndianToInt = Pack.bigEndianToInt(bArr3, i15 * 4);
            int i16 = 0;
            for (int i17 = 0; i17 < 8; i17++) {
                i16 += (iBigEndianToInt >> i17) & R.attr.cacheColorHint;
            }
            sArr[i15] = (short) (((((i16 >>> 24) + i16) & GF2Field.MASK) + 12289) - (((i16 >>> 16) + (i16 >>> 8)) & GF2Field.MASK));
        }
    }

    private static short normalize(short s15) {
        short sBarrett = Reduce.barrett(s15);
        int i15 = sBarrett - 12289;
        return (short) (((sBarrett ^ i15) & (i15 >> 31)) ^ i15);
    }

    static void pointWise(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i15 = 0; i15 < 1024; i15++) {
            sArr3[i15] = Reduce.montgomery((sArr[i15] & HPKE.aead_EXPORT_ONLY) * (65535 & Reduce.montgomery((sArr2[i15] & HPKE.aead_EXPORT_ONLY) * 3186)));
        }
    }

    static void toBytes(byte[] bArr, short[] sArr) {
        for (int i15 = 0; i15 < 256; i15++) {
            int i16 = i15 * 4;
            short sNormalize = normalize(sArr[i16]);
            short sNormalize2 = normalize(sArr[i16 + 1]);
            short sNormalize3 = normalize(sArr[i16 + 2]);
            short sNormalize4 = normalize(sArr[i16 + 3]);
            int i17 = i15 * 7;
            bArr[i17] = (byte) sNormalize;
            bArr[i17 + 1] = (byte) ((sNormalize >> 8) | (sNormalize2 << 6));
            bArr[i17 + 2] = (byte) (sNormalize2 >> 2);
            bArr[i17 + 3] = (byte) ((sNormalize2 >> 10) | (sNormalize3 << 4));
            bArr[i17 + 4] = (byte) (sNormalize3 >> 4);
            bArr[i17 + 5] = (byte) ((sNormalize3 >> 12) | (sNormalize4 << 2));
            bArr[i17 + 6] = (byte) (sNormalize4 >> 6);
        }
    }

    static void toNTT(short[] sArr) {
        NTT.mulCoefficients(sArr, Precomp.PSIS_BITREV_MONTGOMERY);
        NTT.core(sArr, Precomp.OMEGAS_MONTGOMERY);
    }

    static void uniform(short[] sArr, byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i15 = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i16 = 0; i16 < 256; i16 += 2) {
                int i17 = (bArr2[i16] & 255) | ((bArr2[i16 + 1] & 255) << 8);
                if (i17 < 61445) {
                    int i18 = i15 + 1;
                    sArr[i15] = (short) i17;
                    if (i18 == 1024) {
                        return;
                    } else {
                        i15 = i18;
                    }
                }
            }
        }
    }
}
