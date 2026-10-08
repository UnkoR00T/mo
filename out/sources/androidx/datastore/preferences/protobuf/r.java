package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p<?> f12090a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p<?> f12091b = c();

    static p<?> a() {
        p<?> pVar = f12091b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static p<?> b() {
        return f12090a;
    }

    private static p<?> c() {
        if (c1.f11932d) {
            return null;
        }
        try {
            return (p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
