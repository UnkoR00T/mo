package org.bouncycastle.jcajce.spec;

/* JADX INFO: loaded from: classes5.dex */
public class KEMParameterSpec extends KTSParameterSpec {
    public KEMParameterSpec(String str) {
        this(str, 256);
    }

    public int getKeySizeInBits() {
        return getKeySize();
    }

    public KEMParameterSpec(String str, int i15) {
        super(str, i15, null, null, null);
    }
}
