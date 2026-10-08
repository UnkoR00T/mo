package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.k;
import com.google.gson.t;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import wl.v;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b0 f36728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b0 f36729d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f36730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, b0> f36731b = new ConcurrentHashMap();

    private static class DummyTypeAdapterFactory implements b0 {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.b0
        public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f36728c = new DummyTypeAdapterFactory();
        f36729d = new DummyTypeAdapterFactory();
    }

    public JsonAdapterAnnotationTypeAdapterFactory(v vVar) {
        this.f36730a = vVar;
    }

    private static Object a(v vVar, Class<?> cls) {
        return vVar.w(com.google.gson.reflect.a.a(cls), true).a();
    }

    private static vl.b c(Class<?> cls) {
        return (vl.b) cls.getAnnotation(vl.b.class);
    }

    private b0 f(Class<?> cls, b0 b0Var) {
        b0 b0VarPutIfAbsent = this.f36731b.putIfAbsent(cls, b0Var);
        return b0VarPutIfAbsent != null ? b0VarPutIfAbsent : b0Var;
    }

    @Override // com.google.gson.b0
    public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
        vl.b bVarC = c(aVar.c());
        if (bVarC == null) {
            return null;
        }
        return (a0<T>) d(this.f36730a, fVar, aVar, bVarC, true);
    }

    a0<?> d(v vVar, f fVar, com.google.gson.reflect.a<?> aVar, vl.b bVar, boolean z15) {
        a0<?> a0VarB;
        Object objA = a(vVar, bVar.value());
        boolean zNullSafe = bVar.nullSafe();
        if (objA instanceof a0) {
            a0VarB = (a0) objA;
        } else if (objA instanceof b0) {
            b0 b0VarF = (b0) objA;
            if (z15) {
                b0VarF = f(aVar.c(), b0VarF);
            }
            a0VarB = b0VarF.b(fVar, aVar);
        } else {
            boolean z16 = objA instanceof t;
            if (!z16 && !(objA instanceof k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z16 ? (t) objA : null, objA instanceof k ? (k) objA : null, fVar, aVar, z15 ? f36728c : f36729d, zNullSafe);
            zNullSafe = false;
            a0VarB = treeTypeAdapter;
        }
        return (a0VarB == null || !zNullSafe) ? a0VarB : a0VarB.a();
    }

    public boolean e(com.google.gson.reflect.a<?> aVar, b0 b0Var) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(b0Var);
        if (b0Var == f36728c) {
            return true;
        }
        Class<? super Object> clsC = aVar.c();
        b0 b0Var2 = this.f36731b.get(clsC);
        if (b0Var2 != null) {
            return b0Var2 == b0Var;
        }
        vl.b bVarC = c(clsC);
        if (bVarC == null) {
            return false;
        }
        Class<?> clsValue = bVarC.value();
        return b0.class.isAssignableFrom(clsValue) && f(clsC, (b0) a(this.f36730a, clsValue)) == b0Var;
    }
}
