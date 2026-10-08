package org.bouncycastle.crypto.fpe;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class FPEEngine {
    protected final BlockCipher baseCipher;
    protected boolean forEncryption;
    protected FPEParameters fpeParameters;

    protected FPEEngine(BlockCipher blockCipher) {
        this.baseCipher = blockCipher;
    }

    protected static byte[] toByteArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i15 = 0; i15 != sArr.length; i15++) {
            Pack.shortToBigEndian(sArr[i15], bArr, i15 * 2);
        }
        return bArr;
    }

    protected static short[] toShortArray(byte[] bArr) {
        if ((bArr.length & 1) != 0) {
            throw new IllegalArgumentException("data must be an even number of bytes for a wide radix");
        }
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i15 = 0; i15 != length; i15++) {
            sArr[i15] = Pack.bigEndianToShort(bArr, i15 * 2);
        }
        return sArr;
    }

    protected abstract int decryptBlock(byte[] bArr, int i15, int i16, byte[] bArr2, int i17);

    protected abstract int encryptBlock(byte[] bArr, int i15, int i16, byte[] bArr2, int i17);

    public abstract String getAlgorithmName();

    public abstract void init(boolean z15, CipherParameters cipherParameters);

    public int processBlock(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (this.fpeParameters == null) {
            throw new IllegalStateException("FPE engine not initialized");
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("input length cannot be negative");
        }
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("buffer value is null");
        }
        if (bArr.length < i15 + i16) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length >= i17 + i16) {
            return this.forEncryption ? encryptBlock(bArr, i15, i16, bArr2, i17) : decryptBlock(bArr, i15, i16, bArr2, i17);
        }
        throw new OutputLengthException("output buffer too short");
    }
}
