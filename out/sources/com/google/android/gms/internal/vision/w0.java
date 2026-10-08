package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f31295a = a("libcore.io.Memory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f31296b;

    static {
        f31296b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return (f31295a == null || f31296b) ? false : true;
    }

    static Class<?> c() {
        return f31295a;
    }
}
