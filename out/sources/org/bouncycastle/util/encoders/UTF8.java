package org.bouncycastle.util.encoders;

import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes5.dex */
public class UTF8 {
    private static final byte C_CR1 = 1;
    private static final byte C_CR2 = 2;
    private static final byte C_CR3 = 3;
    private static final byte C_ILL = 0;
    private static final byte C_L2A = 4;
    private static final byte C_L3A = 5;
    private static final byte C_L3B = 6;
    private static final byte C_L3C = 7;
    private static final byte C_L4A = 8;
    private static final byte C_L4B = 9;
    private static final byte C_L4C = 10;
    private static final byte S_CS1 = 0;
    private static final byte S_CS2 = 16;
    private static final byte S_CS3 = 32;
    private static final byte S_END = -1;
    private static final byte S_ERR = -2;
    private static final byte S_P3A = 48;
    private static final byte S_P3B = 64;
    private static final byte S_P4A = 80;
    private static final byte S_P4B = 96;
    private static final short[] firstUnitTable = new short[128];
    private static final byte[] transitionTable;

    static {
        byte[] bArr = new byte[112];
        transitionTable = bArr;
        byte[] bArr2 = new byte[128];
        fill(bArr2, 0, 15, (byte) 1);
        fill(bArr2, 16, 31, (byte) 2);
        fill(bArr2, 32, 63, (byte) 3);
        fill(bArr2, 64, 65, (byte) 0);
        fill(bArr2, 66, 95, (byte) 4);
        fill(bArr2, 96, 96, C_L3A);
        fill(bArr2, 97, 108, C_L3B);
        fill(bArr2, 109, 109, C_L3C);
        fill(bArr2, 110, 111, C_L3B);
        fill(bArr2, 112, 112, C_L4A);
        fill(bArr2, 113, 115, C_L4B);
        fill(bArr2, 116, 116, C_L4C);
        fill(bArr2, 117, CertificateBody.profileType, (byte) 0);
        fill(bArr, 0, bArr.length - 1, S_ERR);
        fill(bArr, 8, 11, S_END);
        fill(bArr, 24, 27, (byte) 0);
        fill(bArr, 40, 43, S_CS2);
        fill(bArr, 58, 59, (byte) 0);
        fill(bArr, 72, 73, (byte) 0);
        fill(bArr, 89, 91, S_CS2);
        fill(bArr, 104, 104, S_CS2);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, C_L3C, C_L3C, C_L3C};
        byte[] bArr4 = {S_ERR, S_ERR, S_ERR, S_ERR, 0, S_P3A, S_CS2, S_P3B, S_P4A, S_CS3, S_P4B};
        for (int i15 = 0; i15 < 128; i15++) {
            byte b15 = bArr2[i15];
            firstUnitTable[i15] = (short) (bArr4[b15] | ((bArr3[b15] & i15) << 8));
        }
    }

    private static void fill(byte[] bArr, int i15, int i16, byte b15) {
        while (i15 <= i16) {
            bArr[i15] = b15;
            i15++;
        }
    }

    public static int transcodeToUTF16(byte[] bArr, int i15, int i16, char[] cArr) {
        int i17 = i16 + i15;
        int i18 = 0;
        while (i15 < i17) {
            int i19 = i15 + 1;
            byte b15 = bArr[i15];
            if (b15 < 0) {
                short s15 = firstUnitTable[b15 & 127];
                int i25 = s15 >>> 8;
                byte b16 = (byte) s15;
                while (b16 >= 0) {
                    if (i19 >= i17) {
                        return -1;
                    }
                    int i26 = i19 + 1;
                    byte b17 = bArr[i19];
                    i25 = (i25 << 6) | (b17 & 63);
                    b16 = transitionTable[b16 + ((b17 & S_END) >>> 4)];
                    i19 = i26;
                }
                if (b16 == -2) {
                    return -1;
                }
                if (i25 <= 65535) {
                    if (i18 >= cArr.length) {
                        return -1;
                    }
                    cArr[i18] = (char) i25;
                    i18++;
                } else {
                    if (i18 >= cArr.length - 1) {
                        return -1;
                    }
                    int i27 = i18 + 1;
                    cArr[i18] = (char) ((i25 >>> 10) + 55232);
                    i18 += 2;
                    cArr[i27] = (char) ((i25 & 1023) | 56320);
                }
                i15 = i19;
            } else {
                if (i18 >= cArr.length) {
                    return -1;
                }
                cArr[i18] = (char) b15;
                i15 = i19;
                i18++;
            }
        }
        return i18;
    }

    public static int transcodeToUTF16(byte[] bArr, char[] cArr) {
        return transcodeToUTF16(bArr, 0, bArr.length, cArr);
    }
}
