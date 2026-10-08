package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.internal.Excluder;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.u;
import com.google.gson.w;
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
import wl.c0;
import wl.e0;
import wl.f0;
import wl.h0;
import wl.v;

/* JADX INFO: loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f36747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.gson.d f36748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Excluder f36749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f36750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<w> f36751e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends a0<T> {
        a() {
        }

        @Override // com.google.gson.a0
        public T b(zl.a aVar) throws IOException {
            aVar.G0();
            return null;
        }

        @Override // com.google.gson.a0
        public void d(zl.c cVar, T t15) throws IOException {
            cVar.M();
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f36753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f36754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a0 f36755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a0 f36756g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f36757h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f36758i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Field field, boolean z15, Method method, a0 a0Var, a0 a0Var2, boolean z16, boolean z17) {
            super(str, field);
            this.f36753d = z15;
            this.f36754e = method;
            this.f36755f = a0Var;
            this.f36756g = a0Var2;
            this.f36757h = z16;
            this.f36758i = z17;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.d
        void a(zl.a aVar, int i15, Object[] objArr) {
            Object objB = this.f36756g.b(aVar);
            if (objB != null || !this.f36757h) {
                objArr[i15] = objB;
                return;
            }
            throw new p("null is not allowed as value for record component '" + this.f36763c + "' of primitive type; at path " + aVar.W());
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.d
        void b(zl.a aVar, Object obj) throws IllegalAccessException {
            Object objB = this.f36756g.b(aVar);
            if (objB == null && this.f36757h) {
                return;
            }
            if (this.f36753d) {
                ReflectiveTypeAdapterFactory.c(obj, this.f36762b);
            } else if (this.f36758i) {
                throw new m("Cannot set value of 'static final' " + yl.a.g(this.f36762b, false));
            }
            this.f36762b.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.d
        void c(zl.c cVar, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.f36753d) {
                Method method = this.f36754e;
                if (method == null) {
                    ReflectiveTypeAdapterFactory.c(obj, this.f36762b);
                } else {
                    ReflectiveTypeAdapterFactory.c(obj, method);
                }
            }
            Method method2 = this.f36754e;
            if (method2 != null) {
                try {
                    objInvoke = method2.invoke(obj, null);
                } catch (InvocationTargetException e15) {
                    throw new m("Accessor " + yl.a.g(this.f36754e, false) + " threw exception", e15.getCause());
                }
            } else {
                objInvoke = this.f36762b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            cVar.K(this.f36761a);
            this.f36755f.d(cVar, objInvoke);
        }
    }

    public static abstract class c<T, A> extends a0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f36760a;

        c(f fVar) {
            this.f36760a = fVar;
        }

        @Override // com.google.gson.a0
        public T b(zl.a aVar) throws IOException {
            if (aVar.a0() == zl.b.NULL) {
                aVar.O();
                return null;
            }
            A aE = e();
            Map<String, d> map = this.f36760a.f36766a;
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
                throw yl.a.e(e15);
            } catch (IllegalStateException e16) {
                throw new u(e16);
            }
        }

        @Override // com.google.gson.a0
        public void d(zl.c cVar, T t15) throws IOException {
            if (t15 == null) {
                cVar.M();
                return;
            }
            cVar.r();
            try {
                Iterator<d> it = this.f36760a.f36767b.iterator();
                while (it.hasNext()) {
                    it.next().c(cVar, t15);
                }
                cVar.C();
            } catch (IllegalAccessException e15) {
                throw yl.a.e(e15);
            }
        }

        abstract A e();

        abstract T f(A a15);

        abstract void g(A a15, zl.a aVar, d dVar);
    }

    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f36761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f36762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f36763c;

        protected d(String str, Field field) {
            this.f36761a = str;
            this.f36762b = field;
            this.f36763c = field.getName();
        }

        abstract void a(zl.a aVar, int i15, Object[] objArr);

        abstract void b(zl.a aVar, Object obj);

        abstract void c(zl.c cVar, Object obj);
    }

    private static final class e<T> extends c<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0<T> f36764b;

        e(c0<T> c0Var, f fVar) {
            super(fVar);
            this.f36764b = c0Var;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        T e() {
            return this.f36764b.a();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        T f(T t15) {
            return t15;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        void g(T t15, zl.a aVar, d dVar) {
            dVar.b(aVar, t15);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final f f36765c = new f(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<String, d> f36766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<d> f36767b;

        f(Map<String, d> map, List<d> list) {
            this.f36766a = map;
            this.f36767b = list;
        }
    }

    private static final class g<T> extends c<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final Map<Class<?>, Object> f36768e = j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Constructor<T> f36769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f36770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<String, Integer> f36771d;

        g(Class<T> cls, f fVar, boolean z15) {
            super(fVar);
            this.f36771d = new HashMap();
            Constructor<T> constructorI = yl.a.i(cls);
            this.f36769b = constructorI;
            if (z15) {
                ReflectiveTypeAdapterFactory.c(null, constructorI);
            } else {
                yl.a.o(constructorI);
            }
            String[] strArrK = yl.a.k(cls);
            for (int i15 = 0; i15 < strArrK.length; i15++) {
                this.f36771d.put(strArrK[i15], Integer.valueOf(i15));
            }
            Class<?>[] parameterTypes = this.f36769b.getParameterTypes();
            this.f36770c = new Object[parameterTypes.length];
            for (int i16 = 0; i16 < parameterTypes.length; i16++) {
                this.f36770c[i16] = f36768e.get(parameterTypes[i16]);
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
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object[] e() {
            return (Object[]) this.f36770c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public T f(Object[] objArr) {
            try {
                return this.f36769b.newInstance(objArr);
            } catch (IllegalAccessException e15) {
                throw yl.a.e(e15);
            } catch (IllegalArgumentException e16) {
                e = e16;
                throw new RuntimeException("Failed to invoke constructor '" + yl.a.c(this.f36769b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e17) {
                e = e17;
                throw new RuntimeException("Failed to invoke constructor '" + yl.a.c(this.f36769b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e18) {
                throw new RuntimeException("Failed to invoke constructor '" + yl.a.c(this.f36769b) + "' with args " + Arrays.toString(objArr), e18.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(Object[] objArr, zl.a aVar, d dVar) {
            Integer num = this.f36771d.get(dVar.f36763c);
            if (num != null) {
                dVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + yl.a.c(this.f36769b) + "' for field with name '" + dVar.f36763c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(v vVar, com.google.gson.d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<w> list) {
        this.f36747a = vVar;
        this.f36748b = dVar;
        this.f36749c = excluder;
        this.f36750d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f36751e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void c(Object obj, M m15) {
        if (Modifier.isStatic(m15.getModifiers())) {
            obj = null;
        }
        if (f0.a(m15, obj)) {
            return;
        }
        throw new m(yl.a.g(m15, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private d d(com.google.gson.f fVar, Field field, Method method, String str, com.google.gson.reflect.a<?> aVar, boolean z15, boolean z16) {
        a0<?> eVar;
        boolean zA = e0.a(aVar.c());
        int modifiers = field.getModifiers();
        boolean z17 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z17 = true;
        }
        vl.b bVar = (vl.b) field.getAnnotation(vl.b.class);
        a0<?> a0VarD = bVar != null ? this.f36750d.d(this.f36747a, fVar, aVar, bVar, false) : null;
        boolean z18 = a0VarD != null;
        if (a0VarD == null) {
            a0VarD = fVar.l(aVar);
        }
        a0<?> a0Var = a0VarD;
        if (z15) {
            eVar = z18 ? a0Var : new com.google.gson.internal.bind.e<>(fVar, a0Var, aVar.d());
        } else {
            eVar = a0Var;
        }
        return new b(str, field, z16, method, eVar, a0Var, zA, z17);
    }

    private static IllegalArgumentException e(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + yl.a.f(field) + " and " + yl.a.f(field2) + "\nSee " + h0.a("duplicate-fields"));
    }

    private f f(com.google.gson.f fVar, com.google.gson.reflect.a<?> aVar, Class<?> cls, boolean z15, boolean z16) {
        boolean z17;
        com.google.gson.reflect.a<?> aVar2;
        boolean z18;
        int i15;
        int i16;
        d dVar;
        if (cls.isInterface()) {
            return f.f36765c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        com.google.gson.reflect.a<?> aVarB = aVar;
        boolean z19 = z15;
        Class<?> clsC = cls;
        while (clsC != Object.class) {
            Field[] declaredFields = clsC.getDeclaredFields();
            boolean z25 = true;
            boolean z26 = false;
            if (clsC != cls && declaredFields.length > 0) {
                w.a aVarB2 = f0.b(this.f36751e, clsC);
                if (aVarB2 == w.a.BLOCK_ALL) {
                    throw new m("ReflectionAccessFilter does not permit using reflection for " + clsC + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z19 = aVarB2 == w.a.BLOCK_INACCESSIBLE;
            }
            boolean z27 = z19;
            int length = declaredFields.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17;
                Field field = declaredFields[i18];
                boolean zH = this.h(field, z25);
                boolean zH2 = this.h(field, z26);
                if (zH || zH2) {
                    Method methodH = null;
                    if (!z16) {
                        z17 = zH2;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        z17 = z26;
                    } else {
                        methodH = yl.a.h(clsC, field);
                        if (!z27) {
                            yl.a.o(methodH);
                        }
                        if (methodH.getAnnotation(vl.c.class) != null && field.getAnnotation(vl.c.class) == null) {
                            throw new m("@SerializedName on " + yl.a.g(methodH, z26) + " is not supported");
                        }
                        z17 = zH2;
                    }
                    if (!z27 && methodH == null) {
                        yl.a.o(field);
                    }
                    Type typeP = wl.w.p(aVarB.d(), clsC, field.getGenericType());
                    List<String> listG = this.g(field);
                    aVar2 = aVarB;
                    z18 = false;
                    String str = listG.get(0);
                    i15 = i18;
                    i16 = length;
                    d dVarD = this.d(fVar, field, methodH, str, com.google.gson.reflect.a.b(typeP), zH, z27);
                    if (z17) {
                        for (String str2 : listG) {
                            d dVar2 = (d) linkedHashMap.put(str2, dVarD);
                            if (dVar2 != null) {
                                throw e(cls, str2, dVar2.f36762b, field);
                            }
                        }
                    }
                    if (zH && (dVar = (d) linkedHashMap2.put(str, dVarD)) != null) {
                        throw e(cls, str, dVar.f36762b, field);
                    }
                } else {
                    i16 = length;
                    i15 = i18;
                    aVar2 = aVarB;
                    z18 = z26;
                }
                i17 = i15 + 1;
                this = this;
                z26 = z18;
                aVarB = aVar2;
                length = i16;
                z25 = true;
            }
            aVarB = com.google.gson.reflect.a.b(wl.w.p(aVarB.d(), clsC, clsC.getGenericSuperclass()));
            clsC = aVarB.c();
            z19 = z27;
        }
        return new f(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    private List<String> g(Field field) {
        String strB;
        List<String> listE;
        vl.c cVar = (vl.c) field.getAnnotation(vl.c.class);
        if (cVar == null) {
            strB = this.f36748b.b(field);
            listE = this.f36748b.e(field);
        } else {
            String strValue = cVar.value();
            List<String> listAsList = Arrays.asList(cVar.alternate());
            strB = strValue;
            listE = listAsList;
        }
        if (listE.isEmpty()) {
            return Collections.singletonList(strB);
        }
        ArrayList arrayList = new ArrayList(listE.size() + 1);
        arrayList.add(strB);
        arrayList.addAll(listE);
        return arrayList;
    }

    private boolean h(Field field, boolean z15) {
        return !this.f36749c.g(field, z15);
    }

    @Override // com.google.gson.b0
    public <T> a0<T> b(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        if (!Object.class.isAssignableFrom(clsC)) {
            return null;
        }
        if (yl.a.l(clsC)) {
            return new a();
        }
        w.a aVarB = f0.b(this.f36751e, clsC);
        if (aVarB != w.a.BLOCK_ALL) {
            boolean z15 = aVarB == w.a.BLOCK_INACCESSIBLE;
            return yl.a.m(clsC) ? new g(clsC, f(fVar, aVar, clsC, z15, true), z15) : new e(this.f36747a.w(aVar, true), f(fVar, aVar, clsC, z15, false));
        }
        throw new m("ReflectionAccessFilter does not permit using reflection for " + clsC + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
