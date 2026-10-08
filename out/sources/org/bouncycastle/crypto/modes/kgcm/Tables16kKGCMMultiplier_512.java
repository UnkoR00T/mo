package org.bouncycastle.crypto.modes.kgcm;

import java.lang.reflect.Array;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class Tables16kKGCMMultiplier_512 implements KGCMMultiplier {
    private long[][] T;

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        long[][] jArr2 = this.T;
        if (jArr2 == null) {
            this.T = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 8);
        } else if (KGCMUtil_512.equal(jArr, jArr2[1])) {
            return;
        }
        KGCMUtil_512.copy(jArr, this.T[1]);
        for (int i15 = 2; i15 < 256; i15 += 2) {
            long[][] jArr3 = this.T;
            KGCMUtil_512.multiplyX(jArr3[i15 >> 1], jArr3[i15]);
            long[][] jArr4 = this.T;
            KGCMUtil_512.add(jArr4[i15], jArr4[1], jArr4[i15 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        long[] jArr2 = new long[8];
        KGCMUtil_512.copy(this.T[((int) (jArr[7] >>> 56)) & GF2Field.MASK], jArr2);
        for (int i15 = 62; i15 >= 0; i15--) {
            KGCMUtil_512.multiplyX8(jArr2, jArr2);
            KGCMUtil_512.add(this.T[((int) (jArr[i15 >>> 3] >>> ((i15 & 7) << 3))) & GF2Field.MASK], jArr2, jArr2);
        }
        KGCMUtil_512.copy(jArr2, jArr);
    }
}
