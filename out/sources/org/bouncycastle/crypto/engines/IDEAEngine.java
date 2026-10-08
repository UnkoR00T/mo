package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes5.dex */
public class IDEAEngine implements BlockCipher {
    private static final int BASE = 65537;
    protected static final int BLOCK_SIZE = 8;
    private static final int MASK = 65535;
    private boolean forEncryption;
    private int[] workingKey = null;

    public IDEAEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128));
    }

    private int bytesToWord(byte[] bArr, int i15) {
        return ((bArr[i15] << 8) & 65280) + (bArr[i15 + 1] & 255);
    }

    private int[] expandKey(byte[] bArr) {
        int i15;
        int[] iArr = new int[52];
        int i16 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i16 >= 8) {
                break;
            }
            iArr[i16] = bytesToWord(bArr, i16 * 2);
            i16++;
        }
        for (i15 = 8; i15 < 52; i15++) {
            int i17 = i15 & 7;
            if (i17 < 6) {
                iArr[i15] = (((iArr[i15 - 7] & CertificateBody.profileType) << 9) | (iArr[i15 - 6] >> 7)) & 65535;
            } else if (i17 == 6) {
                iArr[i15] = (((iArr[i15 - 7] & CertificateBody.profileType) << 9) | (iArr[i15 - 14] >> 7)) & 65535;
            } else {
                iArr[i15] = (((iArr[i15 - 15] & CertificateBody.profileType) << 9) | (iArr[i15 - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] generateWorkingKey(boolean z15, byte[] bArr) {
        return z15 ? expandKey(bArr) : invertKey(expandKey(bArr));
    }

    private void ideaFunc(int[] iArr, byte[] bArr, int i15, byte[] bArr2, int i16) {
        int iBytesToWord = bytesToWord(bArr, i15);
        int iBytesToWord2 = bytesToWord(bArr, i15 + 2);
        int iBytesToWord3 = bytesToWord(bArr, i15 + 4);
        int iBytesToWord4 = bytesToWord(bArr, i15 + 6);
        int i17 = 0;
        int i18 = iBytesToWord3;
        int i19 = iBytesToWord2;
        int i25 = iBytesToWord;
        int i26 = 0;
        while (i17 < 8) {
            int iMul = mul(i25, iArr[i26]);
            int i27 = (i19 + iArr[i26 + 1]) & 65535;
            int i28 = (i18 + iArr[i26 + 2]) & 65535;
            int iMul2 = mul(iBytesToWord4, iArr[i26 + 3]);
            int i29 = i26 + 5;
            int iMul3 = mul(i28 ^ iMul, iArr[i26 + 4]);
            i26 += 6;
            int iMul4 = mul(((i27 ^ iMul2) + iMul3) & 65535, iArr[i29]);
            int i35 = 65535 & (iMul3 + iMul4);
            i25 = iMul ^ iMul4;
            iBytesToWord4 = iMul2 ^ i35;
            int i36 = i28 ^ iMul4;
            i17++;
            i18 = i27 ^ i35;
            i19 = i36;
        }
        wordToBytes(mul(i25, iArr[i26]), bArr2, i16);
        wordToBytes(i18 + iArr[i26 + 1], bArr2, i16 + 2);
        wordToBytes(i19 + iArr[i26 + 2], bArr2, i16 + 4);
        wordToBytes(mul(iBytesToWord4, iArr[i26 + 3]), bArr2, i16 + 6);
    }

    private int[] invertKey(int[] iArr) {
        int[] iArr2 = new int[52];
        int iMulInv = mulInv(iArr[0]);
        int iAddInv = addInv(iArr[1]);
        int iAddInv2 = addInv(iArr[2]);
        iArr2[51] = mulInv(iArr[3]);
        iArr2[50] = iAddInv2;
        iArr2[49] = iAddInv;
        int i15 = 48;
        iArr2[48] = iMulInv;
        int i16 = 4;
        for (int i17 = 1; i17 < 8; i17++) {
            int i18 = iArr[i16];
            iArr2[i15 - 1] = iArr[i16 + 1];
            iArr2[i15 - 2] = i18;
            int iMulInv2 = mulInv(iArr[i16 + 2]);
            int iAddInv3 = addInv(iArr[i16 + 3]);
            int i19 = i16 + 5;
            int iAddInv4 = addInv(iArr[i16 + 4]);
            i16 += 6;
            iArr2[i15 - 3] = mulInv(iArr[i19]);
            iArr2[i15 - 4] = iAddInv3;
            iArr2[i15 - 5] = iAddInv4;
            i15 -= 6;
            iArr2[i15] = iMulInv2;
        }
        int i25 = iArr[i16];
        iArr2[i15 - 1] = iArr[i16 + 1];
        iArr2[i15 - 2] = i25;
        int iMulInv3 = mulInv(iArr[i16 + 2]);
        int iAddInv5 = addInv(iArr[i16 + 3]);
        int iAddInv6 = addInv(iArr[i16 + 4]);
        iArr2[i15 - 3] = mulInv(iArr[i16 + 5]);
        iArr2[i15 - 4] = iAddInv6;
        iArr2[i15 - 5] = iAddInv5;
        iArr2[i15 - 6] = iMulInv3;
        return iArr2;
    }

    private int mul(int i15, int i16) {
        int i17;
        if (i15 == 0) {
            i17 = BASE - i16;
        } else if (i16 == 0) {
            i17 = BASE - i15;
        } else {
            int i18 = i15 * i16;
            int i19 = i18 & 65535;
            int i25 = i18 >>> 16;
            i17 = (i19 - i25) + (i19 < i25 ? 1 : 0);
        }
        return i17 & 65535;
    }

    private int mulInv(int i15) {
        if (i15 < 2) {
            return i15;
        }
        int i16 = BASE / i15;
        int i17 = BASE % i15;
        int i18 = 1;
        while (i17 != 1) {
            int i19 = i15 / i17;
            i15 %= i17;
            i18 = (i18 + (i19 * i16)) & 65535;
            if (i15 == 1) {
                return i18;
            }
            int i25 = i17 / i15;
            i17 %= i15;
            i16 = (i16 + (i25 * i18)) & 65535;
        }
        return (1 - i16) & 65535;
    }

    private void wordToBytes(int i15, byte[] bArr, int i16) {
        bArr[i16] = (byte) (i15 >>> 8);
        bArr[i16 + 1] = (byte) i15;
    }

    int addInv(int i15) {
        return (0 - i15) & 65535;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = generateWorkingKey(z15, key);
        this.forEncryption = z15;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z15)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i15 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        ideaFunc(iArr, bArr, i15, bArr2, i16);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
