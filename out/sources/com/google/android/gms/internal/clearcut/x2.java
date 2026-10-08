package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class x2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x2 f29592c = new x2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d3 f29593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, c3<?>> f29594b = new ConcurrentHashMap();

    private x2() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        d3 d3VarC = null;
        for (int i15 = 0; i15 <= 0; i15++) {
            d3VarC = c(strArr[0]);
            if (d3VarC != null) {
                break;
            }
        }
        this.f29593a = d3VarC == null ? new a2() : d3VarC;
    }

    public static x2 a() {
        return f29592c;
    }

    private static d3 c(String str) {
        try {
            return (d3) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> c3<T> b(Class<T> cls) {
        h1.e(cls, "messageType");
        c3<T> c3VarA = (c3) this.f29594b.get(cls);
        if (c3VarA == null) {
            c3VarA = this.f29593a.a(cls);
            h1.e(cls, "messageType");
            h1.e(c3VarA, "schema");
            c3<T> c3Var = (c3) this.f29594b.putIfAbsent(cls, c3VarA);
            if (c3Var != null) {
                return c3Var;
            }
        }
        return c3VarA;
    }

    public final <T> c3<T> d(T t15) {
        return b(t15.getClass());
    }
}
