package org.bouncycastle.crypto.threshold;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ShamirSecretSplitter implements SecretSplitter {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f149210l;
    private final Polynomial poly;
    protected SecureRandom random;

    public enum Algorithm {
        AES,
        RSA
    }

    public enum Mode {
        Native,
        Table
    }

    public ShamirSecretSplitter(Algorithm algorithm, Mode mode, int i15, SecureRandom secureRandom) {
        if (i15 < 0 || i15 > 65534) {
            throw new IllegalArgumentException("Invalid input: l ranges from 0 to 65534 (2^16-2) bytes.");
        }
        this.poly = Polynomial.newInstance(algorithm, mode);
        this.f149210l = i15;
        this.random = secureRandom;
    }

    private byte[][] initP(int i15, int i16) {
        if (i15 < 1 || i15 > 255) {
            throw new IllegalArgumentException("Invalid input: m must be less than 256 and positive.");
        }
        if (i16 < i15 || i16 > 255) {
            throw new IllegalArgumentException("Invalid input: n must be less than 256 and greater than or equal to n.");
        }
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i16, i15);
        for (int i17 = 0; i17 < i16; i17++) {
            for (int i18 = 0; i18 < i15; i18++) {
                bArr[i17][i18] = this.poly.gfPow((byte) (i17 + 1), (byte) i18);
            }
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.threshold.SecretSplitter
    public ShamirSplitSecret resplit(byte[] bArr, int i15, int i16) {
        byte[][] bArrInitP = initP(i15, i16);
        int i17 = 0;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i15, this.f149210l);
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = new ShamirSplitSecretShare[this.f149210l];
        bArr2[0] = Arrays.clone(bArr);
        for (int i18 = 1; i18 < i15; i18++) {
            this.random.nextBytes(bArr2[i18]);
        }
        while (i17 < bArrInitP.length) {
            int i19 = i17 + 1;
            shamirSplitSecretShareArr[i17] = new ShamirSplitSecretShare(this.poly.gfVecMul(bArrInitP[i17], bArr2), i19);
            i17 = i19;
        }
        return new ShamirSplitSecret(this.poly, shamirSplitSecretShareArr);
    }

    @Override // org.bouncycastle.crypto.threshold.SecretSplitter
    public ShamirSplitSecret split(int i15, int i16) {
        byte[][] bArrInitP = initP(i15, i16);
        int i17 = 0;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i15, this.f149210l);
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = new ShamirSplitSecretShare[this.f149210l];
        for (int i18 = 0; i18 < i15; i18++) {
            this.random.nextBytes(bArr[i18]);
        }
        while (i17 < bArrInitP.length) {
            int i19 = i17 + 1;
            shamirSplitSecretShareArr[i17] = new ShamirSplitSecretShare(this.poly.gfVecMul(bArrInitP[i17], bArr), i19);
            i17 = i19;
        }
        return new ShamirSplitSecret(this.poly, shamirSplitSecretShareArr);
    }

    @Override // org.bouncycastle.crypto.threshold.SecretSplitter
    public ShamirSplitSecret splitAround(SecretShare secretShare, int i15, int i16) {
        byte[][] bArrInitP = initP(i15, i16);
        int i17 = 1;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i15, this.f149210l);
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = new ShamirSplitSecretShare[this.f149210l];
        byte[] encoded = secretShare.getEncoded();
        shamirSplitSecretShareArr[0] = new ShamirSplitSecretShare(encoded, 1);
        for (int i18 = 0; i18 < i15; i18++) {
            this.random.nextBytes(bArr[i18]);
        }
        for (int i19 = 0; i19 < this.f149210l; i19++) {
            byte b15 = bArr[1][i19];
            for (int i25 = 2; i25 < i15; i25++) {
                b15 = (byte) (b15 ^ bArr[i25][i19]);
            }
            bArr[0][i19] = (byte) (b15 ^ encoded[i19]);
        }
        while (i17 < bArrInitP.length) {
            int i26 = i17 + 1;
            shamirSplitSecretShareArr[i17] = new ShamirSplitSecretShare(this.poly.gfVecMul(bArrInitP[i17], bArr), i26);
            i17 = i26;
        }
        return new ShamirSplitSecret(this.poly, shamirSplitSecretShareArr);
    }
}
