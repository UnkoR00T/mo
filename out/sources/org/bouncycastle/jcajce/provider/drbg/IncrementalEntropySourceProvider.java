package org.bouncycastle.jcajce.provider.drbg;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;

/* JADX INFO: loaded from: classes5.dex */
class IncrementalEntropySourceProvider implements EntropySourceProvider {
    private final boolean predictionResistant;
    private final SecureRandom random;

    public IncrementalEntropySourceProvider(SecureRandom secureRandom, boolean z15) {
        this.random = secureRandom;
        this.predictionResistant = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(long j15) throws InterruptedException {
        if (j15 != 0) {
            Thread.sleep(j15);
        }
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(int i15) {
        return new IncrementalEntropySource(i15) { // from class: org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySourceProvider.1
            final int numBytes;
            final /* synthetic */ int val$bitsRequired;

            {
                this.val$bitsRequired = i15;
                this.numBytes = (i15 + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.val$bitsRequired;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                try {
                    return getEntropy(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("initial entropy fetch interrupted");
                }
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return IncrementalEntropySourceProvider.this.predictionResistant;
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j15) throws InterruptedException {
                int i16;
                int i17 = this.numBytes;
                byte[] bArr = new byte[i17];
                int i18 = 0;
                while (true) {
                    i16 = this.numBytes;
                    if (i18 >= i16 / 8) {
                        break;
                    }
                    IncrementalEntropySourceProvider.sleep(j15);
                    byte[] bArrGenerateSeed = IncrementalEntropySourceProvider.this.random.generateSeed(8);
                    System.arraycopy(bArrGenerateSeed, 0, bArr, i18 * 8, bArrGenerateSeed.length);
                    i18++;
                }
                int i19 = i16 - ((i16 / 8) * 8);
                if (i19 != 0) {
                    IncrementalEntropySourceProvider.sleep(j15);
                    byte[] bArrGenerateSeed2 = IncrementalEntropySourceProvider.this.random.generateSeed(i19);
                    System.arraycopy(bArrGenerateSeed2, 0, bArr, i17 - bArrGenerateSeed2.length, bArrGenerateSeed2.length);
                }
                return bArr;
            }
        };
    }
}
