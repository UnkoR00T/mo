package org.bouncycastle.crypto.util;

import java.math.BigInteger;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class RadixConverter {
    private static final int DEFAULT_POWERS_TO_CACHE = 10;
    private static final double LOG_LONG_MAX_VALUE = Math.log(9.223372036854776E18d);
    private final int digitsGroupLength;
    private final BigInteger[] digitsGroupSpacePowers;
    private final BigInteger digitsGroupSpaceSize;
    private final int radix;

    public RadixConverter(int i15) {
        this(i15, 10);
    }

    private long fromEncoding(int i15, int i16, short[] sArr) {
        long j15 = 0;
        while (i15 < i16) {
            j15 = (j15 * ((long) this.radix)) + ((long) (sArr[i15] & HPKE.aead_EXPORT_ONLY));
            i15++;
        }
        return j15;
    }

    private BigInteger[] precomputeDigitsGroupPowers(int i15, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr = new BigInteger[i15];
        BigInteger bigIntegerMultiply = bigInteger;
        for (int i16 = 0; i16 < i15; i16++) {
            bigIntegerArr[i16] = bigIntegerMultiply;
            bigIntegerMultiply = bigIntegerMultiply.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    private int toEncoding(long j15, int i15, short[] sArr) {
        int i16;
        for (int i17 = 0; i17 < this.digitsGroupLength && i15 >= 0; i17++) {
            if (j15 == 0) {
                i16 = i15 - 1;
                sArr[i15] = 0;
            } else {
                i16 = i15 - 1;
                int i18 = this.radix;
                sArr[i15] = (short) (j15 % ((long) i18));
                j15 /= (long) i18;
            }
            i15 = i16;
        }
        if (j15 == 0) {
            return i15;
        }
        throw new IllegalStateException("Failed to convert decimal number");
    }

    public int getDigitsGroupLength() {
        return this.digitsGroupLength;
    }

    public int getRadix() {
        return this.radix;
    }

    public RadixConverter(int i15, int i16) {
        this.radix = i15;
        int iFloor = (int) Math.floor(LOG_LONG_MAX_VALUE / Math.log(i15));
        this.digitsGroupLength = iFloor;
        BigInteger bigIntegerPow = BigInteger.valueOf(i15).pow(iFloor);
        this.digitsGroupSpaceSize = bigIntegerPow;
        this.digitsGroupSpacePowers = precomputeDigitsGroupPowers(i16, bigIntegerPow);
    }

    public BigInteger fromEncoding(short[] sArr) {
        BigInteger bigIntegerMultiply = BigIntegers.ONE;
        int length = sArr.length;
        int i15 = length - this.digitsGroupLength;
        BigInteger bigIntegerAdd = null;
        int i16 = 0;
        while (true) {
            int i17 = this.digitsGroupLength;
            if (i15 <= (-i17)) {
                return bigIntegerAdd;
            }
            if (i15 < 0) {
                i17 += i15;
                i15 = 0;
            }
            BigInteger bigIntegerValueOf = BigInteger.valueOf(fromEncoding(i15, Math.min(i17 + i15, length), sArr));
            if (i16 == 0) {
                bigIntegerAdd = bigIntegerValueOf;
            } else {
                BigInteger[] bigIntegerArr = this.digitsGroupSpacePowers;
                bigIntegerMultiply = i16 <= bigIntegerArr.length ? bigIntegerArr[i16 - 1] : bigIntegerMultiply.multiply(this.digitsGroupSpaceSize);
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerValueOf.multiply(bigIntegerMultiply));
            }
            i16++;
            i15 -= this.digitsGroupLength;
        }
    }

    public void toEncoding(BigInteger bigInteger, int i15, short[] sArr) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException();
        }
        int encoding = i15 - 1;
        do {
            if (bigInteger.equals(BigInteger.ZERO)) {
                sArr[encoding] = 0;
                encoding--;
            } else {
                BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger.divideAndRemainder(this.digitsGroupSpaceSize);
                BigInteger bigInteger2 = bigIntegerArrDivideAndRemainder[0];
                encoding = toEncoding(bigIntegerArrDivideAndRemainder[1].longValue(), encoding, sArr);
                bigInteger = bigInteger2;
            }
        } while (encoding >= 0);
        if (bigInteger.signum() != 0) {
            throw new IllegalArgumentException();
        }
    }
}
