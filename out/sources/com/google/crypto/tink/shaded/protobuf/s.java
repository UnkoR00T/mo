package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q<?> f36199a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q<?> f36200b = c();

    static q<?> a() {
        q<?> qVar = f36200b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static q<?> b() {
        return f36199a;
    }

    private static q<?> c() {
        try {
            return (q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
