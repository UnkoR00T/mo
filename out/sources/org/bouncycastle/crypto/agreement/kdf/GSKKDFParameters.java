package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class GSKKDFParameters implements DerivationParameters {
    private final byte[] nonce;
    private final int startCounter;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final byte[] f148952z;

    public GSKKDFParameters(byte[] bArr, int i15) {
        this(bArr, i15, null);
    }

    public byte[] getNonce() {
        return this.nonce;
    }

    public int getStartCounter() {
        return this.startCounter;
    }

    public byte[] getZ() {
        return this.f148952z;
    }

    public GSKKDFParameters(byte[] bArr, int i15, byte[] bArr2) {
        this.f148952z = bArr;
        this.startCounter = i15;
        this.nonce = bArr2;
    }
}
