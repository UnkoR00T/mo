package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class CompositeSignatureSpec implements AlgorithmParameterSpec {
    private final boolean isPrehashMode;
    private final AlgorithmParameterSpec secondaryParameterSpec;

    public CompositeSignatureSpec(boolean z15) {
        this(z15, null);
    }

    public AlgorithmParameterSpec getSecondarySpec() {
        return this.secondaryParameterSpec;
    }

    public boolean isPrehashMode() {
        return this.isPrehashMode;
    }

    public CompositeSignatureSpec(boolean z15, AlgorithmParameterSpec algorithmParameterSpec) {
        this.isPrehashMode = z15;
        this.secondaryParameterSpec = algorithmParameterSpec;
    }
}
