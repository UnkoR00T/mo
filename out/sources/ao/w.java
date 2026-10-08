package ao;

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
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Type, yn.h<?>> f13935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<yn.v> f13937c;

    public w(Map<Type, yn.h<?>> map, boolean z15, List<yn.v> list) {
        this.f13935a = map;
        this.f13936b = z15;
        this.f13937c = list;
    }

    public static /* synthetic */ Object a(String str) {
        throw new yn.m(str);
    }

    public static /* synthetic */ Object b() {
        return new TreeMap();
    }

    public static /* synthetic */ Object d(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new yn.m("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new yn.m("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Object e(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e15) {
            throw eo.a.e(e15);
        } catch (InstantiationException e16) {
            throw new RuntimeException("Failed to invoke constructor '" + eo.a.c(constructor) + "' with no args", e16);
        } catch (InvocationTargetException e17) {
            throw new RuntimeException("Failed to invoke constructor '" + eo.a.c(constructor) + "' with no args", e17.getCause());
        }
    }

    public static /* synthetic */ Object f(String str) {
        throw new yn.m(str);
    }

    public static /* synthetic */ Object g(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new yn.m("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new yn.m("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object h() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Object i(String str) {
        throw new yn.m(str);
    }

    public static /* synthetic */ Object k() {
        return new TreeSet();
    }

    public static /* synthetic */ Object l(String str) {
        throw new yn.m(str);
    }

    public static /* synthetic */ Object m() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object n(Class cls) {
        try {
            return j0.f13919a.d(cls);
        } catch (Exception e15) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e15);
        }
    }

    public static /* synthetic */ Object o() {
        return new ArrayList();
    }

    public static /* synthetic */ Object p() {
        return new b0();
    }

    public static /* synthetic */ Object q() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object r(String str) {
        throw new yn.m(str);
    }

    public static /* synthetic */ Object s() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object t() {
        return new ConcurrentHashMap();
    }

    static String u(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + i0.a("r8-abstract-class");
    }

    private static <T> d0<T> w(Class<? super T> cls, yn.v.a aVar) {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            yn.v.a aVar2 = yn.v.a.ALLOW;
            if (aVar == aVar2 || (g0.a(declaredConstructor, null) && (aVar != yn.v.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (aVar != aVar2 || (strP = eo.a.p(declaredConstructor)) == null) ? new d0() { // from class: ao.s
                    @Override // ao.d0
                    public final Object a() {
                        return w.e(declaredConstructor);
                    }
                } : new d0() { // from class: ao.r
                    @Override // ao.d0
                    public final Object a() {
                        return w.f(strP);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new d0() { // from class: ao.q
                @Override // ao.d0
                public final Object a() {
                    return w.a(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> d0<T> x(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new d0() { // from class: ao.t
                    @Override // ao.d0
                    public final Object a() {
                        return w.k();
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new d0() { // from class: ao.u
                    @Override // ao.d0
                    public final Object a() {
                        return w.s();
                    }
                };
            }
            return Queue.class.isAssignableFrom(cls) ? new d0() { // from class: ao.v
                @Override // ao.d0
                public final Object a() {
                    return w.q();
                }
            } : new d0() { // from class: ao.d
                @Override // ao.d0
                public final Object a() {
                    return w.o();
                }
            };
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new d0() { // from class: ao.e
                @Override // ao.d0
                public final Object a() {
                    return w.h();
                }
            };
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new d0() { // from class: ao.f
                @Override // ao.d0
                public final Object a() {
                    return w.t();
                }
            };
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new d0() { // from class: ao.g
                @Override // ao.d0
                public final Object a() {
                    return w.b();
                }
            };
        }
        return (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(go.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).d())) ? new d0() { // from class: ao.i
            @Override // ao.d0
            public final Object a() {
                return w.p();
            }
        } : new d0() { // from class: ao.h
            @Override // ao.d0
            public final Object a() {
                return w.m();
            }
        };
    }

    private static <T> d0<T> y(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new d0() { // from class: ao.c
                @Override // ao.d0
                public final Object a() {
                    return w.g(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new d0() { // from class: ao.n
                @Override // ao.d0
                public final Object a() {
                    return w.d(type);
                }
            };
        }
        return null;
    }

    private <T> d0<T> z(final Class<? super T> cls) {
        if (this.f13936b) {
            return new d0() { // from class: ao.o
                @Override // ao.d0
                public final Object a() {
                    return w.n(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new d0() { // from class: ao.p
            @Override // ao.d0
            public final Object a() {
                return w.r(str);
            }
        };
    }

    public String toString() {
        return this.f13935a.toString();
    }

    public <T> d0<T> v(go.a<T> aVar) {
        final Type typeE = aVar.e();
        Class<? super T> clsD = aVar.d();
        final yn.h<?> hVar = this.f13935a.get(typeE);
        if (hVar != null) {
            return new d0() { // from class: ao.j
                @Override // ao.d0
                public final Object a() {
                    return hVar.a(typeE);
                }
            };
        }
        final yn.h<?> hVar2 = this.f13935a.get(clsD);
        if (hVar2 != null) {
            return new d0() { // from class: ao.k
                @Override // ao.d0
                public final Object a() {
                    return hVar2.a(typeE);
                }
            };
        }
        d0<T> d0VarY = y(typeE, clsD);
        if (d0VarY != null) {
            return d0VarY;
        }
        yn.v.a aVarB = g0.b(this.f13937c, clsD);
        d0<T> d0VarW = w(clsD, aVarB);
        if (d0VarW != null) {
            return d0VarW;
        }
        d0<T> d0VarX = x(typeE, clsD);
        if (d0VarX != null) {
            return d0VarX;
        }
        final String strU = u(clsD);
        if (strU != null) {
            return new d0() { // from class: ao.l
                @Override // ao.d0
                public final Object a() {
                    return w.l(strU);
                }
            };
        }
        if (aVarB == yn.v.a.ALLOW) {
            return z(clsD);
        }
        final String str = "Unable to create instance of " + clsD + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new d0() { // from class: ao.m
            @Override // ao.d0
            public final Object a() {
                return w.i(str);
            }
        };
    }
}
