package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes5.dex */
public class OpenPGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;

    public OpenPGPCFBBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17;
        int i18 = this.blockSize;
        if (i15 + i18 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + i18 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i19 = this.count;
        int i25 = 2;
        int i26 = 0;
        if (i19 > i18) {
            byte b15 = bArr[i15];
            this.FR[i18 - 2] = b15;
            bArr2[i16] = encryptByte(b15, i18 - 2);
            byte b16 = bArr[i15 + 1];
            byte[] bArr3 = this.FR;
            int i27 = this.blockSize;
            bArr3[i27 - 1] = b16;
            bArr2[i16 + 1] = encryptByte(b16, i27 - 1);
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i25 < this.blockSize) {
                byte b17 = bArr[i15 + i25];
                int i28 = i25 - 2;
                this.FR[i28] = b17;
                bArr2[i16 + i25] = encryptByte(b17, i28);
                i25++;
            }
        } else {
            if (i19 != 0) {
                if (i19 == i18) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    byte b18 = bArr[i15];
                    byte b19 = bArr[i15 + 1];
                    bArr2[i16] = encryptByte(b18, 0);
                    bArr2[i16 + 1] = encryptByte(b19, 1);
                    byte[] bArr4 = this.FR;
                    System.arraycopy(bArr4, 2, bArr4, 0, this.blockSize - 2);
                    byte[] bArr5 = this.FR;
                    int i29 = this.blockSize;
                    bArr5[i29 - 2] = b18;
                    bArr5[i29 - 1] = b19;
                    this.cipher.processBlock(bArr5, 0, this.FRE, 0);
                    while (true) {
                        i17 = this.blockSize;
                        if (i25 >= i17) {
                            break;
                        }
                        byte b25 = bArr[i15 + i25];
                        int i35 = i25 - 2;
                        this.FR[i35] = b25;
                        bArr2[i16 + i25] = encryptByte(b25, i35);
                        i25++;
                    }
                }
            } else {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i17 = this.blockSize;
                    if (i26 >= i17) {
                        break;
                    }
                    int i36 = i15 + i26;
                    this.FR[i26] = bArr[i36];
                    bArr2[i16 + i26] = encryptByte(bArr[i36], i26);
                    i26++;
                }
            }
            this.count += i17;
        }
        return this.blockSize;
    }

    private int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17;
        int i18 = this.blockSize;
        if (i15 + i18 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + i18 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i19 = this.count;
        int i25 = 2;
        int i26 = 0;
        if (i19 > i18) {
            byte[] bArr3 = this.FR;
            int i27 = i18 - 2;
            byte bEncryptByte = encryptByte(bArr[i15], i18 - 2);
            bArr2[i16] = bEncryptByte;
            bArr3[i27] = bEncryptByte;
            byte[] bArr4 = this.FR;
            int i28 = this.blockSize;
            int i29 = i28 - 1;
            byte bEncryptByte2 = encryptByte(bArr[i15 + 1], i28 - 1);
            bArr2[i16 + 1] = bEncryptByte2;
            bArr4[i29] = bEncryptByte2;
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i25 < this.blockSize) {
                byte[] bArr5 = this.FR;
                int i35 = i25 - 2;
                byte bEncryptByte3 = encryptByte(bArr[i15 + i25], i35);
                bArr2[i16 + i25] = bEncryptByte3;
                bArr5[i35] = bEncryptByte3;
                i25++;
            }
        } else {
            if (i19 != 0) {
                if (i19 == i18) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    bArr2[i16] = encryptByte(bArr[i15], 0);
                    bArr2[i16 + 1] = encryptByte(bArr[i15 + 1], 1);
                    byte[] bArr6 = this.FR;
                    System.arraycopy(bArr6, 2, bArr6, 0, this.blockSize - 2);
                    System.arraycopy(bArr2, i16, this.FR, this.blockSize - 2, 2);
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (true) {
                        i17 = this.blockSize;
                        if (i25 >= i17) {
                            break;
                        }
                        byte[] bArr7 = this.FR;
                        int i36 = i25 - 2;
                        byte bEncryptByte4 = encryptByte(bArr[i15 + i25], i36);
                        bArr2[i16 + i25] = bEncryptByte4;
                        bArr7[i36] = bEncryptByte4;
                        i25++;
                    }
                }
            } else {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i17 = this.blockSize;
                    if (i26 >= i17) {
                        break;
                    }
                    byte[] bArr8 = this.FR;
                    byte bEncryptByte5 = encryptByte(bArr[i15 + i26], i26);
                    bArr2[i16 + i26] = bEncryptByte5;
                    bArr8[i26] = bEncryptByte5;
                    i26++;
                }
            }
            this.count += i17;
        }
        return this.blockSize;
    }

    private byte encryptByte(byte b15, int i15) {
        return (byte) (b15 ^ this.FRE[i15]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        this.forEncryption = z15;
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        return this.forEncryption ? encryptBlock(bArr, i15, bArr2, i16) : decryptBlock(bArr, i15, bArr2, i16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        byte[] bArr = this.IV;
        byte[] bArr2 = this.FR;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.cipher.reset();
    }
}
