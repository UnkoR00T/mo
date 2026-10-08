package com.google.gson.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import wl.h0;
import wl.w;

/* JADX INFO: loaded from: classes4.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? super T> f36859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f36860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36861c;

    protected a() {
        Type typeE = e();
        this.f36860b = typeE;
        this.f36859a = (Class<? super T>) w.k(typeE);
        this.f36861c = typeE.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    private Type e() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeB = w.b(parameterizedType.getActualTypeArguments()[0]);
                if (f()) {
                    g(typeB);
                }
                return typeB;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + h0.a("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    private static boolean f() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true");
    }

    private static void g(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + h0.a("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            g(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i15 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                g(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i15 < length) {
                g(actualTypeArguments[i15]);
                i15++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            g(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i15 < length2) {
            g(upperBounds[i15]);
            i15++;
        }
    }

    public final Class<? super T> c() {
        return this.f36859a;
    }

    public final Type d() {
        return this.f36860b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && w.f(this.f36860b, ((a) obj).f36860b);
    }

    public final int hashCode() {
        return this.f36861c;
    }

    public final String toString() {
        return w.u(this.f36860b);
    }

    private a(Type type) {
        Objects.requireNonNull(type);
        Type typeB = w.b(type);
        this.f36860b = typeB;
        this.f36859a = (Class<? super T>) w.k(typeB);
        this.f36861c = typeB.hashCode();
    }
}
