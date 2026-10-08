package org.bouncycastle.crypto.tls;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public abstract class TlsRsaKeyExchange {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    public static final int PRE_MASTER_SECRET_LENGTH = 48;

    private TlsRsaKeyExchange() {
    }

    private static int caddTo(int i15, int i16, byte[] bArr, byte[] bArr2) {
        int i17 = i16 & GF2Field.MASK;
        int i18 = 0;
        for (int i19 = i15 - 1; i19 >= 0; i19--) {
            int i25 = i18 + (bArr2[i19] & 255) + (bArr[i19] & i17);
            bArr2[i19] = (byte) i25;
            i18 = i25 >>> 8;
        }
        return i18;
    }

    private static int checkPkcs1Encoding2(byte[] bArr, int i15, int i16) {
        int i17 = (i15 - i16) - 10;
        int length = bArr.length - i15;
        int length2 = (bArr.length - 1) - i16;
        for (int i18 = 0; i18 < length; i18++) {
            i17 |= -(bArr[i18] & GF2Field.MASK);
        }
        int i19 = -((bArr[length] & GF2Field.MASK) ^ 2);
        while (true) {
            i19 |= i17;
            length++;
            if (length >= length2) {
                return ((-(bArr[length2] & GF2Field.MASK)) | i19) >> 31;
            }
            i17 = (bArr[length] & GF2Field.MASK) - 1;
        }
    }

    private static BigInteger convertInput(BigInteger bigInteger, byte[] bArr, int i15, int i16) {
        BigInteger bigIntegerFromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, i15, i16);
        if (bigIntegerFromUnsignedByteArray.compareTo(bigInteger) < 0) {
            return bigIntegerFromUnsignedByteArray;
        }
        throw new DataLengthException("input too large for RSA cipher.");
    }

    public static byte[] decryptPreMasterSecret(byte[] bArr, int i15, int i16, RSAKeyParameters rSAKeyParameters, int i17, SecureRandom secureRandom) {
        if (bArr == null || i16 < 1 || i16 > getInputLimit(rSAKeyParameters) || i15 < 0 || i15 > bArr.length - i16) {
            throw new IllegalArgumentException("input not a valid EncryptedPreMasterSecret");
        }
        if (!rSAKeyParameters.isPrivate()) {
            throw new IllegalArgumentException("'privateKey' must be an RSA private key");
        }
        BigInteger modulus = rSAKeyParameters.getModulus();
        int iBitLength = modulus.bitLength();
        if (iBitLength < 512) {
            throw new IllegalArgumentException("'privateKey' must be at least 512 bits");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("RSA", ConstraintUtils.bitsOfSecurityFor(modulus), rSAKeyParameters, CryptoServicePurpose.DECRYPTION));
        if ((i17 & 65535) != i17) {
            throw new IllegalArgumentException("'protocolVersion' must be a 16 bit value");
        }
        SecureRandom secureRandom2 = CryptoServicesRegistrar.getSecureRandom(secureRandom);
        byte[] bArr2 = new byte[48];
        secureRandom2.nextBytes(bArr2);
        try {
            byte[] bArrRsaBlinded = rsaBlinded(rSAKeyParameters, convertInput(modulus, bArr, i15, i16), secureRandom2);
            int length = bArrRsaBlinded.length - 48;
            int iCheckPkcs1Encoding2 = checkPkcs1Encoding2(bArrRsaBlinded, (iBitLength - 1) / 8, 48) | ((-((Pack.bigEndianToShort(bArrRsaBlinded, length) ^ i17) & 65535)) >> 31);
            for (int i18 = 0; i18 < 48; i18++) {
                bArr2[i18] = (byte) ((bArr2[i18] & iCheckPkcs1Encoding2) | (bArrRsaBlinded[length + i18] & (~iCheckPkcs1Encoding2)));
            }
            Arrays.fill(bArrRsaBlinded, (byte) 0);
        } catch (Exception unused) {
        }
        return bArr2;
    }

    public static int getInputLimit(RSAKeyParameters rSAKeyParameters) {
        return (rSAKeyParameters.getModulus().bitLength() + 7) / 8;
    }

    private static BigInteger rsa(RSAKeyParameters rSAKeyParameters, BigInteger bigInteger) {
        return bigInteger.modPow(rSAKeyParameters.getExponent(), rSAKeyParameters.getModulus());
    }

    private static byte[] rsaBlinded(RSAKeyParameters rSAKeyParameters, BigInteger bigInteger, SecureRandom secureRandom) {
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters;
        BigInteger publicExponent;
        BigInteger modulus = rSAKeyParameters.getModulus();
        int iBitLength = (modulus.bitLength() / 8) + 1;
        if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) || (publicExponent = (rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) rSAKeyParameters).getPublicExponent()) == null) {
            return toBytes(rsa(rSAKeyParameters, bigInteger), iBitLength);
        }
        BigInteger bigInteger2 = ONE;
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger2, modulus.subtract(bigInteger2), secureRandom);
        BigInteger bigIntegerModPow = bigIntegerCreateRandomInRange.modPow(publicExponent, modulus);
        BigInteger bigIntegerModOddInverse = BigIntegers.modOddInverse(modulus, bigIntegerCreateRandomInRange);
        BigInteger bigIntegerRsaCrt = rsaCrt(rSAPrivateCrtKeyParameters, bigIntegerModPow.multiply(bigInteger).mod(modulus));
        BigInteger bigIntegerMod = bigIntegerModOddInverse.add(bigInteger2).multiply(bigIntegerRsaCrt).mod(modulus);
        byte[] bytes = toBytes(bigIntegerRsaCrt, iBitLength);
        byte[] bytes2 = toBytes(modulus, iBitLength);
        byte[] bytes3 = toBytes(bigIntegerMod, iBitLength);
        caddTo(iBitLength, subFrom(iBitLength, bytes, bytes3), bytes2, bytes3);
        return bytes3;
    }

    private static BigInteger rsaCrt(RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters, BigInteger bigInteger) {
        BigInteger publicExponent = rSAPrivateCrtKeyParameters.getPublicExponent();
        BigInteger p15 = rSAPrivateCrtKeyParameters.getP();
        BigInteger q15 = rSAPrivateCrtKeyParameters.getQ();
        BigInteger dp4 = rSAPrivateCrtKeyParameters.getDP();
        BigInteger dq4 = rSAPrivateCrtKeyParameters.getDQ();
        BigInteger qInv = rSAPrivateCrtKeyParameters.getQInv();
        BigInteger bigIntegerModPow = bigInteger.remainder(p15).modPow(dp4, p15);
        BigInteger bigIntegerModPow2 = bigInteger.remainder(q15).modPow(dq4, q15);
        BigInteger bigIntegerAdd = bigIntegerModPow.subtract(bigIntegerModPow2).multiply(qInv).mod(p15).multiply(q15).add(bigIntegerModPow2);
        if (bigIntegerAdd.modPow(publicExponent, rSAPrivateCrtKeyParameters.getModulus()).equals(bigInteger)) {
            return bigIntegerAdd;
        }
        throw new IllegalStateException("RSA engine faulty decryption/signing detected");
    }

    private static int subFrom(int i15, byte[] bArr, byte[] bArr2) {
        int i16 = 0;
        for (int i17 = i15 - 1; i17 >= 0; i17--) {
            int i18 = i16 + ((bArr2[i17] & 255) - (bArr[i17] & 255));
            bArr2[i17] = (byte) i18;
            i16 = i18 >> 8;
        }
        return i16;
    }

    private static byte[] toBytes(BigInteger bigInteger, int i15) {
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i15];
        System.arraycopy(byteArray, 0, bArr, i15 - byteArray.length, byteArray.length);
        return bArr;
    }
}
