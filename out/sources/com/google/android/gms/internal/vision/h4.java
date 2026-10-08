package com.google.android.gms.internal.vision;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class h4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h4 f31064c = new h4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, l4<?>> f31066b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n4 f31065a = new l3();

    private h4() {
    }

    public static h4 a() {
        return f31064c;
    }

    public final <T> l4<T> b(Class<T> cls) {
        p2.f(cls, "messageType");
        l4<T> l4VarA = (l4) this.f31066b.get(cls);
        if (l4VarA == null) {
            l4VarA = this.f31065a.a(cls);
            p2.f(cls, "messageType");
            p2.f(l4VarA, "schema");
            l4<T> l4Var = (l4) this.f31066b.putIfAbsent(cls, l4VarA);
            if (l4Var != null) {
                return l4Var;
            }
        }
        return l4VarA;
    }

    public final <T> l4<T> c(T t15) {
        return b(t15.getClass());
    }
}
