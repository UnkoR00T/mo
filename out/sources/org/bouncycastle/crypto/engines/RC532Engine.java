package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC5Parameters;

/* JADX INFO: loaded from: classes5.dex */
public class RC532Engine implements BlockCipher {
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private boolean forEncryption;
    private int _noRounds = 12;
    private int[] _S = null;

    private int bytesToWord(byte[] bArr, int i15) {
        return ((bArr[i15 + 3] & 255) << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    private int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBytesToWord = bytesToWord(bArr, i15);
        int iBytesToWord2 = bytesToWord(bArr, i15 + 4);
        for (int i17 = this._noRounds; i17 >= 1; i17--) {
            int i18 = i17 * 2;
            iBytesToWord2 = rotateRight(iBytesToWord2 - this._S[i18 + 1], iBytesToWord) ^ iBytesToWord;
            iBytesToWord = rotateRight(iBytesToWord - this._S[i18], iBytesToWord2) ^ iBytesToWord2;
        }
        wordToBytes(iBytesToWord - this._S[0], bArr2, i16);
        wordToBytes(iBytesToWord2 - this._S[1], bArr2, i16 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBytesToWord = bytesToWord(bArr, i15) + this._S[0];
        int iBytesToWord2 = bytesToWord(bArr, i15 + 4) + this._S[1];
        for (int i17 = 1; i17 <= this._noRounds; i17++) {
            int i18 = i17 * 2;
            iBytesToWord = rotateLeft(iBytesToWord ^ iBytesToWord2, iBytesToWord2) + this._S[i18];
            iBytesToWord2 = rotateLeft(iBytesToWord2 ^ iBytesToWord, iBytesToWord) + this._S[i18 + 1];
        }
        wordToBytes(iBytesToWord, bArr2, i16);
        wordToBytes(iBytesToWord2, bArr2, i16 + 4);
        return 8;
    }

    private int rotateLeft(int i15, int i16) {
        int i17 = i16 & 31;
        return (i15 >>> (32 - i17)) | (i15 << i17);
    }

    private int rotateRight(int i15, int i16) {
        int i17 = i16 & 31;
        return (i15 << (32 - i17)) | (i15 >>> i17);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i15 = 0; i15 != bArr.length; i15++) {
            int i16 = i15 / 4;
            iArr2[i16] = iArr2[i16] + ((bArr[i15] & 255) << ((i15 % 4) * 8));
        }
        int[] iArr3 = new int[(this._noRounds + 1) * 2];
        this._S = iArr3;
        iArr3[0] = P32;
        int i17 = 1;
        while (true) {
            iArr = this._S;
            if (i17 >= iArr.length) {
                break;
            }
            iArr[i17] = iArr[i17 - 1] + Q32;
            i17++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int length3 = 0;
        int iRotateLeft = 0;
        int iRotateLeft2 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < length2; i19++) {
            int[] iArr4 = this._S;
            iRotateLeft = rotateLeft(iArr4[length3] + iRotateLeft + iRotateLeft2, 3);
            iArr4[length3] = iRotateLeft;
            iRotateLeft2 = rotateLeft(iArr2[i18] + iRotateLeft + iRotateLeft2, iRotateLeft2 + iRotateLeft);
            iArr2[i18] = iRotateLeft2;
            length3 = (length3 + 1) % this._S.length;
            i18 = (i18 + 1) % length;
        }
    }

    private void wordToBytes(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) i15;
        bArr[i16 + 1] = (byte) (i15 >> 8);
        bArr[i16 + 2] = (byte) (i15 >> 16);
        bArr[i16 + 3] = (byte) (i15 >> 24);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        byte[] key;
        if (cipherParameters instanceof RC5Parameters) {
            RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
            this._noRounds = rC5Parameters.getRounds();
            key = rC5Parameters.getKey();
            setKey(key);
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + cipherParameters.getClass().getName());
            }
            key = ((KeyParameter) cipherParameters).getKey();
            setKey(key);
        }
        this.forEncryption = z15;
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
