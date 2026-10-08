package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface SkippingCipher {
    long getPosition();

    long seekTo(long j15);

    long skip(long j15);
}
