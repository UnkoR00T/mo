package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class DSASigner implements DSAExt {
    private final DSAKCalculator kCalculator;
    private DSAKeyParameters key;
    private SecureRandom random;

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    private BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int iBitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
        return new BigInteger(1, bArr2);
    }

    private BigInteger getRandomizer(BigInteger bigInteger, SecureRandom secureRandom) {
        return BigIntegers.createRandomBigInteger(7, CryptoServicesRegistrar.getSecureRandom(secureRandom)).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q15 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q15, bArr);
        BigInteger x15 = ((DSAPrivateKeyParameters) this.key).getX();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(q15, x15, bArr);
        } else {
            this.kCalculator.init(q15, this.random);
        }
        BigInteger bigIntegerNextK = this.kCalculator.nextK();
        BigInteger bigIntegerMod = parameters.getG().modPow(bigIntegerNextK.add(getRandomizer(q15, this.random)), parameters.getP()).mod(q15);
        return new BigInteger[]{bigIntegerMod, BigIntegers.modOddInverse(q15, bigIntegerNextK).multiply(bigIntegerCalculateE.add(x15.multiply(bigIntegerMod))).mod(q15)};
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getQ();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z15, CipherParameters cipherParameters) {
        DSAKeyParameters dSAKeyParameters;
        SecureRandom random;
        boolean z16;
        if (z15) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
            } else {
                dSAKeyParameters = (DSAPrivateKeyParameters) cipherParameters;
            }
            CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DSA", this.key, z15));
            if (z15 || this.kCalculator.isDeterministic()) {
                z16 = false;
            } else {
                z16 = true;
            }
            this.random = initSecureRandom(z16, random);
        }
        dSAKeyParameters = (DSAPublicKeyParameters) cipherParameters;
        this.key = dSAKeyParameters;
        random = null;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DSA", this.key, z15));
        if (z15) {
            z16 = false;
        } else {
            z16 = false;
        }
        this.random = initSecureRandom(z16, random);
    }

    protected SecureRandom initSecureRandom(boolean z15, SecureRandom secureRandom) {
        if (z15) {
            return CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q15 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q15, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || q15.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || q15.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModOddInverseVar = BigIntegers.modOddInverseVar(q15, bigInteger2);
        BigInteger bigIntegerMod = bigIntegerCalculateE.multiply(bigIntegerModOddInverseVar).mod(q15);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModOddInverseVar).mod(q15);
        BigInteger p15 = parameters.getP();
        return parameters.getG().modPow(bigIntegerMod, p15).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(bigIntegerMod2, p15)).mod(p15).mod(q15).equals(bigInteger);
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
