package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes5.dex */
public class HQCKeyParameters extends AsymmetricKeyParameter {
    private final HQCParameters params;

    public HQCKeyParameters(boolean z15, HQCParameters hQCParameters) {
        super(z15);
        this.params = hQCParameters;
    }

    public HQCParameters getParameters() {
        return this.params;
    }
}
