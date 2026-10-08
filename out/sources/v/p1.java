package v;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface p1 {

    public static abstract class a<T> {
        a() {
        }

        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new j(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    public interface b {
        boolean a(a<?> aVar);
    }

    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static boolean T(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    static void Z(u2 u2Var, p1 p1Var, p1 p1Var2, a<?> aVar) {
        if (!Objects.equals(aVar, f2.f202585y)) {
            u2Var.e0(aVar, p1Var2.c(aVar), p1Var2.d(aVar));
            return;
        }
        j0.c cVar = (j0.c) p1Var2.f(aVar, null);
        u2Var.e0(aVar, p1Var2.c(aVar), y.t.a((j0.c) p1Var.f(aVar, null), cVar));
    }

    static p1 u(p1 p1Var, p1 p1Var2) {
        if (p1Var == null && p1Var2 == null) {
            return z2.j0();
        }
        u2 u2VarM0 = p1Var2 != null ? u2.m0(p1Var2) : u2.l0();
        if (p1Var != null) {
            Iterator<a<?>> it = p1Var.b().iterator();
            while (it.hasNext()) {
                Z(u2VarM0, p1Var2, p1Var, it.next());
            }
        }
        return z2.k0(u2VarM0);
    }

    Set<a<?>> b();

    c c(a<?> aVar);

    <ValueT> ValueT d(a<ValueT> aVar);

    Set<c> e(a<?> aVar);

    <ValueT> ValueT f(a<ValueT> aVar, ValueT valuet);

    void g(String str, b bVar);

    boolean h(a<?> aVar);

    <ValueT> ValueT i(a<ValueT> aVar, c cVar);
}
