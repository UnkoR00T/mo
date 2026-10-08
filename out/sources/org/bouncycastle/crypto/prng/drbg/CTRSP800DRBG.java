package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class CTRSP800DRBG implements SP80090DRBG {
    private static final int AES_MAX_BITS_REQUEST = 262144;
    private static final long AES_RESEED_MAX = 140737488355328L;
    private static final byte[] K_BITS = Hex.decodeStrict("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    private static final int TDEA_MAX_BITS_REQUEST = 4096;
    private static final long TDEA_RESEED_MAX = 2147483648L;
    private byte[] _Key;
    private byte[] _V;
    private BlockCipher _engine;
    private EntropySource _entropySource;
    private boolean _isTDEA;
    private int _keySizeInBits;
    private long _reseedCounter = 0;
    private int _securityStrength;
    private int _seedLength;

    public CTRSP800DRBG(BlockCipher blockCipher, int i15, int i16, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this._isTDEA = false;
        this._entropySource = entropySource;
        this._engine = blockCipher;
        this._keySizeInBits = i15;
        this._securityStrength = i16;
        this._seedLength = (blockCipher.getBlockSize() * 8) + i15;
        this._isTDEA = isTDEA(blockCipher);
        if (i16 > 256) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (getMaxSecurityStrength(blockCipher, i15) < i16) {
            throw new IllegalArgumentException("Requested security strength is not supported by block cipher and key size");
        }
        if (entropySource.entropySize() < i16) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        CTR_DRBG_Instantiate_algorithm(getEntropy(), bArr2, bArr);
    }

    private void BCC(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int blockSize = this._engine.getBlockSize();
        byte[] bArr5 = new byte[blockSize];
        int length = bArr4.length / blockSize;
        byte[] bArr6 = new byte[blockSize];
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        this._engine.processBlock(bArr3, 0, bArr5, 0);
        for (int i15 = 0; i15 < length; i15++) {
            Bytes.xor(blockSize, bArr5, 0, bArr4, i15 * blockSize, bArr6, 0);
            this._engine.processBlock(bArr6, 0, bArr5, 0);
        }
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
    }

    private byte[] Block_Cipher_df(byte[] bArr, int i15) {
        int blockSize = this._engine.getBlockSize();
        int length = bArr.length;
        int i16 = i15 / 8;
        byte[] bArr2 = new byte[((((length + 9) + blockSize) - 1) / blockSize) * blockSize];
        copyIntToByteArray(bArr2, length, 0);
        copyIntToByteArray(bArr2, i16, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = -128;
        int i17 = this._keySizeInBits;
        int i18 = (i17 / 8) + blockSize;
        byte[] bArr3 = new byte[i18];
        byte[] bArr4 = new byte[blockSize];
        byte[] bArr5 = new byte[blockSize];
        int i19 = i17 / 8;
        byte[] bArr6 = new byte[i19];
        System.arraycopy(K_BITS, 0, bArr6, 0, i19);
        int i25 = 0;
        while (true) {
            int i26 = i25 * blockSize;
            if (i26 * 8 >= this._keySizeInBits + (blockSize * 8)) {
                break;
            }
            copyIntToByteArray(bArr5, i25, 0);
            BCC(bArr4, bArr6, bArr5, bArr2);
            int i27 = i18 - i26;
            if (i27 > blockSize) {
                i27 = blockSize;
            }
            System.arraycopy(bArr4, 0, bArr3, i26, i27);
            i25++;
        }
        byte[] bArr7 = new byte[blockSize];
        System.arraycopy(bArr3, 0, bArr6, 0, i19);
        System.arraycopy(bArr3, i19, bArr7, 0, blockSize);
        byte[] bArr8 = new byte[i16];
        this._engine.init(true, new KeyParameter(expandKey(bArr6)));
        int i28 = 0;
        while (true) {
            int i29 = i28 * blockSize;
            if (i29 >= i16) {
                return bArr8;
            }
            this._engine.processBlock(bArr7, 0, bArr7, 0);
            int i35 = i16 - i29;
            if (i35 > blockSize) {
                i35 = blockSize;
            }
            System.arraycopy(bArr7, 0, bArr8, i29, i35);
            i28++;
        }
    }

    private void CTR_DRBG_Instantiate_algorithm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrBlock_Cipher_df = Block_Cipher_df(Arrays.concatenate(bArr, bArr2, bArr3), this._seedLength);
        int blockSize = this._engine.getBlockSize();
        byte[] bArr4 = new byte[(this._keySizeInBits + 7) / 8];
        this._Key = bArr4;
        byte[] bArr5 = new byte[blockSize];
        this._V = bArr5;
        CTR_DRBG_Update(bArrBlock_Cipher_df, bArr4, bArr5);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Reseed_algorithm(byte[] bArr) {
        CTR_DRBG_Update(Block_Cipher_df(Arrays.concatenate(getEntropy(), bArr), this._seedLength), this._Key, this._V);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this._engine.getBlockSize()];
        int blockSize = this._engine.getBlockSize();
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        int i15 = 0;
        while (true) {
            int i16 = i15 * blockSize;
            if (i16 >= bArr.length) {
                Bytes.xorTo(bArr.length, bArr, bArr4);
                System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                return;
            } else {
                addOneTo(bArr3);
                this._engine.processBlock(bArr3, 0, bArr5, 0);
                int i17 = length - i16;
                if (i17 > blockSize) {
                    i17 = blockSize;
                }
                System.arraycopy(bArr5, 0, bArr4, i16, i17);
                i15++;
            }
        }
    }

    private void addOneTo(byte[] bArr) {
        int i15 = 1;
        for (int i16 = 1; i16 <= bArr.length; i16++) {
            int i17 = (bArr[bArr.length - i16] & 255) + i15;
            i15 = i17 > 255 ? 1 : 0;
            bArr[bArr.length - i16] = (byte) i17;
        }
    }

    private void copyIntToByteArray(byte[] bArr, int i15, int i16) {
        bArr[i16] = (byte) (i15 >> 24);
        bArr[i16 + 1] = (byte) (i15 >> 16);
        bArr[i16 + 2] = (byte) (i15 >> 8);
        bArr[i16 + 3] = (byte) i15;
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private int getMaxSecurityStrength(BlockCipher blockCipher, int i15) {
        if (isTDEA(blockCipher) && i15 == 168) {
            return 112;
        }
        if (blockCipher.getAlgorithmName().equals("AES")) {
            return i15;
        }
        return -1;
    }

    private boolean isTDEA(BlockCipher blockCipher) {
        return blockCipher.getAlgorithmName().equals("DESede") || blockCipher.getAlgorithmName().equals("TDEA");
    }

    private void padKey(byte[] bArr, int i15, byte[] bArr2, int i16) {
        bArr2[i16] = (byte) (bArr[i15] & 254);
        int i17 = i15 + 1;
        bArr2[i16 + 1] = (byte) ((bArr[i15] << 7) | ((bArr[i17] & 252) >>> 1));
        int i18 = bArr[i17] << 6;
        int i19 = i15 + 2;
        bArr2[i16 + 2] = (byte) (i18 | ((bArr[i19] & 248) >>> 2));
        int i25 = bArr[i19] << 5;
        int i26 = i15 + 3;
        bArr2[i16 + 3] = (byte) (i25 | ((bArr[i26] & 240) >>> 3));
        int i27 = bArr[i26] << 4;
        int i28 = i15 + 4;
        bArr2[i16 + 4] = (byte) (i27 | ((bArr[i28] & 224) >>> 4));
        int i29 = bArr[i28] << 3;
        int i35 = i15 + 5;
        bArr2[i16 + 5] = (byte) (i29 | ((bArr[i35] & 192) >>> 5));
        int i36 = i15 + 6;
        bArr2[i16 + 6] = (byte) ((bArr[i35] << 2) | ((bArr[i36] & 128) >>> 6));
        int i37 = i16 + 7;
        bArr2[i37] = (byte) (bArr[i36] << 1);
        while (i16 <= i37) {
            byte b15 = bArr2[i16];
            bArr2[i16] = (byte) (((((b15 >> 7) ^ ((((((b15 >> 1) ^ (b15 >> 2)) ^ (b15 >> 3)) ^ (b15 >> 4)) ^ (b15 >> 5)) ^ (b15 >> 6))) ^ 1) & 1) | (b15 & 254));
            i16++;
        }
    }

    byte[] expandKey(byte[] bArr) {
        if (!this._isTDEA) {
            return bArr;
        }
        byte[] bArr2 = new byte[24];
        padKey(bArr, 0, bArr2, 0);
        padKey(bArr, 7, bArr2, 8);
        padKey(bArr, 14, bArr2, 16);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z15) {
        byte[] bArrBlock_Cipher_df;
        boolean z16 = this._isTDEA;
        long j15 = this._reseedCounter;
        if (z16) {
            if (j15 > TDEA_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (j15 > AES_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z15) {
            CTR_DRBG_Reseed_algorithm(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            bArrBlock_Cipher_df = Block_Cipher_df(bArr2, this._seedLength);
            CTR_DRBG_Update(bArrBlock_Cipher_df, this._Key, this._V);
        } else {
            bArrBlock_Cipher_df = new byte[this._seedLength / 8];
        }
        int length = this._V.length;
        byte[] bArr3 = new byte[length];
        this._engine.init(true, new KeyParameter(expandKey(this._Key)));
        for (int i15 = 0; i15 <= bArr.length / length; i15++) {
            int i16 = i15 * length;
            int length2 = bArr.length - i16 > length ? length : bArr.length - (this._V.length * i15);
            if (length2 != 0) {
                addOneTo(this._V);
                this._engine.processBlock(this._V, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i16, length2);
            }
        }
        CTR_DRBG_Update(bArrBlock_Cipher_df, this._Key, this._V);
        this._reseedCounter++;
        return bArr.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._V.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        CTR_DRBG_Reseed_algorithm(bArr);
    }
}
