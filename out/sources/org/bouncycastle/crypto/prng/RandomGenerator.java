package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes5.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j15);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i15, int i16);
}
