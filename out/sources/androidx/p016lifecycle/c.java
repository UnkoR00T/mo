package androidx.p016lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static c f12723c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f12724a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f12725b = new HashMap();

    @Deprecated
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<j.a, List<b>> f12726a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<b, j.a> f12727b;

        a(Map<b, j.a> map) {
            this.f12727b = map;
            for (Map.Entry<b, j.a> entry : map.entrySet()) {
                j.a value = entry.getValue();
                List<b> arrayList = this.f12726a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f12726a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, q qVar, j.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(qVar, aVar, obj);
                }
            }
        }

        void a(q qVar, j.a aVar, Object obj) {
            b(this.f12726a.get(aVar), qVar, aVar, obj);
            b(this.f12726a.get(j.a.ON_ANY), qVar, aVar, obj);
        }
    }

    @Deprecated
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f12728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f12729b;

        b(int i15, Method method) {
            this.f12728a = i15;
            this.f12729b = method;
            method.setAccessible(true);
        }

        void a(q qVar, j.a aVar, Object obj) {
            try {
                int i15 = this.f12728a;
                if (i15 == 0) {
                    this.f12729b.invoke(obj, null);
                } else if (i15 == 1) {
                    this.f12729b.invoke(obj, qVar);
                } else {
                    if (i15 != 2) {
                        return;
                    }
                    this.f12729b.invoke(obj, qVar, aVar);
                }
            } catch (IllegalAccessException e15) {
                throw new RuntimeException(e15);
            } catch (InvocationTargetException e16) {
                throw new RuntimeException("Failed to call observer method", e16.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12728a == bVar.f12728a && this.f12729b.getName().equals(bVar.f12729b.getName());
        }

        public int hashCode() {
            return (this.f12728a * 31) + this.f12729b.getName().hashCode();
        }
    }

    c() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i15;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f12727b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, j.a> entry : c(cls2).f12727b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z15 = false;
        for (Method method : methodArr) {
            d0 d0Var = (d0) method.getAnnotation(d0.class);
            if (d0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i15 = 0;
                } else {
                    if (!q.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i15 = 1;
                }
                j.a aVarValue = d0Var.value();
                if (parameterTypes.length > 1) {
                    if (!j.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != j.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i15 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i15, method), aVarValue, cls);
                z15 = true;
            }
        }
        a aVar = new a(map);
        this.f12724a.put(cls, aVar);
        this.f12725b.put(cls, Boolean.valueOf(z15));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e15) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e15);
        }
    }

    private void e(Map<b, j.a> map, b bVar, j.a aVar, Class<?> cls) {
        j.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f12729b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class<?> cls) {
        a aVar = this.f12724a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f12725b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((d0) method.getAnnotation(d0.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f12725b.put(cls, Boolean.FALSE);
        return false;
    }
}
