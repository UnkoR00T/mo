package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
class DHKeyGeneratorHelper {
    static final DHKeyGeneratorHelper INSTANCE = new DHKeyGeneratorHelper();
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    private DHKeyGeneratorHelper() {
    }

    BigInteger calculatePrivate(DHParameters dHParameters, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomInRange;
        BigInteger bit;
        int l15 = dHParameters.getL();
        if (l15 != 0) {
            int i15 = l15 >>> 2;
            do {
                bit = BigIntegers.createRandomBigInteger(l15, secureRandom).setBit(l15 - 1);
            } while (WNafUtil.getNafWeight(bit) < i15);
            return bit;
        }
        BigInteger bigInteger = TWO;
        int m15 = dHParameters.getM();
        BigInteger bigIntegerShiftLeft = m15 != 0 ? ONE.shiftLeft(m15 - 1) : bigInteger;
        BigInteger q15 = dHParameters.getQ();
        if (q15 == null) {
            q15 = dHParameters.getP();
        }
        BigInteger bigIntegerSubtract = q15.subtract(bigInteger);
        int iBitLength = bigIntegerSubtract.bitLength() >>> 2;
        do {
            bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigIntegerShiftLeft, bigIntegerSubtract, secureRandom);
        } while (WNafUtil.getNafWeight(bigIntegerCreateRandomInRange) < iBitLength);
        return bigIntegerCreateRandomInRange;
    }

    BigInteger calculatePublic(DHParameters dHParameters, BigInteger bigInteger) {
        return dHParameters.getG().modPow(bigInteger, dHParameters.getP());
    }
}
