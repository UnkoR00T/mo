package org.bouncycastle.pqc.crypto.xmss;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class XMSSUtil {

    private static class CheckingStream extends ObjectInputStream {
        private static final Set components;
        private boolean found;
        private final Class mainClass;

        static {
            HashSet hashSet = new HashSet();
            components = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        CheckingStream(Class cls, InputStream inputStream) {
            super(inputStream);
            this.found = false;
            this.mainClass = cls;
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws InvalidClassException {
            if (this.found) {
                if (!components.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else {
                if (!objectStreamClass.getName().equals(this.mainClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                this.found = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (hasNullPointer(bArr) || hasNullPointer(bArr2)) {
            throw new NullPointerException("a or b == null");
        }
        for (int i15 = 0; i15 < bArr.length; i15++) {
            if (!Arrays.areEqual(bArr[i15], bArr2[i15])) {
                return false;
            }
        }
        return true;
    }

    public static long bytesToXBigEndian(byte[] bArr, int i15, int i16) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        long j15 = 0;
        for (int i17 = i15; i17 < i15 + i16; i17++) {
            j15 = (j15 << 8) | ((long) (bArr[i17] & 255));
        }
        return j15;
    }

    public static int calculateTau(int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            if (((i15 >> i17) & 1) == 0) {
                return i17;
            }
        }
        return 0;
    }

    public static byte[] cloneArray(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void copyBytesAtOffset(byte[] bArr, byte[] bArr2, int i15) {
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i15 > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i16 = 0; i16 < bArr2.length; i16++) {
            bArr[i15 + i16] = bArr2[i16];
        }
    }

    public static Object deserialize(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        CheckingStream checkingStream = new CheckingStream(cls, new ByteArrayInputStream(bArr));
        Object object = checkingStream.readObject();
        if (checkingStream.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(object)) {
            return object;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    public static void dumpByteArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException("x has null pointers");
        }
        for (byte[] bArr2 : bArr) {
            System.out.println(Hex.toHexString(bArr2));
        }
    }

    public static byte[] extractBytesAtOffset(byte[] bArr, int i15, int i16) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (i15 + i16 > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            bArr2[i17] = bArr[i15 + i17];
        }
        return bArr2;
    }

    public static int getDigestSize(Digest digest) {
        if (digest == null) {
            throw new NullPointerException("digest == null");
        }
        String algorithmName = digest.getAlgorithmName();
        if (algorithmName.equals("SHAKE128")) {
            return 32;
        }
        if (algorithmName.equals("SHAKE256")) {
            return 64;
        }
        return digest.getDigestSize();
    }

    public static int getLeafIndex(long j15, int i15) {
        return (int) (j15 & ((1 << i15) - 1));
    }

    public static long getTreeIndex(long j15, int i15) {
        return j15 >> i15;
    }

    public static boolean hasNullPointer(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIndexValid(int i15, long j15) {
        if (j15 >= 0) {
            return j15 < (1 << i15);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static boolean isNewAuthenticationPathNeeded(long j15, int i15, int i16) {
        return j15 != 0 && (j15 + 1) % ((long) Math.pow((double) (1 << i15), (double) i16)) == 0;
    }

    public static boolean isNewBDSInitNeeded(long j15, int i15, int i16) {
        return j15 != 0 && j15 % ((long) Math.pow((double) (1 << i15), (double) (i16 + 1))) == 0;
    }

    public static int log2(int i15) {
        int i16 = 0;
        while (true) {
            i15 >>= 1;
            if (i15 == 0) {
                return i16;
            }
            i16++;
        }
    }

    public static void longToBigEndian(long j15, byte[] bArr, int i15) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        if (bArr.length - i15 < 8) {
            throw new IllegalArgumentException("not enough space in array");
        }
        bArr[i15] = (byte) ((j15 >> 56) & 255);
        bArr[i15 + 1] = (byte) ((j15 >> 48) & 255);
        bArr[i15 + 2] = (byte) ((j15 >> 40) & 255);
        bArr[i15 + 3] = (byte) ((j15 >> 32) & 255);
        bArr[i15 + 4] = (byte) ((j15 >> 24) & 255);
        bArr[i15 + 5] = (byte) ((j15 >> 16) & 255);
        bArr[i15 + 6] = (byte) ((j15 >> 8) & 255);
        bArr[i15 + 7] = (byte) (j15 & 255);
    }

    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toBytesBigEndian(long j15, int i15) {
        byte[] bArr = new byte[i15];
        for (int i16 = i15 - 1; i16 >= 0; i16--) {
            bArr[i16] = (byte) j15;
            j15 >>>= 8;
        }
        return bArr;
    }

    public static byte[][] cloneArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i15 = 0; i15 < bArr.length; i15++) {
            byte[] bArr3 = new byte[bArr[i15].length];
            bArr2[i15] = bArr3;
            byte[] bArr4 = bArr[i15];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }
}
