package org.bouncycastle.util.encoders;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public interface Encoder {
    int decode(String str, OutputStream outputStream);

    int decode(byte[] bArr, int i15, int i16, OutputStream outputStream);

    int encode(byte[] bArr, int i15, int i16, OutputStream outputStream);

    int getEncodedLength(int i15);

    int getMaxDecodedLength(int i15);
}
