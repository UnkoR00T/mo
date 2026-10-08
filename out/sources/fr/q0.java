package fr;

import java.util.Arrays;
import java.util.Collections;
import pr.m3;

/* JADX INFO: loaded from: classes4.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r0 f66411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final mr.c[] f66412b;

    static {
        r0 r0Var = null;
        try {
            r0Var = (r0) m3.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r0Var == null) {
            r0Var = new r0();
        }
        f66411a = r0Var;
        f66412b = new mr.c[0];
    }

    public static mr.c a(Class cls) {
        return f66411a.a(cls);
    }

    public static mr.g b(p pVar) {
        return f66411a.b(pVar);
    }

    public static mr.c c(Class cls) {
        return f66411a.c(cls);
    }

    public static mr.f d(Class cls) {
        return f66411a.d(cls, "");
    }

    public static mr.i e(y yVar) {
        return f66411a.e(yVar);
    }

    public static mr.j f(a0 a0Var) {
        return f66411a.f(a0Var);
    }

    public static mr.p g(Class cls) {
        return f66411a.l(c(cls), Collections.EMPTY_LIST, true);
    }

    public static mr.p h(Class cls, mr.r rVar) {
        return f66411a.l(c(cls), Collections.singletonList(rVar), true);
    }

    public static mr.m i(e0 e0Var) {
        return f66411a.g(e0Var);
    }

    public static mr.n j(g0 g0Var) {
        return f66411a.h(g0Var);
    }

    public static mr.o k(i0 i0Var) {
        return f66411a.i(i0Var);
    }

    public static String l(o oVar) {
        return f66411a.j(oVar);
    }

    public static String m(w wVar) {
        return f66411a.k(wVar);
    }

    public static mr.p n(Class cls) {
        return f66411a.l(c(cls), Collections.EMPTY_LIST, false);
    }

    public static mr.p o(Class cls, mr.r rVar) {
        return f66411a.l(c(cls), Collections.singletonList(rVar), false);
    }

    public static mr.p p(Class cls, mr.r rVar, mr.r rVar2) {
        return f66411a.l(c(cls), Arrays.asList(rVar, rVar2), false);
    }
}
