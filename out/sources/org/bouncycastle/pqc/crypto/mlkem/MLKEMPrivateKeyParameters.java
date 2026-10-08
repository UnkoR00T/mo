package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class MLKEMPrivateKeyParameters extends MLKEMKeyParameters {
    public static final int BOTH = 0;
    public static final int EXPANDED_KEY = 2;
    public static final int SEED_ONLY = 1;
    final byte[] hpk;
    final byte[] nonce;
    private final int prefFormat;
    final byte[] rho;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final byte[] f149511s;
    final byte[] seed;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final byte[] f149512t;

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr) {
        this(mLKEMParameters, bArr, null);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.f149511s, this.f149512t, this.rho, this.hpk, this.nonce});
    }

    public byte[] getHPK() {
        return Arrays.clone(this.hpk);
    }

    public byte[] getNonce() {
        return Arrays.clone(this.nonce);
    }

    public MLKEMPrivateKeyParameters getParametersWithFormat(int i15) {
        if (this.prefFormat == i15) {
            return this;
        }
        if (i15 == 0 || i15 == 1) {
            if (this.seed == null) {
                throw new IllegalStateException("no seed available");
            }
        } else if (i15 != 2) {
            throw new IllegalArgumentException("unknown format");
        }
        return new MLKEMPrivateKeyParameters(this, i15);
    }

    public int getPreferredFormat() {
        return this.prefFormat;
    }

    public byte[] getPublicKey() {
        return MLKEMPublicKeyParameters.getEncoded(this.f149512t, this.rho);
    }

    public MLKEMPublicKeyParameters getPublicKeyParameters() {
        return new MLKEMPublicKeyParameters(getParameters(), this.f149512t, this.rho);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS() {
        return Arrays.clone(this.f149511s);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public byte[] getT() {
        return Arrays.clone(this.f149512t);
    }

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, MLKEMPublicKeyParameters mLKEMPublicKeyParameters) {
        super(true, mLKEMParameters);
        MLKEMEngine engine = mLKEMParameters.getEngine();
        if (bArr.length == 64) {
            byte[][] bArrGenerateKemKeyPairInternal = engine.generateKemKeyPairInternal(Arrays.copyOfRange(bArr, 0, 32), Arrays.copyOfRange(bArr, 32, bArr.length));
            this.f149511s = bArrGenerateKemKeyPairInternal[2];
            this.hpk = bArrGenerateKemKeyPairInternal[3];
            this.nonce = bArrGenerateKemKeyPairInternal[4];
            this.f149512t = bArrGenerateKemKeyPairInternal[0];
            this.rho = bArrGenerateKemKeyPairInternal[1];
            this.seed = bArrGenerateKemKeyPairInternal[5];
        } else {
            this.f149511s = Arrays.copyOfRange(bArr, 0, engine.getKyberIndCpaSecretKeyBytes());
            int kyberIndCpaSecretKeyBytes = engine.getKyberIndCpaSecretKeyBytes();
            this.f149512t = Arrays.copyOfRange(bArr, kyberIndCpaSecretKeyBytes, (engine.getKyberIndCpaPublicKeyBytes() + kyberIndCpaSecretKeyBytes) - 32);
            int kyberIndCpaPublicKeyBytes = kyberIndCpaSecretKeyBytes + (engine.getKyberIndCpaPublicKeyBytes() - 32);
            int i15 = kyberIndCpaPublicKeyBytes + 32;
            this.rho = Arrays.copyOfRange(bArr, kyberIndCpaPublicKeyBytes, i15);
            int i16 = kyberIndCpaPublicKeyBytes + 64;
            this.hpk = Arrays.copyOfRange(bArr, i15, i16);
            this.nonce = Arrays.copyOfRange(bArr, i16, kyberIndCpaPublicKeyBytes + 96);
            this.seed = null;
        }
        if (mLKEMPublicKeyParameters != null && (!Arrays.constantTimeAreEqual(this.f149512t, mLKEMPublicKeyParameters.f149513t) || !Arrays.constantTimeAreEqual(this.rho, mLKEMPublicKeyParameters.rho))) {
            throw new IllegalArgumentException("passed in public key does not match private values");
        }
        this.prefFormat = this.seed != null ? 0 : 2;
    }

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(mLKEMParameters, bArr, bArr2, bArr3, bArr4, bArr5, null);
    }

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(true, mLKEMParameters);
        this.f149511s = Arrays.clone(bArr);
        this.hpk = Arrays.clone(bArr2);
        this.nonce = Arrays.clone(bArr3);
        this.f149512t = Arrays.clone(bArr4);
        this.rho = Arrays.clone(bArr5);
        this.seed = Arrays.clone(bArr6);
        this.prefFormat = 0;
    }

    private MLKEMPrivateKeyParameters(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters, int i15) {
        super(true, mLKEMPrivateKeyParameters.getParameters());
        this.f149511s = mLKEMPrivateKeyParameters.f149511s;
        this.f149512t = mLKEMPrivateKeyParameters.f149512t;
        this.rho = mLKEMPrivateKeyParameters.rho;
        this.hpk = mLKEMPrivateKeyParameters.hpk;
        this.nonce = mLKEMPrivateKeyParameters.nonce;
        this.seed = mLKEMPrivateKeyParameters.seed;
        this.prefFormat = i15;
    }
}
