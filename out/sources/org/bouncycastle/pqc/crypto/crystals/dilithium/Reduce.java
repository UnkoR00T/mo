package org.bouncycastle.pqc.crypto.crystals.dilithium;

/* JADX INFO: loaded from: classes5.dex */
class Reduce {
    Reduce() {
    }

    static int conditionalAddQ(int i15) {
        return i15 + ((i15 >> 31) & 8380417);
    }

    static int montgomeryReduce(long j15) {
        return (int) ((j15 - (((long) ((int) (58728449 * j15))) * 8380417)) >>> 32);
    }

    static int reduce32(int i15) {
        return i15 - (((4194304 + i15) >> 23) * 8380417);
    }
}
