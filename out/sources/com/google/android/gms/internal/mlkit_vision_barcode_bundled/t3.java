package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f30241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f30242b;

    static {
        Charset.forName("US-ASCII");
        f30241a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f30242b = bArr;
        ByteBuffer.wrap(bArr);
        int i15 = n2.f30160a;
        try {
            new l2(bArr, 0, 0, false, null).c(0);
        } catch (v3 e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    public static int a(boolean z15) {
        return z15 ? 1231 : 1237;
    }

    static int b(int i15, byte[] bArr, int i16, int i17) {
        for (int i18 = i16; i18 < i16 + i17; i18++) {
            i15 = (i15 * 31) + bArr[i18];
        }
        return i15;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
