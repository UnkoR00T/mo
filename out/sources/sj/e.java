package sj;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
