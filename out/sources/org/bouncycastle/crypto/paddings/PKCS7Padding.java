package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.openssl.PEMParser;

/* JADX INFO: loaded from: classes5.dex */
public class PKCS7Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i15) {
        byte length = (byte) (bArr.length - i15);
        while (i15 < bArr.length) {
            bArr[i15] = length;
            i15++;
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return PEMParser.TYPE_PKCS7;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) throws InvalidCipherTextException {
        byte b15 = bArr[bArr.length - 1];
        int i15 = b15 & 255;
        int length = bArr.length - i15;
        int i16 = ((i15 - 1) | length) >> 31;
        for (int i17 = 0; i17 < bArr.length; i17++) {
            i16 |= (bArr[i17] ^ b15) & (~((i17 - length) >> 31));
        }
        if (i16 == 0) {
            return i15;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }
}
