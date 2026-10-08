package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class<?> f36153a = c();

    public static p a() {
        p pVarB = b("getEmptyRegistry");
        return pVarB != null ? pVarB : p.f36164d;
    }

    private static final p b(String str) {
        Class<?> cls = f36153a;
        if (cls == null) {
            return null;
        }
        try {
            return (p) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
