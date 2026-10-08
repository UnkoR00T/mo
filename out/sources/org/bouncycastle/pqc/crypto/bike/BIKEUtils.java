package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class BIKEUtils {
    BIKEUtils() {
    }

    protected static int CHECK_BIT(byte[] bArr, int i15) {
        return (bArr[i15 / 8] >>> (i15 % 8)) & 1;
    }

    protected static void SET_BIT(byte[] bArr, int i15) {
        int i16 = i15 / 8;
        bArr[i16] = (byte) (((long) bArr[i16]) | (1 << (i15 % 8)));
    }

    static void fromBitArrayToByteArray(byte[] bArr, byte[] bArr2, int i15, int i16) {
        long j15 = i16;
        int i17 = 0;
        int i18 = 0;
        while (i17 < j15) {
            int i19 = i17 + 8;
            if (i19 >= i16) {
                int i25 = i15 + i17;
                int i26 = bArr2[i25];
                for (int i27 = (i16 - i17) - 1; i27 >= 1; i27--) {
                    i26 |= bArr2[i25 + i27] << i27;
                }
                bArr[i18] = (byte) i26;
            } else {
                int i28 = i17 + i15;
                int i29 = bArr2[i28];
                for (int i35 = 7; i35 >= 1; i35--) {
                    i29 |= bArr2[i28 + i35] << i35;
                }
                bArr[i18] = (byte) i29;
            }
            i18++;
            i17 = i19;
        }
    }

    static void generateRandomByteArray(byte[] bArr, int i15, int i16, Xof xof) {
        byte[] bArr2 = new byte[4];
        for (int i17 = i16 - 1; i17 >= 0; i17--) {
            xof.doOutput(bArr2, 0, 4);
            int iLittleEndianToInt = ((int) (((((long) Pack.littleEndianToInt(bArr2, 0)) & BodyPartID.bodyIdMax) * ((long) (i15 - i17))) >> 32)) + i17;
            if (CHECK_BIT(bArr, iLittleEndianToInt) != 0) {
                iLittleEndianToInt = i17;
            }
            SET_BIT(bArr, iLittleEndianToInt);
        }
    }

    static int getHammingWeight(byte[] bArr) {
        int i15 = 0;
        for (byte b15 : bArr) {
            i15 += b15;
        }
        return i15;
    }
}
