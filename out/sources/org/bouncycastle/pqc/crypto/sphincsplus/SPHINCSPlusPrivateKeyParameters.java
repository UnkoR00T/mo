package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class SPHINCSPlusPrivateKeyParameters extends SPHINCSPlusKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    final PK f149609pk;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final SK f149610sk;

    SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, SK sk4, PK pk4) {
        super(true, sPHINCSPlusParameters);
        this.f149610sk = sk4;
        this.f149609pk = pk4;
    }

    public byte[] getEncoded() {
        SK sk4 = this.f149610sk;
        byte[] bArr = sk4.seed;
        byte[] bArr2 = sk4.prf;
        PK pk4 = this.f149609pk;
        return Arrays.concatenate(new byte[][]{bArr, bArr2, pk4.seed, pk4.root});
    }

    public byte[] getEncodedPublicKey() {
        PK pk4 = this.f149609pk;
        return Arrays.concatenate(pk4.seed, pk4.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.f149610sk.prf);
    }

    public byte[] getPublicKey() {
        PK pk4 = this.f149609pk;
        return Arrays.concatenate(pk4.seed, pk4.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f149609pk.seed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f149609pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f149610sk.seed);
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(true, sPHINCSPlusParameters);
        int n15 = sPHINCSPlusParameters.getN();
        int i15 = n15 * 4;
        if (bArr.length != i15) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i16 = n15 * 2;
        this.f149610sk = new SK(Arrays.copyOfRange(bArr, 0, n15), Arrays.copyOfRange(bArr, n15, i16));
        int i17 = n15 * 3;
        this.f149609pk = new PK(Arrays.copyOfRange(bArr, i16, i17), Arrays.copyOfRange(bArr, i17, i15));
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, sPHINCSPlusParameters);
        this.f149610sk = new SK(bArr, bArr2);
        this.f149609pk = new PK(bArr3, bArr4);
    }
}
