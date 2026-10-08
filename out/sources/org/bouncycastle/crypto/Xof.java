package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes5.dex */
public interface Xof extends ExtendedDigest {
    int doFinal(byte[] bArr, int i15, int i16);

    int doOutput(byte[] bArr, int i15, int i16);
}
