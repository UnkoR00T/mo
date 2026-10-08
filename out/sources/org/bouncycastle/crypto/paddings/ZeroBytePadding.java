package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class ZeroBytePadding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i15) {
        int length = bArr.length - i15;
        while (i15 < bArr.length) {
            bArr[i15] = 0;
            i15++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ZeroByte";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) {
        int length = bArr.length;
        int i15 = 0;
        int i16 = -1;
        while (true) {
            length--;
            if (length < 0) {
                return i15;
            }
            i16 &= ((bArr[length] & 255) - 1) >> 31;
            i15 -= i16;
        }
    }
}
