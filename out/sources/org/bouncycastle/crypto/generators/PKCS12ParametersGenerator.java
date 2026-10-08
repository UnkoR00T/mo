package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
public class PKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f149082u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f149083v;

    public PKCS12ParametersGenerator(Digest digest) {
        this.digest = digest;
        if (digest instanceof ExtendedDigest) {
            this.f149082u = digest.getDigestSize();
            this.f149083v = ((ExtendedDigest) digest).getByteLength();
        } else {
            throw new IllegalArgumentException("Digest " + digest.getAlgorithmName() + " unsupported");
        }
    }

    private void adjust(byte[] bArr, int i15, byte[] bArr2) {
        int i16 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i15) - 1] & 255) + 1;
        bArr[(bArr2.length + i15) - 1] = (byte) i16;
        int i17 = i16 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i18 = i15 + length;
            int i19 = i17 + (bArr2[length] & 255) + (bArr[i18] & 255);
            bArr[i18] = (byte) i19;
            i17 = i19 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i15, int i16) {
        byte[] bArr;
        byte[] bArr2;
        int i17;
        int i18 = this.f149083v;
        byte[] bArr3 = new byte[i18];
        byte[] bArr4 = new byte[i16];
        int i19 = 0;
        for (int i25 = 0; i25 != i18; i25++) {
            bArr3[i25] = (byte) i15;
        }
        byte[] bArr5 = this.salt;
        int i26 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i27 = this.f149083v;
            int length = i27 * (((bArr5.length + i27) - 1) / i27);
            bArr = new byte[length];
            for (int i28 = 0; i28 != length; i28++) {
                byte[] bArr6 = this.salt;
                bArr[i28] = bArr6[i28 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i29 = this.f149083v;
            int length2 = i29 * (((bArr7.length + i29) - 1) / i29);
            bArr2 = new byte[length2];
            for (int i35 = 0; i35 != length2; i35++) {
                byte[] bArr8 = this.password;
                bArr2[i35] = bArr8[i35 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i36 = this.f149083v;
        byte[] bArr10 = new byte[i36];
        int i37 = this.f149082u;
        int i38 = ((i16 + i37) - 1) / i37;
        byte[] bArr11 = new byte[i37];
        int i39 = 1;
        while (i39 <= i38) {
            this.digest.update(bArr3, i19, i18);
            this.digest.update(bArr9, i19, length3);
            this.digest.doFinal(bArr11, i19);
            for (int i45 = i26; i45 < this.iterationCount; i45++) {
                this.digest.update(bArr11, i19, i37);
                this.digest.doFinal(bArr11, i19);
            }
            for (int i46 = i19; i46 != i36; i46++) {
                bArr10[i46] = bArr11[i46 % i37];
            }
            int i47 = i19;
            while (true) {
                int i48 = this.f149083v;
                if (i47 == length3 / i48) {
                    break;
                }
                adjust(bArr9, i48 * i47, bArr10);
                i47++;
            }
            if (i39 == i38) {
                int i49 = i39 - 1;
                int i55 = this.f149082u;
                int i56 = i49 * i55;
                int i57 = i16 - (i49 * i55);
                i17 = 0;
                System.arraycopy(bArr11, 0, bArr4, i56, i57);
            } else {
                i17 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i39 - 1) * this.f149082u, i37);
            }
            i39++;
            i19 = i17;
            i26 = 1;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i15) {
        int i16 = i15 / 8;
        return new KeyParameter(generateDerivedKey(3, i16), 0, i16);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i15) {
        int i16 = i15 / 8;
        return new KeyParameter(generateDerivedKey(1, i16), 0, i16);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i15, int i16) {
        int i17 = i15 / 8;
        int i18 = i16 / 8;
        byte[] bArrGenerateDerivedKey = generateDerivedKey(1, i17);
        return new ParametersWithIV(new KeyParameter(bArrGenerateDerivedKey, 0, i17), generateDerivedKey(2, i18), 0, i18);
    }
}
