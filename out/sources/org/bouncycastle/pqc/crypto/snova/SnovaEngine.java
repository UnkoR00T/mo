package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class SnovaEngine {
    private static final Map<Integer, byte[]> fixedAbqSet = new HashMap();
    private static final Map<Integer, byte[][]> sSet = new HashMap();
    private static final Map<Integer, int[][]> xSSet = new HashMap();
    final byte[][] S;
    private final int alpha;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f149579l;
    private final int lsq;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f149580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f149581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f149582o;
    private final SnovaParameters params;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f149583v;
    final int[][] xS;

    public SnovaEngine(SnovaParameters snovaParameters) {
        int i15;
        this.params = snovaParameters;
        int l15 = snovaParameters.getL();
        this.f149579l = l15;
        int lsq = snovaParameters.getLsq();
        this.lsq = lsq;
        this.f149580m = snovaParameters.getM();
        this.f149583v = snovaParameters.getV();
        this.f149582o = snovaParameters.getO();
        this.alpha = snovaParameters.getAlpha();
        this.f149581n = snovaParameters.getN();
        int i16 = 0;
        if (!xSSet.containsKey(Integers.valueOf(l15))) {
            int i17 = 2;
            byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, l15, lsq);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, l15, lsq);
            be_aI(bArr[0], 0, (byte) 1);
            beTheS(bArr[1]);
            while (true) {
                int i18 = this.f149579l;
                if (i17 >= i18) {
                    break;
                }
                GF16Utils.gf16mMul(bArr[i17 - 1], bArr[1], bArr[i17], i18);
                i17++;
            }
            int i19 = 0;
            while (true) {
                i15 = this.f149579l;
                if (i19 >= i15) {
                    break;
                }
                for (int i25 = 0; i25 < this.lsq; i25++) {
                    iArr[i19][i25] = GF16Utils.gf16FromNibble(bArr[i19][i25]);
                }
                i19++;
            }
            sSet.put(Integers.valueOf(i15), bArr);
            xSSet.put(Integers.valueOf(this.f149579l), iArr);
        }
        this.S = sSet.get(Integers.valueOf(this.f149579l));
        this.xS = xSSet.get(Integers.valueOf(this.f149579l));
        if (this.f149579l >= 4 || fixedAbqSet.containsKey(Integers.valueOf(this.f149582o))) {
            return;
        }
        int i26 = this.alpha;
        int i27 = this.f149579l;
        int i28 = i26 * i27;
        int i29 = i27 * i28;
        int i35 = this.f149582o;
        int i36 = i35 * i28;
        int i37 = i35 * i29;
        byte[] bArr2 = new byte[i37 << 2];
        int i38 = i37 + i36;
        byte[] bArr3 = new byte[i38];
        byte[] bArr4 = new byte[i36 << 2];
        byte[] bytes = "SNOVA_ABQ".getBytes();
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bytes, 0, bytes.length);
        sHAKEDigest.doFinal(bArr3, 0, i38);
        int i39 = i37 << 1;
        GF16.decode(bArr3, bArr2, i39);
        GF16.decode(bArr3, i29, bArr4, 0, i36 << 1);
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        while (true) {
            int i48 = this.f149582o;
            if (i45 >= i48) {
                fixedAbqSet.put(Integers.valueOf(i48), bArr2);
                return;
            }
            int i49 = i16;
            int i55 = i46;
            int i56 = i47;
            while (i49 < this.alpha) {
                makeInvertibleByAddingAS(bArr2, i56);
                makeInvertibleByAddingAS(bArr2, i37 + i56);
                genAFqS(bArr4, i55, bArr2, i39 + i56);
                genAFqS(bArr4, i36 + i55, bArr2, i39 + i37 + i56);
                i49++;
                i55 += this.f149579l;
                i56 += this.lsq;
            }
            i45++;
            i47 += i29;
            i46 += i28;
            i16 = 0;
        }
    }

    private void beTheS(byte[] bArr) {
        int i15;
        int i16;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i15 = this.f149579l;
            if (i17 >= i15) {
                break;
            }
            int i19 = 0;
            while (true) {
                i16 = this.f149579l;
                if (i19 < i16) {
                    bArr[i18 + i19] = (byte) ((8 - (i17 + i19)) & 15);
                    i19++;
                }
            }
            i17++;
            i18 += i16;
        }
        if (i15 == 5) {
            bArr[24] = 9;
        }
    }

    private void be_aI(byte[] bArr, int i15, byte b15) {
        int i16 = this.f149579l + 1;
        int i17 = 0;
        while (i17 < this.f149579l) {
            bArr[i15] = b15;
            i17++;
            i15 += i16;
        }
    }

    private static void copy4DMatrix(byte[][][][] bArr, byte[][][][] bArr2, int i15, int i16, int i17, int i18) {
        for (int i19 = 0; i19 < i15; i19++) {
            for (int i25 = 0; i25 < i16; i25++) {
                for (int i26 = 0; i26 < i17; i26++) {
                    System.arraycopy(bArr[i19][i25][i26], 0, bArr2[i19][i25][i26], 0, i18);
                }
            }
        }
    }

    private byte determinant2x2(byte[] bArr, int i15) {
        return (byte) (GF16.mul(bArr[i15 + 1], bArr[i15 + 2]) ^ GF16.mul(bArr[i15], bArr[i15 + 3]));
    }

    private byte determinant3x3(byte[] bArr, int i15) {
        byte b15 = bArr[i15];
        byte b16 = bArr[i15 + 1];
        byte b17 = bArr[i15 + 2];
        byte b18 = bArr[i15 + 3];
        byte b19 = bArr[i15 + 4];
        byte b25 = bArr[i15 + 5];
        byte b26 = bArr[i15 + 6];
        byte b27 = bArr[i15 + 7];
        byte b28 = bArr[i15 + 8];
        return (byte) ((GF16.mul(b16, GF16.mul(b18, b28) ^ GF16.mul(b25, b26)) ^ GF16.mul(b15, GF16.mul(b19, b28) ^ GF16.mul(b25, b27))) ^ GF16.mul(b17, GF16.mul(b18, b27) ^ GF16.mul(b19, b26)));
    }

    private byte determinant4x4(byte[] bArr, int i15) {
        byte b15 = bArr[i15];
        byte b16 = bArr[i15 + 1];
        byte b17 = bArr[i15 + 2];
        byte b18 = bArr[i15 + 3];
        byte b19 = bArr[i15 + 4];
        byte b25 = bArr[i15 + 5];
        byte b26 = bArr[i15 + 6];
        byte b27 = bArr[i15 + 7];
        byte b28 = bArr[i15 + 8];
        byte b29 = bArr[i15 + 9];
        byte b35 = bArr[i15 + 10];
        byte b36 = bArr[i15 + 11];
        byte b37 = bArr[i15 + 12];
        byte b38 = bArr[i15 + 13];
        byte b39 = bArr[i15 + 14];
        byte b45 = bArr[i15 + 15];
        byte bMul = (byte) (GF16.mul(b35, b45) ^ GF16.mul(b36, b39));
        byte bMul2 = (byte) (GF16.mul(b29, b45) ^ GF16.mul(b36, b38));
        byte bMul3 = (byte) (GF16.mul(b29, b39) ^ GF16.mul(b35, b38));
        byte bMul4 = (byte) (GF16.mul(b36, b37) ^ GF16.mul(b28, b45));
        byte bMul5 = (byte) (GF16.mul(b35, b37) ^ GF16.mul(b28, b39));
        byte bMul6 = (byte) (GF16.mul(b28, b38) ^ GF16.mul(b29, b37));
        return (byte) (GF16.mul(b18, (GF16.mul(b19, bMul3) ^ GF16.mul(b25, bMul5)) ^ GF16.mul(b26, bMul6)) ^ ((GF16.mul(b15, (GF16.mul(b25, bMul) ^ GF16.mul(b26, bMul2)) ^ GF16.mul(b27, bMul3)) ^ GF16.mul(b16, (GF16.mul(b19, bMul) ^ GF16.mul(b26, bMul4)) ^ GF16.mul(b27, bMul5))) ^ GF16.mul(b17, (GF16.mul(b19, bMul2) ^ GF16.mul(b25, bMul4)) ^ GF16.mul(b27, bMul6))));
    }

    private byte determinant5x5(byte[] bArr, int i15) {
        byte b15 = bArr[i15];
        byte b16 = bArr[i15 + 1];
        byte b17 = bArr[i15 + 2];
        byte b18 = bArr[i15 + 3];
        byte b19 = bArr[i15 + 4];
        byte b25 = bArr[i15 + 5];
        byte b26 = bArr[i15 + 6];
        byte b27 = bArr[i15 + 7];
        byte b28 = bArr[i15 + 8];
        byte b29 = bArr[i15 + 9];
        byte b35 = bArr[i15 + 10];
        byte b36 = bArr[i15 + 11];
        byte b37 = bArr[i15 + 12];
        byte b38 = bArr[i15 + 13];
        byte b39 = bArr[i15 + 14];
        byte b45 = bArr[i15 + 15];
        byte b46 = bArr[i15 + 16];
        byte b47 = bArr[i15 + 17];
        byte b48 = bArr[i15 + 18];
        byte b49 = bArr[i15 + 19];
        byte b55 = bArr[i15 + 20];
        byte b56 = bArr[i15 + 21];
        byte b57 = bArr[i15 + 22];
        byte b58 = bArr[i15 + 23];
        byte b59 = bArr[i15 + 24];
        byte bMul = (byte) (GF16.mul(b25, b36) ^ GF16.mul(b26, b35));
        byte bMul2 = (byte) (GF16.mul(b25, b37) ^ GF16.mul(b27, b35));
        byte bMul3 = (byte) (GF16.mul(b25, b38) ^ GF16.mul(b28, b35));
        byte bMul4 = (byte) (GF16.mul(b25, b39) ^ GF16.mul(b29, b35));
        byte bMul5 = (byte) (GF16.mul(b26, b37) ^ GF16.mul(b27, b36));
        byte bMul6 = (byte) (GF16.mul(b26, b38) ^ GF16.mul(b28, b36));
        byte bMul7 = (byte) (GF16.mul(b26, b39) ^ GF16.mul(b29, b36));
        byte bMul8 = (byte) (GF16.mul(b27, b38) ^ GF16.mul(b28, b37));
        byte bMul9 = (byte) (GF16.mul(b27, b39) ^ GF16.mul(b29, b37));
        byte bMul10 = (byte) (GF16.mul(b28, b39) ^ GF16.mul(b29, b38));
        return (byte) (((byte) (GF16.mul((GF16.mul(b18, bMul7) ^ GF16.mul(b16, bMul10)) ^ GF16.mul(b19, bMul6), GF16.mul(b45, b57) ^ GF16.mul(b47, b55)) ^ ((byte) (((byte) (((byte) (GF16.mul((GF16.mul(b15, bMul10) ^ GF16.mul(b18, bMul4)) ^ GF16.mul(b19, bMul3), GF16.mul(b46, b57) ^ GF16.mul(b47, b56)) ^ ((byte) (((byte) (((byte) (((byte) (((byte) GF16.mul((GF16.mul(b15, bMul5) ^ GF16.mul(b16, bMul2)) ^ GF16.mul(b17, bMul), GF16.mul(b48, b59) ^ GF16.mul(b49, b58))) ^ GF16.mul((GF16.mul(b15, bMul6) ^ GF16.mul(b16, bMul3)) ^ GF16.mul(b18, bMul), GF16.mul(b47, b59) ^ GF16.mul(b49, b57)))) ^ GF16.mul((GF16.mul(b15, bMul7) ^ GF16.mul(b16, bMul4)) ^ GF16.mul(b19, bMul), GF16.mul(b47, b58) ^ GF16.mul(b48, b57)))) ^ GF16.mul((GF16.mul(b15, bMul8) ^ GF16.mul(b17, bMul3)) ^ GF16.mul(b18, bMul2), GF16.mul(b46, b59) ^ GF16.mul(b49, b56)))) ^ GF16.mul((GF16.mul(b15, bMul9) ^ GF16.mul(b17, bMul4)) ^ GF16.mul(b19, bMul2), GF16.mul(b46, b58) ^ GF16.mul(b48, b56)))))) ^ GF16.mul((GF16.mul(b16, bMul8) ^ GF16.mul(b17, bMul6)) ^ GF16.mul(b18, bMul5), GF16.mul(b45, b59) ^ GF16.mul(b49, b55)))) ^ GF16.mul(GF16.mul(b19, bMul5) ^ (GF16.mul(b16, bMul9) ^ GF16.mul(b17, bMul7)), GF16.mul(b45, b58) ^ GF16.mul(b48, b55)))))) ^ GF16.mul((GF16.mul(b17, bMul10) ^ GF16.mul(b18, bMul9)) ^ GF16.mul(b19, bMul8), GF16.mul(b45, b56) ^ GF16.mul(b46, b55)));
    }

    private void genAFqS(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17;
        int i18;
        be_aI(bArr2, i16, bArr[i15]);
        int i19 = 1;
        while (true) {
            i17 = this.f149579l;
            if (i19 >= i17 - 1) {
                break;
            }
            gf16mScaleTo(this.S[i19], bArr[i15 + i19], bArr2, i16);
            i19++;
        }
        if (bArr[(i15 + i17) - 1] != 0) {
            i18 = bArr[(i15 + i17) - 1];
        } else {
            int i25 = bArr[i15];
            i18 = 16 - (i25 + (i25 == 0 ? 1 : 0));
        }
        gf16mScaleTo(this.S[i17 - 1], (byte) i18, bArr2, i16);
    }

    private void genAFqSCT(byte[] bArr, int i15, byte[] bArr2) {
        int i16;
        int[] iArr = new int[this.lsq];
        int i17 = this.f149579l + 1;
        int iGf16FromNibble = GF16Utils.gf16FromNibble(bArr[i15]);
        int i18 = 0;
        int i19 = 0;
        while (i18 < this.f149579l) {
            iArr[i19] = iGf16FromNibble;
            i18++;
            i19 += i17;
        }
        int i25 = 1;
        while (true) {
            i16 = this.f149579l;
            if (i25 >= i16 - 1) {
                break;
            }
            int iGf16FromNibble2 = GF16Utils.gf16FromNibble(bArr[i15 + i25]);
            for (int i26 = 0; i26 < this.lsq; i26++) {
                iArr[i26] = iArr[i26] ^ (this.xS[i25][i26] * iGf16FromNibble2);
            }
            i25++;
        }
        int iCtGF16IsNotZero = GF16Utils.ctGF16IsNotZero(bArr[(i16 + i15) - 1]);
        int iGf16FromNibble3 = GF16Utils.gf16FromNibble((byte) ((bArr[(this.f149579l + i15) - 1] * iCtGF16IsNotZero) + ((1 - iCtGF16IsNotZero) * ((GF16Utils.ctGF16IsNotZero(bArr[i15]) + 15) - bArr[i15]))));
        for (int i27 = 0; i27 < this.lsq; i27++) {
            int i28 = iArr[i27] ^ (this.xS[this.f149579l - 1][i27] * iGf16FromNibble3);
            iArr[i27] = i28;
            bArr2[i27] = GF16Utils.gf16ToNibble(i28);
        }
        Arrays.fill(iArr, 0);
    }

    private void genF(MapGroup2 mapGroup2, MapGroup1 mapGroup1, byte[][][] bArr) {
        byte[][][][] bArr2 = mapGroup1.f149573p11;
        byte[][][][] bArr3 = mapGroup2.f149576f11;
        int i15 = this.f149580m;
        int i16 = this.f149583v;
        copy4DMatrix(bArr2, bArr3, i15, i16, i16, this.lsq);
        copy4DMatrix(mapGroup1.f149574p12, mapGroup2.f149577f12, this.f149580m, this.f149583v, this.f149582o, this.lsq);
        copy4DMatrix(mapGroup1.f149575p21, mapGroup2.f149578f21, this.f149580m, this.f149582o, this.f149583v, this.lsq);
        for (int i17 = 0; i17 < this.f149580m; i17++) {
            for (int i18 = 0; i18 < this.f149583v; i18++) {
                for (int i19 = 0; i19 < this.f149582o; i19++) {
                    for (int i25 = 0; i25 < this.f149583v; i25++) {
                        byte[][][] bArr4 = mapGroup1.f149573p11[i17];
                        GF16Utils.gf16mMulToTo(bArr4[i18][i25], bArr[i25][i19], bArr4[i25][i18], mapGroup2.f149577f12[i17][i18][i19], mapGroup2.f149578f21[i17][i19][i18], this.f149579l);
                    }
                }
            }
        }
    }

    private void genSeedsAndT12(byte[][][] bArr, byte[] bArr2) {
        int i15 = this.f149583v * this.f149582o * this.f149579l;
        int i16 = (i15 + 1) >>> 1;
        byte[] bArr3 = new byte[i16];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, 0, bArr2.length);
        sHAKEDigest.doFinal(bArr3, 0, i16);
        byte[] bArr4 = new byte[i15];
        GF16.decode(bArr3, bArr4, i15);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f149583v; i18++) {
            for (int i19 = 0; i19 < this.f149582o; i19++) {
                genAFqSCT(bArr4, i17, bArr[i18][i19]);
                i17 += this.f149579l;
            }
        }
    }

    private void generateASMatrixTo(byte[] bArr, int i15, byte b15) {
        int i16;
        int i17 = 0;
        while (i17 < this.f149579l) {
            int i18 = 0;
            while (true) {
                i16 = this.f149579l;
                if (i18 < i16) {
                    byte b16 = (byte) (8 - (i17 + i18));
                    if (i16 == 5 && i17 == 4 && i18 == 4) {
                        b16 = 9;
                    }
                    int i19 = i15 + i18;
                    bArr[i19] = (byte) (GF16.mul(b16, b15) ^ bArr[i19]);
                    i18++;
                }
            }
            i17++;
            i15 += i16;
        }
    }

    private byte gf16Determinant(byte[] bArr, int i15) {
        int i16 = this.f149579l;
        if (i16 == 2) {
            return determinant2x2(bArr, i15);
        }
        if (i16 == 3) {
            return determinant3x3(bArr, i15);
        }
        if (i16 == 4) {
            return determinant4x4(bArr, i15);
        }
        if (i16 == 5) {
            return determinant5x5(bArr, i15);
        }
        throw new IllegalStateException();
    }

    private void gf16mScaleTo(byte[] bArr, byte b15, byte[] bArr2, int i15) {
        int i16;
        int i17 = 0;
        int i18 = 0;
        while (i17 < this.f149579l) {
            int i19 = 0;
            while (true) {
                i16 = this.f149579l;
                if (i19 < i16) {
                    int i25 = i18 + i19;
                    int i26 = i25 + i15;
                    bArr2[i26] = (byte) (GF16.mul(bArr[i25], b15) ^ bArr2[i26]);
                    i19++;
                }
            }
            i17++;
            i18 += i16;
        }
    }

    private void makeInvertibleByAddingAS(byte[] bArr, int i15) {
        if (gf16Determinant(bArr, i15) != 0) {
            return;
        }
        for (int i16 = 1; i16 < 16; i16++) {
            generateASMatrixTo(bArr, i15, (byte) i16);
            if (gf16Determinant(bArr, i15) != 0) {
                return;
            }
        }
    }

    public void genABQP(MapGroup1 mapGroup1, byte[] bArr) {
        int i15 = this.lsq;
        int i16 = this.f149580m;
        int i17 = this.alpha;
        int i18 = this.f149581n;
        int i19 = this.f149579l;
        int i25 = (i15 * ((i16 * 2 * i17) + (((i18 * i18) - (i16 * i16)) * i16))) + (i19 * 2 * i16 * i17);
        int i26 = ((i16 * i17) * i19) << 1;
        byte[] bArr2 = new byte[i26];
        int i27 = (i25 + 1) >> 1;
        byte[] bArr3 = new byte[i27];
        if (this.params.isPkExpandShake()) {
            byte[] bArr4 = new byte[8];
            SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
            long j15 = 0;
            int i28 = 0;
            while (i27 > 0) {
                sHAKEDigest.update(bArr, 0, bArr.length);
                Pack.longToLittleEndian(j15, bArr4, 0);
                sHAKEDigest.update(bArr4, 0, 8);
                int iMin = Math.min(i27, 168);
                sHAKEDigest.doFinal(bArr3, i28, iMin);
                i28 += iMin;
                i27 -= iMin;
                j15++;
            }
        } else {
            CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
            cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(bArr), new byte[16]));
            int blockSize = cTRModeCipherNewInstance.getBlockSize();
            byte[] bArr5 = new byte[blockSize];
            int i29 = 0;
            while (true) {
                int i35 = i29 + blockSize;
                if (i35 > i27) {
                    break;
                }
                cTRModeCipherNewInstance.processBlock(bArr5, 0, bArr3, i29);
                i29 = i35;
            }
            if (i29 < i27) {
                cTRModeCipherNewInstance.processBlock(bArr5, 0, bArr5, 0);
                System.arraycopy(bArr5, 0, bArr3, i29, i27 - i29);
            }
        }
        if ((this.lsq & 1) == 0) {
            mapGroup1.decode(bArr3, (i25 - i26) >> 1, this.f149579l >= 4);
        } else {
            int i36 = i25 - i26;
            byte[] bArr6 = new byte[i36];
            GF16.decode(bArr3, bArr6, i36);
            mapGroup1.fill(bArr6, this.f149579l >= 4);
        }
        if (this.f149579l < 4) {
            int i37 = this.f149582o;
            int i38 = this.alpha * i37 * this.lsq;
            byte[] bArr7 = fixedAbqSet.get(Integers.valueOf(i37));
            MapGroup1.fillAlpha(bArr7, 0, mapGroup1.aAlpha, this.f149580m * i38);
            MapGroup1.fillAlpha(bArr7, i38, mapGroup1.bAlpha, (this.f149580m - 1) * i38);
            MapGroup1.fillAlpha(bArr7, i38 * 2, mapGroup1.qAlpha1, (this.f149580m - 2) * i38);
            MapGroup1.fillAlpha(bArr7, i38 * 3, mapGroup1.qAlpha2, (this.f149580m - 3) * i38);
            return;
        }
        GF16.decode(bArr3, (i25 - i26) >> 1, bArr2, 0, i26);
        int i39 = this.f149580m * this.alpha * this.f149579l;
        int i45 = 0;
        for (int i46 = 0; i46 < this.f149580m; i46++) {
            for (int i47 = 0; i47 < this.alpha; i47++) {
                makeInvertibleByAddingAS(mapGroup1.aAlpha[i46][i47], 0);
                makeInvertibleByAddingAS(mapGroup1.bAlpha[i46][i47], 0);
                genAFqS(bArr2, i45, mapGroup1.qAlpha1[i46][i47], 0);
                genAFqS(bArr2, i39, mapGroup1.qAlpha2[i46][i47], 0);
                int i48 = this.f149579l;
                i45 += i48;
                i39 += i48;
            }
        }
    }

    public void genMap1T12Map2(SnovaKeyElements snovaKeyElements, byte[] bArr, byte[] bArr2) {
        genSeedsAndT12(snovaKeyElements.T12, bArr2);
        genABQP(snovaKeyElements.map1, bArr);
        genF(snovaKeyElements.map2, snovaKeyElements.map1, snovaKeyElements.T12);
    }

    public void genP22(byte[] bArr, int i15, byte[][][] bArr2, byte[][][][] bArr3, byte[][][][] bArr4) {
        int i16 = this.f149582o;
        int i17 = this.lsq * i16;
        int i18 = i16 * i17;
        int i19 = this.f149580m * i18;
        byte[] bArr5 = new byte[i19];
        int i25 = 0;
        int i26 = 0;
        while (i25 < this.f149580m) {
            int i27 = 0;
            int i28 = i26;
            while (i27 < this.f149582o) {
                int i29 = 0;
                int i35 = i28;
                while (i29 < this.f149582o) {
                    int i36 = 0;
                    while (i36 < this.f149583v) {
                        byte[][] bArr6 = bArr2[i36];
                        int i37 = i29;
                        GF16Utils.gf16mMulTo(bArr6[i27], bArr4[i25][i36][i37], bArr3[i25][i27][i36], bArr6[i37], bArr5, i35, this.f149579l);
                        i36++;
                        i29 = i37;
                    }
                    i29++;
                    i35 += this.lsq;
                }
                i27++;
                i28 += i17;
            }
            i25++;
            i26 += i18;
        }
        GF16.encode(bArr5, bArr, i15, i19);
    }
}
