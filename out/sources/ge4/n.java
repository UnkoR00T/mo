package ge4;

import fv.d0;
import fv.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
abstract class n<ResponseT, ReturnT> extends z<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f72330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fv.e.a f72331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h<e0, ResponseT> f72332c;

    static final class a<ResponseT, ReturnT> extends n<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e<ResponseT, ReturnT> f72333d;

        a(w wVar, fv.e.a aVar, h<e0, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(wVar, aVar, hVar);
            this.f72333d = eVar;
        }

        @Override // ge4.n
        protected ReturnT c(d<ResponseT> dVar, Object[] objArr) {
            return this.f72333d.b(dVar);
        }
    }

    static final class b<ResponseT> extends n<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e<ResponseT, d<ResponseT>> f72334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f72335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f72336f;

        b(w wVar, fv.e.a aVar, h<e0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z15, boolean z16) {
            super(wVar, aVar, hVar);
            this.f72334d = eVar;
            this.f72335e = z15;
            this.f72336f = z16;
        }

        @Override // ge4.n
        protected Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarB = this.f72334d.b(dVar);
            tq.e eVar = (tq.e) objArr[objArr.length - 1];
            try {
                if (this.f72336f) {
                    return p.d(dVarB, eVar);
                }
                return this.f72335e ? p.b(dVarB, eVar) : p.a(dVarB, eVar);
            } catch (LinkageError e15) {
                throw e15;
            } catch (ThreadDeath e16) {
                throw e16;
            } catch (VirtualMachineError e17) {
                throw e17;
            } catch (Throwable th4) {
                return p.e(th4, eVar);
            }
        }
    }

    static final class c<ResponseT> extends n<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e<ResponseT, d<ResponseT>> f72337d;

        c(w wVar, fv.e.a aVar, h<e0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(wVar, aVar, hVar);
            this.f72337d = eVar;
        }

        @Override // ge4.n
        protected Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> dVarB = this.f72337d.b(dVar);
            tq.e eVar = (tq.e) objArr[objArr.length - 1];
            try {
                return p.c(dVarB, eVar);
            } catch (Exception e15) {
                return p.e(e15, eVar);
            }
        }
    }

    n(w wVar, fv.e.a aVar, h<e0, ResponseT> hVar) {
        this.f72330a = wVar;
        this.f72331b = aVar;
        this.f72332c = hVar;
    }

    private static <ResponseT, ReturnT> e<ResponseT, ReturnT> d(y yVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (e<ResponseT, ReturnT>) yVar.a(type, annotationArr);
        } catch (RuntimeException e15) {
            throw c0.o(method, e15, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> h<e0, ResponseT> e(y yVar, Method method, Type type) {
        try {
            return yVar.h(type, method.getAnnotations());
        } catch (RuntimeException e15) {
            throw c0.o(method, e15, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> n<ResponseT, ReturnT> f(y yVar, Method method, w wVar) {
        Type genericReturnType;
        boolean z15;
        boolean z16;
        boolean zM;
        boolean z17 = wVar.f72447l;
        Annotation[] annotations = method.getAnnotations();
        if (z17) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = c0.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (c0.h(typeF) == x.class && (typeF instanceof ParameterizedType)) {
                typeF = c0.g(0, (ParameterizedType) typeF);
                zM = false;
                z15 = true;
            } else {
                if (c0.h(typeF) == d.class) {
                    throw c0.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", c0.g(0, (ParameterizedType) typeF));
                }
                zM = c0.m(typeF);
                z15 = false;
            }
            genericReturnType = new c0.b(null, d.class, typeF);
            annotations = b0.a(annotations);
            z16 = zM;
        } else {
            genericReturnType = method.getGenericReturnType();
            z15 = false;
            z16 = false;
        }
        e eVarD = d(yVar, method, genericReturnType, annotations);
        Type typeA = eVarD.a();
        if (typeA == d0.class) {
            throw c0.n(method, "'" + c0.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == x.class) {
            throw c0.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (wVar.f72439d.equals("HEAD") && !Void.class.equals(typeA) && !c0.m(typeA)) {
            throw c0.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        h hVarE = e(yVar, method, typeA);
        fv.e.a aVar = yVar.f72478b;
        if (z17) {
            return z15 ? new c(wVar, aVar, hVarE, eVarD) : new b(wVar, aVar, hVarE, eVarD, false, z16);
        }
        return new a(wVar, aVar, hVarE, eVarD);
    }

    @Override // ge4.z
    final ReturnT a(Object obj, Object[] objArr) {
        return c(new q(this.f72330a, obj, objArr, this.f72331b, this.f72332c), objArr);
    }

    protected abstract ReturnT c(d<ResponseT> dVar, Object[] objArr);
}
