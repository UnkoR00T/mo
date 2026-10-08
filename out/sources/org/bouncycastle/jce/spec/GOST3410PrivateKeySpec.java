package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f149282a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f149283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f149284q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f149285x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f149285x = bigInteger;
        this.f149283p = bigInteger2;
        this.f149284q = bigInteger3;
        this.f149282a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f149282a;
    }

    public BigInteger getP() {
        return this.f149283p;
    }

    public BigInteger getQ() {
        return this.f149284q;
    }

    public BigInteger getX() {
        return this.f149285x;
    }
}
