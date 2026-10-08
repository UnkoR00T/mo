package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class SPHINCS256Signer implements MessageSigner {
    private final HashFunctions hashFunctions;
    private byte[] keyData;

    public SPHINCS256Signer(Digest digest, Digest digest2) {
        if (digest.getDigestSize() != 32) {
            throw new IllegalArgumentException("n-digest needs to produce 32 bytes of output");
        }
        if (digest2.getDigestSize() != 64) {
            throw new IllegalArgumentException("2n-digest needs to produce 64 bytes of output");
        }
        this.hashFunctions = new HashFunctions(digest, digest2);
    }

    static void compute_authpath_wots(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i15, Tree.leafaddr leafaddrVar, byte[] bArr3, byte[] bArr4, int i16) {
        long j15;
        long j16;
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr(leafaddrVar);
        byte[] bArr5 = new byte[2048];
        byte[] bArr6 = new byte[1024];
        byte[] bArr7 = new byte[68608];
        long j17 = 0;
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j18 = leafaddrVar2.subleaf;
            j15 = 32;
            if (j18 >= 32) {
                break;
            }
            Seed.get_seed(hashFunctions, bArr6, (int) (j18 * 32), bArr3, leafaddrVar2);
            leafaddrVar2.subleaf++;
        }
        Wots wots = new Wots();
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j19 = leafaddrVar2.subleaf;
            j16 = j15;
            if (j19 >= j15) {
                break;
            }
            byte[] bArr8 = bArr7;
            wots.wots_pkgen(hashFunctions, bArr8, (int) (j19 * 2144), bArr6, (int) (j19 * j16), bArr4, 0);
            bArr7 = bArr8;
            leafaddrVar2.subleaf++;
            j15 = j16;
        }
        while (true) {
            leafaddrVar2.subleaf = j17;
            long j25 = leafaddrVar2.subleaf;
            if (j25 >= j16) {
                break;
            }
            Tree.l_tree(hashFunctions, bArr5, (int) ((j25 * j16) + 1024), bArr7, (int) (j25 * 2144), bArr4, 0);
            j17 = leafaddrVar2.subleaf + 1;
        }
        int i17 = 0;
        for (int i18 = 32; i18 > 0; i18 >>>= 1) {
            for (int i19 = 0; i19 < i18; i19 += 2) {
                hashFunctions.hash_2n_n_mask(bArr5, ((i19 >>> 1) * 32) + ((i18 >>> 1) * 32), bArr5, (i18 * 32) + (i19 * 32), bArr4, (i17 + 7) * 64);
            }
            i17++;
        }
        int i25 = (int) leafaddrVar.subleaf;
        for (int i26 = 0; i26 < i16; i26++) {
            System.arraycopy(bArr5, ((32 >>> i26) * 32) + (((i25 >>> i26) ^ 1) * 32), bArr2, i15 + (i26 * 32), 32);
        }
        System.arraycopy(bArr5, 32, bArr, 0, 32);
    }

    static void validate_authpath(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i15, byte[] bArr3, int i16, byte[] bArr4, int i17) {
        byte[] bArr5 = new byte[64];
        if ((i15 & 1) != 0) {
            for (int i18 = 0; i18 < 32; i18++) {
                bArr5[i18 + 32] = bArr2[i18];
            }
            for (int i19 = 0; i19 < 32; i19++) {
                bArr5[i19] = bArr3[i16 + i19];
            }
        } else {
            for (int i25 = 0; i25 < 32; i25++) {
                bArr5[i25] = bArr2[i25];
            }
            for (int i26 = 0; i26 < 32; i26++) {
                bArr5[i26 + 32] = bArr3[i16 + i26];
            }
        }
        int i27 = i16 + 32;
        int i28 = i15;
        int i29 = 0;
        while (i29 < i17 - 1) {
            int i35 = i28 >>> 1;
            if ((i35 & 1) != 0) {
                hashFunctions.hash_2n_n_mask(bArr5, 32, bArr5, 0, bArr4, (i29 + 7) * 64);
                for (int i36 = 0; i36 < 32; i36++) {
                    bArr5[i36] = bArr3[i27 + i36];
                }
            } else {
                hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr4, (i29 + 7) * 64);
                for (int i37 = 0; i37 < 32; i37++) {
                    bArr5[i37 + 32] = bArr3[i27 + i37];
                }
            }
            i27 += 32;
            i29++;
            i28 = i35;
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr5, 0, bArr4, (i17 + 6) * 64);
    }

    private void zerobytes(byte[] bArr, int i15, int i16) {
        for (int i17 = 0; i17 != i16; i17++) {
            bArr[i15 + i17] = 0;
        }
    }

    byte[] crypto_sign(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[41000];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        long[] jArr = new long[8];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[1024];
        byte[] bArr9 = new byte[1088];
        for (int i15 = 0; i15 < 1088; i15++) {
            bArr9[i15] = bArr2[i15];
        }
        System.arraycopy(bArr9, 1056, bArr3, 40968, 32);
        Digest messageHash = hashFunctions.getMessageHash();
        byte[] bArr10 = new byte[messageHash.getDigestSize()];
        messageHash.update(bArr3, 40968, 32);
        messageHash.update(bArr, 0, bArr.length);
        messageHash.doFinal(bArr10, 0);
        zerobytes(bArr3, 40968, 32);
        for (int i16 = 0; i16 != 8; i16++) {
            jArr[i16] = Pack.littleEndianToLong(bArr10, i16 * 8);
        }
        long j15 = jArr[0];
        long j16 = j15 & 1152921504606846975L;
        System.arraycopy(bArr10, 16, bArr4, 0, 32);
        System.arraycopy(bArr4, 0, bArr3, 39912, 32);
        Tree.leafaddr leafaddrVar = new Tree.leafaddr();
        leafaddrVar.level = 11;
        leafaddrVar.subtree = 0L;
        leafaddrVar.subleaf = 0L;
        System.arraycopy(bArr9, 32, bArr3, 39944, 1024);
        HashFunctions hashFunctions2 = hashFunctions;
        Tree.treehash(hashFunctions2, bArr3, 40968, 5, bArr9, leafaddrVar, bArr3, 39944);
        byte[] bArr11 = bArr9;
        Digest messageHash2 = hashFunctions2.getMessageHash();
        messageHash2.update(bArr3, 39912, 1088);
        messageHash2.update(bArr, 0, bArr.length);
        messageHash2.doFinal(bArr5, 0);
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr();
        int i17 = 12;
        leafaddrVar2.level = 12;
        leafaddrVar2.subleaf = (int) (j15 & 31);
        leafaddrVar2.subtree = j16 >>> 5;
        int i18 = 32;
        for (int i19 = 0; i19 < 32; i19++) {
            bArr3[i19] = bArr4[i19];
        }
        System.arraycopy(bArr11, 32, bArr8, 0, 1024);
        int i25 = 0;
        while (i25 < 8) {
            bArr3[i18 + i25] = (byte) ((j16 >>> (i25 * 8)) & 255);
            i25++;
            i18 = 32;
        }
        Seed.get_seed(hashFunctions2, bArr7, 0, bArr11, leafaddrVar2);
        new Horst();
        byte[] bArr12 = bArr8;
        byte[] bArr13 = bArr6;
        byte[] bArr14 = bArr7;
        int i26 = 0;
        int iHorst_sign = 40 + Horst.horst_sign(hashFunctions2, bArr3, 40, bArr13, bArr14, bArr12, bArr5);
        Wots wots = new Wots();
        int i27 = 0;
        while (i27 < i17) {
            leafaddrVar2.level = i27;
            Seed.get_seed(hashFunctions2, bArr14, i26, bArr11, leafaddrVar2);
            byte[] bArr15 = bArr3;
            HashFunctions hashFunctions3 = hashFunctions2;
            Wots wots2 = wots;
            byte[] bArr16 = bArr12;
            byte[] bArr17 = bArr14;
            byte[] bArr18 = bArr13;
            int i28 = iHorst_sign;
            wots2.wots_sign(hashFunctions3, bArr15, i28, bArr18, bArr17, bArr16);
            byte[] bArr19 = bArr11;
            Tree.leafaddr leafaddrVar3 = leafaddrVar2;
            compute_authpath_wots(hashFunctions, bArr18, bArr15, i28 + 2144, leafaddrVar3, bArr19, bArr16, 5);
            bArr13 = bArr18;
            bArr3 = bArr15;
            iHorst_sign = i28 + 2304;
            long j17 = leafaddrVar3.subtree;
            leafaddrVar3.subleaf = (int) (j17 & 31);
            leafaddrVar3.subtree = j17 >>> 5;
            i27++;
            leafaddrVar2 = leafaddrVar3;
            bArr11 = bArr19;
            bArr12 = bArr16;
            bArr14 = bArr17;
            i26 = 0;
            i17 = 12;
            hashFunctions2 = hashFunctions;
            wots = wots2;
        }
        zerobytes(bArr11, i26, 1088);
        return bArr3;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return crypto_sign(this.hashFunctions, bArr, this.keyData);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!z15) {
            this.keyData = ((SPHINCSPublicKeyParameters) cipherParameters).getKeyData();
        } else if (cipherParameters instanceof ParametersWithRandom) {
            this.keyData = ((SPHINCSPrivateKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters()).getKeyData();
        } else {
            this.keyData = ((SPHINCSPrivateKeyParameters) cipherParameters).getKeyData();
        }
    }

    boolean verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[2144];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[41000];
        byte[] bArr8 = new byte[1056];
        if (bArr2.length != 41000) {
            throw new IllegalArgumentException("signature wrong size");
        }
        byte[] bArr9 = new byte[64];
        for (int i15 = 0; i15 < 1056; i15++) {
            bArr8[i15] = bArr3[i15];
        }
        byte[] bArr10 = new byte[32];
        for (int i16 = 0; i16 < 32; i16++) {
            bArr10[i16] = bArr2[i16];
        }
        System.arraycopy(bArr2, 0, bArr7, 0, 41000);
        Digest messageHash = hashFunctions.getMessageHash();
        messageHash.update(bArr10, 0, 32);
        messageHash.update(bArr8, 0, 1056);
        messageHash.update(bArr, 0, bArr.length);
        messageHash.doFinal(bArr9, 0);
        long j15 = 0;
        for (int i17 = 0; i17 < 8; i17++) {
            j15 ^= ((long) (bArr7[32 + i17] & 255)) << (i17 * 8);
        }
        new Horst();
        Horst.horst_verify(hashFunctions, bArr6, bArr7, 40, bArr8, bArr9);
        Wots wots = new Wots();
        int i18 = 13352;
        int i19 = 0;
        while (i19 < 12) {
            wots.wots_verify(hashFunctions, bArr4, bArr7, i18, bArr6, bArr8);
            int i25 = i18;
            byte[] bArr11 = bArr4;
            byte[] bArr12 = bArr5;
            Tree.l_tree(hashFunctions, bArr12, 0, bArr11, 0, bArr8, 0);
            bArr4 = bArr11;
            byte[] bArr13 = bArr7;
            byte[] bArr14 = bArr6;
            validate_authpath(hashFunctions, bArr14, bArr12, (int) (31 & j15), bArr13, i25 + 2144, bArr8, 5);
            bArr7 = bArr13;
            bArr6 = bArr14;
            j15 >>= 5;
            i18 = i25 + 2304;
            i19++;
            bArr5 = bArr12;
            wots = wots;
        }
        boolean z15 = true;
        for (int i26 = 0; i26 < 32; i26++) {
            z15 &= bArr6[i26] == bArr8[i26 + 1024];
        }
        return z15;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return verify(this.hashFunctions, bArr, bArr2, this.keyData);
    }
}
