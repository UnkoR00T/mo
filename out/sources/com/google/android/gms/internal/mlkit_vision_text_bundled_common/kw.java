package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class kw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f30476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f30477b;

    static {
        Charset.forName("US-ASCII");
        f30476a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f30477b = bArr;
        ByteBuffer.wrap(bArr);
        int i15 = cv.f30389a;
        try {
            new av(bArr, 0, 0, false, null).c(0);
        } catch (mw e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    public static int a(boolean z15) {
        return z15 ? 1231 : 1237;
    }

    static int b(int i15, byte[] bArr, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
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

    static boolean d(jx jxVar) {
        if (jxVar instanceof fu) {
            throw null;
        }
        return false;
    }
}
