package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes5.dex */
public interface Translator {
    int decode(byte[] bArr, int i15, int i16, byte[] bArr2, int i17);

    int encode(byte[] bArr, int i15, int i16, byte[] bArr2, int i17);

    int getDecodedBlockSize();

    int getEncodedBlockSize();
}
