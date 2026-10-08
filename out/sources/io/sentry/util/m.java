package io.sentry.util;

import io.sentry.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    @FunctionalInterface
    public interface a<T> {
        void accept(T t15);
    }

    @FunctionalInterface
    public interface b {
        void a(Object obj, Class<?> cls);
    }

    @FunctionalInterface
    public interface c<T> {
        void accept(T t15);
    }

    public static /* synthetic */ void c(Object obj, Class cls) {
    }

    public static /* synthetic */ void d(Object obj) {
    }

    public static io.sentry.j0 e(Object obj) {
        io.sentry.j0 j0Var = new io.sentry.j0();
        p(j0Var, obj);
        return j0Var;
    }

    public static io.sentry.hints.h f(io.sentry.j0 j0Var) {
        return (io.sentry.hints.h) j0Var.d("sentry:eventDropReason", io.sentry.hints.h.class);
    }

    public static Object g(io.sentry.j0 j0Var) {
        return j0Var.c("sentry:typeCheckHint");
    }

    public static boolean h(io.sentry.j0 j0Var, Class<?> cls) {
        return cls.isInstance(g(j0Var));
    }

    public static boolean i(io.sentry.j0 j0Var) {
        return Boolean.TRUE.equals(j0Var.d("sentry:isFromHybridSdk", Boolean.class));
    }

    public static <T> void j(io.sentry.j0 j0Var, Class<T> cls, final c<Object> cVar) {
        l(j0Var, cls, new a() { // from class: io.sentry.util.k
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                m.d(obj);
            }
        }, new b() { // from class: io.sentry.util.l
            @Override // io.sentry.util.m.b
            public final void a(Object obj, Class cls2) {
                cVar.accept(obj);
            }
        });
    }

    public static <T> void k(io.sentry.j0 j0Var, Class<T> cls, a<T> aVar) {
        l(j0Var, cls, aVar, new b() { // from class: io.sentry.util.i
            @Override // io.sentry.util.m.b
            public final void a(Object obj, Class cls2) {
                m.c(obj, cls2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void l(io.sentry.j0 j0Var, Class<T> cls, a<T> aVar, b bVar) {
        Object objG = g(j0Var);
        if (!h(j0Var, cls) || objG == null) {
            bVar.a(objG, cls);
        } else {
            aVar.accept(objG);
        }
    }

    public static <T> void m(io.sentry.j0 j0Var, Class<T> cls, final v0 v0Var, a<T> aVar) {
        l(j0Var, cls, aVar, new b() { // from class: io.sentry.util.j
            @Override // io.sentry.util.m.b
            public final void a(Object obj, Class cls2) {
                t.a(cls2, obj, v0Var);
            }
        });
    }

    public static void n(io.sentry.j0 j0Var, io.sentry.hints.h hVar) {
        j0Var.k("sentry:eventDropReason", hVar);
    }

    public static void o(io.sentry.j0 j0Var, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            j0Var.k("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static void p(io.sentry.j0 j0Var, Object obj) {
        j0Var.k("sentry:typeCheckHint", obj);
    }

    public static boolean q(io.sentry.j0 j0Var) {
        return !(h(j0Var, io.sentry.hints.e.class) || h(j0Var, io.sentry.hints.c.class)) || h(j0Var, io.sentry.hints.b.class);
    }
}
