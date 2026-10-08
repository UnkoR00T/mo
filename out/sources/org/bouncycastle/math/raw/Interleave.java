package org.bouncycastle.math.raw;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class Interleave {
    private static final long M32 = 1431655765;
    private static final long M64 = 6148914691236517205L;
    private static final long M64R = -6148914691236517206L;

    public static int expand16to32(int i15) {
        int i16 = i15 & 65535;
        int i17 = (i16 | (i16 << 8)) & 16711935;
        int i18 = (i17 | (i17 << 4)) & 252645135;
        int i19 = (i18 | (i18 << 2)) & 858993459;
        return (i19 | (i19 << 1)) & 1431655765;
    }

    public static long expand32to64(int i15) {
        int iBitPermuteStep = Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i15, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1);
        return ((((long) (iBitPermuteStep >>> 1)) & M32) << 32) | (M32 & ((long) iBitPermuteStep));
    }

    public static void expand64To128(long j15, long[] jArr, int i15) {
        long jBitPermuteStep = Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j15, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i15] = jBitPermuteStep & M64;
        jArr[i15 + 1] = (jBitPermuteStep >>> 1) & M64;
    }

    public static void expand64To128Rev(long j15, long[] jArr, int i15) {
        long jBitPermuteStep = Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j15, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i15] = jBitPermuteStep & M64R;
        jArr[i15 + 1] = (jBitPermuteStep << 1) & M64R;
    }

    public static int expand8to16(int i15) {
        int i16 = i15 & GF2Field.MASK;
        int i17 = (i16 | (i16 << 4)) & 3855;
        int i18 = (i17 | (i17 << 2)) & 13107;
        return (i18 | (i18 << 1)) & 21845;
    }

    public static int shuffle(int i15) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i15, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1);
    }

    public static int shuffle2(int i15) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i15, 11141290, 7), 52428, 14), 15728880, 4), 65280, 8);
    }

    public static long shuffle3(long j15) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j15, 47851476196393130L, 7), 225176545447116L, 14), 4042322160L, 28);
    }

    public static int unshuffle(int i15) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i15, 572662306, 1), 202116108, 2), 15728880, 4), 65280, 8);
    }

    public static int unshuffle2(int i15) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i15, 65280, 8), 15728880, 4), 52428, 14), 11141290, 7);
    }

    public static long unshuffle3(long j15) {
        return shuffle3(j15);
    }

    public static void expand64To128(long[] jArr, int i15, int i16, long[] jArr2, int i17) {
        for (int i18 = 0; i18 < i16; i18++) {
            expand64To128(jArr[i15 + i18], jArr2, i17);
            i17 += 2;
        }
    }

    public static long shuffle(long j15) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j15, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
    }

    public static long shuffle2(long j15) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j15, 4278255360L, 24), 57421771435671756L, 6), 264913582878960L, 12), 723401728380766730L, 3);
    }

    public static long unshuffle(long j15) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j15, 2459565876494606882L, 1), 868082074056920076L, 2), 67555025218437360L, 4), 280375465148160L, 8), 4294901760L, 16);
    }

    public static long unshuffle2(long j15) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j15, 723401728380766730L, 3), 264913582878960L, 12), 57421771435671756L, 6), 4278255360L, 24);
    }
}
