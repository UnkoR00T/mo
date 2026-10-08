package as;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static final Class<?> a(ClassLoader classLoader, String str) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
