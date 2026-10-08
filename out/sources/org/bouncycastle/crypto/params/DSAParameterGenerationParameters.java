package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f149152l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f149153n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i15, int i16, int i17, SecureRandom secureRandom) {
        this(i15, i16, i17, secureRandom, -1);
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.f149152l;
    }

    public int getN() {
        return this.f149153n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public DSAParameterGenerationParameters(int i15, int i16, int i17, SecureRandom secureRandom, int i18) {
        this.f149152l = i15;
        this.f149153n = i16;
        this.certainty = i17;
        this.usageIndex = i18;
        this.random = secureRandom;
    }
}
