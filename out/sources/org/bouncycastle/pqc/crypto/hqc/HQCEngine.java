package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class HQCEngine {
    private static final int SALT_SIZE_BYTES = 16;
    private static final int SEED_BYTES = 32;
    private final int K_BYTE;
    private final int N1N2_BYTE;
    private final int N1N2_BYTE_64;
    private final int N_BYTE;
    private final int N_BYTE_64;
    private final int N_MU;
    private final int delta;
    private final int fft;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f149465g;
    private final int[] generatorPoly;

    /* JADX INFO: renamed from: gf, reason: collision with root package name */
    private final GF2PolynomialCalculator f149466gf;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f149467k;
    private final int mulParam;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f149468n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private final int f149469n1;
    private final int pkSize;
    private final long rejectionThreshold;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f149470w;

    /* JADX INFO: renamed from: wr, reason: collision with root package name */
    private final int f149471wr;

    public HQCEngine(int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, int i29, int i35, int[] iArr) {
        this.f149468n = i15;
        this.f149467k = i18;
        this.delta = i25;
        this.f149470w = i26;
        this.f149471wr = i27;
        this.f149469n1 = i16;
        this.generatorPoly = iArr;
        this.f149465g = i19;
        this.fft = i28;
        this.N_MU = i29;
        this.pkSize = i35;
        this.mulParam = i17 >> 7;
        this.N_BYTE = Utils.getByteSizeFromBitSize(i15);
        this.K_BYTE = i18;
        int byte64SizeFromBitSize = Utils.getByte64SizeFromBitSize(i15);
        this.N_BYTE_64 = byte64SizeFromBitSize;
        int i36 = i16 * i17;
        this.N1N2_BYTE_64 = Utils.getByte64SizeFromBitSize(i36);
        this.N1N2_BYTE = Utils.getByteSizeFromBitSize(i36);
        this.f149466gf = new GF2PolynomialCalculator(byte64SizeFromBitSize, i15, (1 << (i15 & 63)) - 1);
        long j15 = i15;
        this.rejectionThreshold = (16777216 / j15) * j15;
    }

    private int barrettReduce(int i15) {
        long j15 = (((long) i15) * ((long) this.N_MU)) >>> 32;
        int i16 = this.f149468n;
        int i17 = i15 - ((int) (j15 * ((long) i16)));
        return i17 - ((-(((i17 - i16) >>> 31) ^ 1)) & i16);
    }

    private static int compareU32(int i15, int i16) {
        return (((i15 - i16) | (i16 - i15)) >>> 31) ^ 1;
    }

    private void generateRandomSupport(int[] iArr, int i15, Shake256RandomGenerator shake256RandomGenerator) {
        int i16 = i15 * 3;
        byte[] bArr = new byte[i16];
        int i17 = i16;
        int i18 = 0;
        while (i18 < i15) {
            if (i17 == i16) {
                shake256RandomGenerator.xofGetBytes(bArr, i16);
                i17 = 0;
            }
            int i19 = i17 + 2;
            int i25 = ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17] & 255) << 16);
            i17 += 3;
            int i26 = i25 | (bArr[i19] & 255);
            if (i26 < this.rejectionThreshold) {
                int iBarrettReduce = barrettReduce(i26);
                int i27 = 0;
                while (true) {
                    if (i27 >= i18) {
                        iArr[i18] = iBarrettReduce;
                        i18++;
                        break;
                    } else if (iArr[i27] == iBarrettReduce) {
                        break;
                    } else {
                        i27++;
                    }
                }
            }
        }
    }

    private void hashGJ(byte[] bArr, int i15, byte[] bArr2, byte[] bArr3, int i16, int i17, byte[] bArr4, int i18, int i19, byte b15) {
        SHA3Digest sHA3Digest = new SHA3Digest(i15);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.update(bArr3, i16, i17);
        sHA3Digest.update(bArr4, i18, i19);
        sHA3Digest.update(b15);
        sHA3Digest.doFinal(bArr, 0);
    }

    private static void hashHI(byte[] bArr, int i15, byte[] bArr2, int i16, byte b15) {
        SHA3Digest sHA3Digest = new SHA3Digest(i15);
        sHA3Digest.update(bArr2, 0, i16);
        sHA3Digest.update(b15);
        sHA3Digest.doFinal(bArr, 0);
    }

    private void pkeEncrypt(long[] jArr, long[] jArr2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i15) {
        int i16 = this.N_BYTE_64;
        long[] jArr3 = new long[i16];
        long[] jArr4 = new long[i16];
        int i17 = this.f149469n1;
        byte[] bArr4 = new byte[i17];
        ReedSolomon.encode(bArr4, bArr2, i17, this.f149467k, this.f149465g, this.generatorPoly);
        ReedMuller.encode(jArr2, bArr4, this.f149469n1, this.mulParam);
        Shake256RandomGenerator shake256RandomGenerator = new Shake256RandomGenerator(bArr, 0, 32, (byte) 1);
        vectSetRandom(shake256RandomGenerator, jArr4);
        shake256RandomGenerator.init(bArr3, i15, 32, (byte) 1);
        vectSampleFixedWeights2(shake256RandomGenerator, jArr3, this.f149471wr);
        this.f149466gf.vectMul(jArr, jArr3, jArr4);
        Utils.fromByteArrayToLongArray(jArr4, bArr, 32, this.pkSize - 32);
        this.f149466gf.vectMul(jArr4, jArr3, jArr4);
        vectSampleFixedWeights2(shake256RandomGenerator, jArr3, this.f149471wr);
        Longs.xorTo(this.N_BYTE_64, jArr3, 0, jArr4, 0);
        vectTruncate(jArr4);
        Longs.xorTo(this.N1N2_BYTE_64, jArr4, 0, jArr2, 0);
        vectSampleFixedWeights2(shake256RandomGenerator, jArr4, this.f149471wr);
        Longs.xorTo(this.N_BYTE_64, jArr4, 0, jArr, 0);
        Arrays.clear(jArr3);
        Arrays.clear(jArr4);
        Arrays.clear(bArr4);
    }

    private void vectSampleFixedWeights2(Shake256RandomGenerator shake256RandomGenerator, long[] jArr, int i15) {
        int i16 = this.f149471wr;
        int[] iArr = new int[i16];
        int i17 = i16 << 2;
        byte[] bArr = new byte[i17];
        shake256RandomGenerator.xofGetBytes(bArr, i17);
        Pack.littleEndianToInt(bArr, 0, iArr);
        for (int i18 = 0; i18 < i15; i18++) {
            iArr[i18] = ((int) (((((long) iArr[i18]) & BodyPartID.bodyIdMax) * ((long) (this.f149468n - i18))) >> 32)) + i18;
        }
        int i19 = i15 - 1;
        while (true) {
            int i25 = i19 - 1;
            if (i19 <= 0) {
                writeSupportToVector(jArr, iArr, i15);
                return;
            }
            int iCompareU32 = 0;
            while (i19 < i15) {
                iCompareU32 |= compareU32(iArr[i19], iArr[i25]);
                i19++;
            }
            int i26 = -iCompareU32;
            iArr[i25] = ((~i26) & iArr[i25]) ^ (i26 & i25);
            i19 = i25;
        }
    }

    private void vectSetRandom(Shake256RandomGenerator shake256RandomGenerator, long[] jArr) {
        byte[] bArr = new byte[jArr.length << 3];
        shake256RandomGenerator.xofGetBytes(bArr, this.N_BYTE);
        Pack.littleEndianToLong(bArr, 0, jArr);
        int i15 = this.N_BYTE_64 - 1;
        jArr[i15] = jArr[i15] & Utils.bitMask(this.f149468n, 64L);
    }

    private void vectTruncate(long[] jArr) {
        Arrays.fill(jArr, this.N1N2_BYTE_64, (this.f149468n + 63) >> 6, 0L);
    }

    private void writeSupportToVector(long[] jArr, int[] iArr, int i15) {
        int i16 = this.f149471wr;
        int[] iArr2 = new int[i16];
        long[] jArr2 = new long[i16];
        for (int i17 = 0; i17 < i15; i17++) {
            iArr2[i17] = iArr[i17] >>> 6;
            jArr2[i17] = 1 << (iArr[i17] & 63);
        }
        for (int i18 = 0; i18 < jArr.length; i18++) {
            long j15 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                int i25 = i18 - iArr2[i19];
                j15 |= jArr2[i19] & ((long) (-(((i25 | (-i25)) >>> 31) ^ 1)));
            }
            jArr[i18] = j15;
        }
    }

    public int decaps(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i15 = this.N_BYTE_64;
        long[] jArr = new long[i15];
        long[] jArr2 = new long[i15];
        long[] jArr3 = new long[i15];
        long[] jArr4 = new long[i15];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        int i16 = this.f149467k;
        byte[] bArr6 = new byte[i16];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[this.f149469n1];
        vectSampleFixedWeight1(jArr4, new Shake256RandomGenerator(bArr3, this.pkSize, 32, (byte) 1), this.f149470w);
        Utils.fromByteArrayToLongArray(jArr, bArr2, 0, this.N_BYTE);
        Utils.fromByteArrayToLongArray(jArr2, bArr2, this.N_BYTE, this.N1N2_BYTE);
        this.f149466gf.vectMul(jArr3, jArr4, jArr);
        vectTruncate(jArr3);
        Longs.xorTo(this.N_BYTE_64, jArr2, 0, jArr3, 0);
        ReedMuller.decode(bArr8, jArr3, this.f149469n1, this.mulParam);
        ReedSolomon.decode(bArr6, bArr8, this.f149469n1, this.fft, this.delta, this.f149467k, this.f149465g);
        hashHI(bArr4, 256, bArr3, this.pkSize, (byte) 1);
        hashGJ(bArr5, 512, bArr4, bArr6, 0, i16, bArr2, this.N_BYTE + this.N1N2_BYTE, 16, (byte) 0);
        System.arraycopy(bArr5, 0, bArr, 0, 32);
        Arrays.fill(jArr4, 0L);
        pkeEncrypt(jArr3, jArr4, bArr3, bArr6, bArr5, 32);
        hashGJ(bArr7, 256, bArr4, bArr3, this.pkSize + 32, this.K_BYTE, bArr2, 0, bArr2.length, (byte) 3);
        int i17 = !Arrays.constantTimeAreEqual(this.N_BYTE_64, jArr, 0, jArr3, 0) ? 1 : 0;
        if (!Arrays.constantTimeAreEqual(this.N_BYTE_64, jArr2, 0, jArr4, 0)) {
            i17 = 1;
        }
        int i18 = i17 - 1;
        for (int i19 = 0; i19 < this.K_BYTE; i19++) {
            bArr[i19] = (byte) (((bArr[i19] & i18) ^ (bArr7[i19] & (~i18))) & GF2Field.MASK);
        }
        Arrays.clear(jArr);
        Arrays.clear(jArr2);
        Arrays.clear(jArr3);
        Arrays.clear(jArr4);
        Arrays.clear(bArr4);
        Arrays.clear(bArr5);
        Arrays.clear(bArr6);
        Arrays.clear(bArr7);
        Arrays.clear(bArr8);
        return -i18;
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, SecureRandom secureRandom) {
        int i15 = this.K_BYTE;
        byte[] bArr6 = new byte[i15];
        byte[] bArr7 = new byte[32];
        long[] jArr = new long[this.N_BYTE_64];
        long[] jArr2 = new long[this.N1N2_BYTE_64];
        secureRandom.nextBytes(bArr6);
        secureRandom.nextBytes(bArr5);
        hashHI(bArr7, 256, bArr4, bArr4.length, (byte) 1);
        hashGJ(bArr3, 512, bArr7, bArr6, 0, i15, bArr5, 0, 16, (byte) 0);
        pkeEncrypt(jArr, jArr2, bArr4, bArr6, bArr3, 32);
        Utils.fromLongArrayToByteArray(bArr, jArr);
        Utils.fromLongArrayToByteArray(bArr2, jArr2);
        Arrays.clear(jArr);
        Arrays.clear(jArr2);
        Arrays.clear(bArr6);
        Arrays.clear(bArr7);
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[64];
        int i15 = this.N_BYTE_64;
        long[] jArr = new long[i15];
        long[] jArr2 = new long[i15];
        long[] jArr3 = new long[i15];
        secureRandom.nextBytes(bArr3);
        Shake256RandomGenerator shake256RandomGenerator = new Shake256RandomGenerator(bArr3, (byte) 1);
        System.arraycopy(bArr3, 0, bArr2, this.pkSize + 32 + this.K_BYTE, 32);
        shake256RandomGenerator.nextBytes(bArr3);
        shake256RandomGenerator.nextBytes(bArr2, this.pkSize + 32, this.K_BYTE);
        hashHI(bArr4, 512, bArr3, 32, (byte) 2);
        shake256RandomGenerator.init(bArr4, 0, 32, (byte) 1);
        vectSampleFixedWeight1(jArr2, shake256RandomGenerator, this.f149470w);
        vectSampleFixedWeight1(jArr, shake256RandomGenerator, this.f149470w);
        System.arraycopy(bArr4, 32, bArr, 0, 32);
        shake256RandomGenerator.init(bArr4, 32, 32, (byte) 1);
        vectSetRandom(shake256RandomGenerator, jArr3);
        this.f149466gf.vectMul(jArr3, jArr2, jArr3);
        Longs.xorTo(this.N_BYTE_64, jArr, 0, jArr3, 0);
        Utils.fromLongArrayToByteArray(bArr, 32, bArr.length - 32, jArr3);
        System.arraycopy(bArr4, 0, bArr2, this.pkSize, 32);
        System.arraycopy(bArr, 0, bArr2, 0, this.pkSize);
        Arrays.clear(bArr4);
        Arrays.clear(jArr);
        Arrays.clear(jArr2);
        Arrays.clear(jArr3);
    }

    public void vectSampleFixedWeight1(long[] jArr, Shake256RandomGenerator shake256RandomGenerator, int i15) {
        int[] iArr = new int[this.f149471wr];
        generateRandomSupport(iArr, i15, shake256RandomGenerator);
        writeSupportToVector(jArr, iArr, i15);
    }
}
