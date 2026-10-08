package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.BlockCipher;

/* JADX INFO: loaded from: classes5.dex */
public class X931RNG {
    private static final int BLOCK128_MAX_BITS_REQUEST = 262144;
    private static final long BLOCK128_RESEED_MAX = 8388608;
    private static final int BLOCK64_MAX_BITS_REQUEST = 4096;
    private static final long BLOCK64_RESEED_MAX = 32768;
    private final byte[] DT;
    private final byte[] I;
    private final byte[] R;
    private byte[] V;
    private final BlockCipher engine;
    private final EntropySource entropySource;
    private long reseedCounter = 1;

    public X931RNG(BlockCipher blockCipher, byte[] bArr, EntropySource entropySource) {
        this.engine = blockCipher;
        this.entropySource = entropySource;
        byte[] bArr2 = new byte[blockCipher.getBlockSize()];
        this.DT = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.I = new byte[blockCipher.getBlockSize()];
        this.R = new byte[blockCipher.getBlockSize()];
    }

    private void increment(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b15 = (byte) (bArr[length] + 1);
            bArr[length] = b15;
            if (b15 != 0) {
                return;
            }
        }
    }

    private static boolean isTooLarge(byte[] bArr, int i15) {
        return bArr != null && bArr.length > i15;
    }

    private void process(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i15 = 0; i15 != bArr.length; i15++) {
            bArr[i15] = (byte) (bArr2[i15] ^ bArr3[i15]);
        }
        this.engine.processBlock(bArr, 0, bArr, 0);
    }

    int generate(byte[] bArr, boolean z15) {
        int length = this.R.length;
        long j15 = this.reseedCounter;
        if (length == 8) {
            if (j15 > BLOCK64_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (j15 > BLOCK128_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z15 || this.V == null) {
            byte[] entropy = this.entropySource.getEntropy();
            this.V = entropy;
            if (entropy.length != this.engine.getBlockSize()) {
                throw new IllegalStateException("Insufficient entropy returned");
            }
        }
        int length2 = bArr.length / this.R.length;
        for (int i15 = 0; i15 < length2; i15++) {
            this.engine.processBlock(this.DT, 0, this.I, 0);
            process(this.R, this.I, this.V);
            process(this.V, this.R, this.I);
            byte[] bArr2 = this.R;
            System.arraycopy(bArr2, 0, bArr, bArr2.length * i15, bArr2.length);
            increment(this.DT);
        }
        int length3 = bArr.length - (this.R.length * length2);
        if (length3 > 0) {
            this.engine.processBlock(this.DT, 0, this.I, 0);
            process(this.R, this.I, this.V);
            process(this.V, this.R, this.I);
            byte[] bArr3 = this.R;
            System.arraycopy(bArr3, 0, bArr, length2 * bArr3.length, length3);
            increment(this.DT);
        }
        this.reseedCounter++;
        return bArr.length * 8;
    }

    EntropySource getEntropySource() {
        return this.entropySource;
    }

    void reseed() {
        byte[] entropy = this.entropySource.getEntropy();
        this.V = entropy;
        if (entropy.length != this.engine.getBlockSize()) {
            throw new IllegalStateException("Insufficient entropy returned");
        }
        this.reseedCounter = 1L;
    }
}
