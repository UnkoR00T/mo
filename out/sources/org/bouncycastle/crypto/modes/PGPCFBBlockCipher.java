package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
public class PGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;
    private boolean inlineIv;
    private byte[] tmp;

    public PGPCFBBlockCipher(BlockCipher blockCipher, boolean z15) {
        this.cipher = blockCipher;
        this.inlineIv = z15;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
        this.tmp = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = this.blockSize;
        if (i15 + i17 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i18 = 0;
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i19 = 0; i19 < this.blockSize; i19++) {
            bArr2[i16 + i19] = encryptByte(bArr[i15 + i19], i19);
        }
        while (true) {
            int i25 = this.blockSize;
            if (i18 >= i25) {
                return i25;
            }
            this.FR[i18] = bArr[i15 + i18];
            i18++;
        }
    }

    private int decryptBlockWithIV(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17;
        int i18 = this.blockSize;
        if (i15 + i18 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i16 + i18 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i19 = this.count;
        if (i19 == 0) {
            for (int i25 = 0; i25 < this.blockSize; i25++) {
                this.FR[i25] = bArr[i15 + i25];
            }
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            this.count += this.blockSize;
            return 0;
        }
        if (i19 != i18) {
            if (i19 >= i18 + 2) {
                System.arraycopy(bArr, i15, this.tmp, 0, i18);
                bArr2[i16] = encryptByte(this.tmp[0], this.blockSize - 2);
                bArr2[i16 + 1] = encryptByte(this.tmp[1], this.blockSize - 1);
                System.arraycopy(this.tmp, 0, this.FR, this.blockSize - 2, 2);
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                int i26 = 0;
                while (true) {
                    i17 = this.blockSize;
                    if (i26 >= i17 - 2) {
                        break;
                    }
                    bArr2[i16 + i26 + 2] = encryptByte(this.tmp[i26 + 2], i26);
                    i26++;
                }
                System.arraycopy(this.tmp, 2, this.FR, 0, i17 - 2);
            }
            return this.blockSize;
        }
        System.arraycopy(bArr, i15, this.tmp, 0, i18);
        byte[] bArr3 = this.FR;
        System.arraycopy(bArr3, 2, bArr3, 0, this.blockSize - 2);
        byte[] bArr4 = this.FR;
        int i27 = this.blockSize;
        byte[] bArr5 = this.tmp;
        bArr4[i27 - 2] = bArr5[0];
        bArr4[i27 - 1] = bArr5[1];
        this.cipher.processBlock(bArr4, 0, this.FRE, 0);
        int i28 = 0;
        while (true) {
            int i29 = this.blockSize;
            if (i28 >= i29 - 2) {
                System.arraycopy(this.tmp, 2, this.FR, 0, i29 - 2);
                this.count += 2;
                return this.blockSize - 2;
            }
            bArr2[i16 + i28] = encryptByte(this.tmp[i28 + 2], i28);
            i28++;
        }
    }

    private int encryptBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = this.blockSize;
        if (i15 + i17 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i18 = 0;
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i19 = 0; i19 < this.blockSize; i19++) {
            bArr2[i16 + i19] = encryptByte(bArr[i15 + i19], i19);
        }
        while (true) {
            int i25 = this.blockSize;
            if (i18 >= i25) {
                return i25;
            }
            this.FR[i18] = bArr2[i16 + i18];
            i18++;
        }
    }

    private int encryptBlockWithIV(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17;
        int i18;
        int i19 = this.blockSize;
        if (i15 + i19 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        int i25 = this.count;
        if (i25 != 0) {
            if (i25 >= i19 + 2) {
                if (i19 + i16 > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                int i26 = 0;
                while (true) {
                    i17 = this.blockSize;
                    if (i26 >= i17) {
                        break;
                    }
                    bArr2[i16 + i26] = encryptByte(bArr[i15 + i26], i26);
                    i26++;
                }
                System.arraycopy(bArr2, i16, this.FR, 0, i17);
            }
            return this.blockSize;
        }
        if ((i19 * 2) + i16 + 2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i27 = 0;
        while (true) {
            i18 = this.blockSize;
            if (i27 >= i18) {
                break;
            }
            bArr2[i16 + i27] = encryptByte(this.IV[i27], i27);
            i27++;
        }
        System.arraycopy(bArr2, i16, this.FR, 0, i18);
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i28 = this.blockSize;
        bArr2[i16 + i28] = encryptByte(this.IV[i28 - 2], 0);
        int i29 = this.blockSize;
        bArr2[i16 + i29 + 1] = encryptByte(this.IV[i29 - 1], 1);
        System.arraycopy(bArr2, i16 + 2, this.FR, 0, this.blockSize);
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i35 = 0;
        while (true) {
            int i36 = this.blockSize;
            if (i35 >= i36) {
                System.arraycopy(bArr2, i16 + i36 + 2, this.FR, 0, i36);
                int i37 = this.count;
                int i38 = this.blockSize;
                this.count = i37 + (i38 * 2) + 2;
                return (i38 * 2) + 2;
            }
            bArr2[i36 + i16 + 2 + i35] = encryptByte(bArr[i15 + i35], i35);
            i35++;
        }
    }

    private byte encryptByte(byte b15, int i15) {
        return (byte) (b15 ^ this.FRE[i15]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        StringBuilder sb5;
        String str;
        if (this.inlineIv) {
            sb5 = new StringBuilder();
            sb5.append(this.cipher.getAlgorithmName());
            str = "/PGPCFBwithIV";
        } else {
            sb5 = new StringBuilder();
            sb5.append(this.cipher.getAlgorithmName());
            str = "/PGPCFB";
        }
        sb5.append(str);
        return sb5.toString();
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
        BlockCipher blockCipher;
        this.forEncryption = z15;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv4 = parametersWithIV.getIV();
            int length = iv4.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv4, 0, bArr, bArr.length - iv4.length, iv4.length);
                int i15 = 0;
                while (true) {
                    byte[] bArr2 = this.IV;
                    if (i15 >= bArr2.length - iv4.length) {
                        break;
                    }
                    bArr2[i15] = 0;
                    i15++;
                }
            } else {
                System.arraycopy(iv4, 0, bArr, 0, bArr.length);
            }
            reset();
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            blockCipher = this.cipher;
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        if (this.inlineIv) {
            return this.forEncryption ? encryptBlockWithIV(bArr, i15, bArr2, i16) : decryptBlockWithIV(bArr, i15, bArr2, i16);
        }
        return this.forEncryption ? encryptBlock(bArr, i15, bArr2, i16) : decryptBlock(bArr, i15, bArr2, i16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.FR;
            if (i15 == bArr.length) {
                this.cipher.reset();
                return;
            }
            if (this.inlineIv) {
                bArr[i15] = 0;
            } else {
                bArr[i15] = this.IV[i15];
            }
            i15++;
        }
    }
}
