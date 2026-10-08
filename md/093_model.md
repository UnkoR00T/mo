# Paczka 093 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `bo/l.java (część 2/2)`

## bo/l.java (część 2/2)

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
    private f f(yn.f fVar, go.a<?> aVar, Class<?> cls, boolean z15, boolean z16) {
        boolean z17;
        go.a<?> aVar2;
        boolean z18;
        int i15;
        int i16;
        d dVar;
        if (cls.isInterface()) {
            return f.f20517c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        go.a<?> aVarB = aVar;
        boolean z19 = z15;
        Class<?> clsD = cls;
        while (clsD != Object.class) {
            Field[] declaredFields = clsD.getDeclaredFields();
            boolean z25 = true;
            boolean z26 = false;
            if (clsD != cls && declaredFields.length > 0) {
                v.a aVarB2 = g0.b(this.f20503e, clsD);
                if (aVarB2 == v.a.BLOCK_ALL) {
                    throw new yn.m("ReflectionAccessFilter does not permit using reflection for " + clsD + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z19 = aVarB2 == v.a.BLOCK_INACCESSIBLE;
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
                        methodH = eo.a.h(clsD, field);
                        if (!z27) {
                            eo.a.o(methodH);
                        }
                        if (methodH.getAnnotation(zn.c.class) != null && field.getAnnotation(zn.c.class) == null) {
                            throw new yn.m("@SerializedName on " + eo.a.g(methodH, z26) + " is not supported");
                        }
                        z17 = zH2;
                    }
                    if (!z27 && methodH == null) {
                        eo.a.o(field);
                    }
                    Type typeP = ao.b.p(aVarB.e(), clsD, field.getGenericType());
                    List<String> listG = this.g(field);
                    aVar2 = aVarB;
                    z18 = false;
                    String str = listG.get(0);
                    i15 = i18;
                    i16 = length;
                    d dVarD = this.d(fVar, field, methodH, str, go.a.b(typeP), zH, z27);
                    if (z17) {
                        for (String str2 : listG) {
                            d dVar2 = (d) linkedHashMap.put(str2, dVarD);
                            if (dVar2 != null) {
                                throw e(cls, str2, dVar2.f20514b, field);
                            }
                        }
                    }
                    if (zH && (dVar = (d) linkedHashMap2.put(str, dVarD)) != null) {
                        throw e(cls, str, dVar.f20514b, field);
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
            aVarB = go.a.b(ao.b.p(aVarB.e(), clsD, clsD.getGenericSuperclass()));
            clsD = aVarB.d();
            z19 = z27;
        }
        return new f(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    private List<String> g(Field field) {
        zn.c cVar = (zn.c) field.getAnnotation(zn.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f20500b.b(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    private boolean h(Field field, boolean z15) {
        return !this.f20501c.g(field, z15);
    }

    @Override // yn.a0
    public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
        Class<? super T> clsD = aVar.d();
        if (!Object.class.isAssignableFrom(clsD)) {
            return null;
        }
        if (eo.a.l(clsD)) {
            return new a();
        }
        v.a aVarB = g0.b(this.f20503e, clsD);
        if (aVarB != v.a.BLOCK_ALL) {
            boolean z15 = aVarB == v.a.BLOCK_INACCESSIBLE;
            return eo.a.m(clsD) ? new g(clsD, f(fVar, aVar, clsD, z15, true), z15) : new e(this.f20499a.v(aVar), f(fVar, aVar, clsD, z15, false));
        }
        throw new yn.m("ReflectionAccessFilter does not permit using reflection for " + clsD + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
```
