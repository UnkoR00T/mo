package org.bouncycastle.crypto.generators;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes5.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, CertificateBody.profileType, 131, 137, 139, 149, 151, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i15) {
        Vector vector = new Vector(i15);
        for (int i16 = 0; i16 != i15; i16++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i16]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i15, int i16, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i15, i16, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i15);
        return bigIntegerCreateRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i15) {
        int iNextInt;
        int i16;
        if (((-i15) & i15) == i15) {
            return (int) ((((long) i15) * ((long) (secureRandom.nextInt() & Integer.MAX_VALUE))) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i16 = iNextInt % i15;
        } while ((iNextInt - i16) + (i15 - 1) < 0);
        return i16;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i15 = 0; i15 < vector.size(); i15++) {
            vector3.addElement(vector.elementAt(i15));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j15;
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        boolean z15;
        BigInteger bigInteger;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger2;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigIntegerMod;
        BigInteger bigInteger5;
        BigInteger bigInteger6;
        PrintStream printStream;
        StringBuilder sb5;
        String str;
        int i15;
        BigInteger bigIntegerCreateRandomPrime;
        SecureRandom secureRandom;
        int i16;
        BigInteger bigInteger7;
        BigInteger bigInteger8;
        int i17;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply2 = ONE;
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2;
        for (int i18 = 0; i18 < vectorPermuteList.size() / 2; i18++) {
            bigIntegerMultiply3 = bigIntegerMultiply3.multiply((BigInteger) vectorPermuteList.elementAt(i18));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply4 = bigIntegerMultiply3.multiply(bigIntegerMultiply2);
        int iBitLength = (((strength - bigIntegerMultiply4.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply3).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply2).shiftLeft(1);
        long j16 = 0;
        while (true) {
            j15 = j16 + 1;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        bigIntegerGeneratePrime2 = generatePrime(24, certainty, random);
                    } while (bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2));
                    BigInteger bigIntegerMultiply5 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    z15 = zIsDebug;
                    bigInteger = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply5.add(bigInteger);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    zIsDebug = z15;
                }
                bigInteger2 = bigIntegerShiftLeft2;
                if (BigIntegers.modOddIsCoprime(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2), bigIntegerMultiply4)) {
                    BigInteger bigInteger9 = bigIntegerShiftLeft;
                    bigIntegerMultiply = bigIntegerAdd.multiply(bigIntegerAdd2);
                    bigInteger3 = bigInteger9;
                    if (bigIntegerMultiply.bitLength() >= strength) {
                        break;
                    }
                    int i19 = strength;
                    random = random;
                    certainty = certainty;
                    bigInteger7 = bigIntegerGeneratePrime3;
                    bigInteger8 = bigIntegerGeneratePrime4;
                    if (z15) {
                        PrintStream printStream2 = System.out;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("key size too small. Should be ");
                        i17 = i19;
                        sb6.append(i17);
                        sb6.append(" but is actually ");
                        sb6.append(bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                        printStream2.println(sb6.toString());
                    } else {
                        i17 = i19;
                    }
                }
                strength = i17;
                bigIntegerGeneratePrime3 = bigInteger7;
                bigIntegerGeneratePrime4 = bigInteger8;
                j16 = j15;
                zIsDebug = z15;
                bigIntegerShiftLeft2 = bigInteger2;
                bigIntegerShiftLeft = bigInteger3;
                random = random;
                certainty = certainty;
            } else {
                z15 = zIsDebug;
                bigInteger2 = bigIntegerShiftLeft2;
            }
            bigInteger3 = bigIntegerShiftLeft;
            bigInteger8 = bigIntegerGeneratePrime4;
            bigInteger7 = bigIntegerGeneratePrime3;
            i17 = strength;
            strength = i17;
            bigIntegerGeneratePrime3 = bigInteger7;
            bigIntegerGeneratePrime4 = bigInteger8;
            j16 = j15;
            zIsDebug = z15;
            bigIntegerShiftLeft2 = bigInteger2;
            bigIntegerShiftLeft = bigInteger3;
            random = random;
            certainty = certainty;
        }
        BigInteger bigInteger10 = bigIntegerGeneratePrime4;
        if (z15) {
            System.out.println("needed " + j15 + " tries to generate p and q.");
        }
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger).multiply(bigIntegerAdd2.subtract(bigInteger));
        if (z15) {
            System.out.println("generating g");
        }
        long j17 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger4 = bigIntegerAdd2;
            int i25 = 0;
            while (i25 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i25));
                while (true) {
                    j17++;
                    i15 = i25;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    secureRandom = random;
                    i16 = certainty;
                    if (bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply).equals(ONE)) {
                        i25 = i15;
                        random = secureRandom;
                        certainty = i16;
                    }
                }
                vector.addElement(bigIntegerCreateRandomPrime);
                i25 = i15 + 1;
                random = secureRandom;
                certainty = i16;
            }
            SecureRandom secureRandom2 = random;
            int i26 = certainty;
            bigIntegerMod = ONE;
            for (int i27 = 0; i27 < vectorPermuteList.size(); i27++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i27)).modPow(bigIntegerMultiply4.divide((BigInteger) vectorPermuteList.elementAt(i27)), bigIntegerMultiply)).mod(bigIntegerMultiply);
            }
            int i28 = 0;
            while (true) {
                if (i28 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply);
                    BigInteger bigInteger11 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger11)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply).equals(bigInteger11)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply).equals(bigInteger11)) {
                                bigInteger5 = bigIntegerGeneratePrime3;
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger5), bigIntegerMultiply).equals(bigInteger11)) {
                                    bigInteger6 = bigInteger10;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger6), bigIntegerMultiply).equals(bigInteger11)) {
                                        break;
                                    }
                                    if (z15) {
                                        System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    }
                                } else {
                                    if (z15) {
                                        System.out.println("g has order phi(n)/a\n g: " + bigIntegerMod);
                                    }
                                    bigInteger6 = bigInteger10;
                                }
                            } else if (z15) {
                                printStream = System.out;
                                sb5 = new StringBuilder();
                                str = "g has order phi(n)/q'\n g: ";
                                sb5.append(str);
                                sb5.append(bigIntegerMod);
                                printStream.println(sb5.toString());
                            }
                        } else if (z15) {
                            printStream = System.out;
                            sb5 = new StringBuilder();
                            str = "g has order phi(n)/p'\n g: ";
                            sb5.append(str);
                            sb5.append(bigIntegerMod);
                            printStream.println(sb5.toString());
                        }
                    } else if (z15) {
                        printStream = System.out;
                        sb5 = new StringBuilder();
                        str = "g has order phi(n)/4\n g:";
                        sb5.append(str);
                        sb5.append(bigIntegerMod);
                        printStream.println(sb5.toString());
                    }
                    bigIntegerGeneratePrime3 = bigInteger5;
                    strength = strength;
                    random = secureRandom2;
                    certainty = i26;
                    bigInteger10 = bigInteger6;
                    bigIntegerAdd2 = bigInteger4;
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i28)), bigIntegerMultiply).equals(ONE)) {
                    i28++;
                } else if (z15) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i28) + "\n g: " + bigIntegerMod);
                }
                bigInteger6 = bigInteger10;
                bigInteger5 = bigIntegerGeneratePrime3;
                bigIntegerGeneratePrime3 = bigInteger5;
                strength = strength;
                random = secureRandom2;
                certainty = i26;
                bigInteger10 = bigInteger6;
                bigIntegerAdd2 = bigInteger4;
            }
        }
        if (z15) {
            System.out.println("needed " + j17 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply4 + " (" + bigIntegerMultiply4.bitLength() + " bits)");
            PrintStream printStream3 = System.out;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("a:.......... ");
            sb7.append(bigInteger5);
            printStream3.println(sb7.toString());
            System.out.println("b:.......... " + bigInteger6);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigIntegerAdd);
            System.out.println("q:.......... " + bigInteger4);
            System.out.println("n:.......... " + bigIntegerMultiply);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }
}
