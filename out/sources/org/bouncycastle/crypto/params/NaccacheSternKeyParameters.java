package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f149186g;
    int lowerSigmaBound;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BigInteger f149187n;

    public NaccacheSternKeyParameters(boolean z15, BigInteger bigInteger, BigInteger bigInteger2, int i15) {
        super(z15);
        this.f149186g = bigInteger;
        this.f149187n = bigInteger2;
        this.lowerSigmaBound = i15;
    }

    public BigInteger getG() {
        return this.f149186g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f149187n;
    }
}
