package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class SPHINCSPlusPublicKeyParameters extends SPHINCSPlusKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private final PK f149611pk;

    SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, PK pk4) {
        super(false, sPHINCSPlusParameters);
        this.f149611pk = pk4;
    }

    public byte[] getEncoded() {
        PK pk4 = this.f149611pk;
        return Arrays.concatenate(pk4.seed, pk4.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f149611pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f149611pk.seed);
    }

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(false, sPHINCSPlusParameters);
        int n15 = sPHINCSPlusParameters.getN();
        int i15 = n15 * 2;
        if (bArr.length != i15) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f149611pk = new PK(Arrays.copyOfRange(bArr, 0, n15), Arrays.copyOfRange(bArr, n15, i15));
    }
}
