package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f29565a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f29566b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f29567c = new Object();

    public static boolean a(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2 == null || iArr2.length == 0;
        }
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean b(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static boolean c(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= length || objArr[i15] != null) {
                while (i16 < length2 && objArr2[i16] == null) {
                    i16++;
                }
                boolean z15 = i15 >= length;
                boolean z16 = i16 >= length2;
                if (z15 && z16) {
                    return true;
                }
                if (z15 != z16 || !objArr[i15].equals(objArr2[i16])) {
                    return false;
                }
                i15++;
                i16++;
            } else {
                i15++;
            }
        }
    }

    public static int d(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    public static int e(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    public static int f(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int iHashCode = 0;
        for (int i15 = 0; i15 < length; i15++) {
            Object obj = objArr[i15];
            if (obj != null) {
                iHashCode = (iHashCode * 31) + obj.hashCode();
            }
        }
        return iHashCode;
    }

    public static int g(byte[][] bArr) {
        int length = bArr == null ? 0 : bArr.length;
        int iHashCode = 0;
        for (int i15 = 0; i15 < length; i15++) {
            byte[] bArr2 = bArr[i15];
            if (bArr2 != null) {
                iHashCode = (iHashCode * 31) + Arrays.hashCode(bArr2);
            }
        }
        return iHashCode;
    }

    public static void h(s4 s4Var, s4 s4Var2) {
        t4 t4Var = s4Var.f29537b;
        if (t4Var != null) {
            s4Var2.f29537b = (t4) t4Var.clone();
        }
    }

    public static boolean i(byte[][] bArr, byte[][] bArr2) {
        int length = bArr == null ? 0 : bArr.length;
        int length2 = bArr2 == null ? 0 : bArr2.length;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= length || bArr[i15] != null) {
                while (i16 < length2 && bArr2[i16] == null) {
                    i16++;
                }
                boolean z15 = i15 >= length;
                boolean z16 = i16 >= length2;
                if (z15 && z16) {
                    return true;
                }
                if (z15 != z16 || !Arrays.equals(bArr[i15], bArr2[i16])) {
                    return false;
                }
                i15++;
                i16++;
            } else {
                i15++;
            }
        }
    }
}
