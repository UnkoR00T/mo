package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes5.dex */
public class XTEAEngine implements BlockCipher {
    private static final int block_size = 8;
    private static final int delta = -1640531527;
    private static final int rounds = 32;
    private boolean _forEncryption;
    private int[] _S = new int[4];
    private int[] _sum0 = new int[32];
    private int[] _sum1 = new int[32];
    private boolean _initialised = false;

    private int bytesToInt(byte[] bArr, int i15) {
        int i16 = ((bArr[i15 + 1] & 255) << 16) | (bArr[i15] << 24);
        return (bArr[i15 + 3] & 255) | i16 | ((bArr[i15 + 2] & 255) << 8);
    }

    private int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBytesToInt = bytesToInt(bArr, i15);
        int iBytesToInt2 = bytesToInt(bArr, i15 + 4);
        for (int i17 = 31; i17 >= 0; i17--) {
            iBytesToInt2 -= (((iBytesToInt << 4) ^ (iBytesToInt >>> 5)) + iBytesToInt) ^ this._sum1[i17];
            iBytesToInt -= (((iBytesToInt2 << 4) ^ (iBytesToInt2 >>> 5)) + iBytesToInt2) ^ this._sum0[i17];
        }
        unpackInt(iBytesToInt, bArr2, i16);
        unpackInt(iBytesToInt2, bArr2, i16 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBytesToInt = bytesToInt(bArr, i15);
        int iBytesToInt2 = bytesToInt(bArr, i15 + 4);
        for (int i17 = 0; i17 < 32; i17++) {
            iBytesToInt += (((iBytesToInt2 << 4) ^ (iBytesToInt2 >>> 5)) + iBytesToInt2) ^ this._sum0[i17];
            iBytesToInt2 += (((iBytesToInt << 4) ^ (iBytesToInt >>> 5)) + iBytesToInt) ^ this._sum1[i17];
        }
        unpackInt(iBytesToInt, bArr2, i16);
        unpackInt(iBytesToInt2, bArr2, i16 + 4);
        return 8;
    }

    private void setKey(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < 4) {
            this._S[i15] = bytesToInt(bArr, i16);
            i15++;
            i16 += 4;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            int[] iArr = this._sum0;
            int[] iArr2 = this._S;
            iArr[i18] = iArr2[i17 & 3] + i17;
            i17 -= 1640531527;
            this._sum1[i18] = iArr2[(i17 >>> 11) & 3] + i17;
        }
    }

    private void unpackInt(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) (i15 >>> 24);
        bArr[i16 + 1] = (byte) (i15 >>> 16);
        bArr[i16 + 2] = (byte) (i15 >>> 8);
        bArr[i16 + 3] = (byte) i15;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "XTEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to TEA init - " + cipherParameters.getClass().getName());
        }
        this._forEncryption = z15;
        this._initialised = true;
        setKey(((KeyParameter) cipherParameters).getKey());
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z15)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i15 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + 8 <= bArr2.length) {
            return this._forEncryption ? encryptBlock(bArr, i15, bArr2, i16) : decryptBlock(bArr, i15, bArr2, i16);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
