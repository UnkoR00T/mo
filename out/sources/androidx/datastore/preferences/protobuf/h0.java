package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f0 f11984a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f0 f11985b = new g0();

    static f0 a() {
        return f11984a;
    }

    static f0 b() {
        return f11985b;
    }

    private static f0 c() {
        if (c1.f11932d) {
            return null;
        }
        try {
            return (f0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
