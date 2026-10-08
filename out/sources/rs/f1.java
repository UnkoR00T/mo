package rs;

import java.util.Map;
import rs.n1.a;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f175636a = new i(l.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f175637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f175638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, g1> f175639d;

    static {
        l lVar = l.NOT_NULL;
        f175637b = new i(lVar, null, false, false, 8, null);
        f175638c = new i(lVar, null, true, false, 8, null);
        ss.f0 f0Var = ss.f0.f183849a;
        String strH = f0Var.h("Object");
        String strG = f0Var.g("Predicate");
        String strG2 = f0Var.g("Function");
        String strG3 = f0Var.g("Consumer");
        String strG4 = f0Var.g("BiFunction");
        String strG5 = f0Var.g("BiConsumer");
        String strG6 = f0Var.g("UnaryOperator");
        String strI = f0Var.i("stream/Stream");
        String strI2 = f0Var.i("Optional");
        n1 n1Var = new n1();
        n1.a.b(n1Var.new a(f0Var.i("Iterator")), "forEachRemaining", null, new n(strG3), 2, null);
        n1.a.b(n1Var.new a(f0Var.h("Iterable")), "spliterator", null, new y(f0Var), 2, null);
        n1.a aVar = n1Var.new a(f0Var.i("Collection"));
        n1.a.b(aVar, "removeIf", null, new j0(strG), 2, null);
        n1.a.b(aVar, "stream", null, new u0(strI), 2, null);
        n1.a.b(aVar, "parallelStream", null, new z0(strI), 2, null);
        n1.a aVar2 = n1Var.new a(f0Var.i(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d));
        n1.a.b(aVar2, "replaceAll", null, new a1(strG6), 2, null);
        aVar2.a("addFirst", "2.1", new b1(strH));
        aVar2.a("addLast", "2.1", new c1(strH));
        aVar2.a("removeFirst", "2.1", new d1(strH));
        aVar2.a("removeLast", "2.1", new e1(strH));
        n1.a aVar3 = n1Var.new a(f0Var.i("LinkedList"));
        aVar3.a("addFirst", "2.1", new o(strH));
        aVar3.a("addLast", "2.1", new p(strH));
        aVar3.a("removeFirst", "2.1", new q(strH));
        aVar3.a("removeLast", "2.1", new r(strH));
        n1.a aVar4 = n1Var.new a(f0Var.i("LinkedHashSet"));
        aVar4.a("addFirst", "2.2", new s(strH));
        aVar4.a("addLast", "2.2", new t(strH));
        aVar4.a("removeFirst", "2.2", new u(strH));
        aVar4.a("removeLast", "2.2", new v(strH));
        aVar4.a("getFirst", "2.2", new w(strH));
        aVar4.a("getLast", "2.2", new x(strH));
        n1.a aVar5 = n1Var.new a(f0Var.i("Map"));
        n1.a.b(aVar5, "forEach", null, new z(strG5), 2, null);
        n1.a.b(aVar5, "putIfAbsent", null, new a0(strH), 2, null);
        n1.a.b(aVar5, "replace", null, new b0(strH), 2, null);
        n1.a.b(aVar5, "replace", null, new c0(strH), 2, null);
        n1.a.b(aVar5, "replaceAll", null, new d0(strG4), 2, null);
        n1.a.b(aVar5, "compute", null, new e0(strH, strG4), 2, null);
        n1.a.b(aVar5, "computeIfAbsent", null, new f0(strH, strG2), 2, null);
        n1.a.b(aVar5, "computeIfPresent", null, new g0(strH, strG4), 2, null);
        n1.a.b(aVar5, "merge", null, new h0(strH, strG4), 2, null);
        n1.a aVar6 = n1Var.new a(f0Var.i("LinkedHashMap"));
        aVar6.a("putFirst", "2.2", new i0(strH));
        aVar6.a("putLast", "2.2", new k0(strH));
        n1.a aVar7 = n1Var.new a(strI2);
        n1.a.b(aVar7, "empty", null, new l0(strI2), 2, null);
        n1.a.b(aVar7, "of", null, new m0(strH, strI2), 2, null);
        n1.a.b(aVar7, "ofNullable", null, new n0(strH, strI2), 2, null);
        n1.a.b(aVar7, "get", null, new o0(strH), 2, null);
        n1.a.b(aVar7, "ifPresent", null, new p0(strG3), 2, null);
        n1.a.b(n1Var.new a(f0Var.h("ref/Reference")), "get", null, new q0(strH), 2, null);
        n1.a.b(n1Var.new a(strG), "test", null, new r0(strH), 2, null);
        n1.a.b(n1Var.new a(f0Var.g("BiPredicate")), "test", null, new s0(strH), 2, null);
        n1.a.b(n1Var.new a(strG3), "accept", null, new t0(strH), 2, null);
        n1.a.b(n1Var.new a(strG5), "accept", null, new v0(strH), 2, null);
        n1.a.b(n1Var.new a(strG2), "apply", null, new w0(strH), 2, null);
        n1.a.b(n1Var.new a(strG4), "apply", null, new x0(strH), 2, null);
        n1.a.b(n1Var.new a(f0Var.g("Supplier")), "get", null, new y0(strH), 2, null);
        f175639d = n1Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar, iVar, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.b(str, iVar);
        c4484a.c(str, f175636a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.b(str, iVar);
        c4484a.c(str, f175636a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.b(str, iVar);
        c4484a.b(str, iVar);
        c4484a.d(jt.e.BOOLEAN);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar, iVar, iVar, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(String str, String str2, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        i iVar2 = f175636a;
        c4484a.b(str2, iVar, iVar, iVar2, iVar2);
        c4484a.c(str, iVar2);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(String str, String str2, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.b(str2, iVar, iVar, iVar);
        c4484a.c(str, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(String str, String str2, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        i iVar2 = f175638c;
        i iVar3 = f175636a;
        c4484a.b(str2, iVar, iVar, iVar2, iVar3);
        c4484a.c(str, iVar3);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(String str, String str2, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        i iVar2 = f175638c;
        c4484a.b(str, iVar2);
        i iVar3 = f175636a;
        c4484a.b(str2, iVar, iVar2, iVar2, iVar3);
        c4484a.c(str, iVar3);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.b(str, iVar);
        c4484a.c(str, f175636a);
        return oq.i0.f148189a;
    }

    public static final Map<String, g1> K0() {
        return f175639d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.b(str, iVar);
        c4484a.c(str, f175636a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b, f175638c);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(String str, String str2, n1.a.C4484a c4484a) {
        i iVar = f175638c;
        c4484a.b(str, iVar);
        c4484a.c(str2, f175637b, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(String str, String str2, n1.a.C4484a c4484a) {
        c4484a.b(str, f175636a);
        c4484a.c(str2, f175637b, f175638c);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175638c);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(String str, n1.a.C4484a c4484a) {
        c4484a.b(str, f175637b, f175638c);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175636a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b(ss.f0 f0Var, n1.a.C4484a c4484a) {
        String strI = f0Var.i("Spliterator");
        i iVar = f175637b;
        c4484a.c(strI, iVar, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(String str, n1.a.C4484a c4484a) {
        c4484a.b(str, f175637b);
        c4484a.d(jt.e.BOOLEAN);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.b(str, iVar);
        c4484a.d(jt.e.BOOLEAN);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(String str, n1.a.C4484a c4484a) {
        c4484a.b(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.b(str, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.c(str, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar);
        c4484a.b(str, iVar);
        c4484a.c(str, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar, iVar);
        c4484a.d(jt.e.BOOLEAN);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.c(str, iVar, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.c(str, iVar, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(String str, n1.a.C4484a c4484a) {
        i iVar = f175637b;
        c4484a.b(str, iVar, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(String str, n1.a.C4484a c4484a) {
        c4484a.b(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(String str, n1.a.C4484a c4484a) {
        c4484a.b(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(String str, n1.a.C4484a c4484a) {
        c4484a.b(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(String str, n1.a.C4484a c4484a) {
        c4484a.b(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(String str, n1.a.C4484a c4484a) {
        c4484a.b(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(String str, n1.a.C4484a c4484a) {
        c4484a.b(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(String str, n1.a.C4484a c4484a) {
        c4484a.c(str, f175637b);
        return oq.i0.f148189a;
    }
}
