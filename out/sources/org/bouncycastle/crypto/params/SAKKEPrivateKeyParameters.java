package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class SAKKEPrivateKeyParameters extends AsymmetricKeyParameter {
    private static final BigInteger qMinOne = SAKKEPublicKeyParameters.f149197q.subtract(BigInteger.ONE);
    private final SAKKEPublicKeyParameters publicParams;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final BigInteger f149193z;

    public SAKKEPrivateKeyParameters(BigInteger bigInteger, SAKKEPublicKeyParameters sAKKEPublicKeyParameters) {
        super(true);
        this.f149193z = bigInteger;
        this.publicParams = sAKKEPublicKeyParameters;
        if (!sAKKEPublicKeyParameters.getPoint().multiply(bigInteger).normalize().equals(sAKKEPublicKeyParameters.getZ())) {
            throw new IllegalStateException("public key and private key of SAKKE do not match");
        }
    }

    public BigInteger getMasterSecret() {
        return this.f149193z;
    }

    public SAKKEPublicKeyParameters getPublicParams() {
        return this.publicParams;
    }

    public SAKKEPrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        BigInteger bigInteger = BigIntegers.TWO;
        BigInteger bigInteger2 = qMinOne;
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger, bigInteger2, secureRandom);
        this.f149193z = bigIntegerCreateRandomInRange;
        this.publicParams = new SAKKEPublicKeyParameters(BigIntegers.createRandomInRange(bigInteger, bigInteger2, secureRandom), SAKKEPublicKeyParameters.P.multiply(bigIntegerCreateRandomInRange).normalize());
    }
}
