package org.bouncycastle.crypto.signers;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.Prehash;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class PSSSigner implements Signer {
    public static final byte TRAILER_IMPLICIT = -68;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest contentDigest1;
    private Digest contentDigest2;
    private int emBits;
    private int hLen;
    private byte[] mDash;
    private Digest mgfDigest;
    private int mgfhLen;
    private SecureRandom random;
    private int sLen;
    private boolean sSet;
    private byte[] salt;
    private byte trailer;

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i15) {
        this(asymmetricBlockCipher, digest, i15, TRAILER_IMPLICIT);
    }

    private void ItoOSP(int i15, byte[] bArr) {
        bArr[0] = (byte) (i15 >>> 24);
        bArr[1] = (byte) (i15 >>> 16);
        bArr[2] = (byte) (i15 >>> 8);
        bArr[3] = (byte) i15;
    }

    private void clearBlock(byte[] bArr) {
        for (int i15 = 0; i15 != bArr.length; i15++) {
            bArr[i15] = 0;
        }
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest, digest.getDigestSize(), TRAILER_IMPLICIT);
    }

    private byte[] maskGenerator(byte[] bArr, int i15, int i16, int i17) {
        Digest digest = this.mgfDigest;
        if (!(digest instanceof Xof)) {
            return maskGeneratorFunction1(bArr, i15, i16, i17);
        }
        byte[] bArr2 = new byte[i17];
        digest.update(bArr, i15, i16);
        ((Xof) this.mgfDigest).doFinal(bArr2, 0, i17);
        return bArr2;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i15, int i16, int i17) {
        int i18;
        byte[] bArr2 = new byte[i17];
        byte[] bArr3 = new byte[this.mgfhLen];
        byte[] bArr4 = new byte[4];
        this.mgfDigest.reset();
        int i19 = 0;
        while (true) {
            i18 = this.mgfhLen;
            if (i19 >= i17 / i18) {
                break;
            }
            ItoOSP(i19, bArr4);
            this.mgfDigest.update(bArr, i15, i16);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i25 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i19 * i25, i25);
            i19++;
        }
        if (i18 * i19 < i17) {
            ItoOSP(i19, bArr4);
            this.mgfDigest.update(bArr, i15, i16);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i26 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i19 * i26, i17 - (i19 * i26));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        int digestSize = this.contentDigest1.getDigestSize();
        int i15 = this.hLen;
        if (digestSize != i15) {
            throw new IllegalStateException();
        }
        Digest digest = this.contentDigest1;
        byte[] bArr = this.mDash;
        digest.doFinal(bArr, (bArr.length - i15) - this.sLen);
        if (this.sLen != 0) {
            if (!this.sSet) {
                this.random.nextBytes(this.salt);
            }
            byte[] bArr2 = this.salt;
            byte[] bArr3 = this.mDash;
            int length = bArr3.length;
            int i16 = this.sLen;
            System.arraycopy(bArr2, 0, bArr3, length - i16, i16);
        }
        int i17 = this.hLen;
        byte[] bArr4 = new byte[i17];
        Digest digest2 = this.contentDigest2;
        byte[] bArr5 = this.mDash;
        digest2.update(bArr5, 0, bArr5.length);
        this.contentDigest2.doFinal(bArr4, 0);
        byte[] bArr6 = this.block;
        int length2 = bArr6.length;
        int i18 = this.sLen;
        int i19 = this.hLen;
        bArr6[(((length2 - i18) - 1) - i19) - 1] = 1;
        System.arraycopy(this.salt, 0, bArr6, ((bArr6.length - i18) - i19) - 1, i18);
        byte[] bArrMaskGenerator = maskGenerator(bArr4, 0, i17, (this.block.length - this.hLen) - 1);
        for (int i25 = 0; i25 != bArrMaskGenerator.length; i25++) {
            byte[] bArr7 = this.block;
            bArr7[i25] = (byte) (bArr7[i25] ^ bArrMaskGenerator[i25]);
        }
        byte[] bArr8 = this.block;
        int length3 = bArr8.length;
        int i26 = this.hLen;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i26) - 1, i26);
        byte[] bArr9 = this.block;
        bArr9[0] = (byte) ((GF2Field.MASK >>> ((bArr9.length * 8) - this.emBits)) & bArr9[0]);
        bArr9[bArr9.length - 1] = this.trailer;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr9, 0, bArr9.length);
        clearBlock(this.block);
        return bArrProcessBlock;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z15, CipherParameters cipherParameters) {
        CipherParameters parameters;
        RSAKeyParameters publicKey;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            parameters = parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            if (z15) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            parameters = cipherParameters;
        }
        if (parameters instanceof RSABlindingParameters) {
            publicKey = ((RSABlindingParameters) parameters).getPublicKey();
            this.cipher.init(z15, cipherParameters);
        } else {
            publicKey = (RSAKeyParameters) parameters;
            this.cipher.init(z15, parameters);
        }
        int iBitLength = publicKey.getModulus().bitLength();
        int i15 = iBitLength - 1;
        this.emBits = i15;
        if (i15 < (this.hLen * 8) + (this.sLen * 8) + 9) {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.block = new byte[(iBitLength + 6) / 8];
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.contentDigest1.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b15) {
        this.contentDigest1.update(b15);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        int digestSize = this.contentDigest1.getDigestSize();
        int i15 = this.hLen;
        if (digestSize != i15) {
            throw new IllegalStateException();
        }
        Digest digest = this.contentDigest1;
        byte[] bArr2 = this.mDash;
        digest.doFinal(bArr2, (bArr2.length - i15) - this.sLen);
        try {
            byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            byte[] bArr3 = this.block;
            Arrays.fill(bArr3, 0, bArr3.length - bArrProcessBlock.length, (byte) 0);
            byte[] bArr4 = this.block;
            System.arraycopy(bArrProcessBlock, 0, bArr4, bArr4.length - bArrProcessBlock.length, bArrProcessBlock.length);
            byte[] bArr5 = this.block;
            int length = GF2Field.MASK >>> ((bArr5.length * 8) - this.emBits);
            byte b15 = bArr5[0];
            if ((b15 & 255) != (b15 & length) || bArr5[bArr5.length - 1] != this.trailer) {
                clearBlock(bArr5);
                return false;
            }
            int length2 = bArr5.length;
            int i16 = this.hLen;
            byte[] bArrMaskGenerator = maskGenerator(bArr5, (length2 - i16) - 1, i16, (bArr5.length - i16) - 1);
            for (int i17 = 0; i17 != bArrMaskGenerator.length; i17++) {
                byte[] bArr6 = this.block;
                bArr6[i17] = (byte) (bArr6[i17] ^ bArrMaskGenerator[i17]);
            }
            byte[] bArr7 = this.block;
            bArr7[0] = (byte) (length & bArr7[0]);
            int i18 = 0;
            while (true) {
                byte[] bArr8 = this.block;
                int length3 = bArr8.length;
                int i19 = this.hLen;
                int i25 = this.sLen;
                if (i18 != ((length3 - i19) - i25) - 2) {
                    if (bArr8[i18] != 0) {
                        clearBlock(bArr8);
                        return false;
                    }
                    i18++;
                } else {
                    if (bArr8[((bArr8.length - i19) - i25) - 2] != 1) {
                        clearBlock(bArr8);
                        return false;
                    }
                    if (this.sSet) {
                        byte[] bArr9 = this.salt;
                        byte[] bArr10 = this.mDash;
                        System.arraycopy(bArr9, 0, bArr10, bArr10.length - i25, i25);
                    } else {
                        int length4 = ((bArr8.length - i25) - i19) - 1;
                        byte[] bArr11 = this.mDash;
                        System.arraycopy(bArr8, length4, bArr11, bArr11.length - i25, i25);
                    }
                    Digest digest2 = this.contentDigest2;
                    byte[] bArr12 = this.mDash;
                    digest2.update(bArr12, 0, bArr12.length);
                    Digest digest3 = this.contentDigest2;
                    byte[] bArr13 = this.mDash;
                    digest3.doFinal(bArr13, bArr13.length - this.hLen);
                    int length5 = this.block.length;
                    int i26 = this.hLen;
                    int i27 = (length5 - i26) - 1;
                    int length6 = this.mDash.length - i26;
                    while (true) {
                        byte[] bArr14 = this.mDash;
                        if (length6 == bArr14.length) {
                            clearBlock(bArr14);
                            clearBlock(this.block);
                            return true;
                        }
                        if ((this.block[i27] ^ bArr14[length6]) != 0) {
                            clearBlock(bArr14);
                            clearBlock(this.block);
                            return false;
                        }
                        i27++;
                        length6++;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i15, byte b15) {
        this(asymmetricBlockCipher, digest, digest, i15, b15);
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i15, byte b15) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest2, i15, b15);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i15, int i16) {
        this.contentDigest1.update(bArr, i15, i16);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i15) {
        this(asymmetricBlockCipher, digest, digest2, i15, TRAILER_IMPLICIT);
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b15) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest2, bArr, b15);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i15, byte b15) {
        this(asymmetricBlockCipher, digest, digest, digest2, i15, b15);
    }

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, int i15, byte b15) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = false;
        this.sLen = i15;
        this.salt = new byte[i15];
        this.mDash = new byte[i15 + 8 + this.hLen];
        this.trailer = b15;
    }

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, byte[] bArr, byte b15) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = true;
        int length = bArr.length;
        this.sLen = length;
        this.salt = bArr;
        this.mDash = new byte[length + 8 + this.hLen];
        this.trailer = b15;
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest2, bArr, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b15) {
        this(asymmetricBlockCipher, digest, digest, digest2, bArr, b15);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr, TRAILER_IMPLICIT);
    }
}
