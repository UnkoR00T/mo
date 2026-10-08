package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes5.dex */
public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;
    private int[] _S = null;
    private boolean forEncryption;

    private int bytesToWord(byte[] bArr, int i15) {
        int i16 = 0;
        for (int i17 = 3; i17 >= 0; i17--) {
            i16 = (i16 << 8) + (bArr[i17 + i15] & 255);
        }
        return i16;
    }

    private int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBytesToWord = bytesToWord(bArr, i15);
        int iBytesToWord2 = bytesToWord(bArr, i15 + 4);
        int iBytesToWord3 = bytesToWord(bArr, i15 + 8);
        int iBytesToWord4 = bytesToWord(bArr, i15 + 12);
        int[] iArr = this._S;
        int i17 = iBytesToWord3 - iArr[43];
        int iRotateRight = iBytesToWord - iArr[42];
        int i18 = 20;
        while (i18 >= 1) {
            int iRotateLeft = rotateLeft(((iRotateRight * 2) + 1) * iRotateRight, 5);
            int iRotateLeft2 = rotateLeft(((i17 * 2) + 1) * i17, 5);
            int i19 = i18 * 2;
            int iRotateRight2 = rotateRight(iBytesToWord2 - this._S[i19 + 1], iRotateLeft) ^ iRotateLeft2;
            i18--;
            int i25 = iRotateRight;
            iRotateRight = rotateRight(iBytesToWord4 - this._S[i19], iRotateLeft2) ^ iRotateLeft;
            iBytesToWord4 = i17;
            i17 = iRotateRight2;
            iBytesToWord2 = i25;
        }
        int[] iArr2 = this._S;
        int i26 = iBytesToWord4 - iArr2[1];
        int i27 = iBytesToWord2 - iArr2[0];
        wordToBytes(iRotateRight, bArr2, i16);
        wordToBytes(i27, bArr2, i16 + 4);
        wordToBytes(i17, bArr2, i16 + 8);
        wordToBytes(i26, bArr2, i16 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBytesToWord = bytesToWord(bArr, i15);
        int iBytesToWord2 = bytesToWord(bArr, i15 + 4);
        int iBytesToWord3 = bytesToWord(bArr, i15 + 8);
        int iBytesToWord4 = bytesToWord(bArr, i15 + 12);
        int[] iArr = this._S;
        int i17 = iBytesToWord2 + iArr[0];
        int i18 = iBytesToWord4 + iArr[1];
        int i19 = 1;
        while (i19 <= 20) {
            int iRotateLeft = rotateLeft(((i17 * 2) + 1) * i17, 5);
            int iRotateLeft2 = rotateLeft(((i18 * 2) + 1) * i18, 5);
            int i25 = i19 * 2;
            int iRotateLeft3 = rotateLeft(iBytesToWord ^ iRotateLeft, iRotateLeft2) + this._S[i25];
            int iRotateLeft4 = rotateLeft(iBytesToWord3 ^ iRotateLeft2, iRotateLeft) + this._S[i25 + 1];
            i19++;
            iBytesToWord3 = i18;
            i18 = iRotateLeft3;
            iBytesToWord = i17;
            i17 = iRotateLeft4;
        }
        int[] iArr2 = this._S;
        int i26 = iBytesToWord + iArr2[42];
        int i27 = iBytesToWord3 + iArr2[43];
        wordToBytes(i26, bArr2, i16);
        wordToBytes(i17, bArr2, i16 + 4);
        wordToBytes(i27, bArr2, i16 + 8);
        wordToBytes(i18, bArr2, i16 + 12);
        return 16;
    }

    private int rotateLeft(int i15, int i16) {
        return (i15 >>> (-i16)) | (i15 << i16);
    }

    private int rotateRight(int i15, int i16) {
        return (i15 << (-i16)) | (i15 >>> i16);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = bArr.length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i15 = length3 / 4;
            iArr2[i15] = (iArr2[i15] << 8) + (bArr[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this._S = iArr3;
        iArr3[0] = P32;
        int i16 = 1;
        while (true) {
            iArr = this._S;
            if (i16 >= iArr.length) {
                break;
            }
            iArr[i16] = iArr[i16 - 1] + Q32;
            i16++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int length5 = 0;
        int iRotateLeft = 0;
        int iRotateLeft2 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length4; i18++) {
            int[] iArr4 = this._S;
            iRotateLeft = rotateLeft(iArr4[length5] + iRotateLeft + iRotateLeft2, 3);
            iArr4[length5] = iRotateLeft;
            iRotateLeft2 = rotateLeft(iArr2[i17] + iRotateLeft + iRotateLeft2, iRotateLeft2 + iRotateLeft);
            iArr2[i17] = iRotateLeft2;
            length5 = (length5 + 1) % this._S.length;
            i17 = (i17 + 1) % length2;
        }
    }

    private void wordToBytes(int i15, byte[] bArr, int i16) {
        for (int i17 = 0; i17 < 4; i17++) {
            bArr[i17 + i16] = (byte) i15;
            i15 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + cipherParameters.getClass().getName());
        }
        this.forEncryption = z15;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z15)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int blockSize = getBlockSize();
        if (this._S == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i15 + blockSize > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + i16 <= bArr2.length) {
            return this.forEncryption ? encryptBlock(bArr, i15, bArr2, i16) : decryptBlock(bArr, i15, bArr2, i16);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
