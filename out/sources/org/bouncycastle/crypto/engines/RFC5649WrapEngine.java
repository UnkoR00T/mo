package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class RFC5649WrapEngine implements Wrapper {
    private static final byte[] DEFAULT_IV = {-90, 89, 89, -90};
    private final BlockCipher engine;
    private final byte[] preIV = new byte[4];
    private KeyParameter param = null;
    private boolean forWrapping = true;

    public RFC5649WrapEngine(BlockCipher blockCipher) {
        this.engine = blockCipher;
    }

    private byte[] padPlaintext(byte[] bArr) {
        int length = bArr.length;
        int i15 = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i15];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i15 != 0) {
            System.arraycopy(new byte[i15], 0, bArr2, length, i15);
        }
        return bArr2;
    }

    private byte[] rfc3394UnwrapNoIvCheck(byte[] bArr, int i15, int i16, byte[] bArr2) {
        int i17 = i16 - 8;
        byte[] bArr3 = new byte[i17];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i15, bArr4, 0, 8);
        System.arraycopy(bArr, i15 + 8, bArr3, 0, i17);
        this.engine.init(false, this.param);
        int i18 = (i16 / 8) - 1;
        for (int i19 = 5; i19 >= 0; i19--) {
            for (int i25 = i18; i25 >= 1; i25--) {
                int i26 = (i25 - 1) * 8;
                System.arraycopy(bArr3, i26, bArr4, 8, 8);
                int i27 = (i18 * i19) + i25;
                int i28 = 1;
                while (i27 != 0) {
                    int i29 = 8 - i28;
                    bArr4[i29] = (byte) (bArr4[i29] ^ ((byte) i27));
                    i27 >>>= 8;
                    i28++;
                }
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 8, bArr3, i26, 8);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, 8);
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z15, CipherParameters cipherParameters) {
        this.forWrapping = z15;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            System.arraycopy(DEFAULT_IV, 0, this.preIV, 0, 4);
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv4 = parametersWithIV.getIV();
            if (iv4.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
            this.param = (KeyParameter) parametersWithIV.getParameters();
            System.arraycopy(iv4, 0, this.preIV, 0, 4);
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i15, int i16) throws InvalidCipherTextException {
        byte[] bArrRfc3394UnwrapNoIvCheck;
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i17 = i16 / 8;
        if (i17 * 8 != i16) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        if (i17 <= 1) {
            throw new InvalidCipherTextException("unwrap data must be at least 16 bytes");
        }
        byte[] bArr2 = new byte[i16];
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        byte[] bArr3 = new byte[i16];
        byte[] bArr4 = new byte[8];
        if (i17 == 2) {
            this.engine.init(false, this.param);
            int blockSize = this.engine.getBlockSize();
            for (int i18 = 0; i18 < i16; i18 += blockSize) {
                this.engine.processBlock(bArr2, i18, bArr3, i18);
            }
            System.arraycopy(bArr3, 0, bArr4, 0, 8);
            int i19 = i16 - 8;
            bArrRfc3394UnwrapNoIvCheck = new byte[i19];
            System.arraycopy(bArr3, 8, bArrRfc3394UnwrapNoIvCheck, 0, i19);
        } else {
            bArrRfc3394UnwrapNoIvCheck = rfc3394UnwrapNoIvCheck(bArr, i15, i16, bArr4);
        }
        int i25 = 4;
        byte[] bArr5 = new byte[4];
        System.arraycopy(bArr4, 0, bArr5, 0, 4);
        int iBigEndianToInt = Pack.bigEndianToInt(bArr4, 4);
        boolean zConstantTimeAreEqual = Arrays.constantTimeAreEqual(bArr5, this.preIV);
        int length = bArrRfc3394UnwrapNoIvCheck.length;
        if (iBigEndianToInt <= length - 8) {
            zConstantTimeAreEqual = false;
        }
        if (iBigEndianToInt > length) {
            zConstantTimeAreEqual = false;
        }
        int i26 = length - iBigEndianToInt;
        if (i26 >= 8 || i26 < 0) {
            zConstantTimeAreEqual = false;
        } else {
            i25 = i26;
        }
        byte[] bArr6 = new byte[i25];
        System.arraycopy(bArrRfc3394UnwrapNoIvCheck, bArrRfc3394UnwrapNoIvCheck.length - i25, bArr6, 0, i25);
        if (!Arrays.constantTimeAreEqual(bArr6, new byte[i25])) {
            zConstantTimeAreEqual = false;
        }
        if (!zConstantTimeAreEqual) {
            throw new InvalidCipherTextException("checksum failed");
        }
        byte[] bArr7 = new byte[iBigEndianToInt];
        System.arraycopy(bArrRfc3394UnwrapNoIvCheck, 0, bArr7, 0, iBigEndianToInt);
        return bArr7;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i15, int i16) {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        byte[] bArr2 = new byte[8];
        System.arraycopy(this.preIV, 0, bArr2, 0, 4);
        Pack.intToBigEndian(i16, bArr2, 4);
        byte[] bArr3 = new byte[i16];
        System.arraycopy(bArr, i15, bArr3, 0, i16);
        byte[] bArrPadPlaintext = padPlaintext(bArr3);
        if (bArrPadPlaintext.length != 8) {
            RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine(this.engine);
            rFC3394WrapEngine.init(true, new ParametersWithIV(this.param, bArr2));
            return rFC3394WrapEngine.wrap(bArrPadPlaintext, 0, bArrPadPlaintext.length);
        }
        int length = bArrPadPlaintext.length + 8;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr2, 0, bArr4, 0, 8);
        System.arraycopy(bArrPadPlaintext, 0, bArr4, 8, bArrPadPlaintext.length);
        this.engine.init(true, this.param);
        int blockSize = this.engine.getBlockSize();
        for (int i17 = 0; i17 < length; i17 += blockSize) {
            this.engine.processBlock(bArr4, i17, bArr4, i17);
        }
        return bArr4;
    }
}
