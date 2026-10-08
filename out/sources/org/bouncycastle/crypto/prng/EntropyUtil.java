package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes5.dex */
public class EntropyUtil {
    public static byte[] generateSeed(EntropySource entropySource, int i15) {
        byte[] bArr = new byte[i15];
        if (i15 * 8 <= entropySource.entropySize()) {
            System.arraycopy(entropySource.getEntropy(), 0, bArr, 0, i15);
            return bArr;
        }
        int iEntropySize = entropySource.entropySize() / 8;
        for (int i16 = 0; i16 < i15; i16 += iEntropySize) {
            byte[] entropy = entropySource.getEntropy();
            int i17 = i15 - i16;
            if (entropy.length <= i17) {
                System.arraycopy(entropy, 0, bArr, i16, entropy.length);
            } else {
                System.arraycopy(entropy, 0, bArr, i16, i17);
            }
        }
        return bArr;
    }
}
