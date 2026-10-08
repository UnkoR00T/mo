package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SCrypt {
    private SCrypt() {
    }

    private static void BlockMix(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i15) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i15 * 2; i18 > 0; i18--) {
            Xor(iArr2, iArr, i16, iArr3);
            Salsa20Engine.salsaCore(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i17, 16);
            i17 = (length + i16) - i17;
            i16 += 16;
        }
    }

    private static void Clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    private static void ClearAll(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            Clear(iArr2);
        }
    }

    private static byte[] MFcrypt(byte[] bArr, byte[] bArr2, int i15, int i16, int i17, int i18) {
        int i19 = i16 * 128;
        byte[] bArrSingleIterationPBKDF2 = SingleIterationPBKDF2(bArr, bArr2, i17 * i19);
        int[] iArr = null;
        try {
            int length = bArrSingleIterationPBKDF2.length >>> 2;
            iArr = new int[length];
            Pack.littleEndianToInt(bArrSingleIterationPBKDF2, 0, iArr);
            int i25 = 0;
            for (int i26 = i15 * i16; i15 - i25 > 2 && i26 > 1024; i26 >>>= 1) {
                i25++;
            }
            int i27 = i19 >>> 2;
            for (int i28 = 0; i28 < length; i28 += i27) {
                SMix(iArr, i28, i15, i25, i16);
            }
            Pack.intToLittleEndian(iArr, bArrSingleIterationPBKDF2, 0);
            return SingleIterationPBKDF2(bArr, bArrSingleIterationPBKDF2, i18);
        } finally {
            Clear(bArrSingleIterationPBKDF2);
            Clear(iArr);
        }
    }

    private static void SMix(int[] iArr, int i15, int i16, int i17, int i18) {
        int i19 = i16 >>> i17;
        int i25 = 1 << i17;
        int i26 = i19 - 1;
        int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i16) - i17;
        int i27 = i18 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i27];
        int[] iArr5 = new int[i27];
        int[][] iArr6 = new int[i25][];
        try {
            System.arraycopy(iArr, i15, iArr5, 0, i27);
            int i28 = 0;
            while (i28 < i25) {
                int[] iArr7 = new int[i19 * i27];
                iArr6[i28] = iArr7;
                int i29 = iNumberOfTrailingZeros;
                int i35 = i25;
                int i36 = 0;
                for (int i37 = 0; i37 < i19; i37 += 2) {
                    System.arraycopy(iArr5, 0, iArr7, i36, i27);
                    int i38 = i36 + i27;
                    BlockMix(iArr5, iArr2, iArr3, iArr4, i18);
                    System.arraycopy(iArr4, 0, iArr7, i38, i27);
                    i36 = i38 + i27;
                    BlockMix(iArr4, iArr2, iArr3, iArr5, i18);
                }
                i28++;
                iNumberOfTrailingZeros = i29;
                i25 = i35;
            }
            int i39 = iNumberOfTrailingZeros;
            int i45 = i16 - 1;
            for (int i46 = 0; i46 < i16; i46++) {
                int i47 = iArr5[i27 - 16] & i45;
                System.arraycopy(iArr6[i47 >>> i39], (i47 & i26) * i27, iArr4, 0, i27);
                Xor(iArr4, iArr5, 0, iArr4);
                BlockMix(iArr4, iArr2, iArr3, iArr5, i18);
            }
            System.arraycopy(iArr5, 0, iArr, i15, i27);
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th4) {
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th4;
        }
    }

    private static byte[] SingleIterationPBKDF2(byte[] bArr, byte[] bArr2, int i15) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(SHA256Digest.newInstance());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i15 * 8)).getKey();
    }

    private static void Xor(int[] iArr, int[] iArr2, int i15, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i15 + length];
        }
    }

    public static byte[] generate(byte[] bArr, byte[] bArr2, int i15, int i16, int i17, int i18) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if (i15 <= 1 || !isPowerOf2(i15)) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        }
        if (i16 == 1 && i15 >= 65536) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        }
        if (i16 < 1) {
            throw new IllegalArgumentException("Block size r must be >= 1.");
        }
        int i19 = Integer.MAX_VALUE / (i16 * 1024);
        if (i17 >= 1 && i17 <= i19) {
            if (i18 >= 1) {
                return MFcrypt(bArr, bArr2, i15, i16, i17, i18);
            }
            throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
        }
        throw new IllegalArgumentException("Parallelisation parameter p must be >= 1 and <= " + i19 + " (based on block size r of " + i16 + ")");
    }

    private static boolean isPowerOf2(int i15) {
        return (i15 & (i15 + (-1))) == 0;
    }

    private static void Clear(int[] iArr) {
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }
}
