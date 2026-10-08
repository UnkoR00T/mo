package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f149286a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f149287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f149288q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f149287p = bigInteger;
        this.f149288q = bigInteger2;
        this.f149286a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            if (this.f149286a.equals(gOST3410PublicKeyParameterSetSpec.f149286a) && this.f149287p.equals(gOST3410PublicKeyParameterSetSpec.f149287p) && this.f149288q.equals(gOST3410PublicKeyParameterSetSpec.f149288q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f149286a;
    }

    public BigInteger getP() {
        return this.f149287p;
    }

    public BigInteger getQ() {
        return this.f149288q;
    }

    public int hashCode() {
        return (this.f149286a.hashCode() ^ this.f149287p.hashCode()) ^ this.f149288q.hashCode();
    }
}
