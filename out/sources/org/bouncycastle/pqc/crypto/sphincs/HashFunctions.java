package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
class HashFunctions {
    private static final byte[] hashc = Strings.toByteArray("expand 32-byte to 64-byte state!");
    private final Digest dig256;
    private final Digest dig512;
    private final Permute perm;

    HashFunctions(Digest digest) {
        this(digest, null);
    }

    Digest getMessageHash() {
        return this.dig512;
    }

    int hash_2n_n(byte[] bArr, int i15, byte[] bArr2, int i16) {
        byte[] bArr3 = new byte[64];
        for (int i17 = 0; i17 < 32; i17++) {
            bArr3[i17] = bArr2[i16 + i17];
            bArr3[i17 + 32] = hashc[i17];
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i18 = 0; i18 < 32; i18++) {
            bArr3[i18] = (byte) (bArr3[i18] ^ bArr2[(i16 + i18) + 32]);
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i19 = 0; i19 < 32; i19++) {
            bArr[i15 + i19] = bArr3[i19];
        }
        return 0;
    }

    int hash_2n_n_mask(byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17) {
        byte[] bArr4 = new byte[64];
        for (int i18 = 0; i18 < 64; i18++) {
            bArr4[i18] = (byte) (bArr2[i16 + i18] ^ bArr3[i17 + i18]);
        }
        return hash_2n_n(bArr, i15, bArr4, 0);
    }

    int hash_n_n(byte[] bArr, int i15, byte[] bArr2, int i16) {
        byte[] bArr3 = new byte[64];
        for (int i17 = 0; i17 < 32; i17++) {
            bArr3[i17] = bArr2[i16 + i17];
            bArr3[i17 + 32] = hashc[i17];
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i18 = 0; i18 < 32; i18++) {
            bArr[i15 + i18] = bArr3[i18];
        }
        return 0;
    }

    int hash_n_n_mask(byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17) {
        byte[] bArr4 = new byte[32];
        for (int i18 = 0; i18 < 32; i18++) {
            bArr4[i18] = (byte) (bArr2[i16 + i18] ^ bArr3[i17 + i18]);
        }
        return hash_n_n(bArr, i15, bArr4, 0);
    }

    int varlen_hash(byte[] bArr, int i15, byte[] bArr2, int i16) {
        this.dig256.update(bArr2, 0, i16);
        this.dig256.doFinal(bArr, i15);
        return 0;
    }

    HashFunctions(Digest digest, Digest digest2) {
        this.perm = new Permute();
        this.dig256 = digest;
        this.dig512 = digest2;
    }
}
