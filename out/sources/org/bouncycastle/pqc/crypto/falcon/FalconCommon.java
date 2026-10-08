package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes5.dex */
class FalconCommon {
    static final int[] l2bound = {0, 101498, 208714, 428865, 892039, 1852696, 3842630, 7959734, 16468416, 34034726, 70265242};

    FalconCommon() {
    }

    static void hash_to_point_vartime(SHAKEDigest sHAKEDigest, short[] sArr, int i15) {
        int i16 = 1 << i15;
        byte[] bArr = new byte[2];
        int i17 = 0;
        while (i16 > 0) {
            sHAKEDigest.doOutput(bArr, 0, 2);
            int i18 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            if (i18 < 61445) {
                sArr[i17] = (short) (i18 % 12289);
                i16--;
                i17++;
            }
        }
    }

    static int is_short(short[] sArr, int i15, short[] sArr2, int i16) {
        int i17 = 1 << i16;
        int i18 = 0;
        int i19 = 0;
        for (int i25 = 0; i25 < i17; i25++) {
            short s15 = sArr[i15 + i25];
            int i26 = i18 + (s15 * s15);
            int i27 = i19 | i26;
            short s16 = sArr2[i25];
            i18 = i26 + (s16 * s16);
            i19 = i27 | i18;
        }
        return (((long) ((-(i19 >>> 31)) | i18)) & BodyPartID.bodyIdMax) <= ((long) l2bound[i16]) ? 1 : 0;
    }

    static int is_short_half(int i15, short[] sArr, int i16) {
        int i17 = 1 << i16;
        int i18 = -(i15 >>> 31);
        for (int i19 = 0; i19 < i17; i19++) {
            short s15 = sArr[i19];
            i15 += s15 * s15;
            i18 |= i15;
        }
        return (((long) (i15 | (-(i18 >>> 31)))) & BodyPartID.bodyIdMax) <= ((long) l2bound[i16]) ? 1 : 0;
    }
}
