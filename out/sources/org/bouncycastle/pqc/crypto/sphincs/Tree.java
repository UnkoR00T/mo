package org.bouncycastle.pqc.crypto.sphincs;

/* JADX INFO: loaded from: classes5.dex */
class Tree {

    static class leafaddr {
        int level;
        long subleaf;
        long subtree;

        public leafaddr() {
        }

        public leafaddr(leafaddr leafaddrVar) {
            this.level = leafaddrVar.level;
            this.subtree = leafaddrVar.subtree;
            this.subleaf = leafaddrVar.subleaf;
        }
    }

    Tree() {
    }

    static void gen_leaf_wots(HashFunctions hashFunctions, byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, leafaddr leafaddrVar) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[2144];
        Wots wots = new Wots();
        Seed.get_seed(hashFunctions, bArr4, 0, bArr3, leafaddrVar);
        wots.wots_pkgen(hashFunctions, bArr5, 0, bArr4, 0, bArr2, i16);
        l_tree(hashFunctions, bArr, i15, bArr5, 0, bArr2, i16);
    }

    static void l_tree(HashFunctions hashFunctions, byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17) {
        int i18;
        int i19 = 67;
        for (int i25 = 0; i25 < 7; i25++) {
            int i26 = 0;
            while (true) {
                i18 = i19 >>> 1;
                if (i26 >= i18) {
                    break;
                }
                hashFunctions.hash_2n_n_mask(bArr2, i16 + (i26 * 32), bArr2, i16 + (i26 * 64), bArr3, i17 + (i25 * 64));
                i26++;
            }
            if ((i19 & 1) != 0) {
                System.arraycopy(bArr2, i16 + ((i19 - 1) * 32), bArr2, (i18 * 32) + i16, 32);
                i18++;
            }
            i19 = i18;
        }
        System.arraycopy(bArr2, i16, bArr, i15, 32);
    }

    static void treehash(HashFunctions hashFunctions, byte[] bArr, int i15, int i16, byte[] bArr2, leafaddr leafaddrVar, byte[] bArr3, int i17) {
        leafaddr leafaddrVar2 = new leafaddr(leafaddrVar);
        int i18 = i16 + 1;
        byte[] bArr4 = new byte[i18 * 32];
        int[] iArr = new int[i18];
        int i19 = (int) (leafaddrVar2.subleaf + ((long) (1 << i16)));
        int i25 = 0;
        while (leafaddrVar2.subleaf < i19) {
            gen_leaf_wots(hashFunctions, bArr4, i25 * 32, bArr3, i17, bArr2, leafaddrVar2);
            iArr[i25] = 0;
            int i26 = i25 + 1;
            while (i26 > 1) {
                int i27 = iArr[i26 - 1];
                int i28 = i26 - 2;
                if (i27 != iArr[i28]) {
                    break;
                }
                int i29 = i28 * 32;
                hashFunctions.hash_2n_n_mask(bArr4, i29, bArr4, i29, bArr3, i17 + ((i27 + 7) * 64));
                iArr[i28] = iArr[i28] + 1;
                i26--;
                i19 = i19;
            }
            leafaddrVar2.subleaf++;
            i25 = i26;
            i19 = i19;
        }
        for (int i35 = 0; i35 < 32; i35++) {
            bArr[i15 + i35] = bArr4[i35];
        }
    }
}
