package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes5.dex */
class Rounding {
    Rounding() {
    }

    public static int[] decompose(int i15, int i16) {
        int i17;
        int i18 = (i15 + CertificateBody.profileType) >> 7;
        if (i16 == 261888) {
            i17 = (((i18 * 1025) + PKIFailureInfo.badSenderNonce) >> 22) & 15;
        } else {
            if (i16 != 95232) {
                throw new RuntimeException("Wrong Gamma2!");
            }
            int i19 = ((i18 * 11275) + 8388608) >> 24;
            i17 = i19 ^ (((43 - i19) >> 31) & i19);
        }
        int i25 = i15 - ((i17 * 2) * i16);
        return new int[]{i25 - (((4190208 - i25) >> 31) & 8380417), i17};
    }

    public static int makeHint(int i15, int i16, MLDSAEngine mLDSAEngine) {
        int i17;
        int dilithiumGamma2 = mLDSAEngine.getDilithiumGamma2();
        if (i15 <= dilithiumGamma2 || i15 > (i17 = 8380417 - dilithiumGamma2)) {
            return 0;
        }
        return (i15 == i17 && i16 == 0) ? 0 : 1;
    }

    static void power2RoundAll(int[] iArr, int[] iArr2) {
        for (int i15 = 0; i15 < 256; i15++) {
            int i16 = iArr[i15];
            int i17 = i16 + 4095;
            iArr[i15] = i17 >> 13;
            iArr2[i15] = i16 - (i17 & (-8192));
        }
    }

    public static int useHint(int i15, int i16, int i17) {
        int[] iArrDecompose = decompose(i15, i17);
        int i18 = iArrDecompose[0];
        int i19 = iArrDecompose[1];
        if (i16 == 0) {
            return i19;
        }
        if (i17 == 261888) {
            return (i18 > 0 ? i19 + 1 : i19 - 1) & 15;
        }
        if (i17 != 95232) {
            throw new RuntimeException("Wrong Gamma2!");
        }
        if (i18 > 0) {
            if (i19 == 43) {
                return 0;
            }
            return i19 + 1;
        }
        if (i19 == 0) {
            return 43;
        }
        return i19 - 1;
    }
}
