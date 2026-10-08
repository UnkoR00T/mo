package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class SkipjackEngine implements BlockCipher {
    static final int BLOCK_SIZE = 8;
    static short[] ftable = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};
    private boolean encrypting;
    private int[] key0;
    private int[] key1;
    private int[] key2;
    private int[] key3;

    public SkipjackEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80));
    }

    private int g(int i15, int i16) {
        int i17 = (i16 >> 8) & GF2Field.MASK;
        int i18 = i16 & GF2Field.MASK;
        short[] sArr = ftable;
        int i19 = i17 ^ sArr[this.key0[i15] ^ i18];
        int i25 = i18 ^ sArr[this.key1[i15] ^ i19];
        int i26 = i19 ^ sArr[this.key2[i15] ^ i25];
        return (i26 << 8) + (sArr[this.key3[i15] ^ i26] ^ i25);
    }

    private CryptoServicePurpose getPurpose() {
        if (this.key0 == null) {
            return CryptoServicePurpose.ANY;
        }
        return this.encrypting ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }

    private int h(int i15, int i16) {
        int i17 = i16 & GF2Field.MASK;
        int i18 = (i16 >> 8) & GF2Field.MASK;
        short[] sArr = ftable;
        int i19 = i17 ^ sArr[this.key3[i15] ^ i18];
        int i25 = i18 ^ sArr[this.key2[i15] ^ i19];
        int i26 = i19 ^ sArr[this.key1[i15] ^ i25];
        return ((sArr[this.key0[i15] ^ i26] ^ i25) << 8) + i26;
    }

    public int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = (bArr[i15] << 8) + (bArr[i15 + 1] & 255);
        int i18 = (bArr[i15 + 2] << 8) + (bArr[i15 + 3] & 255);
        int i19 = (bArr[i15 + 4] << 8) + (bArr[i15 + 5] & 255);
        int i25 = (bArr[i15 + 6] << 8) + (bArr[i15 + 7] & 255);
        int i26 = 31;
        for (int i27 = 0; i27 < 2; i27++) {
            int i28 = 0;
            while (i28 < 8) {
                int iH = h(i26, i18);
                int i29 = (i19 ^ iH) ^ (i26 + 1);
                i26--;
                i28++;
                int i35 = i25;
                i25 = i17;
                i17 = iH;
                i18 = i29;
                i19 = i35;
            }
            int i36 = 0;
            while (i36 < 8) {
                int i37 = (i17 ^ i18) ^ (i26 + 1);
                int iH2 = h(i26, i18);
                i26--;
                i36++;
                int i38 = i25;
                i25 = i37;
                i17 = iH2;
                i18 = i19;
                i19 = i38;
            }
        }
        bArr2[i16] = (byte) (i17 >> 8);
        bArr2[i16 + 1] = (byte) i17;
        bArr2[i16 + 2] = (byte) (i18 >> 8);
        bArr2[i16 + 3] = (byte) i18;
        bArr2[i16 + 4] = (byte) (i19 >> 8);
        bArr2[i16 + 5] = (byte) i19;
        bArr2[i16 + 6] = (byte) (i25 >> 8);
        bArr2[i16 + 7] = (byte) i25;
        return 8;
    }

    public int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = (bArr[i15] << 8) + (bArr[i15 + 1] & 255);
        int iG = (bArr[i15 + 2] << 8) + (bArr[i15 + 3] & 255);
        int i18 = (bArr[i15 + 4] << 8) + (bArr[i15 + 5] & 255);
        int i19 = (bArr[i15 + 6] << 8) + (bArr[i15 + 7] & 255);
        int i25 = 0;
        for (int i26 = 0; i26 < 2; i26++) {
            int i27 = 0;
            while (i27 < 8) {
                int iG2 = g(i25, i17);
                i25++;
                i27++;
                int i28 = iG;
                iG = iG2;
                i17 = (i19 ^ iG2) ^ i25;
                i19 = i18;
                i18 = i28;
            }
            int i29 = 0;
            while (i29 < 8) {
                int i35 = i25 + 1;
                int i36 = (iG ^ i17) ^ i35;
                i29++;
                iG = g(i25, i17);
                i17 = i19;
                i19 = i18;
                i18 = i36;
                i25 = i35;
            }
        }
        bArr2[i16] = (byte) (i17 >> 8);
        bArr2[i16 + 1] = (byte) i17;
        bArr2[i16 + 2] = (byte) (iG >> 8);
        bArr2[i16 + 3] = (byte) iG;
        bArr2[i16 + 4] = (byte) (i18 >> 8);
        bArr2[i16 + 5] = (byte) i18;
        bArr2[i16 + 6] = (byte) (i19 >> 8);
        bArr2[i16 + 7] = (byte) i19;
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to SKIPJACK init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.encrypting = z15;
        this.key0 = new int[32];
        this.key1 = new int[32];
        this.key2 = new int[32];
        this.key3 = new int[32];
        for (int i15 = 0; i15 < 32; i15++) {
            int i16 = i15 * 4;
            this.key0[i15] = key[i16 % 10] & 255;
            this.key1[i15] = key[(i16 + 1) % 10] & 255;
            this.key2[i15] = key[(i16 + 2) % 10] & 255;
            this.key3[i15] = key[(i16 + 3) % 10] & 255;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80, cipherParameters, getPurpose()));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (this.key1 == null) {
            throw new IllegalStateException("SKIPJACK engine not initialised");
        }
        if (i15 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i15, bArr2, i16);
            return 8;
        }
        decryptBlock(bArr, i15, bArr2, i16);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
