package org.bouncycastle.jcajce.provider.drbg;

import org.bouncycastle.crypto.prng.EntropySource;

/* JADX INFO: loaded from: classes5.dex */
interface IncrementalEntropySource extends EntropySource {
    byte[] getEntropy(long j15);
}
