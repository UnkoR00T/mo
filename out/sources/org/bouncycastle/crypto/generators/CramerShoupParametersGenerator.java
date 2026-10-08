package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.CramerShoupParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class CramerShoupParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private int certainty;
    private SecureRandom random;
    private int size;

    private static class ParametersHelper {
        private static final BigInteger TWO = BigInteger.valueOf(2);

        private ParametersHelper() {
        }

        static BigInteger[] generateSafePrimes(int i15, int i16, SecureRandom secureRandom) {
            BigInteger bigIntegerCreateRandomPrime;
            BigInteger bigIntegerAdd;
            int i17 = i15 - 1;
            while (true) {
                bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i17, 2, secureRandom);
                bigIntegerAdd = bigIntegerCreateRandomPrime.shiftLeft(1).add(CramerShoupParametersGenerator.ONE);
                if (bigIntegerAdd.isProbablePrime(i16) && (i16 <= 2 || bigIntegerCreateRandomPrime.isProbablePrime(i16))) {
                    break;
                }
            }
            return new BigInteger[]{bigIntegerAdd, bigIntegerCreateRandomPrime};
        }

        static BigInteger selectGenerator(BigInteger bigInteger, SecureRandom secureRandom) {
            BigInteger bigIntegerModPow;
            BigInteger bigIntegerSubtract = bigInteger.subtract(TWO);
            do {
                BigInteger bigInteger2 = TWO;
                bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger2, bigIntegerSubtract, secureRandom).modPow(bigInteger2, bigInteger);
            } while (bigIntegerModPow.equals(CramerShoupParametersGenerator.ONE));
            return bigIntegerModPow;
        }
    }

    public CramerShoupParameters generateParameters() {
        BigInteger bigIntegerSelectGenerator;
        BigInteger bigInteger = ParametersHelper.generateSafePrimes(this.size, this.certainty, this.random)[1];
        BigInteger bigIntegerSelectGenerator2 = ParametersHelper.selectGenerator(bigInteger, this.random);
        do {
            bigIntegerSelectGenerator = ParametersHelper.selectGenerator(bigInteger, this.random);
        } while (bigIntegerSelectGenerator2.equals(bigIntegerSelectGenerator));
        return new CramerShoupParameters(bigInteger, bigIntegerSelectGenerator2, bigIntegerSelectGenerator, SHA256Digest.newInstance());
    }

    public void init(int i15, int i16, SecureRandom secureRandom) {
        this.size = i15;
        this.certainty = i16;
        this.random = secureRandom;
    }

    public CramerShoupParameters generateParameters(DHParameters dHParameters) {
        BigInteger bigIntegerSelectGenerator;
        BigInteger p15 = dHParameters.getP();
        BigInteger g15 = dHParameters.getG();
        do {
            bigIntegerSelectGenerator = ParametersHelper.selectGenerator(p15, this.random);
        } while (g15.equals(bigIntegerSelectGenerator));
        return new CramerShoupParameters(p15, g15, bigIntegerSelectGenerator, SHA256Digest.newInstance());
    }
}
