package org.bouncycastle.util;

import java.math.BigInteger;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class Arrays {

    public static class Iterator<T> implements java.util.Iterator<T> {
        private final T[] dataArray;
        private int position = 0;

        public Iterator(T[] tArr) {
            this.dataArray = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.dataArray.length;
        }

        @Override // java.util.Iterator
        public T next() {
            int i15 = this.position;
            T[] tArr = this.dataArray;
            if (i15 != tArr.length) {
                this.position = i15 + 1;
                return tArr[i15];
            }
            throw new NoSuchElementException("Out of elements: " + this.position);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    private Arrays() {
    }

    public static byte[] append(byte[] bArr, byte b15) {
        if (bArr == null) {
            return new byte[]{b15};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = b15;
        return bArr2;
    }

    public static boolean areAllZeroes(byte[] bArr, int i15, int i16) {
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            i17 |= bArr[i15 + i18];
        }
        return i17 == 0;
    }

    public static boolean areEqual(byte[] bArr, int i15, int i16, byte[] bArr2, int i17, int i18) {
        int i19 = i16 - i15;
        if (i19 != i18 - i17) {
            return false;
        }
        for (int i25 = 0; i25 < i19; i25++) {
            if (bArr[i15 + i25] != bArr2[i17 + i25]) {
                return false;
            }
        }
        return true;
    }

    public static void clear(byte[] bArr) {
        if (bArr != null) {
            java.util.Arrays.fill(bArr, (byte) 0);
        }
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static int compareUnsigned(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i15 = 0; i15 < iMin; i15++) {
            int i16 = bArr[i15] & 255;
            int i17 = bArr2[i15] & 255;
            if (i16 < i17) {
                return -1;
            }
            if (i16 > i17) {
                return 1;
            }
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        return bArr.length > bArr2.length ? 1 : 0;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return clone(bArr2);
        }
        if (bArr2 == null) {
            return clone(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean constantTimeAreEqual(int i15, byte[] bArr, int i16, byte[] bArr2, int i17) {
        if (bArr == null) {
            throw new NullPointerException("'a' cannot be null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("'b' cannot be null");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i16 > bArr.length - i15) {
            throw new IndexOutOfBoundsException("'aOff' value invalid for specified length");
        }
        if (i17 > bArr2.length - i15) {
            throw new IndexOutOfBoundsException("'bOff' value invalid for specified length");
        }
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            i18 |= bArr[i16 + i19] ^ bArr2[i17 + i19];
        }
        return i18 == 0;
    }

    public static boolean contains(byte[] bArr, byte b15) {
        for (byte b16 : bArr) {
            if (b16 == b15) {
                return true;
            }
        }
        return false;
    }

    public static byte[] copyOf(byte[] bArr, int i15) {
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i15));
        return bArr2;
    }

    public static byte[] copyOfRange(byte[] bArr, int i15, int i16) {
        int length = getLength(i15, i16);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i15, bArr2, 0, Math.min(bArr.length - i15, length));
        return bArr2;
    }

    public static void fill(byte[] bArr, byte b15) {
        java.util.Arrays.fill(bArr, b15);
    }

    private static int getLength(int i15, int i16) {
        int i17 = i16 - i15;
        if (i17 >= 0) {
            return i17;
        }
        throw new IllegalArgumentException(i15 + " > " + i16);
    }

    public static int hashCode(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i15 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i15;
            }
            i15 = (i15 * 257) ^ bArr[length];
        }
    }

    public static boolean isNullOrContainsNull(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullOrEmpty(byte[] bArr) {
        return bArr == null || bArr.length < 1;
    }

    public static byte[] prepend(byte[] bArr, byte b15) {
        if (bArr == null) {
            return new byte[]{b15};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b15;
        return bArr2;
    }

    public static void reverse(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - 1;
        for (int i15 = 0; i15 <= length; i15++) {
            bArr2[i15] = bArr[length - i15];
        }
    }

    public static void reverseInPlace(byte[] bArr, int i15, int i16) {
        int i17 = (i16 + i15) - 1;
        while (i15 < i17) {
            byte b15 = bArr[i15];
            bArr[i15] = bArr[i17];
            bArr[i17] = b15;
            i17--;
            i15++;
        }
    }

    public static boolean segmentsOverlap(int i15, int i16, int i17, int i18) {
        return i16 > 0 && i18 > 0 && i15 - i17 < i18 && i17 - i15 < i16;
    }

    public static void validateRange(byte[] bArr, int i15, int i16) {
        if (bArr == null) {
            throw new NullPointerException("'buf' cannot be null");
        }
        if (((bArr.length - i15) | i15 | (i16 - i15) | (bArr.length - i16)) >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("buf.length: " + bArr.length + ", from: " + i15 + ", to: " + i16);
    }

    public static void validateSegment(byte[] bArr, int i15, int i16) {
        if (bArr == null) {
            throw new NullPointerException("'buf' cannot be null");
        }
        int length = bArr.length - i15;
        if ((length | i15 | i16 | (length - i16)) >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("buf.length: " + bArr.length + ", off: " + i15 + ", len: " + i16);
    }

    public static int[] append(int[] iArr, int i15) {
        if (iArr == null) {
            return new int[]{i15};
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i15;
        return iArr2;
    }

    public static boolean areEqual(byte[] bArr, byte[] bArr2) {
        return java.util.Arrays.equals(bArr, bArr2);
    }

    public static void clear(char[] cArr) {
        if (cArr != null) {
            java.util.Arrays.fill(cArr, (char) 0);
        }
    }

    public static byte[] clone(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 == null || bArr2.length != bArr.length) {
            return clone(bArr);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return concatenate(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return concatenate(bArr, bArr3);
        }
        if (bArr3 == null) {
            return concatenate(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static boolean constantTimeAreEqual(int i15, long[] jArr, int i16, long[] jArr2, int i17) {
        if (jArr == null) {
            throw new NullPointerException("'a' cannot be null");
        }
        if (jArr2 == null) {
            throw new NullPointerException("'b' cannot be null");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i16 > jArr.length - i15) {
            throw new IndexOutOfBoundsException("'aOff' value invalid for specified length");
        }
        if (i17 > jArr2.length - i15) {
            throw new IndexOutOfBoundsException("'bOff' value invalid for specified length");
        }
        long j15 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            j15 |= jArr[i16 + i18] ^ jArr2[i17 + i18];
        }
        return 0 == j15;
    }

    public static boolean contains(char[] cArr, char c15) {
        for (char c16 : cArr) {
            if (c16 == c15) {
                return true;
            }
        }
        return false;
    }

    public static char[] copyOf(char[] cArr, int i15) {
        char[] cArr2 = new char[i15];
        System.arraycopy(cArr, 0, cArr2, 0, Math.min(cArr.length, i15));
        return cArr2;
    }

    public static char[] copyOfRange(char[] cArr, int i15, int i16) {
        int length = getLength(i15, i16);
        char[] cArr2 = new char[length];
        System.arraycopy(cArr, i15, cArr2, 0, Math.min(cArr.length - i15, length));
        return cArr2;
    }

    public static void fill(byte[] bArr, int i15, int i16, byte b15) {
        java.util.Arrays.fill(bArr, i15, i16, b15);
    }

    public static int hashCode(byte[] bArr, int i15, int i16) {
        if (bArr == null) {
            return 0;
        }
        int i17 = i16 + 1;
        while (true) {
            i16--;
            if (i16 < 0) {
                return i17;
            }
            i17 = (i17 * 257) ^ bArr[i15 + i16];
        }
    }

    public static boolean isNullOrEmpty(int[] iArr) {
        return iArr == null || iArr.length < 1;
    }

    public static int[] prepend(int[] iArr, int i15) {
        if (iArr == null) {
            return new int[]{i15};
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 1, length);
        iArr2[0] = i15;
        return iArr2;
    }

    public static byte[] reverse(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i15 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i15];
            i15++;
        }
    }

    public static byte[] reverseInPlace(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length - 1;
        for (int i15 = 0; i15 < length; i15++) {
            byte b15 = bArr[i15];
            bArr[i15] = bArr[length];
            bArr[length] = b15;
            length--;
        }
        return bArr;
    }

    public static String[] append(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    public static boolean areEqual(char[] cArr, char[] cArr2) {
        return java.util.Arrays.equals(cArr, cArr2);
    }

    public static void clear(int[] iArr) {
        if (iArr != null) {
            java.util.Arrays.fill(iArr, 0);
        }
    }

    public static char[] clone(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null) {
            return concatenate(bArr2, bArr3, bArr4);
        }
        if (bArr2 == null) {
            return concatenate(bArr, bArr3, bArr4);
        }
        if (bArr3 == null) {
            return concatenate(bArr, bArr2, bArr4);
        }
        if (bArr4 == null) {
            return concatenate(bArr, bArr2, bArr3);
        }
        byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr5, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr5, length2, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, length2 + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static boolean constantTimeAreEqual(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr == bArr2) {
                return true;
            }
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            int length2 = bArr.length ^ bArr2.length;
            for (int i15 = 0; i15 != length; i15++) {
                length2 |= bArr[i15] ^ bArr2[i15];
            }
            while (length < bArr2.length) {
                byte b15 = bArr2[length];
                length2 |= b15 ^ (~b15);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(int[] iArr, int i15) {
        for (int i16 : iArr) {
            if (i16 == i15) {
                return true;
            }
        }
        return false;
    }

    public static int[] copyOf(int[] iArr, int i15) {
        int[] iArr2 = new int[i15];
        System.arraycopy(iArr, 0, iArr2, 0, Math.min(iArr.length, i15));
        return iArr2;
    }

    public static int[] copyOfRange(int[] iArr, int i15, int i16) {
        int length = getLength(i15, i16);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, i15, iArr2, 0, Math.min(iArr.length - i15, length));
        return iArr2;
    }

    public static void fill(char[] cArr, char c15) {
        java.util.Arrays.fill(cArr, c15);
    }

    public static int hashCode(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i15 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i15;
            }
            i15 = (i15 * 257) ^ cArr[length];
        }
    }

    public static boolean isNullOrEmpty(Object[] objArr) {
        return objArr == null || objArr.length < 1;
    }

    public static short[] prepend(short[] sArr, short s15) {
        if (sArr == null) {
            return new short[]{s15};
        }
        int length = sArr.length;
        short[] sArr2 = new short[length + 1];
        System.arraycopy(sArr, 0, sArr2, 1, length);
        sArr2[0] = s15;
        return sArr2;
    }

    public static int[] reverse(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i15 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            iArr2[length] = iArr[i15];
            i15++;
        }
    }

    public static int[] reverseInPlace(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = iArr[i15];
            iArr[i15] = iArr[length];
            iArr[length] = i16;
            length--;
        }
        return iArr;
    }

    public static short[] append(short[] sArr, short s15) {
        if (sArr == null) {
            return new short[]{s15};
        }
        int length = sArr.length;
        short[] sArr2 = new short[length + 1];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        sArr2[length] = s15;
        return sArr2;
    }

    public static boolean areEqual(int[] iArr, int[] iArr2) {
        return java.util.Arrays.equals(iArr, iArr2);
    }

    public static void clear(long[] jArr) {
        if (jArr != null) {
            java.util.Arrays.fill(jArr, 0L);
        }
    }

    public static int[] clone(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static byte[] concatenate(byte[][] bArr) {
        int length = 0;
        for (int i15 = 0; i15 != bArr.length; i15++) {
            length += bArr[i15].length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (int i16 = 0; i16 != bArr.length; i16++) {
            byte[] bArr3 = bArr[i16];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr[i16].length;
        }
        return bArr2;
    }

    public static boolean constantTimeAreEqual(char[] cArr, char[] cArr2) {
        if (cArr != null && cArr2 != null) {
            if (cArr == cArr2) {
                return true;
            }
            int iMin = Math.min(cArr.length, cArr2.length);
            int length = cArr.length ^ cArr2.length;
            for (int i15 = 0; i15 != iMin; i15++) {
                length |= cArr[i15] ^ cArr2[i15];
            }
            while (iMin < cArr2.length) {
                char c15 = cArr2[iMin];
                length |= ((byte) (~c15)) ^ ((byte) c15);
                iMin++;
            }
            if (length == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(long[] jArr, long j15) {
        for (long j16 : jArr) {
            if (j16 == j15) {
                return true;
            }
        }
        return false;
    }

    public static long[] copyOf(long[] jArr, int i15) {
        long[] jArr2 = new long[i15];
        System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, i15));
        return jArr2;
    }

    public static long[] copyOfRange(long[] jArr, int i15, int i16) {
        int length = getLength(i15, i16);
        long[] jArr2 = new long[length];
        System.arraycopy(jArr, i15, jArr2, 0, Math.min(jArr.length - i15, length));
        return jArr2;
    }

    public static void fill(char[] cArr, int i15, int i16, char c15) {
        java.util.Arrays.fill(cArr, i15, i16, c15);
    }

    public static int hashCode(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i15 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i15;
            }
            i15 = (i15 * 257) ^ iArr[length];
        }
    }

    public static short[] reverseInPlace(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        int length = sArr.length - 1;
        for (int i15 = 0; i15 < length; i15++) {
            short s15 = sArr[i15];
            sArr[i15] = sArr[length];
            sArr[length] = s15;
            length--;
        }
        return sArr;
    }

    public static boolean areEqual(long[] jArr, long[] jArr2) {
        return java.util.Arrays.equals(jArr, jArr2);
    }

    public static long[] clone(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static int[] concatenate(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return clone(iArr2);
        }
        if (iArr2 == null) {
            return clone(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static boolean constantTimeAreEqual(long[] jArr, long[] jArr2) {
        if (jArr != null && jArr2 != null) {
            if (jArr == jArr2) {
                return true;
            }
            int length = jArr.length < jArr2.length ? jArr.length : jArr2.length;
            long length2 = jArr.length ^ jArr2.length;
            for (int i15 = 0; i15 != length; i15++) {
                length2 |= jArr[i15] ^ jArr2[i15];
            }
            while (length < jArr2.length) {
                long j15 = jArr2[length];
                length2 |= j15 ^ (~j15);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(short[] sArr, short s15) {
        for (short s16 : sArr) {
            if (s16 == s15) {
                return true;
            }
        }
        return false;
    }

    public static BigInteger[] copyOf(BigInteger[] bigIntegerArr, int i15) {
        BigInteger[] bigIntegerArr2 = new BigInteger[i15];
        System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, Math.min(bigIntegerArr.length, i15));
        return bigIntegerArr2;
    }

    public static BigInteger[] copyOfRange(BigInteger[] bigIntegerArr, int i15, int i16) {
        int length = getLength(i15, i16);
        BigInteger[] bigIntegerArr2 = new BigInteger[length];
        System.arraycopy(bigIntegerArr, i15, bigIntegerArr2, 0, Math.min(bigIntegerArr.length - i15, length));
        return bigIntegerArr2;
    }

    public static void fill(int[] iArr, int i15) {
        java.util.Arrays.fill(iArr, i15);
    }

    public static int hashCode(int[] iArr, int i15, int i16) {
        if (iArr == null) {
            return 0;
        }
        int i17 = i16 + 1;
        while (true) {
            i16--;
            if (i16 < 0) {
                return i17;
            }
            i17 = (i17 * 257) ^ iArr[i15 + i16];
        }
    }

    public static boolean areEqual(Object[] objArr, Object[] objArr2) {
        return java.util.Arrays.equals(objArr, objArr2);
    }

    public static long[] clone(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return clone(jArr);
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    public static short[] concatenate(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            return clone(sArr2);
        }
        if (sArr2 == null) {
            return clone(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z15) {
        for (boolean z16 : zArr) {
            if (z16 == z15) {
                return true;
            }
        }
        return false;
    }

    public static short[] copyOf(short[] sArr, int i15) {
        short[] sArr2 = new short[i15];
        System.arraycopy(sArr, 0, sArr2, 0, Math.min(sArr.length, i15));
        return sArr2;
    }

    public static short[] copyOfRange(short[] sArr, int i15, int i16) {
        int length = getLength(i15, i16);
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, i15, sArr2, 0, Math.min(sArr.length - i15, length));
        return sArr2;
    }

    public static void fill(int[] iArr, int i15, int i16, int i17) {
        java.util.Arrays.fill(iArr, i15, i16, i17);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null) {
            return 0;
        }
        int length = jArr.length;
        int i15 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i15;
            }
            long j15 = jArr[length];
            i15 = (((i15 * 257) ^ ((int) j15)) * 257) ^ ((int) (j15 >>> 32));
        }
    }

    public static boolean areEqual(short[] sArr, short[] sArr2) {
        return java.util.Arrays.equals(sArr, sArr2);
    }

    public static BigInteger[] clone(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null) {
            return null;
        }
        return (BigInteger[]) bigIntegerArr.clone();
    }

    public static boolean[] copyOf(boolean[] zArr, int i15) {
        boolean[] zArr2 = new boolean[i15];
        System.arraycopy(zArr, 0, zArr2, 0, Math.min(zArr.length, i15));
        return zArr2;
    }

    public static boolean[] copyOfRange(boolean[] zArr, int i15, int i16) {
        int length = getLength(i15, i16);
        boolean[] zArr2 = new boolean[length];
        System.arraycopy(zArr, i15, zArr2, 0, Math.min(zArr.length - i15, length));
        return zArr2;
    }

    public static void fill(long[] jArr, int i15, int i16, long j15) {
        java.util.Arrays.fill(jArr, i15, i16, j15);
    }

    public static int hashCode(long[] jArr, int i15, int i16) {
        if (jArr == null) {
            return 0;
        }
        int i17 = i16 + 1;
        while (true) {
            i16--;
            if (i16 < 0) {
                return i17;
            }
            long j15 = jArr[i15 + i16];
            i17 = (((i17 * 257) ^ ((int) j15)) * 257) ^ ((int) (j15 >>> 32));
        }
    }

    public static boolean areEqual(boolean[] zArr, boolean[] zArr2) {
        return java.util.Arrays.equals(zArr, zArr2);
    }

    public static short[] clone(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static void fill(long[] jArr, long j15) {
        java.util.Arrays.fill(jArr, j15);
    }

    public static int hashCode(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ Objects.hashCode(objArr[length]);
        }
    }

    public static boolean[] clone(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static void fill(Object[] objArr, int i15, int i16, Object obj) {
        java.util.Arrays.fill(objArr, i15, i16, obj);
    }

    public static int hashCode(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i15 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i15;
            }
            i15 = (i15 * 257) ^ (sArr[length] & 255);
        }
    }

    public static byte[][] clone(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][] bArr2 = new byte[length][];
        for (int i15 = 0; i15 != length; i15++) {
            bArr2[i15] = clone(bArr[i15]);
        }
        return bArr2;
    }

    public static void fill(Object[] objArr, Object obj) {
        java.util.Arrays.fill(objArr, obj);
    }

    public static int hashCode(int[][] iArr) {
        int iHashCode = 0;
        for (int i15 = 0; i15 != iArr.length; i15++) {
            iHashCode = (iHashCode * 257) + hashCode(iArr[i15]);
        }
        return iHashCode;
    }

    public static byte[][][] clone(byte[][][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][][] bArr2 = new byte[length][][];
        for (int i15 = 0; i15 != length; i15++) {
            bArr2[i15] = clone(bArr[i15]);
        }
        return bArr2;
    }

    public static void fill(short[] sArr, int i15, int i16, short s15) {
        java.util.Arrays.fill(sArr, i15, i16, s15);
    }

    public static int hashCode(short[][] sArr) {
        int iHashCode = 0;
        for (int i15 = 0; i15 != sArr.length; i15++) {
            iHashCode = (iHashCode * 257) + hashCode(sArr[i15]);
        }
        return iHashCode;
    }

    public static void fill(short[] sArr, short s15) {
        java.util.Arrays.fill(sArr, s15);
    }

    public static int hashCode(short[][][] sArr) {
        int iHashCode = 0;
        for (int i15 = 0; i15 != sArr.length; i15++) {
            iHashCode = (iHashCode * 257) + hashCode(sArr[i15]);
        }
        return iHashCode;
    }

    public static void fill(boolean[] zArr, int i15, int i16, boolean z15) {
        java.util.Arrays.fill(zArr, i15, i16, z15);
    }

    public static void fill(boolean[] zArr, boolean z15) {
        java.util.Arrays.fill(zArr, z15);
    }
}
