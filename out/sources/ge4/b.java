package ge4;

import fv.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import oq.i0;

/* JADX INFO: loaded from: classes2.dex */
final class b extends h.a {

    static final class a implements h<e0, e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f72290a = new a();

        a() {
        }

        @Override // ge4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 a(e0 e0Var) {
            try {
                return c0.a(e0Var);
            } finally {
                e0Var.close();
            }
        }
    }

    /* JADX INFO: renamed from: ge4.b$b, reason: collision with other inner class name */
    static final class C1659b implements h<fv.c0, fv.c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1659b f72291a = new C1659b();

        C1659b() {
        }

        @Override // ge4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public fv.c0 a(fv.c0 c0Var) {
            return c0Var;
        }
    }

    static final class c implements h<e0, e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f72292a = new c();

        c() {
        }

        @Override // ge4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 a(e0 e0Var) {
            return e0Var;
        }
    }

    static final class d implements h<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f72293a = new d();

        d() {
        }

        @Override // ge4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    static final class e implements h<e0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f72294a = new e();

        e() {
        }

        @Override // ge4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 a(e0 e0Var) {
            e0Var.close();
            return i0.f148189a;
        }
    }

    static final class f implements h<e0, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f72295a = new f();

        f() {
        }

        @Override // ge4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(e0 e0Var) {
            e0Var.close();
            return null;
        }
    }

    b() {
    }

    @Override // ge4.h.a
    public h<?, fv.c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        if (fv.c0.class.isAssignableFrom(c0.h(type))) {
            return C1659b.f72291a;
        }
        return null;
    }

    @Override // ge4.h.a
    public h<e0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (type == e0.class) {
            return c0.l(annotationArr, ie4.w.class) ? c.f72292a : a.f72290a;
        }
        if (type == Void.class) {
            return f.f72295a;
        }
        if (c0.m(type)) {
            return e.f72294a;
        }
        return null;
    }
}
