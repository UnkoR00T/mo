package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes5.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    Reduce() {
    }

    static short barrett(short s15) {
        int i15 = s15 & HPKE.aead_EXPORT_ONLY;
        return (short) (i15 - (((i15 * 5) >>> 16) * 12289));
    }

    static short montgomery(int i15) {
        return (short) (((((i15 * QInv) & RMask) * 12289) + i15) >>> 18);
    }
}
