package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f149171a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f149172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f149173q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f149172p = bigInteger;
        this.f149173q = bigInteger2;
        this.f149171a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f149172p) && gOST3410Parameters.getQ().equals(this.f149173q) && gOST3410Parameters.getA().equals(this.f149171a);
    }

    public BigInteger getA() {
        return this.f149171a;
    }

    public BigInteger getP() {
        return this.f149172p;
    }

    public BigInteger getQ() {
        return this.f149173q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f149172p.hashCode() ^ this.f149173q.hashCode()) ^ this.f149171a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f149171a = bigInteger3;
        this.f149172p = bigInteger;
        this.f149173q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}
