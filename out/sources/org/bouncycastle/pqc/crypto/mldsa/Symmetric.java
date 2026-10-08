package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes5.dex */
abstract class Symmetric {
    final int stream128BlockBytes;
    final int stream256BlockBytes;

    static class ShakeSymmetric extends Symmetric {
        private final SHAKEDigest digest128;
        private final SHAKEDigest digest256;

        ShakeSymmetric() {
            super(168, 136);
            this.digest128 = new SHAKEDigest(128);
            this.digest256 = new SHAKEDigest(256);
        }

        private void streamInit(SHAKEDigest sHAKEDigest, byte[] bArr, short s15) {
            sHAKEDigest.reset();
            sHAKEDigest.update(bArr, 0, bArr.length);
            sHAKEDigest.update(new byte[]{(byte) s15, (byte) (s15 >> 8)}, 0, 2);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        void stream128init(byte[] bArr, short s15) {
            streamInit(this.digest128, bArr, s15);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        void stream128squeezeBlocks(byte[] bArr, int i15, int i16) {
            this.digest128.doOutput(bArr, i15, i16);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        void stream256init(byte[] bArr, short s15) {
            streamInit(this.digest256, bArr, s15);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        void stream256squeezeBlocks(byte[] bArr, int i15, int i16) {
            this.digest256.doOutput(bArr, i15, i16);
        }
    }

    Symmetric(int i15, int i16) {
        this.stream128BlockBytes = i15;
        this.stream256BlockBytes = i16;
    }

    abstract void stream128init(byte[] bArr, short s15);

    abstract void stream128squeezeBlocks(byte[] bArr, int i15, int i16);

    abstract void stream256init(byte[] bArr, short s15);

    abstract void stream256squeezeBlocks(byte[] bArr, int i15, int i16);
}
