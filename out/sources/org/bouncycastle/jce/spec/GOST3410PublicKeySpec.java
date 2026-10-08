package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f149289a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f149290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f149291q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f149292y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f149292y = bigInteger;
        this.f149290p = bigInteger2;
        this.f149291q = bigInteger3;
        this.f149289a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f149289a;
    }

    public BigInteger getP() {
        return this.f149290p;
    }

    public BigInteger getQ() {
        return this.f149291q;
    }

    public BigInteger getY() {
        return this.f149292y;
    }
}
