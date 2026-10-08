package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
abstract class Symmetric {
    final int stream128BlockBytes;
    final int stream256BlockBytes;

    @Deprecated
    static class AesSymmetric extends Symmetric {
        private final StreamCipher cipher;

        AesSymmetric() {
            super(64, 64);
            this.cipher = SICBlockCipher.newInstance(AESEngine.newInstance());
        }

        private void aes128(byte[] bArr, int i15, int i16) {
            this.cipher.processBytes(new byte[i16], 0, i16, bArr, i15);
        }

        private void streamInit(byte[] bArr, short s15) {
            byte[] bArr2 = new byte[12];
            bArr2[0] = (byte) s15;
            bArr2[1] = (byte) (s15 >> 8);
            this.cipher.init(true, new ParametersWithIV(new KeyParameter(bArr, 0, 32), bArr2));
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream128init(byte[] bArr, short s15) {
            streamInit(bArr, s15);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream128squeezeBlocks(byte[] bArr, int i15, int i16) {
            aes128(bArr, i15, i16);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream256init(byte[] bArr, short s15) {
            streamInit(bArr, s15);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream256squeezeBlocks(byte[] bArr, int i15, int i16) {
            aes128(bArr, i15, i16);
        }
    }

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

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream128init(byte[] bArr, short s15) {
            streamInit(this.digest128, bArr, s15);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream128squeezeBlocks(byte[] bArr, int i15, int i16) {
            this.digest128.doOutput(bArr, i15, i16);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        void stream256init(byte[] bArr, short s15) {
            streamInit(this.digest256, bArr, s15);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
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
