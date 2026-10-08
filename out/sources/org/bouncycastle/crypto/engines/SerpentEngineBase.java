package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes5.dex */
public abstract class SerpentEngineBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;
    protected boolean encrypting;
    protected int keyBits;
    protected int[] wKey;

    SerpentEngineBase() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256));
    }

    private CryptoServicePurpose getPurpose() {
        if (this.wKey == null) {
            return CryptoServicePurpose.ANY;
        }
        return this.encrypting ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }

    protected static int rotateLeft(int i15, int i16) {
        return (i15 >>> (-i16)) | (i15 << i16);
    }

    protected static int rotateRight(int i15, int i16) {
        return (i15 << (-i16)) | (i15 >>> i16);
    }

    protected final void LT(int[] iArr) {
        int iRotateLeft = rotateLeft(iArr[0], 13);
        int iRotateLeft2 = rotateLeft(iArr[2], 3);
        int i15 = (iArr[1] ^ iRotateLeft) ^ iRotateLeft2;
        int i16 = (iArr[3] ^ iRotateLeft2) ^ (iRotateLeft << 3);
        iArr[1] = rotateLeft(i15, 1);
        int iRotateLeft3 = rotateLeft(i16, 7);
        iArr[3] = iRotateLeft3;
        iArr[0] = rotateLeft((iRotateLeft ^ iArr[1]) ^ iRotateLeft3, 5);
        iArr[2] = rotateLeft((iArr[3] ^ iRotateLeft2) ^ (iArr[1] << 7), 22);
    }

    protected abstract void decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16);

    protected abstract void encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16);

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    protected final void ib0(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = ~i15;
        int i25 = i16 ^ i15;
        int i26 = (i19 | i25) ^ i18;
        int i27 = i17 ^ i26;
        int i28 = i25 ^ i27;
        iArr[2] = i28;
        int i29 = (i25 & i18) ^ i19;
        int i35 = (i28 & i29) ^ i26;
        iArr[1] = i35;
        int i36 = (i15 & i26) ^ (i35 | i27);
        iArr[3] = i36;
        iArr[0] = i36 ^ (i29 ^ i27);
    }

    protected final void ib1(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = i18 ^ i16;
        int i25 = i15 ^ (i16 & i19);
        int i26 = i19 ^ i25;
        int i27 = i17 ^ i26;
        iArr[3] = i27;
        int i28 = i16 ^ (i19 & i25);
        int i29 = i25 ^ (i27 | i28);
        iArr[1] = i29;
        int i35 = ~i29;
        int i36 = i28 ^ i27;
        iArr[0] = i35 ^ i36;
        iArr[2] = (i35 | i36) ^ i26;
    }

    protected final void ib2(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = i16 ^ i18;
        int i25 = ~i19;
        int i26 = i15 ^ i17;
        int i27 = i17 ^ i19;
        int i28 = (i16 & i27) ^ i26;
        iArr[0] = i28;
        int i29 = (((i15 | i25) ^ i18) | i26) ^ i19;
        iArr[3] = i29;
        int i35 = ~i27;
        int i36 = i29 | i28;
        iArr[1] = i35 ^ i36;
        iArr[2] = (i36 ^ i26) ^ (i18 & i35);
    }

    protected final void ib3(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = i15 | i16;
        int i25 = i16 ^ i17;
        int i26 = i15 ^ (i16 & i25);
        int i27 = i17 ^ i26;
        int i28 = i18 | i26;
        int i29 = i25 ^ i28;
        iArr[0] = i29;
        int i35 = (i28 | i25) ^ i18;
        iArr[2] = i27 ^ i35;
        int i36 = i19 ^ i35;
        int i37 = i26 ^ (i29 & i36);
        iArr[3] = i37;
        iArr[1] = i37 ^ (i36 ^ i29);
    }

    protected final void ib4(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = i16 ^ ((i17 | i18) & i15);
        int i25 = i17 ^ (i15 & i19);
        int i26 = i18 ^ i25;
        iArr[1] = i26;
        int i27 = ~i15;
        int i28 = (i25 & i26) ^ i19;
        iArr[3] = i28;
        int i29 = i18 ^ (i26 | i27);
        iArr[0] = i28 ^ i29;
        iArr[2] = (i27 ^ i26) ^ (i19 & i29);
    }

    protected final void ib5(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = ~i17;
        int i25 = (i16 & i19) ^ i18;
        int i26 = i15 & i25;
        int i27 = (i16 ^ i19) ^ i26;
        iArr[3] = i27;
        int i28 = i27 | i16;
        iArr[1] = i25 ^ (i15 & i28);
        int i29 = i18 | i15;
        iArr[0] = (i19 ^ i28) ^ i29;
        iArr[2] = ((i15 ^ i17) | i26) ^ (i16 & i29);
    }

    protected final void ib6(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = ~i15;
        int i25 = i15 ^ i16;
        int i26 = i17 ^ i25;
        int i27 = (i17 | i19) ^ i18;
        iArr[1] = i26 ^ i27;
        int i28 = i25 ^ (i26 & i27);
        int i29 = i27 ^ (i16 | i28);
        iArr[3] = i29;
        int i35 = i16 | i29;
        iArr[0] = i28 ^ i35;
        iArr[2] = (i18 & i19) ^ (i35 ^ i26);
    }

    protected final void ib7(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = (i15 & i16) | i17;
        int i25 = (i15 | i16) & i18;
        int i26 = i19 ^ i25;
        iArr[3] = i26;
        int i27 = i16 ^ i25;
        int i28 = ((i26 ^ (~i18)) | i27) ^ i15;
        iArr[1] = i28;
        int i29 = (i27 ^ i17) ^ (i18 | i28);
        iArr[0] = i29;
        iArr[2] = ((i15 & i26) ^ i29) ^ (i19 ^ i28);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.encrypting = z15;
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.wKey = makeWorkingKey(key);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, getPurpose()));
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + cipherParameters.getClass().getName());
    }

    protected final void inverseLT(int[] iArr) {
        int iRotateRight = (rotateRight(iArr[2], 22) ^ iArr[3]) ^ (iArr[1] << 7);
        int iRotateRight2 = rotateRight(iArr[0], 5) ^ iArr[1];
        int i15 = iArr[3];
        int i16 = iRotateRight2 ^ i15;
        int iRotateRight3 = rotateRight(i15, 7);
        int iRotateRight4 = rotateRight(iArr[1], 1);
        iArr[3] = (iRotateRight3 ^ iRotateRight) ^ (i16 << 3);
        iArr[1] = (iRotateRight4 ^ i16) ^ iRotateRight;
        iArr[2] = rotateRight(iRotateRight, 3);
        iArr[0] = rotateRight(i16, 13);
    }

    protected abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (this.wKey == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i15 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i15, bArr2, i16);
            return 16;
        }
        decryptBlock(bArr, i15, bArr2, i16);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    protected final void sb0(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = i15 ^ i18;
        int i25 = i17 ^ i19;
        int i26 = i16 ^ i25;
        int i27 = (i18 & i15) ^ i26;
        iArr[3] = i27;
        int i28 = i15 ^ (i16 & i19);
        iArr[2] = (i17 | i28) ^ i26;
        int i29 = (i25 ^ i28) & i27;
        iArr[1] = (~i25) ^ i29;
        iArr[0] = (~i28) ^ i29;
    }

    protected final void sb1(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = (~i15) ^ i16;
        int i25 = (i15 | i19) ^ i17;
        int i26 = i18 ^ i25;
        iArr[2] = i26;
        int i27 = i16 ^ (i18 | i19);
        int i28 = i26 ^ i19;
        int i29 = (i25 & i27) ^ i28;
        iArr[3] = i29;
        int i35 = i27 ^ i25;
        iArr[1] = i29 ^ i35;
        iArr[0] = i25 ^ (i35 & i28);
    }

    protected final void sb2(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = ~i15;
        int i25 = i16 ^ i18;
        int i26 = (i17 & i19) ^ i25;
        iArr[0] = i26;
        int i27 = i17 ^ i19;
        int i28 = i16 & (i17 ^ i26);
        int i29 = i27 ^ i28;
        iArr[3] = i29;
        int i35 = i15 ^ ((i28 | i18) & (i26 | i27));
        iArr[2] = i35;
        iArr[1] = (i35 ^ (i18 | i19)) ^ (i25 ^ i29);
    }

    protected final void sb3(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = i15 ^ i16;
        int i25 = i15 & i17;
        int i26 = i15 | i18;
        int i27 = i17 ^ i18;
        int i28 = i25 | (i19 & i26);
        int i29 = i27 ^ i28;
        iArr[2] = i29;
        int i35 = (i26 ^ i16) ^ i28;
        int i36 = i19 ^ (i27 & i35);
        iArr[0] = i36;
        int i37 = i36 & i29;
        iArr[1] = i35 ^ i37;
        iArr[3] = (i16 | i18) ^ (i27 ^ i37);
    }

    protected final void sb4(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = i15 ^ i18;
        int i25 = i17 ^ (i18 & i19);
        int i26 = i16 | i25;
        iArr[3] = i19 ^ i26;
        int i27 = ~i16;
        int i28 = (i19 | i27) ^ i25;
        iArr[0] = i28;
        int i29 = i27 ^ i19;
        int i35 = (i26 & i29) ^ (i28 & i15);
        iArr[2] = i35;
        iArr[1] = (i15 ^ i25) ^ (i29 & i35);
    }

    protected final void sb5(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = ~i15;
        int i25 = i15 ^ i16;
        int i26 = i15 ^ i18;
        int i27 = (i17 ^ i19) ^ (i25 | i26);
        iArr[0] = i27;
        int i28 = i18 & i27;
        int i29 = (i25 ^ i27) ^ i28;
        iArr[1] = i29;
        int i35 = i26 ^ (i27 | i19);
        iArr[2] = (i25 | i28) ^ i35;
        iArr[3] = (i35 & i29) ^ (i16 ^ i28);
    }

    protected final void sb6(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = ~i15;
        int i25 = i15 ^ i18;
        int i26 = i16 ^ i25;
        int i27 = i17 ^ (i19 | i25);
        int i28 = i16 ^ i27;
        iArr[1] = i28;
        int i29 = (i25 | i28) ^ i18;
        int i35 = (i27 & i29) ^ i26;
        iArr[2] = i35;
        int i36 = i29 ^ i27;
        iArr[0] = i35 ^ i36;
        iArr[3] = (i36 & i26) ^ (~i27);
    }

    protected final void sb7(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = i16 ^ i17;
        int i25 = (i17 & i19) ^ i18;
        int i26 = i15 ^ i25;
        int i27 = i16 ^ ((i18 | i19) & i26);
        iArr[1] = i27;
        int i28 = (i15 & i26) ^ i19;
        iArr[3] = i28;
        int i29 = (i27 | i25) ^ i26;
        int i35 = i25 ^ (i28 & i29);
        iArr[2] = i35;
        iArr[0] = (i28 & i35) ^ (~i29);
    }
}
