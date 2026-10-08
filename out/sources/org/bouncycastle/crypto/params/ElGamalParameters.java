package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f149166g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f149167l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f149168p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f149168p) && elGamalParameters.getG().equals(this.f149166g) && elGamalParameters.getL() == this.f149167l;
    }

    public BigInteger getG() {
        return this.f149166g;
    }

    public int getL() {
        return this.f149167l;
    }

    public BigInteger getP() {
        return this.f149168p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f149167l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i15) {
        this.f149166g = bigInteger2;
        this.f149168p = bigInteger;
        this.f149167l = i15;
    }
}
