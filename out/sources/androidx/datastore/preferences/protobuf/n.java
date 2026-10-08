package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class<?> f12050a = c();

    public static o a() {
        o oVarB = b("getEmptyRegistry");
        return oVarB != null ? oVarB : o.f12053c;
    }

    private static final o b(String str) {
        Class<?> cls = f12050a;
        if (cls == null) {
            return null;
        }
        try {
            return (o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
