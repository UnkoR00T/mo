package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class RainbowUtil {
    RainbowUtil() {
    }

    public static short[][] cloneArray(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length][];
        for (int i15 = 0; i15 < sArr.length; i15++) {
            sArr2[i15] = Arrays.clone(sArr[i15]);
        }
        return sArr2;
    }

    public static byte[] convertArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i15 = 0; i15 < sArr.length; i15++) {
            bArr[i15] = (byte) sArr[i15];
        }
        return bArr;
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z15 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z15 &= sArr[length] == sArr2[length];
        }
        return z15;
    }

    public static short[][][] generate_random(SecureRandom secureRandom, int i15, int i16, int i17, boolean z15) {
        byte[] bArr = new byte[z15 ? (((i16 + 1) * i16) / 2) * i15 : i15 * i16 * i17];
        secureRandom.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i15, i16, i17);
        int i18 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            for (int i25 = 0; i25 < i17; i25++) {
                for (int i26 = 0; i26 < i15; i26++) {
                    if (!z15 || i19 <= i25) {
                        sArr[i26][i19][i25] = (short) (bArr[i18] & 255);
                        i18++;
                    }
                }
            }
        }
        return sArr;
    }

    public static short[][] generate_random_2d(SecureRandom secureRandom, int i15, int i16) {
        byte[] bArr = new byte[i15 * i16];
        secureRandom.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i15, i16);
        for (int i17 = 0; i17 < i16; i17++) {
            for (int i18 = 0; i18 < i15; i18++) {
                sArr[i18][i17] = (short) (bArr[(i17 * i15) + i18] & 255);
            }
        }
        return sArr;
    }

    public static byte[] getEncoded(short[][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        byte[] bArr = new byte[length * length2];
        for (int i15 = 0; i15 < length2; i15++) {
            for (int i16 = 0; i16 < length; i16++) {
                bArr[(i15 * length) + i16] = (byte) sArr[i16][i15];
            }
        }
        return bArr;
    }

    public static byte[] hash(Digest digest, byte[] bArr, int i15) {
        int digestSize = digest.getDigestSize();
        digest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[digestSize];
        digest.doFinal(bArr2, 0);
        if (i15 == digestSize) {
            return bArr2;
        }
        if (i15 < digestSize) {
            return Arrays.copyOf(bArr2, i15);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, digestSize);
        while (true) {
            i15 -= digestSize;
            if (i15 < digestSize) {
                break;
            }
            digest.update(bArr2, 0, digestSize);
            bArr2 = new byte[digestSize];
            digest.doFinal(bArr2, 0);
            bArrCopyOf = Arrays.concatenate(bArrCopyOf, bArr2);
        }
        if (i15 <= 0) {
            return bArrCopyOf;
        }
        digest.update(bArr2, 0, digestSize);
        byte[] bArr3 = new byte[digestSize];
        digest.doFinal(bArr3, 0);
        int length = bArrCopyOf.length;
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, length + i15);
        System.arraycopy(bArr3, 0, bArrCopyOf2, length, i15);
        return bArrCopyOf2;
    }

    public static int loadEncoded(short[][] sArr, byte[] bArr, int i15) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        for (int i16 = 0; i16 < length2; i16++) {
            for (int i17 = 0; i17 < length; i17++) {
                sArr[i17][i16] = (short) (bArr[(i16 * length) + i15 + i17] & 255);
            }
        }
        return length * length2;
    }

    public static short[][][] cloneArray(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i15 = 0; i15 < sArr.length; i15++) {
            for (int i16 = 0; i16 < sArr[0].length; i16++) {
                sArr2[i15][i16] = Arrays.clone(sArr[i15][i16]);
            }
        }
        return sArr2;
    }

    public static short[] convertArray(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i15 = 0; i15 < bArr.length; i15++) {
            sArr[i15] = (short) (bArr[i15] & 255);
        }
        return sArr;
    }

    public static boolean equals(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            zEquals &= equals(sArr[length], sArr2[length]);
        }
        return zEquals;
    }

    public static byte[] getEncoded(short[][][] sArr, boolean z15) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        byte[] bArr = new byte[z15 ? (((length2 + 1) * length2) / 2) * length : length * length2 * length3];
        int i15 = 0;
        for (int i16 = 0; i16 < length2; i16++) {
            for (int i17 = 0; i17 < length3; i17++) {
                for (short[][] sArr3 : sArr) {
                    if (!z15 || i16 <= i17) {
                        bArr[i15] = (byte) sArr3[i16][i17];
                        i15++;
                    }
                }
            }
        }
        return bArr;
    }

    public static byte[] hash(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int digestSize = digest.getDigestSize();
        digest.update(bArr, 0, bArr.length);
        digest.update(bArr2, 0, bArr2.length);
        if (bArr3.length == digestSize) {
            digest.doFinal(bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[digestSize];
        digest.doFinal(bArr4, 0);
        if (bArr3.length < digestSize) {
            System.arraycopy(bArr4, 0, bArr3, 0, bArr3.length);
            return bArr3;
        }
        System.arraycopy(bArr4, 0, bArr3, 0, digestSize);
        int length = bArr3.length - digestSize;
        int i15 = digestSize;
        while (length >= digestSize) {
            digest.update(bArr4, 0, digestSize);
            digest.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i15, digestSize);
            length -= digestSize;
            i15 += digestSize;
        }
        if (length > 0) {
            digest.update(bArr4, 0, digestSize);
            digest.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i15, length);
        }
        return bArr3;
    }

    public static int loadEncoded(short[][][] sArr, byte[] bArr, int i15, boolean z15) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            for (int i18 = 0; i18 < length2; i18++) {
                for (short[][] sArr3 : sArr) {
                    if (!z15 || i17 <= i18) {
                        sArr3[i17][i18] = (short) (bArr[i16 + i15] & 255);
                        i16++;
                    }
                }
            }
        }
        return i16;
    }

    public static boolean equals(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            zEquals &= equals(sArr[length], sArr2[length]);
        }
        return zEquals;
    }
}
