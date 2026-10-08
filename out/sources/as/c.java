package as;

import fr.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import pq.n;
import sr.p;
import ss.x;

/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f14278a = new c();

    private c() {
    }

    private final ft.f a(Class<?> cls) {
        int i15 = 0;
        while (cls.isArray()) {
            i15++;
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (t.c(cls, Void.TYPE)) {
                return new ft.f(zs.b.f236634d.c(p.a.f183639f.m()), i15);
            }
            sr.m mVarN = jt.e.e(cls.getName()).n();
            return i15 > 0 ? new ft.f(zs.b.f236634d.c(mVarN.k()), i15 - 1) : new ft.f(zs.b.f236634d.c(mVarN.o()), i15);
        }
        zs.b bVarE = bs.f.e(cls);
        zs.b bVarM = ur.c.f200031a.m(bVarE.a());
        if (bVarM != null) {
            bVarE = bVarM;
        }
        return new ft.f(bVarE, i15);
    }

    private final void c(Class<?> cls, x.d dVar) throws InvocationTargetException {
        Constructor<?>[] constructorArr;
        int i15;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i16 = 0;
        while (i16 < length) {
            Constructor<?> constructor = declaredConstructors[i16];
            x.e eVarA = dVar.a(zs.h.f236664j, m.f14292a.a(constructor));
            if (eVarA == null) {
                constructorArr = declaredConstructors;
                i15 = length;
            } else {
                for (Annotation annotation : constructor.getDeclaredAnnotations()) {
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i17 = 0; i17 < length3; i17++) {
                        Annotation[] annotationArr = parameterAnnotations[i17];
                        int length4 = annotationArr.length;
                        int i18 = 0;
                        while (i18 < length4) {
                            Annotation annotation2 = annotationArr[i18];
                            Class<?> clsB = dr.a.b(dr.a.a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i19 = length;
                            x.a aVarC = eVarA.c(i17 + length2, bs.f.e(clsB), new b(annotation2));
                            if (aVarC != null) {
                                f14278a.h(aVarC, annotation2, clsB);
                            }
                            i18++;
                            declaredConstructors = constructorArr2;
                            length = i19;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i15 = length;
                eVarA.a();
            }
            i16++;
            declaredConstructors = constructorArr;
            length = i15;
        }
    }

    private final void d(Class<?> cls, x.d dVar) throws InvocationTargetException {
        for (Field field : cls.getDeclaredFields()) {
            x.c cVarB = dVar.b(zs.f.l(field.getName()), m.f14292a.b(field), null);
            if (cVarB != null) {
                for (Annotation annotation : field.getDeclaredAnnotations()) {
                    f(cVarB, annotation);
                }
                cVarB.a();
            }
        }
    }

    private final void e(Class<?> cls, x.d dVar) throws InvocationTargetException {
        for (Method method : cls.getDeclaredMethods()) {
            x.e eVarA = dVar.a(zs.f.l(method.getName()), m.f14292a.c(method));
            if (eVarA != null) {
                for (Annotation annotation : method.getDeclaredAnnotations()) {
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                int length = parameterAnnotations.length;
                for (int i15 = 0; i15 < length; i15++) {
                    for (Annotation annotation2 : parameterAnnotations[i15]) {
                        Class<?> clsB = dr.a.b(dr.a.a(annotation2));
                        x.a aVarC = eVarA.c(i15, bs.f.e(clsB), new b(annotation2));
                        if (aVarC != null) {
                            f14278a.h(aVarC, annotation2, clsB);
                        }
                    }
                }
                eVarA.a();
            }
        }
    }

    private final void f(x.c cVar, Annotation annotation) throws InvocationTargetException {
        Class<?> clsB = dr.a.b(dr.a.a(annotation));
        x.a aVarB = cVar.b(bs.f.e(clsB), new b(annotation));
        if (aVarB != null) {
            f14278a.h(aVarB, annotation, clsB);
        }
    }

    private final void g(x.a aVar, zs.f fVar, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (t.c(enclosingClass, Class.class)) {
            aVar.f(fVar, a((Class) obj));
            return;
        }
        if (i.f14285a.contains(enclosingClass)) {
            aVar.d(fVar, obj);
            return;
        }
        if (bs.f.l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            aVar.c(fVar, bs.f.e(enclosingClass), zs.f.l(((Enum) obj).name()));
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?> cls = (Class) n.X0(enclosingClass.getInterfaces());
            x.a aVarB = aVar.b(fVar, bs.f.e(cls));
            if (aVarB == null) {
                return;
            }
            h(aVarB, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        x.b bVarE = aVar.e(fVar);
        if (bVarE == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i15 = 0;
        if (componentType.isEnum()) {
            zs.b bVarE2 = bs.f.e(componentType);
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i15 < length) {
                bVarE.b(bVarE2, zs.f.l(((Enum) objArr[i15]).name()));
                i15++;
            }
        } else if (t.c(componentType, Class.class)) {
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i15 < length2) {
                bVarE.e(a((Class) objArr2[i15]));
                i15++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i15 < length3) {
                Object obj2 = objArr3[i15];
                x.a aVarC = bVarE.c(bs.f.e(componentType));
                if (aVarC != null) {
                    h(aVarC, (Annotation) obj2, componentType);
                }
                i15++;
            }
        } else {
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i15 < length4) {
                bVarE.d(objArr4[i15]);
                i15++;
            }
        }
        bVarE.a();
    }

    private final void h(x.a aVar, Annotation annotation, Class<?> cls) throws InvocationTargetException {
        for (Method method : cls.getDeclaredMethods()) {
            try {
                g(aVar, zs.f.l(method.getName()), method.invoke(annotation, null));
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class<?> cls, x.c cVar) {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            f(cVar, annotation);
        }
        cVar.a();
    }

    public final void i(Class<?> cls, x.d dVar) {
        e(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }
}
