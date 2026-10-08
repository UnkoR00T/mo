package org.bouncycastle.crypto.prng;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class ThreadedSeedGenerator {

    private static class SeedGenerator implements Runnable {
        private volatile int counter;
        private volatile boolean stop;

        private SeedGenerator() {
            this.counter = 0;
            this.stop = false;
        }

        public byte[] generateSeed(int i15, boolean z15) {
            Thread thread = new Thread(this);
            byte[] bArr = new byte[i15];
            this.counter = 0;
            this.stop = false;
            thread.start();
            if (!z15) {
                i15 *= 8;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                while (this.counter == i16) {
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException unused) {
                    }
                }
                i16 = this.counter;
                if (z15) {
                    bArr[i17] = (byte) (i16 & GF2Field.MASK);
                } else {
                    int i18 = i17 / 8;
                    bArr[i18] = (byte) ((bArr[i18] << 1) | (i16 & 1));
                }
            }
            this.stop = true;
            return bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.stop) {
                this.counter++;
            }
        }
    }

    public byte[] generateSeed(int i15, boolean z15) {
        return new SeedGenerator().generateSeed(i15, z15);
    }
}
