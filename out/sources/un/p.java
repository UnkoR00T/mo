package un;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public class p {
    public static byte[] a(byte[] bArr, int i15) throws sn.h {
        int i16;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new sn.h("Invalid ECDSA signature format");
        }
        byte b15 = bArr[1];
        if (b15 > 0) {
            i16 = 2;
        } else {
            if (b15 != -127) {
                throw new sn.h("Invalid ECDSA signature format");
            }
            i16 = 3;
        }
        int i17 = bArr[i16 + 1];
        int i18 = i17;
        while (i18 > 0 && bArr[((i16 + 2) + i17) - i18] == 0) {
            i18--;
        }
        int i19 = i16 + 2 + i17;
        int i25 = bArr[i19 + 1];
        int i26 = i25;
        while (i26 > 0 && bArr[((i19 + 2) + i25) - i26] == 0) {
            i26--;
        }
        int iMax = Math.max(Math.max(i18, i26), i15 / 2);
        int i27 = bArr[i16 - 1];
        if ((i27 & GF2Field.MASK) != bArr.length - i16 || (i27 & GF2Field.MASK) != i17 + 4 + i25 || bArr[i16] != 2 || bArr[i19] != 2) {
            throw new sn.h("Invalid ECDSA signature format");
        }
        int i28 = iMax * 2;
        byte[] bArr2 = new byte[i28];
        System.arraycopy(bArr, i19 - i18, bArr2, iMax - i18, i18);
        System.arraycopy(bArr, ((i19 + 2) + i25) - i26, bArr2, i28 - i26, i26);
        return bArr2;
    }
}
