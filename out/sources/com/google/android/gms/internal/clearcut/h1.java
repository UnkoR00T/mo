package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f29350a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f29351b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f29352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f29353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j0 f29354e;

    static {
        byte[] bArr = new byte[0];
        f29352c = bArr;
        f29353d = ByteBuffer.wrap(bArr);
        f29354e = j0.b(bArr, 0, bArr.length, false);
    }

    static <T> T a(T t15) {
        t15.getClass();
        return t15;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int iC = c(length, bArr, 0, length);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    static int c(int i15, byte[] bArr, int i16, int i17) {
        for (int i18 = i16; i18 < i16 + i17; i18++) {
            i15 = (i15 * 31) + bArr[i18];
        }
        return i15;
    }

    static Object d(Object obj, Object obj2) {
        return ((l2) obj).g().x1((l2) obj2).O0();
    }

    static <T> T e(T t15, String str) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(str);
    }

    public static int f(boolean z15) {
        return z15 ? 1231 : 1237;
    }

    public static boolean g(byte[] bArr) {
        return d4.h(bArr);
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f29350a);
    }

    static boolean i(l2 l2Var) {
        return false;
    }

    public static int j(long j15) {
        return (int) (j15 ^ (j15 >>> 32));
    }
}
