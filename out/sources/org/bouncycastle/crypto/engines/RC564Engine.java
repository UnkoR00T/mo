package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.RC5Parameters;

/* JADX INFO: loaded from: classes5.dex */
public class RC564Engine implements BlockCipher {
    private static final long P64 = -5196783011329398165L;
    private static final long Q64 = -7046029254386353131L;
    private static final int bytesPerWord = 8;
    private static final int wordSize = 64;
    private boolean forEncryption;
    private int _noRounds = 12;
    private long[] _S = null;

    private long bytesToWord(byte[] bArr, int i15) {
        long j15 = 0;
        for (int i16 = 7; i16 >= 0; i16--) {
            j15 = (j15 << 8) + ((long) (bArr[i16 + i15] & 255));
        }
        return j15;
    }

    private int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        long jBytesToWord = bytesToWord(bArr, i15);
        long jBytesToWord2 = bytesToWord(bArr, i15 + 8);
        for (int i17 = this._noRounds; i17 >= 1; i17--) {
            int i18 = i17 * 2;
            jBytesToWord2 = rotateRight(jBytesToWord2 - this._S[i18 + 1], jBytesToWord) ^ jBytesToWord;
            jBytesToWord = rotateRight(jBytesToWord - this._S[i18], jBytesToWord2) ^ jBytesToWord2;
        }
        wordToBytes(jBytesToWord - this._S[0], bArr2, i16);
        wordToBytes(jBytesToWord2 - this._S[1], bArr2, i16 + 8);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        long jBytesToWord = bytesToWord(bArr, i15) + this._S[0];
        long jBytesToWord2 = bytesToWord(bArr, i15 + 8) + this._S[1];
        for (int i17 = 1; i17 <= this._noRounds; i17++) {
            int i18 = i17 * 2;
            jBytesToWord = rotateLeft(jBytesToWord ^ jBytesToWord2, jBytesToWord2) + this._S[i18];
            jBytesToWord2 = rotateLeft(jBytesToWord2 ^ jBytesToWord, jBytesToWord) + this._S[i18 + 1];
        }
        wordToBytes(jBytesToWord, bArr2, i16);
        wordToBytes(jBytesToWord2, bArr2, i16 + 8);
        return 16;
    }

    private long rotateLeft(long j15, long j16) {
        long j17 = j16 & 63;
        return (j15 >>> ((int) (64 - j17))) | (j15 << ((int) j17));
    }

    private long rotateRight(long j15, long j16) {
        long j17 = j16 & 63;
        return (j15 << ((int) (64 - j17))) | (j15 >>> ((int) j17));
    }

    private void setKey(byte[] bArr) {
        long[] jArr;
        int length = (bArr.length + 7) / 8;
        long[] jArr2 = new long[length];
        for (int i15 = 0; i15 != bArr.length; i15++) {
            int i16 = i15 / 8;
            jArr2[i16] = jArr2[i16] + (((long) (bArr[i15] & 255)) << ((i15 % 8) * 8));
        }
        long[] jArr3 = new long[(this._noRounds + 1) * 2];
        this._S = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i17 = 1;
        while (true) {
            jArr = this._S;
            if (i17 >= jArr.length) {
                break;
            }
            jArr[i17] = jArr[i17 - 1] + Q64;
            i17++;
        }
        int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
        long jRotateLeft = 0;
        long jRotateLeft2 = 0;
        int length3 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < length2; i19++) {
            long[] jArr4 = this._S;
            jRotateLeft = rotateLeft(jArr4[length3] + jRotateLeft + jRotateLeft2, 3L);
            jArr4[length3] = jRotateLeft;
            jRotateLeft2 = rotateLeft(jArr2[i18] + jRotateLeft + jRotateLeft2, jRotateLeft2 + jRotateLeft);
            jArr2[i18] = jRotateLeft2;
            length3 = (length3 + 1) % this._S.length;
            i18 = (i18 + 1) % length;
        }
    }

    private void wordToBytes(long j15, byte[] bArr, int i15) {
        for (int i16 = 0; i16 < 8; i16++) {
            bArr[i16 + i15] = (byte) j15;
            j15 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-64";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof RC5Parameters)) {
            throw new IllegalArgumentException("invalid parameter passed to RC564 init - " + cipherParameters.getClass().getName());
        }
        RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
        this.forEncryption = z15;
        this._noRounds = rC5Parameters.getRounds();
        byte[] key = rC5Parameters.getKey();
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z15)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        return this.forEncryption ? encryptBlock(bArr, i15, bArr2, i16) : decryptBlock(bArr, i15, bArr2, i16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
