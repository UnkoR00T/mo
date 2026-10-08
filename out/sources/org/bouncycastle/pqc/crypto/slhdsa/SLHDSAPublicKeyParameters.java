package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class SLHDSAPublicKeyParameters extends SLHDSAKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private final PK f149571pk;

    SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, PK pk4) {
        super(false, sLHDSAParameters);
        this.f149571pk = pk4;
    }

    public byte[] getEncoded() {
        PK pk4 = this.f149571pk;
        return Arrays.concatenate(pk4.seed, pk4.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f149571pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f149571pk.seed);
    }

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(false, sLHDSAParameters);
        int n15 = sLHDSAParameters.getN();
        int i15 = n15 * 2;
        if (bArr.length != i15) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f149571pk = new PK(Arrays.copyOfRange(bArr, 0, n15), Arrays.copyOfRange(bArr, n15, i15));
    }
}
