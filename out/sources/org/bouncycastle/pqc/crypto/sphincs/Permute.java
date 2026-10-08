package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class Permute {
    private static final int CHACHA_ROUNDS = 12;

    Permute() {
    }

    public static void permute(int i15, int[] iArr) {
        int i16 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i15 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i17 = iArr[0];
        int i18 = iArr[1];
        int i19 = iArr[2];
        char c15 = 3;
        int i25 = iArr[3];
        char c16 = 4;
        int i26 = iArr[4];
        char c17 = 5;
        int i27 = iArr[5];
        char c18 = 6;
        int i28 = iArr[6];
        int i29 = 7;
        int i35 = iArr[7];
        int i36 = 8;
        int i37 = iArr[8];
        int i38 = iArr[9];
        int i39 = iArr[10];
        int i45 = iArr[11];
        int i46 = iArr[12];
        int i47 = iArr[13];
        int i48 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i48;
        int iRotl3 = i47;
        int iRotl4 = i46;
        int i49 = i45;
        int i55 = i39;
        int i56 = i38;
        int i57 = i37;
        int iRotl5 = i35;
        int iRotl6 = i28;
        int iRotl7 = i27;
        int iRotl8 = i26;
        int i58 = i25;
        int i59 = i19;
        int i65 = i18;
        int i66 = i17;
        int i67 = i15;
        while (i67 > 0) {
            int i68 = i66 + iRotl8;
            char c19 = c15;
            int iRotl9 = rotl(iRotl4 ^ i68, i16);
            int i69 = i57 + iRotl9;
            int iRotl10 = rotl(iRotl8 ^ i69, 12);
            int i75 = i68 + iRotl10;
            int iRotl11 = rotl(iRotl9 ^ i75, i36);
            int i76 = i69 + iRotl11;
            int iRotl12 = rotl(iRotl10 ^ i76, i29);
            int i77 = i65 + iRotl7;
            char c25 = c16;
            int iRotl13 = rotl(iRotl3 ^ i77, i16);
            int i78 = i56 + iRotl13;
            int iRotl14 = rotl(iRotl7 ^ i78, 12);
            int i79 = i77 + iRotl14;
            int iRotl15 = rotl(iRotl13 ^ i79, i36);
            int i85 = i78 + iRotl15;
            int iRotl16 = rotl(iRotl14 ^ i85, i29);
            int i86 = i59 + iRotl6;
            char c26 = c17;
            int iRotl17 = rotl(iRotl2 ^ i86, i16);
            int i87 = i55 + iRotl17;
            char c27 = c18;
            int iRotl18 = rotl(iRotl6 ^ i87, 12);
            int i88 = i86 + iRotl18;
            int iRotl19 = rotl(iRotl17 ^ i88, i36);
            int i89 = i87 + iRotl19;
            int iRotl20 = rotl(iRotl18 ^ i89, i29);
            int i95 = i58 + iRotl5;
            int iRotl21 = rotl(iRotl ^ i95, i16);
            int i96 = i49 + iRotl21;
            int iRotl22 = rotl(iRotl5 ^ i96, 12);
            int i97 = i95 + iRotl22;
            int iRotl23 = rotl(iRotl21 ^ i97, i36);
            int i98 = i96 + iRotl23;
            int iRotl24 = rotl(iRotl22 ^ i98, 7);
            int i99 = i75 + iRotl16;
            int iRotl25 = rotl(iRotl23 ^ i99, 16);
            int i100 = i89 + iRotl25;
            int iRotl26 = rotl(iRotl16 ^ i100, 12);
            i66 = i99 + iRotl26;
            iRotl = rotl(iRotl25 ^ i66, 8);
            i55 = i100 + iRotl;
            iRotl7 = rotl(iRotl26 ^ i55, 7);
            int i101 = i79 + iRotl20;
            int iRotl27 = rotl(iRotl11 ^ i101, 16);
            int i102 = i98 + iRotl27;
            int iRotl28 = rotl(iRotl20 ^ i102, 12);
            i65 = i101 + iRotl28;
            iRotl4 = rotl(iRotl27 ^ i65, 8);
            i49 = i102 + iRotl4;
            iRotl6 = rotl(iRotl28 ^ i49, 7);
            int i103 = i88 + iRotl24;
            int iRotl29 = rotl(iRotl15 ^ i103, 16);
            int i104 = i76 + iRotl29;
            int iRotl30 = rotl(iRotl24 ^ i104, 12);
            i59 = i103 + iRotl30;
            iRotl3 = rotl(iRotl29 ^ i59, 8);
            i57 = i104 + iRotl3;
            iRotl5 = rotl(iRotl30 ^ i57, 7);
            int i105 = i97 + iRotl12;
            int iRotl31 = rotl(iRotl19 ^ i105, 16);
            int i106 = i85 + iRotl31;
            int iRotl32 = rotl(iRotl12 ^ i106, 12);
            i58 = i105 + iRotl32;
            iRotl2 = rotl(iRotl31 ^ i58, 8);
            i56 = i106 + iRotl2;
            iRotl8 = rotl(iRotl32 ^ i56, 7);
            i67 -= 2;
            i29 = 7;
            i16 = 16;
            c15 = c19;
            c16 = c25;
            c17 = c26;
            c18 = c27;
            i36 = 8;
        }
        iArr[0] = i66;
        iArr[1] = i65;
        iArr[2] = i59;
        iArr[c15] = i58;
        iArr[c16] = iRotl8;
        iArr[c17] = iRotl7;
        iArr[c18] = iRotl6;
        iArr[i29] = iRotl5;
        iArr[8] = i57;
        iArr[9] = i56;
        iArr[10] = i55;
        iArr[11] = i49;
        iArr[12] = iRotl4;
        iArr[13] = iRotl3;
        iArr[14] = iRotl2;
        iArr[15] = iRotl;
    }

    protected static int rotl(int i15, int i16) {
        return (i15 >>> (-i16)) | (i15 << i16);
    }

    void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i15 = 0; i15 < 16; i15++) {
            iArr[i15] = Pack.littleEndianToInt(bArr2, i15 * 4);
        }
        permute(12, iArr);
        for (int i16 = 0; i16 < 16; i16++) {
            Pack.intToLittleEndian(iArr[i16], bArr, i16 * 4);
        }
    }
}
