package org.bouncycastle.math.ec.rfc7748;

import java.security.SecureRandom;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class X448 {
    private static final int C_A = 156326;
    private static final int C_A24 = 39082;
    public static final int POINT_SIZE = 56;
    public static final int SCALAR_SIZE = 56;

    private static class F extends X448Field {
        private F() {
        }
    }

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public static boolean calculateAgreement(byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17) {
        scalarMult(bArr, i15, bArr2, i16, bArr3, i17);
        return !Arrays.areAllZeroes(bArr3, i17, 56);
    }

    public static void clampPrivateKey(byte[] bArr) {
        if (bArr.length != 56) {
            throw new IllegalArgumentException("k");
        }
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    private static int decode32(byte[] bArr, int i15) {
        return (bArr[i15 + 3] << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
    }

    private static void decodeScalar(byte[] bArr, int i15, int[] iArr) {
        for (int i16 = 0; i16 < 14; i16++) {
            iArr[i16] = decode32(bArr, (i16 * 4) + i15);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | PKIFailureInfo.systemUnavail;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        if (bArr.length != 56) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
        clampPrivateKey(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i15, byte[] bArr2, int i16) {
        scalarMultBase(bArr, i15, bArr2, i16);
    }

    private static void pointDouble(int[] iArr, int[] iArr2) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        X448Field.add(iArr, iArr2, iArrCreate);
        X448Field.sub(iArr, iArr2, iArrCreate2);
        X448Field.sqr(iArrCreate, iArrCreate);
        X448Field.sqr(iArrCreate2, iArrCreate2);
        X448Field.mul(iArrCreate, iArrCreate2, iArr);
        X448Field.sub(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.mul(iArrCreate, C_A24, iArr2);
        X448Field.add(iArr2, iArrCreate2, iArr2);
        X448Field.mul(iArr2, iArrCreate, iArr2);
    }

    public static void precompute() {
        Ed448.precompute();
    }

    public static void scalarMult(byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17) {
        int[] iArr = new int[14];
        decodeScalar(bArr, i15, iArr);
        int[] iArrCreate = X448Field.create();
        X448Field.decode(bArr2, i16, iArrCreate);
        int[] iArrCreate2 = X448Field.create();
        X448Field.copy(iArrCreate, 0, iArrCreate2, 0);
        int[] iArrCreate3 = X448Field.create();
        iArrCreate3[0] = 1;
        int[] iArrCreate4 = X448Field.create();
        iArrCreate4[0] = 1;
        int[] iArrCreate5 = X448Field.create();
        int[] iArrCreate6 = X448Field.create();
        int[] iArrCreate7 = X448Field.create();
        int i18 = 447;
        int i19 = 1;
        while (true) {
            X448Field.add(iArrCreate4, iArrCreate5, iArrCreate6);
            X448Field.sub(iArrCreate4, iArrCreate5, iArrCreate4);
            X448Field.add(iArrCreate2, iArrCreate3, iArrCreate5);
            X448Field.sub(iArrCreate2, iArrCreate3, iArrCreate2);
            X448Field.mul(iArrCreate6, iArrCreate2, iArrCreate6);
            X448Field.mul(iArrCreate4, iArrCreate5, iArrCreate4);
            X448Field.sqr(iArrCreate5, iArrCreate5);
            X448Field.sqr(iArrCreate2, iArrCreate2);
            X448Field.sub(iArrCreate5, iArrCreate2, iArrCreate7);
            X448Field.mul(iArrCreate7, C_A24, iArrCreate3);
            X448Field.add(iArrCreate3, iArrCreate2, iArrCreate3);
            X448Field.mul(iArrCreate3, iArrCreate7, iArrCreate3);
            X448Field.mul(iArrCreate2, iArrCreate5, iArrCreate2);
            X448Field.sub(iArrCreate6, iArrCreate4, iArrCreate5);
            X448Field.add(iArrCreate6, iArrCreate4, iArrCreate4);
            X448Field.sqr(iArrCreate4, iArrCreate4);
            X448Field.sqr(iArrCreate5, iArrCreate5);
            X448Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
            i18--;
            int i25 = (iArr[i18 >>> 5] >>> (i18 & 31)) & 1;
            int i26 = i19 ^ i25;
            X448Field.cswap(i26, iArrCreate2, iArrCreate4);
            X448Field.cswap(i26, iArrCreate3, iArrCreate5);
            if (i18 < 2) {
                break;
            } else {
                i19 = i25;
            }
        }
        for (int i27 = 0; i27 < 2; i27++) {
            pointDouble(iArrCreate2, iArrCreate3);
        }
        X448Field.inv(iArrCreate3, iArrCreate3);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.normalize(iArrCreate2);
        X448Field.encode(iArrCreate2, bArr3, i17);
    }

    public static void scalarMultBase(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        Ed448.scalarMultBaseXY(Friend.INSTANCE, bArr, i15, iArrCreate, iArrCreate2);
        X448Field.inv(iArrCreate, iArrCreate);
        X448Field.mul(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.sqr(iArrCreate, iArrCreate);
        X448Field.normalize(iArrCreate);
        X448Field.encode(iArrCreate, bArr2, i16);
    }
}
