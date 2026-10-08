package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f149278g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f149279p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f149279p = bigInteger;
        this.f149278g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f149278g;
    }

    public BigInteger getP() {
        return this.f149279p;
    }
}
