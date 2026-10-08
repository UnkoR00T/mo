package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2 f29360a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g2 f29361b = new h2();

    static g2 a() {
        return f29360a;
    }

    static g2 b() {
        return f29361b;
    }

    private static g2 c() {
        try {
            return (g2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
