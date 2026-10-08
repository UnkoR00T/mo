package org.bouncycastle.jcajce.provider.asymmetric.util;

/* JADX INFO: loaded from: classes5.dex */
public class PrimeCertaintyCalculator {
    private PrimeCertaintyCalculator() {
    }

    public static int getDefaultCertainty(int i15) {
        if (i15 <= 1024) {
            return 80;
        }
        return (((i15 - 1) / 1024) * 16) + 96;
    }
}
