package bq;

import lq.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static <T> T a(Object obj, Class<T> cls) {
        if (obj instanceof lq.a) {
            return cls.cast(obj);
        }
        if (obj instanceof b) {
            return (T) a(((b) obj).p(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), lq.a.class, b.class));
    }
}
