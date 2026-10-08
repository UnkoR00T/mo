package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f36029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f36030b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f36031c;

    static {
        f36031c = (f36029a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f36030b;
    }

    static boolean c() {
        if (f36029a) {
            return true;
        }
        return (f36030b == null || f36031c) ? false : true;
    }
}
