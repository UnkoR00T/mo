package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class DilithiumPrivateKeyParameters extends DilithiumKeyParameters {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final byte[] f149442k;
    final byte[] rho;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    final byte[] f149443s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    final byte[] f149444s2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    final byte[] f149445t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private final byte[] f149446t1;

    /* JADX INFO: renamed from: tr, reason: collision with root package name */
    final byte[] f149447tr;

    public DilithiumPrivateKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, DilithiumPublicKeyParameters dilithiumPublicKeyParameters) {
        super(true, dilithiumParameters);
        DilithiumEngine engine = dilithiumParameters.getEngine(null);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        this.f149442k = Arrays.copyOfRange(bArr, 32, 64);
        this.f149447tr = Arrays.copyOfRange(bArr, 64, 128);
        int dilithiumL = (engine.getDilithiumL() * engine.getDilithiumPolyEtaPackedBytes()) + 128;
        this.f149443s1 = Arrays.copyOfRange(bArr, 128, dilithiumL);
        int dilithiumK = (engine.getDilithiumK() * engine.getDilithiumPolyEtaPackedBytes()) + dilithiumL;
        this.f149444s2 = Arrays.copyOfRange(bArr, dilithiumL, dilithiumK);
        this.f149445t0 = Arrays.copyOfRange(bArr, dilithiumK, (engine.getDilithiumK() * 416) + dilithiumK);
        if (dilithiumPublicKeyParameters != null) {
            this.f149446t1 = dilithiumPublicKeyParameters.getT1();
        } else {
            this.f149446t1 = null;
        }
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.rho, this.f149442k, this.f149447tr, this.f149443s1, this.f149444s2, this.f149445t0});
    }

    public byte[] getK() {
        return Arrays.clone(this.f149442k);
    }

    @Deprecated
    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getPublicKey() {
        return DilithiumPublicKeyParameters.getEncoded(this.rho, this.f149446t1);
    }

    public DilithiumPublicKeyParameters getPublicKeyParameters() {
        return new DilithiumPublicKeyParameters(getParameters(), this.rho, this.f149446t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS1() {
        return Arrays.clone(this.f149443s1);
    }

    public byte[] getS2() {
        return Arrays.clone(this.f149444s2);
    }

    public byte[] getT0() {
        return Arrays.clone(this.f149445t0);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f149446t1);
    }

    public byte[] getTr() {
        return Arrays.clone(this.f149447tr);
    }

    public DilithiumPrivateKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, dilithiumParameters);
        this.rho = Arrays.clone(bArr);
        this.f149442k = Arrays.clone(bArr2);
        this.f149447tr = Arrays.clone(bArr3);
        this.f149443s1 = Arrays.clone(bArr4);
        this.f149444s2 = Arrays.clone(bArr5);
        this.f149445t0 = Arrays.clone(bArr6);
        this.f149446t1 = Arrays.clone(bArr7);
    }
}
