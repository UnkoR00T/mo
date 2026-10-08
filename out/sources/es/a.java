package es;

import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final fs.a A;
    private static final fs.a B;
    private static final fs.a C;
    private static final fs.a D;
    private static final fs.a E;
    private static final fs.a F;
    private static final fs.b G;
    private static final fs.b H;
    private static final fs.b I;
    private static final fs.a J;
    private static final fs.a K;
    private static final fs.a L;
    private static final fs.a M;
    private static final fs.a N;
    private static final fs.a O;
    private static final fs.a P;
    private static final fs.b Q;
    private static final fs.b R;
    private static final fs.a S;
    private static final fs.a T;
    private static final fs.a U;
    private static final fs.a V;
    private static final fs.a W;
    private static final fs.a X;
    private static final fs.a Y;
    private static final fs.b Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f53003a = {q0.f(new fr.b0(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1)), q0.f(new fr.b0(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1)), q0.f(new fr.b0(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1)), q0.f(new fr.b0(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1)), q0.f(new fr.b0(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), q0.f(new fr.b0(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1)), q0.f(new fr.b0(a.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1)), q0.f(new fr.b0(a.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1)), q0.f(new fr.b0(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1)), q0.f(new fr.b0(a.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1)), q0.f(new fr.b0(a.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1)), q0.f(new fr.b0(a.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1)), q0.f(new fr.b0(a.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1)), q0.f(new fr.b0(a.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1)), q0.f(new fr.b0(a.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1)), q0.f(new fr.b0(a.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1)), q0.f(new fr.b0(a.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1)), q0.f(new fr.b0(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1)), q0.f(new fr.b0(a.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1)), q0.f(new fr.b0(a.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1)), q0.f(new fr.b0(a.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1)), q0.f(new fr.b0(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1)), q0.f(new fr.b0(a.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1)), q0.f(new fr.b0(a.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1)), q0.f(new fr.b0(a.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1)), q0.f(new fr.b0(a.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1)), q0.f(new fr.b0(a.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1)), q0.f(new fr.b0(a.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1)), q0.f(new fr.b0(a.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1)), q0.f(new fr.b0(a.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1)), q0.f(new fr.b0(a.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1)), q0.f(new fr.b0(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1)), q0.f(new fr.b0(a.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1)), q0.f(new fr.b0(a.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1)), q0.f(new fr.b0(a.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1)), q0.f(new fr.b0(a.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1)), q0.f(new fr.b0(a.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1)), q0.f(new fr.b0(a.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1)), q0.f(new fr.b0(a.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1)), q0.f(new fr.b0(a.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1)), q0.f(new fr.b0(a.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1)), q0.f(new fr.b0(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1)), q0.f(new fr.b0(a.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1)), q0.f(new fr.b0(a.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), q0.f(new fr.b0(a.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), q0.f(new fr.b0(a.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), q0.f(new fr.b0(a.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1)), q0.f(new fr.b0(a.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1)), q0.f(new fr.b0(a.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1)), q0.f(new fr.b0(a.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1)), q0.f(new fr.b0(a.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1)), q0.f(new fr.b0(a.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1)), q0.f(new fr.b0(a.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), q0.f(new fr.b0(a.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), q0.f(new fr.b0(a.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1)), q0.f(new fr.b0(a.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1))};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final fs.a f53004a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final fs.a f53005b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final fs.a f53006b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final fs.a f53007c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final fs.a f53008c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final fs.a f53009d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final fs.a f53010d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final fs.a f53011e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final fs.a f53012e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final fs.a f53013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final fs.a f53014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final fs.a f53015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final fs.b f53016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final fs.b f53017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final fs.b f53018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final fs.a f53019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final fs.a f53020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final fs.a f53021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final fs.a f53022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final fs.a f53023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final fs.a f53024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final fs.a f53025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final fs.b f53026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final fs.a f53027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final fs.a f53028u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final fs.b f53029v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final fs.b f53030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final fs.b f53031x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final fs.a f53032y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final fs.a f53033z;

    static {
        ws.b.C5702b c5702b = ws.b.f214721c;
        f53005b = fs.c.a(new fs.d(c5702b));
        f53007c = fs.c.b(new fs.d(c5702b));
        f53009d = fs.c.c(new fs.d(c5702b));
        f53011e = fs.c.g(new fs.d(c5702b));
        f53013f = fs.c.f(new fs.d(c5702b));
        f53014g = fs.c.j(new fs.d(c5702b));
        f53015h = fs.c.h(new fs.d(c5702b));
        f53016i = fs.c.e(new fr.b0() { // from class: es.a.i
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((es.g) obj).i());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((es.g) obj).s(((Number) obj2).intValue());
            }
        });
        f53017j = fs.c.k(new fr.b0() { // from class: es.a.o
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((es.g) obj).i());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((es.g) obj).s(((Number) obj2).intValue());
            }
        });
        e eVar = new fr.b0() { // from class: es.a.e
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((es.g) obj).i());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((es.g) obj).s(((Number) obj2).intValue());
            }
        };
        ws.b.d<us.c.EnumC5226c> dVar = ws.b.f214724f;
        wq.a<es.b> aVarE = es.b.e();
        wq.a<es.b> aVarE2 = es.b.e();
        ArrayList arrayList = new ArrayList(pq.v.y(aVarE2, 10));
        Iterator<es.b> it = aVarE2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        f53018k = new fs.b(eVar, dVar, aVarE, arrayList);
        f53019l = fs.c.a(new fs.d(ws.b.f214725g));
        f53020m = fs.c.a(new fs.d(ws.b.f214726h));
        f53021n = fs.c.a(new fs.d(ws.b.f214727i));
        f53022o = fs.c.a(new fs.d(ws.b.f214728j));
        f53023p = fs.c.a(new fs.d(ws.b.f214729k));
        f53024q = fs.c.a(new fs.d(ws.b.f214730l));
        f53025r = fs.c.a(new fs.d(ws.b.f214731m));
        f53026s = fs.c.k(new fr.b0() { // from class: es.a.p
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((es.j) obj).c());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((es.j) obj).f(((Number) obj2).intValue());
            }
        });
        f53027t = fs.c.b(new fs.d(ws.b.f214732n));
        f53028u = fs.c.b(new fs.d(ws.b.f214733o));
        f53029v = fs.c.d(new fr.b0() { // from class: es.a.f
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((s) obj).e());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((s) obj).j(((Number) obj2).intValue());
            }
        });
        f53030w = fs.c.k(new fr.b0() { // from class: es.a.k
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((s) obj).e());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((s) obj).j(((Number) obj2).intValue());
            }
        });
        f53031x = fs.c.e(new fr.b0() { // from class: es.a.j
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((s) obj).e());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((s) obj).j(((Number) obj2).intValue());
            }
        });
        f53032y = fs.c.c(new fs.d(ws.b.f214736r));
        f53033z = fs.c.c(new fs.d(ws.b.f214737s));
        A = fs.c.c(new fs.d(ws.b.f214738t));
        B = fs.c.c(new fs.d(ws.b.f214739u));
        C = fs.c.c(new fs.d(ws.b.f214740v));
        D = fs.c.c(new fs.d(ws.b.f214741w));
        E = fs.c.c(new fs.d(ws.b.f214742x));
        F = fs.c.c(new fs.d(ws.b.f214743y));
        G = fs.c.k(new fr.b0() { // from class: es.a.l
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((t) obj).g());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((t) obj).m(((Number) obj2).intValue());
            }
        });
        H = fs.c.e(new fr.b0() { // from class: es.a.g
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((t) obj).g());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((t) obj).m(((Number) obj2).intValue());
            }
        });
        I = fs.c.d(new fr.b0() { // from class: es.a.d
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((t) obj).g());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((t) obj).m(((Number) obj2).intValue());
            }
        });
        J = fs.c.g(new fs.d(ws.b.A));
        K = fs.c.g(new fs.d(ws.b.D));
        L = fs.c.g(new fs.d(ws.b.E));
        M = fs.c.g(new fs.d(ws.b.F));
        N = fs.c.g(new fs.d(ws.b.G));
        O = fs.c.g(new fs.d(ws.b.H));
        P = fs.c.g(new fs.d(ws.b.I));
        Q = fs.c.k(new fr.b0() { // from class: es.a.m
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((u) obj).b());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((u) obj).c(((Number) obj2).intValue());
            }
        });
        R = fs.c.e(new fr.b0() { // from class: es.a.h
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((u) obj).b());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((u) obj).c(((Number) obj2).intValue());
            }
        });
        S = fs.c.f(new fs.d(ws.b.N));
        T = fs.c.f(new fs.d(ws.b.O));
        U = fs.c.f(new fs.d(ws.b.P));
        V = fs.c.i(new fs.d(0, 1, 1));
        ws.b.C5702b c5702b2 = ws.b.f214719a;
        W = fs.c.i(new fs.d(c5702b2.f214746a + 1, c5702b2.f214747b, 1));
        ws.b.C5702b c5702b3 = ws.b.f214720b;
        X = fs.c.i(new fs.d(c5702b3.f214746a + 1, c5702b3.f214747b, 1));
        Y = new fs.a(new fr.b0() { // from class: es.a.c
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((x) obj).b());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((x) obj).d(((Number) obj2).intValue());
            }
        }, new fs.d(0, 1, 1));
        Z = fs.c.k(new fr.b0() { // from class: es.a.n
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((w) obj).b());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((w) obj).f(((Number) obj2).intValue());
            }
        });
        f53004a0 = fs.c.j(new fs.d(ws.b.K));
        f53006b0 = fs.c.j(new fs.d(ws.b.L));
        f53008c0 = fs.c.j(new fs.d(ws.b.M));
        f53010d0 = new fs.a(new fr.b0() { // from class: es.a.a
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((es.n) obj).b());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((es.n) obj).e(((Number) obj2).intValue());
            }
        }, new fs.d(ws.b.Q));
        f53012e0 = new fs.a(new fr.b0() { // from class: es.a.b
            @Override // fr.b0, mr.n
            public Object get(Object obj) {
                return Integer.valueOf(((es.n) obj).b());
            }

            @Override // fr.b0, mr.j
            public void n(Object obj, Object obj2) {
                ((es.n) obj).e(((Number) obj2).intValue());
            }
        }, new fs.d(ws.b.R));
    }

    public static final es.b a(es.g gVar) {
        return (es.b) f53018k.a(gVar, f53003a[9]);
    }

    public static final boolean b(es.g gVar) {
        return f53023p.a(gVar, f53003a[14]);
    }
}
