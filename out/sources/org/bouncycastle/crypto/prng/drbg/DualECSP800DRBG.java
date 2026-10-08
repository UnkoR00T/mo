package org.bouncycastle.crypto.prng.drbg;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class DualECSP800DRBG implements SP80090DRBG {
    private static final int MAX_ADDITIONAL_INPUT = 4096;
    private static final int MAX_ENTROPY_LENGTH = 4096;
    private static final int MAX_PERSONALIZATION_STRING = 4096;
    private static final long RESEED_MAX = 2147483648L;
    private static final DualECPoints[] nistPoints;
    private static final BigInteger p256_Px;
    private static final BigInteger p256_Py;
    private static final BigInteger p256_Qx;
    private static final BigInteger p256_Qy;
    private static final BigInteger p384_Px;
    private static final BigInteger p384_Py;
    private static final BigInteger p384_Qx;
    private static final BigInteger p384_Qy;
    private static final BigInteger p521_Px;
    private static final BigInteger p521_Py;
    private static final BigInteger p521_Qx;
    private static final BigInteger p521_Qy;
    private ECPoint _P;
    private ECPoint _Q;
    private Digest _digest;
    private EntropySource _entropySource;
    private ECMultiplier _fixedPointMultiplier;
    private int _outlen;
    private long _reseedCounter;
    private byte[] _s;
    private int _sLength;
    private int _securityStrength;
    private int _seedlen;

    static {
        BigInteger bigInteger = new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16);
        p256_Px = bigInteger;
        BigInteger bigInteger2 = new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16);
        p256_Py = bigInteger2;
        BigInteger bigInteger3 = new BigInteger("c97445f45cdef9f0d3e05e1e585fc297235b82b5be8ff3efca67c59852018192", 16);
        p256_Qx = bigInteger3;
        BigInteger bigInteger4 = new BigInteger("b28ef557ba31dfcbdd21ac46e2a91e3c304f44cb87058ada2cb815151e610046", 16);
        p256_Qy = bigInteger4;
        BigInteger bigInteger5 = new BigInteger("aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", 16);
        p384_Px = bigInteger5;
        BigInteger bigInteger6 = new BigInteger("3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f", 16);
        p384_Py = bigInteger6;
        BigInteger bigInteger7 = new BigInteger("8e722de3125bddb05580164bfe20b8b432216a62926c57502ceede31c47816edd1e89769124179d0b695106428815065", 16);
        p384_Qx = bigInteger7;
        BigInteger bigInteger8 = new BigInteger("023b1660dd701d0839fd45eec36f9ee7b32e13b315dc02610aa1b636e346df671f790f84c5e09b05674dbb7e45c803dd", 16);
        p384_Qy = bigInteger8;
        BigInteger bigInteger9 = new BigInteger("c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", 16);
        p521_Px = bigInteger9;
        BigInteger bigInteger10 = new BigInteger("11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650", 16);
        p521_Py = bigInteger10;
        BigInteger bigInteger11 = new BigInteger("1b9fa3e518d683c6b65763694ac8efbaec6fab44f2276171a42726507dd08add4c3b3f4c1ebc5b1222ddba077f722943b24c3edfa0f85fe24d0c8c01591f0be6f63", 16);
        p521_Qx = bigInteger11;
        BigInteger bigInteger12 = new BigInteger("1f3bdba585295d9a1110d1df1f9430ef8442c5018976ff3437ef91b81dc0b8132c8d5c39c32d0e004a3092b7d327c0e7a4d26d2c7b69b58f9066652911e457779de", 16);
        p521_Qy = bigInteger12;
        nistPoints = new DualECPoints[]{createDualECPoints("P-256", 128, bigInteger, bigInteger2, bigInteger3, bigInteger4, 1), createDualECPoints("P-384", 192, bigInteger5, bigInteger6, bigInteger7, bigInteger8, 1), createDualECPoints("P-521", 256, bigInteger9, bigInteger10, bigInteger11, bigInteger12, 1)};
    }

    public DualECSP800DRBG(Digest digest, int i15, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this(nistPoints, digest, i15, entropySource, bArr, bArr2);
    }

    private static DualECPoints createDualECPoints(String str, int i15, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i16) {
        ECCurve.AbstractFp abstractFp = (ECCurve.AbstractFp) CustomNamedCurves.getByNameLazy(str).getCurve();
        return new DualECPoints(i15, abstractFp.createPoint(bigInteger, bigInteger2), abstractFp.createPoint(bigInteger3, bigInteger4), i16);
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private BigInteger getScalarMultipleXCoord(ECPoint eCPoint, BigInteger bigInteger) {
        return this._fixedPointMultiplier.multiply(eCPoint, bigInteger).normalize().getAffineXCoord().toBigInteger();
    }

    private byte[] pad8(byte[] bArr, int i15) {
        int i16 = i15 % 8;
        if (i16 == 0) {
            return bArr;
        }
        int i17 = 8 - i16;
        int length = bArr.length - 1;
        int i18 = 0;
        while (length >= 0) {
            int i19 = bArr[length] & GF2Field.MASK;
            bArr[length] = (byte) ((i18 >> (8 - i17)) | (i19 << i17));
            length--;
            i18 = i19;
        }
        return bArr;
    }

    private byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return bArr;
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i15 = 0; i15 != length; i15++) {
            bArr3[i15] = (byte) (bArr[i15] ^ bArr2[i15]);
        }
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z15) {
        int length = bArr.length * 8;
        int length2 = bArr.length / this._outlen;
        if (Utils.isTooLarge(bArr2, 512)) {
            throw new IllegalArgumentException("Additional input too large");
        }
        if (this._reseedCounter + ((long) length2) > RESEED_MAX) {
            return -1;
        }
        if (z15) {
            reseed(bArr2);
            bArr2 = null;
        }
        BigInteger bigInteger = bArr2 != null ? new BigInteger(1, xor(this._s, Utils.hash_df(this._digest, bArr2, this._seedlen))) : new BigInteger(1, this._s);
        int length3 = 0;
        Arrays.fill(bArr, (byte) 0);
        int i15 = 0;
        for (int i16 = 0; i16 < length2; i16++) {
            bigInteger = getScalarMultipleXCoord(this._P, bigInteger);
            byte[] byteArray = getScalarMultipleXCoord(this._Q, bigInteger).toByteArray();
            int length4 = byteArray.length;
            int i17 = this._outlen;
            if (length4 >= i17) {
                System.arraycopy(byteArray, byteArray.length - i17, bArr, i15, i17);
            } else {
                System.arraycopy(byteArray, 0, bArr, (i17 - byteArray.length) + i15, byteArray.length);
            }
            i15 += this._outlen;
            this._reseedCounter++;
        }
        if (i15 < bArr.length) {
            bigInteger = getScalarMultipleXCoord(this._P, bigInteger);
            byte[] byteArray2 = getScalarMultipleXCoord(this._Q, bigInteger).toByteArray();
            int length5 = bArr.length - i15;
            int length6 = byteArray2.length;
            int i18 = this._outlen;
            if (length6 >= i18) {
                length3 = byteArray2.length - i18;
            } else {
                int length7 = i18 - byteArray2.length;
                if (length7 < length5) {
                    i15 += length7;
                    length5 -= length7;
                }
                this._reseedCounter++;
            }
            System.arraycopy(byteArray2, length3, bArr, i15, length5);
            this._reseedCounter++;
        }
        this._s = BigIntegers.asUnsignedByteArray(this._sLength, getScalarMultipleXCoord(this._P, bigInteger));
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._outlen * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        if (Utils.isTooLarge(bArr, 512)) {
            throw new IllegalArgumentException("Additional input string too large");
        }
        this._s = Utils.hash_df(this._digest, Arrays.concatenate(pad8(this._s, this._seedlen), getEntropy(), bArr), this._seedlen);
        this._reseedCounter = 0L;
    }

    public DualECSP800DRBG(DualECPoints[] dualECPointsArr, Digest digest, int i15, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this._fixedPointMultiplier = new FixedPointCombMultiplier();
        this._digest = digest;
        this._entropySource = entropySource;
        this._securityStrength = i15;
        if (Utils.isTooLarge(bArr, 512)) {
            throw new IllegalArgumentException("Personalization string too large");
        }
        if (entropySource.entropySize() < i15 || entropySource.entropySize() > 4096) {
            throw new IllegalArgumentException("EntropySource must provide between " + i15 + " and " + PKIFailureInfo.certConfirmed + " bits");
        }
        byte[] bArrConcatenate = Arrays.concatenate(getEntropy(), bArr2, bArr);
        for (int i16 = 0; i16 != dualECPointsArr.length; i16++) {
            if (i15 <= dualECPointsArr[i16].getSecurityStrength()) {
                if (Utils.getMaxSecurityStrength(digest) < dualECPointsArr[i16].getSecurityStrength()) {
                    throw new IllegalArgumentException("Requested security strength is not supported by digest");
                }
                this._seedlen = dualECPointsArr[i16].getSeedLen();
                this._outlen = dualECPointsArr[i16].getMaxOutlen() / 8;
                this._P = dualECPointsArr[i16].getP();
                this._Q = dualECPointsArr[i16].getQ();
                break;
            }
        }
        if (this._P == null) {
            throw new IllegalArgumentException("security strength cannot be greater than 256 bits");
        }
        byte[] bArrHash_df = Utils.hash_df(this._digest, bArrConcatenate, this._seedlen);
        this._s = bArrHash_df;
        this._sLength = bArrHash_df.length;
        this._reseedCounter = 0L;
    }
}
