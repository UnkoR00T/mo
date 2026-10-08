package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class SLHDSAPrivateKeyParameters extends SLHDSAKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    final PK f149569pk;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final SK f149570sk;

    SLHDSAPrivateKeyParameters(SLHDSAParameters sLHDSAParameters, SK sk4, PK pk4) {
        super(true, sLHDSAParameters);
        this.f149570sk = sk4;
        this.f149569pk = pk4;
    }

    public byte[] getEncoded() {
        SK sk4 = this.f149570sk;
        byte[] bArr = sk4.seed;
        byte[] bArr2 = sk4.prf;
        PK pk4 = this.f149569pk;
        return Arrays.concatenate(new byte[][]{bArr, bArr2, pk4.seed, pk4.root});
    }

    public byte[] getEncodedPublicKey() {
        PK pk4 = this.f149569pk;
        return Arrays.concatenate(pk4.seed, pk4.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.f149570sk.prf);
    }

    public byte[] getPublicKey() {
        PK pk4 = this.f149569pk;
        return Arrays.concatenate(pk4.seed, pk4.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f149569pk.seed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f149569pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f149570sk.seed);
    }

    public SLHDSAPrivateKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(true, sLHDSAParameters);
        int n15 = sLHDSAParameters.getN();
        int i15 = n15 * 4;
        if (bArr.length != i15) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i16 = n15 * 2;
        this.f149570sk = new SK(Arrays.copyOfRange(bArr, 0, n15), Arrays.copyOfRange(bArr, n15, i16));
        int i17 = n15 * 3;
        this.f149569pk = new PK(Arrays.copyOfRange(bArr, i16, i17), Arrays.copyOfRange(bArr, i17, i15));
    }

    public SLHDSAPrivateKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, sLHDSAParameters);
        this.f149570sk = new SK(bArr, bArr2);
        this.f149569pk = new PK(bArr3, bArr4);
    }
}
