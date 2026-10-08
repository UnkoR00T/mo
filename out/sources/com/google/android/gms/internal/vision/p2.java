package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f31222a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f31223b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f31224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f31225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final r1 f31226e;

    static {
        byte[] bArr = new byte[0];
        f31224c = bArr;
        f31225d = ByteBuffer.wrap(bArr);
        f31226e = r1.b(bArr, 0, bArr.length, false);
    }

    static int a(int i15, byte[] bArr, int i16, int i17) {
        for (int i18 = i16; i18 < i16 + i17; i18++) {
            i15 = (i15 * 31) + bArr[i18];
        }
        return i15;
    }

    public static int b(long j15) {
        return (int) (j15 ^ (j15 >>> 32));
    }

    public static int c(boolean z15) {
        return z15 ? 1231 : 1237;
    }

    static <T> T d(T t15) {
        t15.getClass();
        return t15;
    }

    static Object e(Object obj, Object obj2) {
        return ((u3) obj).b().Q1((u3) obj2).d();
    }

    static <T> T f(T t15, String str) {
        if (t15 != null) {
            return t15;
        }
        throw new NullPointerException(str);
    }

    static boolean g(u3 u3Var) {
        return false;
    }

    public static boolean h(byte[] bArr) {
        return l5.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f31222a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
