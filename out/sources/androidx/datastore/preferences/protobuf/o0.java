package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m0 f12057a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m0 f12058b = new n0();

    static m0 a() {
        return f12057a;
    }

    static m0 b() {
        return f12058b;
    }

    private static m0 c() {
        if (c1.f11932d) {
            return null;
        }
        try {
            return (m0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
