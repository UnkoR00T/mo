package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes5.dex */
public class AESWrapEngine extends RFC3394WrapEngine {
    public AESWrapEngine() {
        super(AESEngine.newInstance());
    }

    public AESWrapEngine(boolean z15) {
        super(AESEngine.newInstance(), z15);
    }
}
