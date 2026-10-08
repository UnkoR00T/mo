package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class DSAKeyParameters extends AsymmetricKeyParameter {
    private DSAParameters params;

    public DSAKeyParameters(boolean z15, DSAParameters dSAParameters) {
        super(z15);
        this.params = dSAParameters;
    }

    public DSAParameters getParameters() {
        return this.params;
    }
}
