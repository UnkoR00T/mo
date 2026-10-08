package com.google.android.libraries.places.internal;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes4.dex */
public interface or0 extends WritableByteChannel, cs0 {
    or0 D2(int i15);

    or0 S3(String str);

    @Override // com.google.android.libraries.places.internal.cs0, java.io.Flushable
    void flush();

    or0 j3(int i15);

    or0 p2(byte[] bArr);

    or0 x2(int i15);
}
