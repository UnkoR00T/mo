package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a51 {
    public static a51 h() {
        return t(1).g();
    }

    public static a51 i() {
        return t(2).g();
    }

    public static a51 j() {
        return t(3).g();
    }

    public static a51 k() {
        return t(4).g();
    }

    public static a51 l(List list) {
        zj.p.q(list);
        z41 z41VarT = t(5);
        z41VarT.b(list);
        return z41VarT.g();
    }

    public static a51 m(String str) {
        zj.p.q(str);
        z41 z41VarT = t(6);
        z41VarT.a(str);
        return z41VarT.g();
    }

    public static a51 n(String str, Status status) {
        zj.p.q(str);
        zj.p.q(status);
        z41 z41VarT = t(7);
        z41VarT.a(str);
        z41VarT.f(status);
        return z41VarT.g();
    }

    public static a51 o(ii.l0 l0Var) {
        zj.p.q(l0Var);
        z41 z41VarT = t(8);
        z41VarT.c(l0Var);
        return z41VarT.g();
    }

    public static a51 p(ii.h hVar, ii.i iVar) {
        zj.p.q(hVar);
        zj.p.q(iVar);
        z41 z41VarT = t(8);
        z41VarT.d(hVar);
        z41VarT.e(iVar);
        return z41VarT.g();
    }

    public static a51 q(ii.h hVar, Status status) {
        zj.p.q(hVar);
        zj.p.q(status);
        z41 z41VarT = t(9);
        z41VarT.d(hVar);
        z41VarT.f(status);
        return z41VarT.g();
    }

    public static a51 r() {
        z41 z41VarT = t(10);
        z41VarT.f(new Status(16));
        return z41VarT.g();
    }

    public static a51 s(Status status) {
        zj.p.q(status);
        z41 z41VarT = t(10);
        z41VarT.f(status);
        return z41VarT.g();
    }

    private static z41 t(int i15) {
        w41 w41Var = new w41();
        w41Var.h(i15);
        return w41Var;
    }

    public abstract String a();

    public abstract ak.n0 b();

    public abstract ii.l0 c();

    public abstract ii.h d();

    public abstract ii.i e();

    public abstract Status f();

    public abstract int g();
}
