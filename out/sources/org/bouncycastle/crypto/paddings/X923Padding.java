package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes5.dex */
public class X923Padding implements BlockCipherPadding {
    SecureRandom random = null;

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i15) {
        byte length = (byte) (bArr.length - i15);
        while (i15 < bArr.length - 1) {
            SecureRandom secureRandom = this.random;
            if (secureRandom == null) {
                bArr[i15] = 0;
            } else {
                bArr[i15] = (byte) secureRandom.nextInt();
            }
            i15++;
        }
        bArr[i15] = length;
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "X9.23";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        int i15 = bArr[bArr.length - 1] & 255;
        if ((((bArr.length - i15) | (i15 - 1)) >> 31) == 0) {
            return i15;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
