package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class DHDomainParameterSpec extends DHParameterSpec {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final BigInteger f149254j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f149255m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final BigInteger f149256q;
    private DHValidationParameters validationParameters;

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, 0);
    }

    public DHParameters getDomainParameters() {
        return new DHParameters(getP(), getG(), this.f149256q, this.f149255m, getL(), this.f149254j, this.validationParameters);
    }

    public BigInteger getJ() {
        return this.f149254j;
    }

    public int getM() {
        return this.f149255m;
    }

    public BigInteger getQ() {
        return this.f149256q;
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i15) {
        this(bigInteger, bigInteger2, bigInteger3, null, i15);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i15) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i15);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i15, int i16) {
        super(bigInteger, bigInteger3, i16);
        this.f149256q = bigInteger2;
        this.f149254j = bigInteger4;
        this.f149255m = i15;
    }

    public DHDomainParameterSpec(DHParameters dHParameters) {
        this(dHParameters.getP(), dHParameters.getQ(), dHParameters.getG(), dHParameters.getJ(), dHParameters.getM(), dHParameters.getL());
        this.validationParameters = dHParameters.getValidationParameters();
    }
}
