package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f29518a = a();

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static r0 b() {
        Class<?> cls = f29518a;
        if (cls != null) {
            try {
                return (r0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return r0.f29528c;
    }
}
