package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class MLKEMPublicKeyParameters extends MLKEMKeyParameters {
    final byte[] rho;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final byte[] f149513t;

    public MLKEMPublicKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr) {
        super(false, mLKEMParameters);
        MLKEMEngine engine = mLKEMParameters.getEngine();
        if (bArr.length != engine.getKyberIndCpaPublicKeyBytes()) {
            throw new IllegalArgumentException("'encoding' has invalid length");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - 32);
        this.f149513t = bArrCopyOfRange;
        this.rho = Arrays.copyOfRange(bArr, bArr.length - 32, bArr.length);
        if (!engine.checkModulus(bArrCopyOfRange)) {
            throw new IllegalArgumentException("Modulus check failed for ML-KEM public key");
        }
    }

    public byte[] getEncoded() {
        return getEncoded(this.f149513t, this.rho);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT() {
        return Arrays.clone(this.f149513t);
    }

    public MLKEMPublicKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, byte[] bArr2) {
        super(false, mLKEMParameters);
        MLKEMEngine engine = mLKEMParameters.getEngine();
        if (bArr.length != engine.getKyberPolyVecBytes()) {
            throw new IllegalArgumentException("'t' has invalid length");
        }
        if (bArr2.length != 32) {
            throw new IllegalArgumentException("'rho' has invalid length");
        }
        byte[] bArrClone = Arrays.clone(bArr);
        this.f149513t = bArrClone;
        this.rho = Arrays.clone(bArr2);
        if (!engine.checkModulus(bArrClone)) {
            throw new IllegalArgumentException("Modulus check failed for ML-KEM public key");
        }
    }

    static byte[] getEncoded(byte[] bArr, byte[] bArr2) {
        return Arrays.concatenate(bArr, bArr2);
    }
}
