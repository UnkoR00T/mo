package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class HQCPrivateKeyParameters extends HQCKeyParameters {

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final byte[] f149476sk;

    public HQCPrivateKeyParameters(HQCParameters hQCParameters, byte[] bArr) {
        super(true, hQCParameters);
        this.f149476sk = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f149476sk);
    }

    public byte[] getPrivateKey() {
        return Arrays.clone(this.f149476sk);
    }
}
