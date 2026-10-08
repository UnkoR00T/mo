# Paczka 092 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `bo/l.java (część 1/2)`

## bo/l.java (część 1/2)

```java
package bo;

import ao.d0;
import ao.f0;
import ao.g0;
import ao.i0;
import ao.w;
import ao.x;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import yn.a0;
import yn.t;
import yn.v;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f20499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yn.d f20500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f20501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bo.e f20502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<v> f20503e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends z<T> {
        a() {
        }

        @Override // yn.z
        public T b(ho.a aVar) throws IOException {
            aVar.G0();
            return null;
        }

        @Override // yn.z
        public void d(ho.c cVar, T t15) throws IOException {
            cVar.M();
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f20505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f20506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ z f20507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z f20508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f20509h;

        /* JADX INFO:
    public static abstract class c<T, A> extends z<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f20512a;

        c(f fVar) {
            this.f20512a = fVar;
        }

        @Override // yn.z
        public T b(ho.a aVar) throws IOException {
            if (aVar.a0() == ho.b.NULL) {
                aVar.O();
                return null;
            }
            A aE = e();
            Map<String, d> map = this.f20512a.f20518a;
            try {
                aVar.Y();
                while (aVar.I()) {
                    d dVar = map.get(aVar.h1());
                    if (dVar == null) {
                        aVar.G0();
                    } else {
                        g(aE, aVar, dVar);
                    }
                }
                aVar.h0();
                return f(aE);
            } catch (IllegalAccessException e15) {
                throw eo.a.e(e15);
            } catch (IllegalStateException e16) {
                throw new t(e16);
            }
        }

        @Override // yn.z
        public void d(ho.c cVar, T t15) throws IOException {
            if (t15 == null) {
                cVar.M();
                return;
            }
            cVar.r();
            try {
                Iterator<d> it = this.f20512a.f20519b.iterator();
                while (it.hasNext()) {
                    it.next().c(cVar, t15);
                }
                cVar.C();
            } catch (IllegalAccessException e15) {
                throw eo.a.e(e15);
            }
        }

        abstract A e();

        abstract T f(A a15);

        abstract void g(A a15, ho.a aVar, d dVar);
    }

    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f20513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f20514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f20515c;

        protected d(String str, Field field) {
            this.f20513a = str;
            this.f20514b = field;
            this.f20515c = field.getName();
        }

        abstract void a(ho.a aVar, int i15, Object[] objArr);

        abstract void b(ho.a aVar, Object obj);

        abstract void c(ho.c cVar, Object obj);
    }

    private static final class e<T> extends c<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0<T> f20516b;

        e(d0<T> d0Var, f fVar) {
            super(fVar);
            this.f20516b = d0Var;
        }

        @Override // bo.l.c
        T e() {
            return this.f20516b.a();
        }

        @Override // bo.l.c
        T f(T t15) {
            return t15;
        }

        @Override // bo.l.c
        void g(T t15, ho.a aVar, d dVar) {
            dVar.b(aVar, t15);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f20517c = new f(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, d> f20518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<d> f20519b;

        public f(Map<String, d> map, List<d> list) {
            this.f20518a = map;
            this.f20519b = list;
        }
    }

    private static final class g<T> extends c<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final Map<Class<?>, Object> f20520e = j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Constructor<T> f20521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f20522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<String, Integer> f20523d;

        g(Class<T> cls, f fVar, boolean z15) {
            super(fVar);
            this.f20523d = new HashMap();
            Constructor<T> constructorI = eo.a.i(cls);
            this.f20521b = constructorI;
            if (z15) {
                l.c(null, constructorI);
            } else {
                eo.a.o(constructorI);
            }
            String[] strArrK = eo.a.k(cls);
            for (int i15 = 0; i15 < strArrK.length; i15++) {
                this.f20523d.put(strArrK[i15], Integer.valueOf(i15));
            }
            Class<?>[] parameterTypes = this.f20521b.getParameterTypes();
            this.f20522c = new Object[parameterTypes.length];
            for (int i16 = 0; i16 < parameterTypes.length; i16++) {
                this.f20522c[i16] = f20520e.get(parameterTypes[i16]);
            }
        }

        private static Map<Class<?>, Object> j() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // bo.l.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object[] e() {
            return (Object[]) this.f20522c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // bo.l.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public T f(Object[] objArr) {
            try {
                return this.f20521b.newInstance(objArr);
            } catch (IllegalAccessException e15) {
                throw eo.a.e(e15);
            } catch (IllegalArgumentException e16) {
                e = e16;
                throw new RuntimeException("Failed to invoke constructor '" + eo.a.c(this.f20521b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e17) {
                e = e17;
                throw new RuntimeException("Failed to invoke constructor '" + eo.a.c(this.f20521b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e18) {
                throw new RuntimeException("Failed to invoke constructor '" + eo.a.c(this.f20521b) + "' with args " + Arrays.toString(objArr), e18.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // bo.l.c
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(Object[] objArr, ho.a aVar, d dVar) {
            Integer num = this.f20523d.get(dVar.f20515c);
            if (num != null) {
                dVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + eo.a.c(this.f20521b) + "' for field with name '" + dVar.f20515c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public l(w wVar, yn.d dVar, x xVar, bo.e eVar, List<v> list) {
        this.f20499a = wVar;
        this.f20500b = dVar;
        this.f20501c = xVar;
        this.f20502d = eVar;
        this.f20503e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void c(Object obj, M m15) {
        if (Modifier.isStatic(m15.getModifiers())) {
            obj = null;
        }
        if (g0.a(m15, obj)) {
            return;
        }
        throw new yn.m(eo.a.g(m15, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private d d(yn.f fVar, Field field, Method method, String str, go.a<?> aVar, boolean z15, boolean z16) {
        z<?> oVar;
        boolean zA = f0.a(aVar.d());
        int modifiers = field.getModifiers();
        boolean z17 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z17 = true;
        }
        zn.b bVar = (zn.b) field.getAnnotation(zn.b.class);
        z<?> zVarD = bVar != null ? this.f20502d.d(this.f20499a, fVar, aVar, bVar, false) : null;
        boolean z18 = zVarD != null;
        if (zVarD == null) {
            zVarD = fVar.k(aVar);
        }
        z<?> zVar = zVarD;
        if (z15) {
            oVar = z18 ? zVar : new o<>(fVar, zVar, aVar.e());
        } else {
            oVar = zVar;
        }
        return new b(str, field, z16, method, oVar, zVar, zA, z17);
    }

    private static IllegalArgumentException e(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + eo.a.f(field) + " and " + eo.a.f(field2) + "\nSee " + i0.a("duplicate-fields"));
    }

```
