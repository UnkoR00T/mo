package org.bouncycastle.pqc.crypto.mlkem;

import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class MLKEMEngine {
    private static final int KyberEta2 = 2;
    private static final int KyberIndCpaMsgBytes = 32;
    public static final int KyberN = 256;
    public static final int KyberPolyBytes = 384;
    public static final int KyberQ = 3329;
    public static final int KyberQinv = 62209;
    private static final int KyberSharedSecretBytes = 32;
    public static final int KyberSymBytes = 32;
    private final int CryptoBytes;
    private final int CryptoCipherTextBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int KyberCipherTextBytes;
    private final int KyberEta1;
    private final int KyberIndCpaBytes;
    private final int KyberIndCpaPublicKeyBytes;
    private final int KyberIndCpaSecretKeyBytes;
    private final int KyberK;
    private final int KyberPolyCompressedBytes;
    private final int KyberPolyVecBytes;
    private final int KyberPolyVecCompressedBytes;
    private final int KyberPublicKeyBytes;
    private final int KyberSecretKeyBytes;
    private final MLKEMIndCpa indCpa;
    private SecureRandom random;
    private final int sessionKeyLength;
    private final Symmetric symmetric;

    public MLKEMEngine(int i15) {
        int i16;
        this.KyberK = i15;
        if (i15 != 2) {
            if (i15 == 3) {
                this.KyberEta1 = 2;
            } else {
                if (i15 != 4) {
                    throw new IllegalArgumentException("K: " + i15 + " is not supported for Crystals Kyber");
                }
                this.KyberEta1 = 2;
                this.KyberPolyCompressedBytes = 160;
                i16 = i15 * 352;
            }
            this.KyberPolyVecCompressedBytes = i16;
            this.sessionKeyLength = 32;
            int i17 = i15 * KyberPolyBytes;
            this.KyberPolyVecBytes = i17;
            int i18 = i17 + 32;
            this.KyberIndCpaPublicKeyBytes = i18;
            this.KyberIndCpaSecretKeyBytes = i17;
            int i19 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
            this.KyberIndCpaBytes = i19;
            this.KyberPublicKeyBytes = i18;
            int i25 = i17 + i18 + 64;
            this.KyberSecretKeyBytes = i25;
            this.KyberCipherTextBytes = i19;
            this.CryptoBytes = 32;
            this.CryptoSecretKeyBytes = i25;
            this.CryptoPublicKeyBytes = i18;
            this.CryptoCipherTextBytes = i19;
            this.symmetric = new Symmetric.ShakeSymmetric();
            this.indCpa = new MLKEMIndCpa(this);
        }
        this.KyberEta1 = 3;
        this.KyberPolyCompressedBytes = 128;
        i16 = i15 * 320;
        this.KyberPolyVecCompressedBytes = i16;
        this.sessionKeyLength = 32;
        int i110 = i15 * KyberPolyBytes;
        this.KyberPolyVecBytes = i110;
        int i111 = i110 + 32;
        this.KyberIndCpaPublicKeyBytes = i111;
        this.KyberIndCpaSecretKeyBytes = i110;
        int i112 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
        this.KyberIndCpaBytes = i112;
        this.KyberPublicKeyBytes = i111;
        int i26 = i110 + i111 + 64;
        this.KyberSecretKeyBytes = i26;
        this.KyberCipherTextBytes = i112;
        this.CryptoBytes = 32;
        this.CryptoSecretKeyBytes = i26;
        this.CryptoPublicKeyBytes = i111;
        this.CryptoCipherTextBytes = i112;
        this.symmetric = new Symmetric.ShakeSymmetric();
        this.indCpa = new MLKEMIndCpa(this);
    }

    private void cmov(byte[] bArr, byte[] bArr2, int i15, int i16) {
        int i17 = (0 - i16) >> 24;
        for (int i18 = 0; i18 != i15; i18++) {
            bArr[i18] = (byte) ((bArr2[i18] & i17) | (bArr[i18] & (~i17)));
        }
    }

    private int constantTimeZeroOnEqual(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length ^ bArr.length;
        for (int i15 = 0; i15 != bArr2.length; i15++) {
            length |= bArr[i15] ^ bArr2[i15];
        }
        return length & GF2Field.MASK;
    }

    public static int getKyberEta2() {
        return 2;
    }

    public static int getKyberIndCpaMsgBytes() {
        return 32;
    }

    boolean checkModulus(byte[] bArr) {
        return PolyVec.checkModulus(this, bArr) < 0;
    }

    public byte[][] generateKemKeyPair() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        this.random.nextBytes(bArr);
        this.random.nextBytes(bArr2);
        return generateKemKeyPairInternal(bArr, bArr2);
    }

    public byte[][] generateKemKeyPairInternal(byte[] bArr, byte[] bArr2) {
        byte[][] bArrGenerateKeyPair = this.indCpa.generateKeyPair(bArr);
        int i15 = this.KyberIndCpaSecretKeyBytes;
        byte[] bArr3 = new byte[i15];
        System.arraycopy(bArrGenerateKeyPair[1], 0, bArr3, 0, i15);
        byte[] bArr4 = new byte[32];
        this.symmetric.hash_h(bArr4, bArrGenerateKeyPair[0], 0);
        int i16 = this.KyberIndCpaPublicKeyBytes;
        byte[] bArr5 = new byte[i16];
        System.arraycopy(bArrGenerateKeyPair[0], 0, bArr5, 0, i16);
        int i17 = i16 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr5, 0, i17), Arrays.copyOfRange(bArr5, i17, i16), bArr3, bArr4, bArr2, Arrays.concatenate(bArr, bArr2)};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoCipherTextBytes() {
        return this.CryptoCipherTextBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getKyberCipherTextBytes() {
        return this.KyberCipherTextBytes;
    }

    public int getKyberEta1() {
        return this.KyberEta1;
    }

    public int getKyberIndCpaBytes() {
        return this.KyberIndCpaBytes;
    }

    public int getKyberIndCpaPublicKeyBytes() {
        return this.KyberIndCpaPublicKeyBytes;
    }

    public int getKyberIndCpaSecretKeyBytes() {
        return this.KyberIndCpaSecretKeyBytes;
    }

    public int getKyberK() {
        return this.KyberK;
    }

    public int getKyberPolyCompressedBytes() {
        return this.KyberPolyCompressedBytes;
    }

    public int getKyberPolyVecBytes() {
        return this.KyberPolyVecBytes;
    }

    public int getKyberPolyVecCompressedBytes() {
        return this.KyberPolyVecCompressedBytes;
    }

    public int getKyberPublicKeyBytes() {
        return this.KyberPublicKeyBytes;
    }

    public int getKyberSecretKeyBytes() {
        return this.KyberSecretKeyBytes;
    }

    public Symmetric getSymmetric() {
        return this.symmetric;
    }

    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    byte[] kemDecrypt(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters, byte[] bArr) {
        byte[] encoded = mLKEMPrivateKeyParameters.getEncoded();
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, this.KyberIndCpaSecretKeyBytes, encoded.length);
        System.arraycopy(this.indCpa.decrypt(encoded, bArr), 0, bArr2, 0, 32);
        System.arraycopy(encoded, this.KyberSecretKeyBytes - 64, bArr2, 32, 32);
        this.symmetric.hash_g(bArr3, bArr2);
        byte[] bArr4 = new byte[this.KyberCipherTextBytes + 32];
        System.arraycopy(encoded, this.KyberSecretKeyBytes - 32, bArr4, 0, 32);
        System.arraycopy(bArr, 0, bArr4, 32, this.KyberCipherTextBytes);
        this.symmetric.kdf(bArr4, bArr4);
        cmov(bArr3, bArr4, 32, constantTimeZeroOnEqual(bArr, this.indCpa.encrypt(bArrCopyOfRange, Arrays.copyOfRange(bArr2, 0, 32), Arrays.copyOfRange(bArr3, 32, 64))));
        return Arrays.copyOfRange(bArr3, 0, this.sessionKeyLength);
    }

    byte[][] kemEncrypt(MLKEMPublicKeyParameters mLKEMPublicKeyParameters, byte[] bArr) {
        byte[] encoded = mLKEMPublicKeyParameters.getEncoded();
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        this.symmetric.hash_h(bArr2, encoded, 32);
        this.symmetric.hash_g(bArr3, bArr2);
        byte[] bArrEncrypt = this.indCpa.encrypt(encoded, Arrays.copyOfRange(bArr2, 0, 32), Arrays.copyOfRange(bArr3, 32, 64));
        int i15 = this.sessionKeyLength;
        byte[] bArr4 = new byte[i15];
        System.arraycopy(bArr3, 0, bArr4, 0, i15);
        return new byte[][]{bArr4, bArrEncrypt};
    }
}
