package ge4;

import fv.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<Method, Object> f72477a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final fv.e.a f72478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final fv.v f72479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List<h.a> f72480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f72481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<e.a> f72482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f72483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Executor f72484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f72485i;

    class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f72486a = new Object[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f72487b;

        a(Class cls) {
            this.f72487b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f72486a;
            }
            u uVar = t.f72419b;
            return uVar.c(method) ? uVar.b(method, this.f72487b, obj, objArr) : y.this.c(this.f72487b, method).a(obj, objArr);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private fv.e.a f72489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private fv.v f72490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<h.a> f72491c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<e.a> f72492d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f72493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f72494f;

        public b a(h.a aVar) {
            List<h.a> list = this.f72491c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(fv.v vVar) {
            Objects.requireNonNull(vVar, "baseUrl == null");
            List<String> listM = vVar.m();
            if ("".equals(listM.get(listM.size() - 1))) {
                this.f72490b = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return b(fv.v.h(str));
        }

        public y d() {
            if (this.f72490b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            fv.e.a zVar = this.f72489a;
            if (zVar == null) {
                zVar = new fv.z();
            }
            fv.e.a aVar = zVar;
            Executor executor = this.f72493e;
            if (executor == null) {
                executor = t.f72418a;
            }
            Executor executor2 = executor;
            c cVar = t.f72420c;
            ArrayList arrayList = new ArrayList(this.f72492d);
            List<? extends e.a> listA = cVar.a(executor2);
            arrayList.addAll(listA);
            List<? extends h.a> listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList(this.f72491c.size() + 1 + size);
            arrayList2.add(new ge4.b());
            arrayList2.addAll(this.f72491c);
            arrayList2.addAll(listB);
            return new y(aVar, this.f72490b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listA.size(), executor2, this.f72494f);
        }

        public b e(fv.e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f72489a = aVar;
            return this;
        }

        public b f(fv.z zVar) {
            Objects.requireNonNull(zVar, "client == null");
            return e(zVar);
        }
    }

    y(fv.e.a aVar, fv.v vVar, List<h.a> list, int i15, List<e.a> list2, int i16, Executor executor, boolean z15) {
        this.f72478b = aVar;
        this.f72479c = vVar;
        this.f72480d = list;
        this.f72481e = i15;
        this.f72482f = list2;
        this.f72483g = i16;
        this.f72484h = executor;
        this.f72485i = z15;
    }

    private void j(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb5 = new StringBuilder("Type parameters are unsupported on ");
                sb5.append(cls2.getName());
                if (cls2 != cls) {
                    sb5.append(" which is an interface of ");
                    sb5.append(cls.getName());
                }
                throw new IllegalArgumentException(sb5.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f72485i) {
            u uVar = t.f72419b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!uVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    z<?> c(Class<?> cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f72477a.get(method);
            if (objPutIfAbsent instanceof z) {
                return (z) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f72477a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                z<?> zVarB = z.b(this, cls, method);
                                this.f72477a.put(method, zVarB);
                                return zVarB;
                            } catch (Throwable th4) {
                                this.f72477a.remove(method);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f72477a.get(method);
                    if (obj2 != null) {
                        return (z) obj2;
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
    }

    public e<?, ?> d(e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f72482f.indexOf(aVar) + 1;
        int size = this.f72482f.size();
        for (int i15 = iIndexOf; i15 < size; i15++) {
            e<?, ?> eVarA = this.f72482f.get(i15).a(type, annotationArr, this);
            if (eVarA != null) {
                return eVarA;
            }
        }
        StringBuilder sb5 = new StringBuilder("Could not locate call adapter for ");
        sb5.append(type);
        sb5.append(".\n");
        if (aVar != null) {
            sb5.append("  Skipped:");
            for (int i16 = 0; i16 < iIndexOf; i16++) {
                sb5.append("\n   * ");
                sb5.append(this.f72482f.get(i16).getClass().getName());
            }
            sb5.append('\n');
        }
        sb5.append("  Tried:");
        int size2 = this.f72482f.size();
        while (iIndexOf < size2) {
            sb5.append("\n   * ");
            sb5.append(this.f72482f.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb5.toString());
    }

    public <T> h<T, fv.c0> e(h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f72480d.indexOf(aVar) + 1;
        int size = this.f72480d.size();
        for (int i15 = iIndexOf; i15 < size; i15++) {
            h<T, fv.c0> hVar = (h<T, fv.c0>) this.f72480d.get(i15).c(type, annotationArr, annotationArr2, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb5 = new StringBuilder("Could not locate RequestBody converter for ");
        sb5.append(type);
        sb5.append(".\n");
        if (aVar != null) {
            sb5.append("  Skipped:");
            for (int i16 = 0; i16 < iIndexOf; i16++) {
                sb5.append("\n   * ");
                sb5.append(this.f72480d.get(i16).getClass().getName());
            }
            sb5.append('\n');
        }
        sb5.append("  Tried:");
        int size2 = this.f72480d.size();
        while (iIndexOf < size2) {
            sb5.append("\n   * ");
            sb5.append(this.f72480d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb5.toString());
    }

    public <T> h<e0, T> f(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f72480d.indexOf(aVar) + 1;
        int size = this.f72480d.size();
        for (int i15 = iIndexOf; i15 < size; i15++) {
            h<e0, T> hVar = (h<e0, T>) this.f72480d.get(i15).d(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb5 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb5.append(type);
        sb5.append(".\n");
        if (aVar != null) {
            sb5.append("  Skipped:");
            for (int i16 = 0; i16 < iIndexOf; i16++) {
                sb5.append("\n   * ");
                sb5.append(this.f72480d.get(i16).getClass().getName());
            }
            sb5.append('\n');
        }
        sb5.append("  Tried:");
        int size2 = this.f72480d.size();
        while (iIndexOf < size2) {
            sb5.append("\n   * ");
            sb5.append(this.f72480d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb5.toString());
    }

    public <T> h<T, fv.c0> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public <T> h<e0, T> h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public <T> h<T, String> i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f72480d.size();
        for (int i15 = 0; i15 < size; i15++) {
            h<T, String> hVar = (h<T, String>) this.f72480d.get(i15).e(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        return ge4.b.d.f72293a;
    }
}
