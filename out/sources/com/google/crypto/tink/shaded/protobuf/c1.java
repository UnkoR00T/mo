package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c1 f36026c = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, g1<?>> f36028b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1 f36027a = new j0();

    private c1() {
    }

    public static c1 a() {
        return f36026c;
    }

    public g1<?> b(Class<?> cls, g1<?> g1Var) {
        a0.b(cls, "messageType");
        a0.b(g1Var, "schema");
        return this.f36028b.putIfAbsent(cls, g1Var);
    }

    public <T> g1<T> c(Class<T> cls) {
        a0.b(cls, "messageType");
        g1<T> g1VarA = (g1) this.f36028b.get(cls);
        if (g1VarA == null) {
            g1VarA = this.f36027a.a(cls);
            g1<T> g1Var = (g1<T>) b(cls, g1VarA);
            if (g1Var != null) {
                return g1Var;
            }
        }
        return g1VarA;
    }

    public <T> g1<T> d(T t15) {
        return c(t15.getClass());
    }
}
