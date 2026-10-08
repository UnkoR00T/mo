package org.bouncycastle.pqc.crypto.cmce;

/* JADX INFO: loaded from: classes5.dex */
abstract class GF {
    GF() {
    }

    protected abstract short gf_frac(short s15, short s16);

    protected abstract short gf_inv(short s15);

    final short gf_iszero(short s15) {
        return (short) ((s15 - 1) >> 31);
    }

    protected abstract short gf_mul(short s15, short s16);

    protected abstract int gf_mul_ext(short s15, short s16);

    protected abstract void gf_mul_poly(int i15, int[] iArr, short[] sArr, short[] sArr2, short[] sArr3, int[] iArr2);

    protected abstract short gf_reduce(int i15);

    protected abstract short gf_sq(short s15);

    protected abstract int gf_sq_ext(short s15);

    protected abstract void gf_sqr_poly(int i15, int[] iArr, short[] sArr, short[] sArr2, int[] iArr2);
}
