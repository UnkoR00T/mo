package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    byte[] f149185iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f149185iv = bArr2;
    }

    public byte[] getIV() {
        return this.f149185iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
