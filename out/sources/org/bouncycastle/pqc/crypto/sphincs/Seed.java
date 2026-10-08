package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class Seed {
    Seed() {
    }

    static void get_seed(HashFunctions hashFunctions, byte[] bArr, int i15, byte[] bArr2, Tree.leafaddr leafaddrVar) {
        byte[] bArr3 = new byte[40];
        for (int i16 = 0; i16 < 32; i16++) {
            bArr3[i16] = bArr2[i16];
        }
        Pack.longToLittleEndian((leafaddrVar.subleaf << 59) | ((long) leafaddrVar.level) | (leafaddrVar.subtree << 4), bArr3, 32);
        hashFunctions.varlen_hash(bArr, i15, bArr3, 40);
    }

    static void prg(byte[] bArr, int i15, long j15, byte[] bArr2, int i16) {
        ChaChaEngine chaChaEngine = new ChaChaEngine(12);
        chaChaEngine.init(true, new ParametersWithIV(new KeyParameter(bArr2, i16, 32), new byte[8]));
        chaChaEngine.processBytes(bArr, i15, (int) j15, bArr, i15);
    }
}
