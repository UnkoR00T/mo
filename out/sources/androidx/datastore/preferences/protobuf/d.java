package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f11935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f11936b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f11937c;

    static {
        f11937c = (f11935a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f11936b;
    }

    static boolean c() {
        if (f11935a) {
            return true;
        }
        return (f11936b == null || f11937c) ? false : true;
    }
}
