package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
class r10 {
    protected static final int a(String str, byte[] bArr, int i15, int i16) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i15 > i16) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i15, length);
        return i15 + length;
    }
}
