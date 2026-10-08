package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int SIZE = 16;
    private static final byte[] roundConstants = {-128, 27, 54, 108, -40, -85, 77, -102, 47, 94, PSSSigner.TRAILER_IMPLICIT, 99, -58, -105, 53, 106, -44};
    private boolean _forEncryption;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f149049k = new int[4];
    private boolean _initialised = false;

    private int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i15);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i15 + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i15 + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i15 + 12);
        int[] iArr = this.f149049k;
        int i17 = iArr[0];
        int i18 = iArr[1];
        int i19 = iArr[2];
        int i25 = iArr[3];
        int i26 = 16;
        while (true) {
            int i27 = iBigEndianToInt ^ iBigEndianToInt3;
            int iRotateLeft = i27 ^ (Integers.rotateLeft(i27, 8) ^ Integers.rotateLeft(i27, 24));
            int i28 = iBigEndianToInt2 ^ i18;
            int i29 = iBigEndianToInt4 ^ i25;
            int i35 = i28 ^ i29;
            int iRotateLeft2 = i35 ^ (Integers.rotateLeft(i35, 24) ^ Integers.rotateLeft(i35, 8));
            int i36 = i28 ^ iRotateLeft;
            int i37 = (iBigEndianToInt3 ^ i19) ^ iRotateLeft2;
            int i38 = i29 ^ iRotateLeft;
            int i39 = ((iBigEndianToInt ^ i17) ^ iRotateLeft2) ^ (roundConstants[i26] & 255);
            i26--;
            if (i26 < 0) {
                Pack.intToBigEndian(i39, bArr2, i16);
                Pack.intToBigEndian(i36, bArr2, i16 + 4);
                Pack.intToBigEndian(i37, bArr2, i16 + 8);
                Pack.intToBigEndian(i38, bArr2, i16 + 12);
                return 16;
            }
            int iRotateLeft3 = Integers.rotateLeft(i36, 1);
            int iRotateLeft4 = Integers.rotateLeft(i37, 5);
            int iRotateLeft5 = Integers.rotateLeft(i38, 2);
            int i45 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i46 = ~i45;
            int i47 = i39 ^ (iRotateLeft4 & i46);
            int i48 = (iRotateLeft4 ^ (i46 ^ iRotateLeft5)) ^ i47;
            int i49 = i45 ^ (i47 | i48);
            int i55 = iRotateLeft5 ^ (i48 & i49);
            iBigEndianToInt2 = Integers.rotateLeft(i49, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i48, 27);
            int iRotateLeft6 = Integers.rotateLeft(i47, 30);
            iBigEndianToInt = i55;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    private int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i15);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i15 + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i15 + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i15 + 12);
        int[] iArr = this.f149049k;
        int i17 = 0;
        int i18 = iArr[0];
        int i19 = 1;
        int i25 = iArr[1];
        int i26 = iArr[2];
        int i27 = iArr[3];
        while (true) {
            int i28 = iBigEndianToInt ^ (roundConstants[i17] & 255);
            int i29 = i28 ^ iBigEndianToInt3;
            int iRotateLeft = i29 ^ (Integers.rotateLeft(i29, 8) ^ Integers.rotateLeft(i29, 24));
            int i35 = iBigEndianToInt2 ^ i25;
            int i36 = iBigEndianToInt4 ^ i27;
            int i37 = i19;
            int i38 = i35 ^ i36;
            int iRotateLeft2 = i38 ^ (Integers.rotateLeft(i38, 24) ^ Integers.rotateLeft(i38, 8));
            int i39 = (i28 ^ i18) ^ iRotateLeft2;
            int i45 = i35 ^ iRotateLeft;
            int i46 = (iBigEndianToInt3 ^ i26) ^ iRotateLeft2;
            int i47 = i36 ^ iRotateLeft;
            i17++;
            if (i17 > 16) {
                Pack.intToBigEndian(i39, bArr2, i16);
                Pack.intToBigEndian(i45, bArr2, i16 + 4);
                Pack.intToBigEndian(i46, bArr2, i16 + 8);
                Pack.intToBigEndian(i47, bArr2, i16 + 12);
                return 16;
            }
            i19 = i37;
            int iRotateLeft3 = Integers.rotateLeft(i45, i19);
            int iRotateLeft4 = Integers.rotateLeft(i46, 5);
            int iRotateLeft5 = Integers.rotateLeft(i47, 2);
            int i48 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i49 = ~i48;
            int i55 = i39 ^ (iRotateLeft4 & i49);
            int i56 = (iRotateLeft4 ^ (i49 ^ iRotateLeft5)) ^ i55;
            int i57 = i48 ^ (i55 | i56);
            int i58 = iRotateLeft5 ^ (i56 & i57);
            iBigEndianToInt2 = Integers.rotateLeft(i57, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i56, 27);
            int iRotateLeft6 = Integers.rotateLeft(i55, 30);
            iBigEndianToInt = i58;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        Pack.bigEndianToInt(key, 0, this.f149049k, 0, 4);
        if (!z15) {
            int[] iArr = this.f149049k;
            int i15 = iArr[0];
            int i16 = iArr[1];
            int i17 = iArr[2];
            int i18 = iArr[3];
            int i19 = i15 ^ i17;
            int iRotateLeft = i19 ^ (Integers.rotateLeft(i19, 8) ^ Integers.rotateLeft(i19, 24));
            int i25 = i16 ^ i18;
            int iRotateLeft2 = (Integers.rotateLeft(i25, 8) ^ Integers.rotateLeft(i25, 24)) ^ i25;
            int i26 = i16 ^ iRotateLeft;
            int i27 = i18 ^ iRotateLeft;
            int[] iArr2 = this.f149049k;
            iArr2[0] = i15 ^ iRotateLeft2;
            iArr2[1] = i26;
            iArr2[2] = i17 ^ iRotateLeft2;
            iArr2[3] = i27;
        }
        this._forEncryption = z15;
        this._initialised = true;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z15)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i15 > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 <= bArr2.length - 16) {
            return this._forEncryption ? encryptBlock(bArr, i15, bArr2, i16) : decryptBlock(bArr, i15, bArr2, i16);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
