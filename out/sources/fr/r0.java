package fr;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class r0 {
    public mr.c a(Class cls) {
        return new i(cls);
    }

    public mr.g b(p pVar) {
        return pVar;
    }

    public mr.c c(Class cls) {
        return new i(cls);
    }

    public mr.f d(Class cls, String str) {
        return new d0(cls, str);
    }

    public mr.i e(y yVar) {
        return yVar;
    }

    public mr.j f(a0 a0Var) {
        return a0Var;
    }

    public mr.m g(e0 e0Var) {
        return e0Var;
    }

    public mr.n h(g0 g0Var) {
        return g0Var;
    }

    public mr.o i(i0 i0Var) {
        return i0Var;
    }

    public String j(o oVar) {
        String string = oVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String k(w wVar) {
        return j(wVar);
    }

    public mr.p l(mr.e eVar, List<mr.r> list, boolean z15) {
        return new z0(eVar, list, z15);
    }
}
