package org.bouncycastle.crypto.engines;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class LEAEngine implements BlockCipher {
    private static final int BASEROUNDS = 16;
    private static final int BLOCKSIZE = 16;
    private static final int[] DELTA = {-1007687205, 1147300610, 2044886154, 2027892972, 1902027934, -947529206, -531697110, -440137385};
    private static final int KEY0 = 0;
    private static final int KEY1 = 1;
    private static final int KEY2 = 2;
    private static final int KEY3 = 3;
    private static final int KEY4 = 4;
    private static final int KEY5 = 5;
    private static final int MASK128 = 3;
    private static final int MASK256 = 7;
    private static final int NUMWORDS = 4;
    private static final int NUMWORDS128 = 4;
    private static final int NUMWORDS192 = 6;
    private static final int NUMWORDS256 = 8;
    private static final int ROT1 = 1;
    private static final int ROT11 = 11;
    private static final int ROT13 = 13;
    private static final int ROT17 = 17;
    private static final int ROT3 = 3;
    private static final int ROT5 = 5;
    private static final int ROT6 = 6;
    private static final int ROT9 = 9;
    private boolean forEncryption;
    private final int[] theBlock = new int[4];
    private int[][] theRoundKeys;
    private int theRounds;

    private static int bufLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private static void checkBuffer(byte[] bArr, int i15, boolean z15) {
        int iBufLength = bufLength(bArr);
        int i16 = i15 + 16;
        if (i15 < 0 || i16 < 0 || i16 > iBufLength) {
            if (!z15) {
                throw new DataLengthException("Input buffer too short.");
            }
        }
    }

    private int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        Pack.littleEndianToInt(bArr, i15, this.theBlock, 0, 4);
        for (int i17 = this.theRounds - 1; i17 >= 0; i17--) {
            decryptRound(i17);
        }
        Pack.intToLittleEndian(this.theBlock, bArr2, i16);
        return 16;
    }

    private void decryptRound(int i15) {
        int[] iArr = this.theRoundKeys[i15];
        int i16 = i15 % 4;
        int iRightIndex = rightIndex(i16);
        int[] iArr2 = this.theBlock;
        iArr2[iRightIndex] = iArr[1] ^ (ror32(iArr2[iRightIndex], 9) - (this.theBlock[i16] ^ iArr[0]));
        int iRightIndex2 = rightIndex(iRightIndex);
        int[] iArr3 = this.theBlock;
        iArr3[iRightIndex2] = (rol32(iArr3[iRightIndex2], 5) - (this.theBlock[iRightIndex] ^ iArr[2])) ^ iArr[3];
        int iRightIndex3 = rightIndex(iRightIndex2);
        int[] iArr4 = this.theBlock;
        iArr4[iRightIndex3] = iArr[5] ^ (rol32(iArr4[iRightIndex3], 3) - (this.theBlock[iRightIndex2] ^ iArr[4]));
    }

    private int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        Pack.littleEndianToInt(bArr, i15, this.theBlock, 0, 4);
        for (int i17 = 0; i17 < this.theRounds; i17++) {
            encryptRound(i17);
        }
        Pack.intToLittleEndian(this.theBlock, bArr2, i16);
        return 16;
    }

    private void encryptRound(int i15) {
        int[] iArr = this.theRoundKeys[i15];
        int i16 = (i15 + 3) % 4;
        int iLeftIndex = leftIndex(i16);
        int[] iArr2 = this.theBlock;
        iArr2[i16] = ror32((iArr[4] ^ iArr2[iLeftIndex]) + (iArr2[i16] ^ iArr[5]), 3);
        int iLeftIndex2 = leftIndex(iLeftIndex);
        int[] iArr3 = this.theBlock;
        iArr3[iLeftIndex] = ror32((iArr3[iLeftIndex2] ^ iArr[2]) + (iArr[3] ^ iArr3[iLeftIndex]), 5);
        int iLeftIndex3 = leftIndex(iLeftIndex2);
        int[] iArr4 = this.theBlock;
        iArr4[iLeftIndex2] = rol32((iArr4[iLeftIndex3] ^ iArr[0]) + (iArr[1] ^ iArr4[iLeftIndex2]), 9);
    }

    private void generate128RoundKeys(int[] iArr) {
        for (int i15 = 0; i15 < this.theRounds; i15++) {
            int iRol32 = rol32(DELTA[i15 & 3], i15);
            iArr[0] = rol32(iArr[0] + iRol32, 1);
            iArr[1] = rol32(iArr[1] + rol32(iRol32, 1), 3);
            iArr[2] = rol32(iArr[2] + rol32(iRol32, 2), 6);
            iArr[3] = rol32(iArr[3] + rol32(iRol32, 3), 11);
            int[] iArr2 = this.theRoundKeys[i15];
            iArr2[0] = iArr[0];
            iArr2[1] = iArr[1];
            iArr2[2] = iArr[2];
            int i16 = iArr[1];
            iArr2[3] = i16;
            iArr2[4] = iArr[3];
            iArr2[5] = i16;
        }
    }

    private void generate192RoundKeys(int[] iArr) {
        for (int i15 = 0; i15 < this.theRounds; i15++) {
            int iRol32 = rol32(DELTA[i15 % 6], i15);
            iArr[0] = rol32(iArr[0] + rol32(iRol32, 0), 1);
            iArr[1] = rol32(iArr[1] + rol32(iRol32, 1), 3);
            iArr[2] = rol32(iArr[2] + rol32(iRol32, 2), 6);
            iArr[3] = rol32(iArr[3] + rol32(iRol32, 3), 11);
            iArr[4] = rol32(iArr[4] + rol32(iRol32, 4), 13);
            iArr[5] = rol32(iArr[5] + rol32(iRol32, 5), 17);
            System.arraycopy(iArr, 0, this.theRoundKeys[i15], 0, 6);
        }
    }

    private void generate256RoundKeys(int[] iArr) {
        int i15 = 0;
        for (int i16 = 0; i16 < this.theRounds; i16++) {
            int iRol32 = rol32(DELTA[i16 & 7], i16);
            int[] iArr2 = this.theRoundKeys[i16];
            int i17 = i15 & 7;
            int iRol33 = rol32(iArr[i17] + iRol32, 1);
            iArr2[0] = iRol33;
            iArr[i17] = iRol33;
            int i18 = (i15 + 1) & 7;
            int iRol34 = rol32(iArr[i18] + rol32(iRol32, 1), 3);
            iArr2[1] = iRol34;
            iArr[i18] = iRol34;
            int i19 = (i15 + 2) & 7;
            int iRol35 = rol32(iArr[i19] + rol32(iRol32, 2), 6);
            iArr2[2] = iRol35;
            iArr[i19] = iRol35;
            int i25 = (i15 + 3) & 7;
            int iRol36 = rol32(iArr[i25] + rol32(iRol32, 3), 11);
            iArr2[3] = iRol36;
            iArr[i25] = iRol36;
            int i26 = (i15 + 4) & 7;
            int iRol37 = rol32(iArr[i26] + rol32(iRol32, 4), 13);
            iArr2[4] = iRol37;
            iArr[i26] = iRol37;
            int i27 = (i15 + 5) & 7;
            int iRol38 = rol32(iArr[i27] + rol32(iRol32, 5), 17);
            iArr2[5] = iRol38;
            i15 += 6;
            iArr[i27] = iRol38;
        }
    }

    private void generateRoundKeys(byte[] bArr) {
        int length = (bArr.length >> 1) + 16;
        this.theRounds = length;
        this.theRoundKeys = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length, 6);
        int length2 = bArr.length / 4;
        int[] iArr = new int[length2];
        Pack.littleEndianToInt(bArr, 0, iArr, 0, length2);
        if (length2 == 4) {
            generate128RoundKeys(iArr);
        } else if (length2 != 6) {
            generate256RoundKeys(iArr);
        } else {
            generate192RoundKeys(iArr);
        }
    }

    private static int leftIndex(int i15) {
        if (i15 == 0) {
            return 3;
        }
        return i15 - 1;
    }

    private static int rightIndex(int i15) {
        if (i15 == 3) {
            return 0;
        }
        return i15 + 1;
    }

    private static int rol32(int i15, int i16) {
        return (i15 >>> (32 - i16)) | (i15 << i16);
    }

    private static int ror32(int i15, int i16) {
        return (i15 << (32 - i16)) | (i15 >>> i16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "LEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to LEA init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if ((length << 1) % 16 != 0 || length < 16 || length > 32) {
            throw new IllegalArgumentException("KeyBitSize must be 128, 192 or 256");
        }
        this.forEncryption = z15;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), length * 8, cipherParameters, Utils.getPurpose(this.forEncryption)));
        generateRoundKeys(key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        checkBuffer(bArr, i15, false);
        checkBuffer(bArr2, i16, true);
        return this.forEncryption ? encryptBlock(bArr, i15, bArr2, i16) : decryptBlock(bArr, i15, bArr2, i16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
