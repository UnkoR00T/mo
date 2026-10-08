package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RFC3394WrapEngine implements Wrapper {
    private static final byte[] DEFAULT_IV = {-90, -90, -90, -90, -90, -90, -90, -90};
    private final BlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final byte[] f149054iv;
    private KeyParameter param;
    private final boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
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
            System.arraycopy(DEFAULT_IV, 0, this.f149054iv, 0, 8);
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv4 = parametersWithIV.getIV();
            if (iv4.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
            this.param = (KeyParameter) parametersWithIV.getParameters();
            System.arraycopy(iv4, 0, this.f149054iv, 0, 8);
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i15, int i16) throws InvalidCipherTextException {
        byte[] bArr2;
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        if (i16 < 16) {
            throw new InvalidCipherTextException("unwrap data too short");
        }
        int i17 = i16 / 8;
        if (i17 * 8 != i16) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        int i18 = 1;
        this.engine.init(!this.wrapCipherMode, this.param);
        byte[] bArr3 = this.f149054iv;
        byte[] bArr4 = new byte[i16 - bArr3.length];
        byte[] bArr5 = new byte[bArr3.length];
        byte[] bArr6 = new byte[bArr3.length + 8];
        int i19 = i17 - 1;
        if (i19 == 1) {
            this.engine.processBlock(bArr, i15, bArr6, 0);
            System.arraycopy(bArr6, 0, bArr5, 0, this.f149054iv.length);
            System.arraycopy(bArr6, this.f149054iv.length, bArr4, 0, 8);
        } else {
            System.arraycopy(bArr, i15, bArr5, 0, bArr3.length);
            byte[] bArr7 = this.f149054iv;
            System.arraycopy(bArr, bArr7.length + i15, bArr4, 0, i16 - bArr7.length);
            for (int i25 = 5; i25 >= 0; i25--) {
                int i26 = i19;
                while (i26 >= i18) {
                    System.arraycopy(bArr5, 0, bArr6, 0, this.f149054iv.length);
                    int i27 = (i26 - 1) * 8;
                    System.arraycopy(bArr4, i27, bArr6, this.f149054iv.length, 8);
                    int i28 = (i19 * i25) + i26;
                    int i29 = i18;
                    while (i28 != 0) {
                        int i35 = i18;
                        int length = this.f149054iv.length - i29;
                        bArr6[length] = (byte) (bArr6[length] ^ ((byte) i28));
                        i28 >>>= 8;
                        i29++;
                        i18 = i35;
                    }
                    this.engine.processBlock(bArr6, 0, bArr6, 0);
                    System.arraycopy(bArr6, 0, bArr5, 0, 8);
                    System.arraycopy(bArr6, 8, bArr4, i27, 8);
                    i26--;
                    i18 = i18;
                }
            }
        }
        if (i19 != i18) {
            if (!Arrays.constantTimeAreEqual(bArr5, this.f149054iv)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        } else if (!Arrays.constantTimeAreEqual(bArr5, this.f149054iv)) {
            System.arraycopy(bArr, i15, bArr5, 0, this.f149054iv.length);
            byte[] bArr8 = this.f149054iv;
            System.arraycopy(bArr, i15 + bArr8.length, bArr4, 0, i16 - bArr8.length);
            int i36 = 5;
            while (true) {
                bArr2 = this.f149054iv;
                if (i36 < 0) {
                    break;
                }
                System.arraycopy(bArr5, 0, bArr6, 0, bArr2.length);
                System.arraycopy(bArr4, 0, bArr6, this.f149054iv.length, 8);
                int i37 = (i19 * i36) + 1;
                int i38 = 1;
                while (i37 != 0) {
                    int length2 = this.f149054iv.length - i38;
                    bArr6[length2] = (byte) (((byte) i37) ^ bArr6[length2]);
                    i37 >>>= 8;
                    i38++;
                }
                this.engine.processBlock(bArr6, 0, bArr6, 0);
                System.arraycopy(bArr6, 0, bArr5, 0, 8);
                System.arraycopy(bArr6, 8, bArr4, 0, 8);
                i36--;
            }
            if (!Arrays.constantTimeAreEqual(bArr5, bArr2)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i15, int i16) {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i16 < 8) {
            throw new DataLengthException("wrap data must be at least 8 bytes");
        }
        int i17 = i16 / 8;
        if (i17 * 8 != i16) {
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        this.engine.init(this.wrapCipherMode, this.param);
        byte[] bArr2 = this.f149054iv;
        byte[] bArr3 = new byte[bArr2.length + i16];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i15, bArr3, this.f149054iv.length, i16);
        if (i17 == 1) {
            this.engine.processBlock(bArr3, 0, bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[this.f149054iv.length + 8];
        for (int i18 = 0; i18 != 6; i18++) {
            for (int i19 = 1; i19 <= i17; i19++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.f149054iv.length);
                int i25 = i19 * 8;
                System.arraycopy(bArr3, i25, bArr4, this.f149054iv.length, 8);
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                int i26 = (i17 * i18) + i19;
                int i27 = 1;
                while (i26 != 0) {
                    int length = this.f149054iv.length - i27;
                    bArr4[length] = (byte) (((byte) i26) ^ bArr4[length]);
                    i26 >>>= 8;
                    i27++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i25, 8);
            }
        }
        return bArr3;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z15) {
        this.f149054iv = new byte[8];
        this.param = null;
        this.forWrapping = true;
        this.engine = blockCipher;
        this.wrapCipherMode = !z15;
    }
}
