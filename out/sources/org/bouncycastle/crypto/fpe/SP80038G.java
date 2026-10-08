package org.bouncycastle.crypto.fpe;

import java.math.BigInteger;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class SP80038G {
    protected static final int BLOCK_SIZE = 16;
    static final String FF1_DISABLED = "org.bouncycastle.fpe.disable_ff1";
    static final String FPE_DISABLED = "org.bouncycastle.fpe.disable";
    protected static final double LOG2 = Math.log(2.0d);
    protected static final double TWO_TO_96 = Math.pow(2.0d, 96.0d);

    SP80038G() {
    }

    protected static int calculateB_FF1(int i15, int i16) {
        int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i15);
        int iBitLength = iNumberOfTrailingZeros * i16;
        int i17 = i15 >>> iNumberOfTrailingZeros;
        if (i17 != 1) {
            iBitLength += BigInteger.valueOf(i17).pow(i16).bitLength();
        }
        return (iBitLength + 7) / 8;
    }

    protected static BigInteger[] calculateModUV(BigInteger bigInteger, int i15, int i16) {
        BigInteger bigIntegerPow = bigInteger.pow(i15);
        BigInteger[] bigIntegerArr = {bigIntegerPow, bigIntegerPow};
        if (i16 != i15) {
            bigIntegerArr[1] = bigIntegerPow.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    protected static byte[] calculateP_FF1(int i15, byte b15, int i16, int i17) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i15 >> 8), (byte) i15, 10, b15, 0, 0, 0, 0, 0, 0, 0, 0};
        Pack.intToBigEndian(i16, bArr, 8);
        Pack.intToBigEndian(i17, bArr, 12);
        return bArr;
    }

    protected static byte[] calculateTweak64_FF3_1(byte[] bArr) {
        byte b15 = bArr[0];
        byte b16 = bArr[1];
        byte b17 = bArr[2];
        byte b18 = bArr[3];
        return new byte[]{b15, b16, b17, (byte) (b18 & 240), bArr[4], bArr[5], bArr[6], (byte) (b18 << 4)};
    }

    protected static BigInteger calculateY_FF1(BlockCipher blockCipher, byte[] bArr, int i15, int i16, int i17, byte[] bArr2, short[] sArr, RadixConverter radixConverter) {
        int length = bArr.length;
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr));
        int i18 = ((-(length + i15 + 1)) & 15) + length;
        int i19 = i18 + 1 + i15;
        byte[] bArr3 = new byte[i19];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i18] = (byte) i17;
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr3, i19 - bArrAsUnsignedByteArray.length, bArrAsUnsignedByteArray.length);
        byte[] bArrPrf = prf(blockCipher, Arrays.concatenate(bArr2, bArr3));
        if (i16 > 16) {
            int i25 = (i16 + 15) / 16;
            byte[] bArr4 = new byte[i25 * 16];
            int iBigEndianToInt = Pack.bigEndianToInt(bArrPrf, 12);
            System.arraycopy(bArrPrf, 0, bArr4, 0, 16);
            for (int i26 = 1; i26 < i25; i26++) {
                int i27 = i26 * 16;
                System.arraycopy(bArrPrf, 0, bArr4, i27, 12);
                Pack.intToBigEndian(iBigEndianToInt ^ i26, bArr4, i27 + 12);
                blockCipher.processBlock(bArr4, i27, bArr4, i27);
            }
            bArrPrf = bArr4;
        }
        return num(bArrPrf, 0, i16);
    }

    protected static BigInteger calculateY_FF3(BlockCipher blockCipher, byte[] bArr, int i15, int i16, short[] sArr, RadixConverter radixConverter) {
        byte[] bArr2 = new byte[16];
        Pack.intToBigEndian(Pack.bigEndianToInt(bArr, i15) ^ i16, bArr2, 0);
        BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr), bArr2, 4, 12);
        Arrays.reverseInPlace(bArr2);
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        Arrays.reverseInPlace(bArr2);
        return num(bArr2, 0, 16);
    }

    protected static void checkArgs(BlockCipher blockCipher, boolean z15, int i15, byte[] bArr, int i16, int i17) {
        checkCipher(blockCipher);
        if (i15 < 2 || i15 > 256) {
            throw new IllegalArgumentException();
        }
        checkData(z15, i15, bArr, i16, i17);
    }

    protected static void checkCipher(BlockCipher blockCipher) {
        if (16 != blockCipher.getBlockSize()) {
            throw new IllegalArgumentException();
        }
    }

    protected static void checkData(boolean z15, int i15, byte[] bArr, int i16, int i17) {
        checkLength(z15, i15, i17);
        for (int i18 = 0; i18 < i17; i18++) {
            if ((bArr[i16 + i18] & 255) >= i15) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    private static void checkLength(boolean z15, int i15, int i16) {
        int iFloor;
        if (i16 >= 2) {
            double d15 = i15;
            if (Math.pow(d15, i16) >= 1000000.0d) {
                if (z15 || i16 <= (iFloor = ((int) Math.floor(Math.log(TWO_TO_96) / Math.log(d15))) * 2)) {
                    return;
                }
                throw new IllegalArgumentException("maximum input length is " + iFloor);
            }
        }
        throw new IllegalArgumentException("input too short");
    }

    static short[] decFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i15, int i16, int i17, short[] sArr, short[] sArr2) {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int iCalculateB_FF1 = calculateB_FF1(radix, i17);
        int i18 = (iCalculateB_FF1 + 7) & (-4);
        byte[] bArrCalculateP_FF1 = calculateP_FF1(radix, (byte) i16, i15, length);
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radix), i16, i17);
        int i19 = 9;
        short[] sArr3 = sArr2;
        int i25 = i16;
        short[] sArr4 = sArr;
        while (i19 >= 0) {
            int i26 = iCalculateB_FF1;
            byte[] bArr2 = bArrCalculateP_FF1;
            int i27 = i19;
            i25 = i15 - i25;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).subtract(calculateY_FF1(blockCipher, bArr, i26, i18, i27, bArr2, sArr4, radixConverter)).mod(bigIntegerArrCalculateModUV[i27 & 1]), i25, sArr3);
            i19 = i27 - 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            bArrCalculateP_FF1 = bArr2;
            iCalculateB_FF1 = i26;
        }
        return Arrays.concatenate(sArr4, sArr3);
    }

    private static short[] decFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i15, int i16, int i17, short[] sArr, short[] sArr2) {
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i16, i17);
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i18 = 7;
        while (i18 >= 0) {
            i17 = i15 - i17;
            int i19 = i18 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr4).subtract(calculateY_FF3(blockCipher2, bArr, 4 - (i19 * 4), i18, sArr3, radixConverter2)).mod(bigIntegerArrCalculateModUV[1 - i19]), i17, sArr4);
            i18--;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        Arrays.reverseInPlace(sArr3);
        Arrays.reverseInPlace(sArr4);
        return Arrays.concatenate(sArr3, sArr4);
    }

    static byte[] decryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i15, int i16) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i15, i16);
        int i17 = i16 / 2;
        int i18 = i16 - i17;
        return toByte(decFF1(blockCipher, radixConverter, bArr, i16, i17, i18, toShort(bArr2, i15, i17), toShort(bArr2, i15 + i17, i18)));
    }

    static short[] decryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i15, int i16) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i15, i16);
        int i17 = i16 / 2;
        int i18 = i16 - i17;
        short[] sArr2 = new short[i17];
        short[] sArr3 = new short[i18];
        System.arraycopy(sArr, i15, sArr2, 0, i17);
        System.arraycopy(sArr, i15 + i17, sArr3, 0, i18);
        return decFF1(blockCipher, radixConverter, bArr, i16, i17, i18, sArr2, sArr3);
    }

    static byte[] decryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i15, int i16) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i15, i16);
        if (bArr.length == 8) {
            return implDecryptFF3(blockCipher, radixConverter, bArr, bArr2, i15, i16);
        }
        throw new IllegalArgumentException();
    }

    static byte[] decryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i15, int i16) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i15, i16);
        if (bArr.length == 7) {
            return implDecryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i15, i16);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    static short[] decryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i15, int i16) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i15, i16);
        if (bArr.length == 7) {
            return implDecryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i15, i16);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    private static short[] encFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i15, int i16, int i17, short[] sArr, short[] sArr2) {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int iCalculateB_FF1 = calculateB_FF1(radix, i17);
        int i18 = (iCalculateB_FF1 + 7) & (-4);
        byte[] bArrCalculateP_FF1 = calculateP_FF1(radix, (byte) i16, i15, length);
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radix), i16, i17);
        int i19 = 0;
        short[] sArr3 = sArr;
        int i25 = i17;
        short[] sArr4 = sArr2;
        while (i19 < 10) {
            int i26 = iCalculateB_FF1;
            byte[] bArr2 = bArrCalculateP_FF1;
            int i27 = i19;
            i25 = i15 - i25;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).add(calculateY_FF1(blockCipher, bArr, i26, i18, i27, bArr2, sArr4, radixConverter)).mod(bigIntegerArrCalculateModUV[i27 & 1]), i25, sArr3);
            i19 = i27 + 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            bArrCalculateP_FF1 = bArr2;
            iCalculateB_FF1 = i26;
        }
        return Arrays.concatenate(sArr3, sArr4);
    }

    private static short[] encFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i15, int i16, int i17, short[] sArr, short[] sArr2) {
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i16, i17);
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr2);
        short[] sArr3 = sArr2;
        int i18 = 0;
        while (i18 < 8) {
            i16 = i15 - i16;
            int i19 = i18 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr).add(calculateY_FF3(blockCipher2, bArr, 4 - (i19 * 4), i18, sArr3, radixConverter2)).mod(bigIntegerArrCalculateModUV[1 - i19]), i16, sArr);
            i18++;
            short[] sArr4 = sArr3;
            sArr3 = sArr;
            sArr = sArr4;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr3);
        return Arrays.concatenate(sArr, sArr3);
    }

    static byte[] encryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i15, int i16) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i15, i16);
        int i17 = i16 / 2;
        int i18 = i16 - i17;
        return toByte(encFF1(blockCipher, radixConverter, bArr, i16, i17, i18, toShort(bArr2, i15, i17), toShort(bArr2, i15 + i17, i18)));
    }

    static short[] encryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i15, int i16) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i15, i16);
        int i17 = i16 / 2;
        int i18 = i16 - i17;
        short[] sArr2 = new short[i17];
        short[] sArr3 = new short[i18];
        System.arraycopy(sArr, i15, sArr2, 0, i17);
        System.arraycopy(sArr, i15 + i17, sArr3, 0, i18);
        return encFF1(blockCipher, radixConverter, bArr, i16, i17, i18, sArr2, sArr3);
    }

    static byte[] encryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i15, int i16) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i15, i16);
        if (bArr.length == 8) {
            return implEncryptFF3(blockCipher, radixConverter, bArr, bArr2, i15, i16);
        }
        throw new IllegalArgumentException();
    }

    static byte[] encryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i15, int i16) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i15, i16);
        if (bArr.length == 7) {
            return encryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i15, i16);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    static short[] encryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i15, int i16) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i15, i16);
        if (bArr.length == 7) {
            return encryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i15, i16);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    static short[] encryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i15, int i16) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i15, i16);
        if (bArr.length == 8) {
            return implEncryptFF3w(blockCipher, radixConverter, bArr, sArr, i15, i16);
        }
        throw new IllegalArgumentException();
    }

    protected static byte[] implDecryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i15, int i16) {
        int i17 = i16 / 2;
        int i18 = i16 - i17;
        return toByte(decFF3_1(blockCipher, radixConverter, bArr, i16, i17, i18, toShort(bArr2, i15, i18), toShort(bArr2, i15 + i18, i17)));
    }

    protected static short[] implDecryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i15, int i16) {
        int i17 = i16 / 2;
        int i18 = i16 - i17;
        short[] sArr2 = new short[i18];
        short[] sArr3 = new short[i17];
        System.arraycopy(sArr, i15, sArr2, 0, i18);
        System.arraycopy(sArr, i15 + i18, sArr3, 0, i17);
        return decFF3_1(blockCipher, radixConverter, bArr, i16, i17, i18, sArr2, sArr3);
    }

    protected static byte[] implEncryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i15, int i16) {
        int i17 = i16 / 2;
        int i18 = i16 - i17;
        return toByte(encFF3_1(blockCipher, radixConverter, bArr, i16, i17, i18, toShort(bArr2, i15, i18), toShort(bArr2, i15 + i18, i17)));
    }

    protected static short[] implEncryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i15, int i16) {
        int i17 = i16 / 2;
        int i18 = i16 - i17;
        short[] sArr2 = new short[i18];
        short[] sArr3 = new short[i17];
        System.arraycopy(sArr, i15, sArr2, 0, i18);
        System.arraycopy(sArr, i15 + i18, sArr3, 0, i17);
        return encFF3_1(blockCipher, radixConverter, bArr, i16, i17, i18, sArr2, sArr3);
    }

    protected static BigInteger num(byte[] bArr, int i15, int i16) {
        return new BigInteger(1, Arrays.copyOfRange(bArr, i15, i16 + i15));
    }

    protected static byte[] prf(BlockCipher blockCipher, byte[] bArr) {
        if (bArr.length % 16 != 0) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length / 16;
        byte[] bArr2 = new byte[16];
        for (int i15 = 0; i15 < length; i15++) {
            Bytes.xorTo(16, bArr, i15 * 16, bArr2, 0);
            blockCipher.processBlock(bArr2, 0, bArr2, 0);
        }
        return bArr2;
    }

    private static byte[] toByte(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length];
        for (int i15 = 0; i15 != length; i15++) {
            bArr[i15] = (byte) sArr[i15];
        }
        return bArr;
    }

    private static short[] toShort(byte[] bArr, int i15, int i16) {
        short[] sArr = new short[i16];
        for (int i17 = 0; i17 != i16; i17++) {
            sArr[i17] = (short) (bArr[i15 + i17] & 255);
        }
        return sArr;
    }

    protected static void checkArgs(BlockCipher blockCipher, boolean z15, int i15, short[] sArr, int i16, int i17) {
        checkCipher(blockCipher);
        if (i15 < 2 || i15 > 65536) {
            throw new IllegalArgumentException();
        }
        checkData(z15, i15, sArr, i16, i17);
    }

    protected static void checkData(boolean z15, int i15, short[] sArr, int i16, int i17) {
        checkLength(z15, i15, i17);
        for (int i18 = 0; i18 < i17; i18++) {
            if ((sArr[i16 + i18] & HPKE.aead_EXPORT_ONLY) >= i15) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }
}
