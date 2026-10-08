package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes5.dex */
public class MayoKeyParameters extends AsymmetricKeyParameter {
    private final MayoParameters params;

    public MayoKeyParameters(boolean z15, MayoParameters mayoParameters) {
        super(z15);
        this.params = mayoParameters;
    }

    public MayoParameters getParameters() {
        return this.params;
    }
}
