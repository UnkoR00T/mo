package uu;

import java.lang.reflect.Type;
import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"uu/q", "uu/r"}, d2 = {}, k = 4, mv = {2, 3, 0}, xi = 48)
public final class p {
    public static final KSerializer<Object> a(bv.c cVar, Type type) {
        return q.d(cVar, type);
    }

    public static final <T> KSerializer<T> b(mr.c<T> cVar) {
        return r.a(cVar);
    }

    public static final KSerializer<Object> c(bv.c cVar, Type type) {
        return q.g(cVar, type);
    }

    public static final <T> KSerializer<T> d(mr.c<T> cVar) {
        return r.b(cVar);
    }
}
