package org.bouncycastle.crypto.threshold;

/* JADX INFO: loaded from: classes5.dex */
public interface SecretSplitter {
    SplitSecret resplit(byte[] bArr, int i15, int i16);

    SplitSecret split(int i15, int i16);

    SplitSecret splitAround(SecretShare secretShare, int i15, int i16);
}
