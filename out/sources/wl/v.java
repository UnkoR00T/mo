package wl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Type, com.google.gson.h<?>> f214050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f214051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.google.gson.w> f214052c;

    public v(Map<Type, com.google.gson.h<?>> map, boolean z15, List<com.google.gson.w> list) {
        this.f214050a = map;
        this.f214051b = z15;
        this.f214052c = list;
    }

    private static <T> c0<T> A(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (c0<T>) y(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (c0<T>) B(type, cls);
        }
        return null;
    }

    private static c0<? extends Map<? extends Object, Object>> B(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(a0.class) && x(type)) {
            return new c0() { // from class: wl.e
                @Override // wl.c0
                public final Object a() {
                    return v.p();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new c0() { // from class: wl.f
                @Override // wl.c0
                public final Object a() {
                    return v.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new c0() { // from class: wl.g
                @Override // wl.c0
                public final Object a() {
                    return v.j();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new c0() { // from class: wl.h
                @Override // wl.c0
                public final Object a() {
                    return v.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new c0() { // from class: wl.i
                @Override // wl.c0
                public final Object a() {
                    return v.h();
                }
            };
        }
        return null;
    }

    private static <T> c0<T> C(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new c0() { // from class: wl.c
                @Override // wl.c0
                public final Object a() {
                    return v.m(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new c0() { // from class: wl.d
                @Override // wl.c0
                public final Object a() {
                    return v.f(type);
                }
            };
        }
        return null;
    }

    private <T> c0<T> D(final Class<? super T> cls) {
        if (this.f214051b) {
            return new c0() { // from class: wl.u
                @Override // wl.c0
                public final Object a() {
                    return v.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new c0() { // from class: wl.b
            @Override // wl.c0
            public final Object a() {
                return v.o(str);
            }
        };
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return i0.f214035a.d(cls);
        } catch (Exception e15) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e15);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.m("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new com.google.gson.m("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map h() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map j() {
        return new TreeMap();
    }

    public static /* synthetic */ Object k(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Collection l() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object m(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.m("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new com.google.gson.m("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object n(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Object o(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Map p() {
        return new a0();
    }

    public static /* synthetic */ Object q(String str) {
        throw new com.google.gson.m(str);
    }

    public static /* synthetic */ Collection r() {
        return new TreeSet();
    }

    public static /* synthetic */ Object s(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e15) {
            throw yl.a.e(e15);
        } catch (InstantiationException e16) {
            throw new RuntimeException("Failed to invoke constructor '" + yl.a.c(constructor) + "' with no args", e16);
        } catch (InvocationTargetException e17) {
            throw new RuntimeException("Failed to invoke constructor '" + yl.a.c(constructor) + "' with no args", e17.getCause());
        }
    }

    public static /* synthetic */ Collection t() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object u(String str) {
        throw new com.google.gson.m(str);
    }

    static String v(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + h0.a("r8-abstract-class");
    }

    private static boolean x(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && w.k(actualTypeArguments[0]) == String.class;
    }

    private static c0<? extends Collection<? extends Object>> y(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new c0() { // from class: wl.q
                @Override // wl.c0
                public final Object a() {
                    return v.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new c0() { // from class: wl.r
                @Override // wl.c0
                public final Object a() {
                    return v.l();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new c0() { // from class: wl.s
                @Override // wl.c0
                public final Object a() {
                    return v.r();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new c0() { // from class: wl.t
                @Override // wl.c0
                public final Object a() {
                    return v.t();
                }
            };
        }
        return null;
    }

    private static <T> c0<T> z(Class<? super T> cls, com.google.gson.w.a aVar) {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            com.google.gson.w.a aVar2 = com.google.gson.w.a.ALLOW;
            if (aVar == aVar2 || (f0.a(declaredConstructor, null) && (aVar != com.google.gson.w.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (aVar != aVar2 || (strP = yl.a.p(declaredConstructor)) == null) ? new c0() { // from class: wl.m
                    @Override // wl.c0
                    public final Object a() {
                        return v.s(declaredConstructor);
                    }
                } : new c0() { // from class: wl.k
                    @Override // wl.c0
                    public final Object a() {
                        return v.k(strP);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new c0() { // from class: wl.j
                @Override // wl.c0
                public final Object a() {
                    return v.n(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f214050a.toString();
    }

    public <T> c0<T> w(com.google.gson.reflect.a<T> aVar, boolean z15) {
        final Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        final com.google.gson.h<?> hVar = this.f214050a.get(typeD);
        if (hVar != null) {
            return new c0() { // from class: wl.a
                @Override // wl.c0
                public final Object a() {
                    return hVar.a(typeD);
                }
            };
        }
        final com.google.gson.h<?> hVar2 = this.f214050a.get(clsC);
        if (hVar2 != null) {
            return new c0() { // from class: wl.l
                @Override // wl.c0
                public final Object a() {
                    return hVar2.a(typeD);
                }
            };
        }
        c0<T> c0VarC = C(typeD, clsC);
        if (c0VarC != null) {
            return c0VarC;
        }
        com.google.gson.w.a aVarB = f0.b(this.f214052c, clsC);
        c0<T> c0VarZ = z(clsC, aVarB);
        if (c0VarZ != null) {
            return c0VarZ;
        }
        c0<T> c0VarA = A(typeD, clsC);
        if (c0VarA != null) {
            return c0VarA;
        }
        final String strV = v(clsC);
        if (strV != null) {
            return new c0() { // from class: wl.n
                @Override // wl.c0
                public final Object a() {
                    return v.q(strV);
                }
            };
        }
        if (!z15) {
            final String str = "Unable to create instance of " + clsC + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new c0() { // from class: wl.o
                @Override // wl.c0
                public final Object a() {
                    return v.d(str);
                }
            };
        }
        if (aVarB == com.google.gson.w.a.ALLOW) {
            return D(clsC);
        }
        final String str2 = "Unable to create instance of " + clsC + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new c0() { // from class: wl.p
            @Override // wl.c0
            public final Object a() {
                return v.u(str2);
            }
        };
    }
}
