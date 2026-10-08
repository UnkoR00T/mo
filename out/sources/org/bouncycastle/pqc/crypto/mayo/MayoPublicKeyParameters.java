package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class MayoPublicKeyParameters extends MayoKeyParameters {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f149500p;

    public MayoPublicKeyParameters(MayoParameters mayoParameters, byte[] bArr) {
        super(false, mayoParameters);
        this.f149500p = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f149500p);
    }

    public byte[] getP() {
        return Arrays.clone(this.f149500p);
    }
}
