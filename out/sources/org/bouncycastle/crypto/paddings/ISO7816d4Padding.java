package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes5.dex */
public class ISO7816d4Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i15) {
        int length = bArr.length - i15;
        bArr[i15] = -128;
        while (true) {
            i15++;
            if (i15 >= bArr.length) {
                return length;
            }
            bArr[i15] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO7816-4";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length;
        int i15 = -1;
        int i16 = -1;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            int i17 = bArr[length] & 255;
            i15 ^= ((((i17 ^ 128) - 1) >> 31) & i16) & (length ^ i15);
            i16 &= (i17 - 1) >> 31;
        }
        if (i15 >= 0) {
            return bArr.length - i15;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
