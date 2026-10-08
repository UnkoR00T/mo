package org.bouncycastle.math.raw;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Bits {
    public static int bitPermuteStep(int i15, int i16, int i17) {
        int i18 = i16 & ((i15 >>> i17) ^ i15);
        return i15 ^ (i18 ^ (i18 << i17));
    }

    public static int bitPermuteStepSimple(int i15, int i16, int i17) {
        return ((i15 >>> i17) & i16) | ((i15 & i16) << i17);
    }

    public static long bitPermuteStep(long j15, long j16, int i15) {
        long j17 = j16 & ((j15 >>> i15) ^ j15);
        return j15 ^ (j17 ^ (j17 << i15));
    }

    public static long bitPermuteStepSimple(long j15, long j16, int i15) {
        return ((j15 >>> i15) & j16) | ((j15 & j16) << i15);
    }
}
