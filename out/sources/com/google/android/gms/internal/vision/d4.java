package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4 f30993a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4 f30994b = new e4();

    static b4 a() {
        return f30993a;
    }

    static b4 b() {
        return f30994b;
    }

    private static b4 c() {
        try {
            return (b4) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
