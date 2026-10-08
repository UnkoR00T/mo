package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s2 f29551a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s2 f29552b = new t2();

    static s2 a() {
        return f29551a;
    }

    static s2 b() {
        return f29552b;
    }

    private static s2 c() {
        try {
            return (s2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
