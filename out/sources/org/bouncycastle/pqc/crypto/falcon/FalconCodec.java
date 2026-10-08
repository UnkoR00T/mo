package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
class FalconCodec {
    static final byte[] max_fg_bits = {0, 8, 8, 8, 8, 8, 7, 7, 6, 6, 5};
    static final byte[] max_FG_bits = {0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    FalconCodec() {
    }

    static int comp_decode(short[] sArr, int i15, byte[] bArr, int i16) {
        int i17 = 1 << i15;
        int i18 = 0;
        int i19 = 0;
        int i25 = 0;
        for (int i26 = 0; i26 < i17; i26++) {
            if (i25 >= i16) {
                return 0;
            }
            i18 = (i18 << 8) | (bArr[i25] & 255);
            i25++;
            int i27 = i18 >>> i19;
            int i28 = i27 & 128;
            int i29 = i27 & CertificateBody.profileType;
            do {
                if (i19 == 0) {
                    if (i25 >= i16) {
                        return 0;
                    }
                    i18 = (i18 << 8) | (bArr[i25] & 255);
                    i25++;
                    i19 = 8;
                }
                i19--;
                if (((i18 >>> i19) & 1) == 0) {
                    i29 += 128;
                } else {
                    if (i28 != 0 && i29 == 0) {
                        return 0;
                    }
                    if (i28 != 0) {
                        i29 = -i29;
                    }
                    sArr[i26] = (short) i29;
                }
            } while (i29 <= 2047);
            return 0;
        }
        if ((((1 << i19) - 1) & i18) != 0) {
            return 0;
        }
        return i25;
    }

    static int comp_encode(byte[] bArr, int i15, short[] sArr, int i16) {
        int i17;
        int i18 = 1 << i16;
        for (int i19 = 0; i19 < i18; i19++) {
            short s15 = sArr[i19];
            if (s15 < -2047 || s15 > 2047) {
                return 0;
            }
        }
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < i18; i28++) {
            int i29 = i26 << 1;
            short s16 = sArr[i28];
            if (s16 < 0) {
                i17 = s16;
                i29 |= 1;
                i17 = -s16;
            }
            i17 = s16;
            int i35 = (i29 << 7) | (i17 & CertificateBody.profileType);
            int i36 = (i17 >>> 7) + 1;
            i26 = (i35 << i36) | 1;
            i25 = i25 + 8 + i36;
            while (i25 >= 8) {
                i25 -= 8;
                if (bArr != null) {
                    if (i27 >= i15) {
                        return 0;
                    }
                    bArr[i27] = (byte) (i26 >>> i25);
                }
                i27++;
            }
        }
        if (i25 <= 0) {
            return i27;
        }
        if (bArr != null) {
            if (i27 >= i15) {
                return 0;
            }
            bArr[i27] = (byte) (i26 << (8 - i25));
        }
        return i27 + 1;
    }

    static int modq_decode(short[] sArr, int i15, byte[] bArr, int i16) {
        int i17 = 1 << i15;
        int i18 = ((i17 * 14) + 7) >> 3;
        if (i18 > i16) {
            return 0;
        }
        int i19 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i19 < i17) {
            int i28 = i27 + 1;
            i25 = (i25 << 8) | (bArr[i27] & 255);
            int i29 = i26 + 8;
            if (i29 >= 14) {
                i26 -= 6;
                int i35 = (i25 >>> i26) & 16383;
                if (i35 >= 12289) {
                    return 0;
                }
                sArr[i19] = (short) i35;
                i19++;
            } else {
                i26 = i29;
            }
            i27 = i28;
        }
        if ((((1 << i26) - 1) & i25) != 0) {
            return 0;
        }
        return i18;
    }

    static int modq_encode(byte[] bArr, int i15, short[] sArr, int i16) {
        int i17 = 1;
        int i18 = 1 << i16;
        for (int i19 = 0; i19 < i18; i19++) {
            if ((65535 & sArr[i19]) >= 12289) {
                return 0;
            }
        }
        int i25 = ((i18 * 14) + 7) >> 3;
        if (bArr != null) {
            if (i25 > i15) {
                return 0;
            }
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < i18; i28++) {
                i27 = (i27 << 14) | (sArr[i28] & HPKE.aead_EXPORT_ONLY);
                i26 += 14;
                while (i26 >= 8) {
                    i26 -= 8;
                    bArr[i17] = (byte) (i27 >> i26);
                    i17++;
                }
            }
            if (i26 > 0) {
                bArr[i17] = (byte) (i27 << (8 - i26));
            }
        }
        return i25;
    }

    static int trim_i8_decode(byte[] bArr, int i15, int i16, byte[] bArr2, int i17, int i18) {
        int i19 = 1 << i15;
        int i25 = ((i19 * i16) + 7) >> 3;
        if (i25 > i18) {
            return 0;
        }
        int i26 = (1 << i16) - 1;
        int i27 = 1 << (i16 - 1);
        int i28 = 0;
        int i29 = 0;
        int i35 = 0;
        while (i28 < i19) {
            int i36 = i17 + 1;
            i29 = (i29 << 8) | (bArr2[i17] & GF2Field.MASK);
            i35 += 8;
            while (i35 >= i16 && i28 < i19) {
                i35 -= i16;
                int i37 = (i29 >>> i35) & i26;
                int i38 = i37 | (-(i37 & i27));
                if (i38 == (-i27)) {
                    return 0;
                }
                bArr[i28] = (byte) i38;
                i28++;
            }
            i17 = i36;
        }
        if ((((1 << i35) - 1) & i29) != 0) {
            return 0;
        }
        return i25;
    }

    static int trim_i8_encode(byte[] bArr, int i15, int i16, byte[] bArr2, int i17, int i18) {
        int i19 = 1 << i17;
        int i25 = (1 << (i18 - 1)) - 1;
        int i26 = -i25;
        for (int i27 = 0; i27 < i19; i27++) {
            int i28 = bArr2[i27];
            if (i28 < i26 || i28 > i25) {
                return 0;
            }
        }
        int i29 = ((i19 * i18) + 7) >> 3;
        if (bArr != null) {
            if (i29 > i16) {
                return 0;
            }
            int i35 = (1 << i18) - 1;
            int i36 = 0;
            int i37 = 0;
            for (int i38 = 0; i38 < i19; i38++) {
                i37 = (i37 << i18) | (bArr2[i38] & 65535 & i35);
                i36 += i18;
                while (i36 >= 8) {
                    i36 -= 8;
                    bArr[i15] = (byte) (i37 >>> i36);
                    i15++;
                }
            }
            if (i36 > 0) {
                bArr[i15] = (byte) (i37 << (8 - i36));
            }
        }
        return i29;
    }
}
