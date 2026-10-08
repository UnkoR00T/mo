package org.bouncycastle.crypto.engines;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RFC3211WrapEngine implements Wrapper {
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private ParametersWithIV param;
    private SecureRandom rand;

    public RFC3211WrapEngine(BlockCipher blockCipher) {
        this.engine = new CBCBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getUnderlyingCipher().getAlgorithmName() + "/RFC3211Wrap";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z15, CipherParameters cipherParameters) {
        this.forWrapping = z15;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.rand = parametersWithRandom.getRandom();
            if (!(parametersWithRandom.getParameters() instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("RFC3211Wrap requires an IV");
            }
            this.param = (ParametersWithIV) parametersWithRandom.getParameters();
            return;
        }
        if (z15) {
            this.rand = CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("RFC3211Wrap requires an IV");
        }
        this.param = (ParametersWithIV) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i15, int i16) throws InvalidCipherTextException {
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int blockSize = this.engine.getBlockSize();
        if (i16 < blockSize * 2) {
            throw new InvalidCipherTextException("input too short");
        }
        byte[] bArr2 = new byte[i16];
        byte[] bArr3 = new byte[blockSize];
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        System.arraycopy(bArr, i15, bArr3, 0, blockSize);
        this.engine.init(false, new ParametersWithIV(this.param.getParameters(), bArr3));
        for (int i17 = blockSize; i17 < i16; i17 += blockSize) {
            this.engine.processBlock(bArr2, i17, bArr2, i17);
        }
        System.arraycopy(bArr2, i16 - blockSize, bArr3, 0, blockSize);
        this.engine.init(false, new ParametersWithIV(this.param.getParameters(), bArr3));
        this.engine.processBlock(bArr2, 0, bArr2, 0);
        this.engine.init(false, this.param);
        for (int i18 = 0; i18 < i16; i18 += blockSize) {
            this.engine.processBlock(bArr2, i18, bArr2, i18);
        }
        int i19 = bArr2[0];
        int i25 = i16 - 4;
        boolean z15 = (i19 & GF2Field.MASK) > i25;
        byte[] bArr4 = z15 ? new byte[i25] : new byte[i19 & GF2Field.MASK];
        System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
        int i26 = 0;
        int i27 = 0;
        while (i26 != 3) {
            int i28 = i26 + 1;
            i27 |= bArr2[i26 + 4] ^ ((byte) (~bArr2[i28]));
            i26 = i28;
        }
        Arrays.clear(bArr2);
        if (!z15 && !(i27 != 0)) {
            return bArr4;
        }
        throw new InvalidCipherTextException("wrapped key corrupted");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i15, int i16) {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i16 > 255 || i16 < 0) {
            throw new IllegalArgumentException("input must be from 0 to 255 bytes");
        }
        this.engine.init(true, this.param);
        int blockSize = this.engine.getBlockSize();
        int i17 = i16 + 4;
        int i18 = blockSize * 2;
        if (i17 >= i18) {
            i18 = i17 % blockSize == 0 ? i17 : ((i17 / blockSize) + 1) * blockSize;
        }
        byte[] bArr2 = new byte[i18];
        bArr2[0] = (byte) i16;
        System.arraycopy(bArr, i15, bArr2, 4, i16);
        int length = bArr2.length - i17;
        byte[] bArr3 = new byte[length];
        this.rand.nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, i17, length);
        bArr2[1] = (byte) (~bArr2[4]);
        bArr2[2] = (byte) (~bArr2[5]);
        bArr2[3] = (byte) (~bArr2[6]);
        for (int i19 = 0; i19 < bArr2.length; i19 += blockSize) {
            this.engine.processBlock(bArr2, i19, bArr2, i19);
        }
        for (int i25 = 0; i25 < bArr2.length; i25 += blockSize) {
            this.engine.processBlock(bArr2, i25, bArr2, i25);
        }
        return bArr2;
    }
}
