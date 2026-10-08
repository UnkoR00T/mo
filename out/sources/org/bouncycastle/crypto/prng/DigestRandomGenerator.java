package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class DigestRandomGenerator implements RandomGenerator {
    private static long CYCLE_COUNT = 10;
    private Digest digest;
    private byte[] seed;
    private byte[] state;
    private long seedCounter = 1;
    private long stateCounter = 1;

    public DigestRandomGenerator(Digest digest) {
        this.digest = digest;
        this.seed = new byte[digest.getDigestSize()];
        this.state = new byte[digest.getDigestSize()];
    }

    private void cycleSeed() {
        digestUpdate(this.seed);
        long j15 = this.seedCounter;
        this.seedCounter = 1 + j15;
        digestAddCounter(j15);
        digestDoFinal(this.seed);
    }

    private void digestAddCounter(long j15) {
        for (int i15 = 0; i15 != 8; i15++) {
            this.digest.update((byte) j15);
            j15 >>>= 8;
        }
    }

    private void digestDoFinal(byte[] bArr) {
        this.digest.doFinal(bArr, 0);
    }

    private void digestUpdate(byte[] bArr) {
        this.digest.update(bArr, 0, bArr.length);
    }

    private void generateState() {
        long j15 = this.stateCounter;
        this.stateCounter = 1 + j15;
        digestAddCounter(j15);
        digestUpdate(this.state);
        digestUpdate(this.seed);
        digestDoFinal(this.state);
        if (this.stateCounter % CYCLE_COUNT == 0) {
            cycleSeed();
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j15) {
        synchronized (this) {
            digestAddCounter(j15);
            digestUpdate(this.seed);
            digestDoFinal(this.seed);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            try {
                if (!Arrays.isNullOrEmpty(bArr)) {
                    digestUpdate(bArr);
                }
                digestUpdate(this.seed);
                digestDoFinal(this.seed);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i15, int i16) {
        synchronized (this) {
            try {
                generateState();
                int i17 = i16 + i15;
                int i18 = 0;
                while (i15 != i17) {
                    if (i18 == this.state.length) {
                        generateState();
                        i18 = 0;
                    }
                    bArr[i15] = this.state[i18];
                    i15++;
                    i18++;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
