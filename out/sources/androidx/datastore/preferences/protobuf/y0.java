package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w0 f12225a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w0 f12226b = new x0();

    static w0 a() {
        return f12225a;
    }

    static w0 b() {
        return f12226b;
    }

    private static w0 c() {
        if (c1.f11932d) {
            return null;
        }
        try {
            return (w0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
