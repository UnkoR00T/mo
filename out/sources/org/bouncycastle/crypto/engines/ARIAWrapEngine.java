package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes5.dex */
public class ARIAWrapEngine extends RFC3394WrapEngine {
    public ARIAWrapEngine() {
        super(new ARIAEngine());
    }

    public ARIAWrapEngine(boolean z15) {
        super(new ARIAEngine(), z15);
    }
}
