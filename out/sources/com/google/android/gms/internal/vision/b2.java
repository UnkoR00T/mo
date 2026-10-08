package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<?> f30970a = new z1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a2<?> f30971b = c();

    static a2<?> a() {
        return f30970a;
    }

    static a2<?> b() {
        a2<?> a2Var = f30971b;
        if (a2Var != null) {
            return a2Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static a2<?> c() {
        try {
            return (a2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
