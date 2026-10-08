package org.bouncycastle.crypto.engines;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RC2WrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149050iv;
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private SecureRandom f149051sr;
    Digest sha1 = DigestFactory.createSHA1();
    byte[] digest = new byte[20];

    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.sha1.update(bArr, 0, bArr.length);
        this.sha1.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(bArr), bArr2);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z15, CipherParameters cipherParameters) {
        this.forWrapping = z15;
        this.engine = new CBCBlockCipher(new RC2Engine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f149051sr = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.f149051sr = CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof ParametersWithIV)) {
            this.param = cipherParameters;
            if (this.forWrapping) {
                byte[] bArr = new byte[8];
                this.f149050iv = bArr;
                this.f149051sr.nextBytes(bArr);
                this.paramPlusIV = new ParametersWithIV(this.param, this.f149050iv);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.paramPlusIV = parametersWithIV;
        this.f149050iv = parametersWithIV.getIV();
        this.param = this.paramPlusIV.getParameters();
        if (!this.forWrapping) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        byte[] bArr2 = this.f149050iv;
        if (bArr2 == null || bArr2.length != 8) {
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i15, int i16) throws InvalidCipherTextException {
        if (this.forWrapping) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        if (i16 % this.engine.getBlockSize() != 0) {
            throw new InvalidCipherTextException("Ciphertext not multiple of " + this.engine.getBlockSize());
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i16];
        System.arraycopy(bArr, i15, bArr2, 0, i16);
        for (int i17 = 0; i17 < i16 / this.engine.getBlockSize(); i17++) {
            int blockSize = this.engine.getBlockSize() * i17;
            this.engine.processBlock(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i16];
        int i18 = 0;
        while (i18 < i16) {
            int i19 = i18 + 1;
            bArr3[i18] = bArr2[i16 - i19];
            i18 = i19;
        }
        byte[] bArr4 = new byte[8];
        this.f149050iv = bArr4;
        int i25 = i16 - 8;
        byte[] bArr5 = new byte[i25];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i25);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.f149050iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr6 = new byte[i25];
        System.arraycopy(bArr5, 0, bArr6, 0, i25);
        for (int i26 = 0; i26 < i25 / this.engine.getBlockSize(); i26++) {
            int blockSize2 = this.engine.getBlockSize() * i26;
            this.engine.processBlock(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i27 = i16 - 16;
        byte[] bArr7 = new byte[i27];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i27);
        System.arraycopy(bArr6, i27, bArr8, 0, 8);
        if (!checkCMSKeyChecksum(bArr7, bArr8)) {
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        int i28 = bArr7[0];
        if (i27 - ((i28 & GF2Field.MASK) + 1) <= 7) {
            byte[] bArr9 = new byte[i28];
            System.arraycopy(bArr7, 1, bArr9, 0, i28);
            return bArr9;
        }
        throw new InvalidCipherTextException("too many pad bytes (" + (i27 - ((bArr7[0] & GF2Field.MASK) + 1)) + ")");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i15, int i16) {
        if (!this.forWrapping) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i17 = i16 + 1;
        int i18 = i17 % 8;
        int i19 = i18 != 0 ? (8 - i18) + i17 : i17;
        byte[] bArr2 = new byte[i19];
        bArr2[0] = (byte) i16;
        System.arraycopy(bArr, i15, bArr2, 1, i16);
        int i25 = (i19 - i16) - 1;
        byte[] bArr3 = new byte[i25];
        if (i25 > 0) {
            this.f149051sr.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i17, i25);
        }
        byte[] bArrCalculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
        int length = bArrCalculateCMSKeyChecksum.length + i19;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr2, 0, bArr4, 0, i19);
        System.arraycopy(bArrCalculateCMSKeyChecksum, 0, bArr4, i19, bArrCalculateCMSKeyChecksum.length);
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr4, 0, bArr5, 0, length);
        int blockSize = length / this.engine.getBlockSize();
        if (length % this.engine.getBlockSize() != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.engine.init(true, this.paramPlusIV);
        for (int i26 = 0; i26 < blockSize; i26++) {
            int blockSize2 = this.engine.getBlockSize() * i26;
            this.engine.processBlock(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.f149050iv;
        int length2 = bArr6.length + length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        System.arraycopy(bArr5, 0, bArr7, this.f149050iv.length, length);
        byte[] bArr8 = new byte[length2];
        int i27 = 0;
        while (i27 < length2) {
            int i28 = i27 + 1;
            bArr8[i27] = bArr7[length2 - i28];
            i27 = i28;
        }
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i29 = 0; i29 < blockSize + 1; i29++) {
            int blockSize3 = this.engine.getBlockSize() * i29;
            this.engine.processBlock(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }
}
