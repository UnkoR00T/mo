package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w0 f36335a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w0 f36336b = new x0();

    static w0 a() {
        return f36335a;
    }

    static w0 b() {
        return f36336b;
    }

    private static w0 c() {
        try {
            return (w0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
