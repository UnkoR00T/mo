package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes5.dex */
abstract class Symmetric {
    final int xofBlockBytes;

    static class ShakeSymmetric extends Symmetric {
        private final SHA3Digest sha3Digest256;
        private final SHA3Digest sha3Digest512;
        private final SHAKEDigest shakeDigest;
        private final SHAKEDigest xof;

        ShakeSymmetric() {
            super(168);
            this.xof = new SHAKEDigest(128);
            this.shakeDigest = new SHAKEDigest(256);
            this.sha3Digest256 = new SHA3Digest(256);
            this.sha3Digest512 = new SHA3Digest(512);
        }

        @Override // org.bouncycastle.pqc.crypto.mlkem.Symmetric
        void hash_g(byte[] bArr, byte[] bArr2) {
            this.sha3Digest512.update(bArr2, 0, bArr2.length);
            this.sha3Digest512.doFinal(bArr, 0);
        }

        @Override // org.bouncycastle.pqc.crypto.mlkem.Symmetric
        void hash_h(byte[] bArr, byte[] bArr2, int i15) {
            this.sha3Digest256.update(bArr2, 0, bArr2.length);
            this.sha3Digest256.doFinal(bArr, i15);
        }

        @Override // org.bouncycastle.pqc.crypto.mlkem.Symmetric
        void kdf(byte[] bArr, byte[] bArr2) {
            this.shakeDigest.update(bArr2, 0, bArr2.length);
            this.shakeDigest.doFinal(bArr, 0, bArr.length);
        }

        @Override // org.bouncycastle.pqc.crypto.mlkem.Symmetric
        void prf(byte[] bArr, byte[] bArr2, byte b15) {
            int length = bArr2.length + 1;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr3[bArr2.length] = b15;
            this.shakeDigest.update(bArr3, 0, length);
            this.shakeDigest.doFinal(bArr, 0, bArr.length);
        }

        @Override // org.bouncycastle.pqc.crypto.mlkem.Symmetric
        void xofAbsorb(byte[] bArr, byte b15, byte b16) {
            this.xof.reset();
            byte[] bArr2 = new byte[bArr.length + 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr2[bArr.length] = b15;
            bArr2[bArr.length + 1] = b16;
            this.xof.update(bArr2, 0, bArr.length + 2);
        }

        @Override // org.bouncycastle.pqc.crypto.mlkem.Symmetric
        void xofSqueezeBlocks(byte[] bArr, int i15, int i16) {
            this.xof.doOutput(bArr, i15, i16);
        }
    }

    Symmetric(int i15) {
        this.xofBlockBytes = i15;
    }

    abstract void hash_g(byte[] bArr, byte[] bArr2);

    abstract void hash_h(byte[] bArr, byte[] bArr2, int i15);

    abstract void kdf(byte[] bArr, byte[] bArr2);

    abstract void prf(byte[] bArr, byte[] bArr2, byte b15);

    abstract void xofAbsorb(byte[] bArr, byte b15, byte b16);

    abstract void xofSqueezeBlocks(byte[] bArr, int i15, int i16);
}
