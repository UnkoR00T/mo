package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class TBCPadding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i15) {
        int length = bArr.length - i15;
        int i16 = 0;
        if (i15 <= 0 ? (bArr[bArr.length - 1] & 1) == 0 : (bArr[i15 - 1] & 1) == 0) {
            i16 = 255;
        }
        byte b15 = (byte) i16;
        while (i15 < bArr.length) {
            bArr[i15] = b15;
            i15++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "TBC";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) {
        int length = bArr.length - 1;
        int i15 = bArr[length] & 255;
        int i16 = -1;
        int i17 = 1;
        while (true) {
            length--;
            if (length < 0) {
                return i17;
            }
            i16 &= (((bArr[length] & 255) ^ i15) - 1) >> 31;
            i17 -= i16;
        }
    }
}
