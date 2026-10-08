package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f149144g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BigInteger f149145j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f149146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f149147m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f149148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f149149q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    private static int getDefaultMParam(int i15) {
        return (i15 != 0 && i15 < DEFAULT_MINIMUM_LENGTH) ? i15 : DEFAULT_MINIMUM_LENGTH;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHParameters)) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.f149148p) && dHParameters.getG().equals(this.f149144g);
    }

    public BigInteger getG() {
        return this.f149144g;
    }

    public BigInteger getJ() {
        return this.f149145j;
    }

    public int getL() {
        return this.f149146l;
    }

    public int getM() {
        return this.f149147m;
    }

    public BigInteger getP() {
        return this.f149148p;
    }

    public BigInteger getQ() {
        return this.f149149q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i15) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i15), i15, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i15, int i16) {
        this(bigInteger, bigInteger2, bigInteger3, i15, i16, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i15, int i16, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i16 != 0) {
            if (i16 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i16 < i15) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i15 > bigInteger.bitLength() && !Properties.isOverrideSet("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f149144g = bigInteger2;
        this.f149148p = bigInteger;
        this.f149149q = bigInteger3;
        this.f149147m = i15;
        this.f149146l = i16;
        this.f149145j = bigInteger4;
        this.validation = dHValidationParameters;
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, DEFAULT_MINIMUM_LENGTH, 0, bigInteger4, dHValidationParameters);
    }
}
