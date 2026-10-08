package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s0<?> f29555a = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s0<?> f29556b = a();

    private static s0<?> a() {
        try {
            return (s0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static s0<?> b() {
        return f29555a;
    }

    static s0<?> c() {
        s0<?> s0Var = f29556b;
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
