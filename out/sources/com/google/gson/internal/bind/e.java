package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.f;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes4.dex */
final class e<T> extends a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f36841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0<T> f36842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f36843c;

    e(f fVar, a0<T> a0Var, Type type) {
        this.f36841a = fVar;
        this.f36842b = a0Var;
        this.f36843c = type;
    }

    private static Type e(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    private static boolean f(a0<?> a0Var) {
        a0<?> a0VarE;
        while ((a0Var instanceof d) && (a0VarE = ((d) a0Var).e()) != a0Var) {
            a0Var = a0VarE;
        }
        return a0Var instanceof ReflectiveTypeAdapterFactory.c;
    }

    @Override // com.google.gson.a0
    public T b(zl.a aVar) {
        return this.f36842b.b(aVar);
    }

    @Override // com.google.gson.a0
    public void d(zl.c cVar, T t15) {
        a0<T> a0VarL = this.f36842b;
        Type typeE = e(this.f36843c, t15);
        if (typeE != this.f36843c) {
            a0VarL = this.f36841a.l(com.google.gson.reflect.a.b(typeE));
            if ((a0VarL instanceof ReflectiveTypeAdapterFactory.c) && !f(this.f36842b)) {
                a0VarL = this.f36842b;
            }
        }
        a0VarL.d(cVar, t15);
    }
}
