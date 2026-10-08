package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m0 f36154a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m0 f36155b = new n0();

    static m0 a() {
        return f36154a;
    }

    static m0 b() {
        return f36155b;
    }

    private static m0 c() {
        try {
            return (m0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
