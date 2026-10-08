package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r3 f31264a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r3 f31265b = new q3();

    static r3 a() {
        return f31264a;
    }

    static r3 b() {
        return f31265b;
    }

    private static r3 c() {
        try {
            return (r3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
